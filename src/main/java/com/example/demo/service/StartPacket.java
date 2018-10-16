package com.example.demo.service;

import com.example.demo.dao.ARPMapper;
import com.example.demo.dao.IPV4Mapper;
import com.example.demo.dao.TCPMapper;
import com.example.demo.dao.UDPMapper;
import com.example.demo.entity.*;
import jpcap.JpcapCaptor;
import jpcap.NetworkInterface;
import jpcap.packet.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StartPacket {

    @Resource
    protected IPV4Mapper ipv4Mapper;
    @Resource
    private TCPMapper tcpMapper;
    @Resource
    private UDPMapper udpMapper;
    @Resource
    private ARPMapper arpMapper;

    private Integer id = 1;

    private String BytesToHexString(byte[] b) {
        String hs = "";
        String stmp = "";
        if(b!=null){
            for (int n = 0; n < b.length; n++) {
                stmp = (Integer.toHexString(b[n] & 0XFF));
                if (stmp.length() == 1)
                    hs = hs + "0" + stmp;
                else
                    hs = hs + stmp;
            }
            return hs.toUpperCase();
        }else{
            return null;
        }

    }


    public void startCapThread() {
        try{
            //获取本机上的网络接口对象数组
            final  NetworkInterface[] devices = JpcapCaptor.getDeviceList();
            NetworkInterface nc=devices[0];
            //创建某个卡口上的抓取对象,最大为2000个
            ipv4Mapper.deleteAll();
            ipv4Mapper.auto();
            arpMapper.deleteAll();
            arpMapper.auto();
            tcpMapper.deleteAll();
            tcpMapper.auto();
            udpMapper.deleteAll();
            udpMapper.auto();
            JpcapCaptor jpcap1 = JpcapCaptor.openDevice(nc, 2000, true, 20);
            while(true){
                Packet packet = jpcap1.getPacket();
                this.receivePacket(packet);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    /**
     * 实现的接包方法:
     */

    private void receivePacket(Packet packet) {

        try {
            if (packet instanceof IPPacket) {     //分析IP
                IPPacket iPacket = (IPPacket) packet;
                IPV4 ipv4 = new IPV4();

                if (iPacket.version == 4) {      //分析IPv4协议
                    ipv4.setSortId(this.id);
                    ipv4.setVersion((int) iPacket.version); //IP版本
                    ipv4.setRsvTos((int) iPacket.rsv_tos); //服务类型
                    ipv4.setPriority((int) iPacket.priority); //优先级
                    ipv4.setLength((int) iPacket.length); //长度
                    ipv4.setIdent(iPacket.ident); //标识
                    ipv4.setDontFrag(iPacket.dont_frag); //Don't Frag?
                    ipv4.setMoreFrag(iPacket.more_frag); //More Frag?
                    ipv4.setOffset((int) iPacket.offset);//片偏移
                    ipv4.setHopLimit((int) iPacket.hop_limit);  //生存时间
                    ipv4.setProtocol((int) iPacket.protocol); //协议
                    ipv4.setSrcIp(iPacket.src_ip.getHostAddress());
                    ipv4.setDstIp(iPacket.dst_ip.getHostAddress()); //目的IP
                    ipv4Mapper.insertSelective(ipv4);
                }

                if (iPacket instanceof UDPPacket) { //分析UDP协议

                    UDPPacket uPacket = (UDPPacket) iPacket;
                    UDP udp = new UDP();
                    udp.setSortId(this.id);
                    udp.setSrcPort(uPacket.src_port);   //源端口
                    udp.setDstPort(uPacket.dst_port);   //目的端口
                    udp.setLength(uPacket.length);      //长度
                    udpMapper.insertSelective(udp);
                }

                if (iPacket instanceof TCPPacket) {     //分析TCP协议
                    TCPPacket tPacket = (TCPPacket) iPacket;
                    TCP tcp = new TCP();
                    tcp.setSortId(this.id);
                    tcp.setSrcPort(tPacket.src_port);   //源端口
                    tcp.setDstPort(tPacket.dst_port);   //目的端口
                    tcp.setUrg(tPacket.urg);            //URG
                    tcp.setAck(tPacket.ack);            //ACK
                    tcp.setPsh(tPacket.psh);            //PSH
                    tcp.setRst(tPacket.rst);            //RST
                    tcp.setSyn(tPacket.syn);            //SYN
                    tcp.setFin(tPacket.fin);            //FIN
                    tcp.setWindow(tPacket.window);      //窗口大小
                    tcp.setUrgentPointer((int) tPacket.urgent_pointer); //紧急指针
                    if (tPacket.src_port == 80 || tPacket.dst_port == 80) {//分析HTTP协议
                        byte[] data = tPacket.data;
                        if (data.length == 0) {
                            tcp.setData("");
                        } else {
                            try {
                                //接受HTTP回应
                                String str = new String(BytesToHexString(data));
                                if(str.equals(new String(str.getBytes("UTF-8"),"UTF-8")))
                                    tcp.setData(str);
                                else
                                    tcp.setData("code error!");

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }else{
                        tcp.setData("");
                    }

                    tcpMapper.insertSelective(tcp);
                    }
                    this.id = this.id + 1;
                }

                if (packet instanceof ARPPacket) {               //分析ARP协议
                    ARPPacket aPacket = (ARPPacket) packet;
                    ARP arp = new ARP();
                    arp.setHardtype((int) aPacket.hardtype);  //硬件类型
                    arp.setPrototype((int) aPacket.prototype);//协议类型
                    arp.setHlen((int) aPacket.hlen);//硬件地址长度
                    arp.setPlen((int) aPacket.plen);//协议地址长度
                    arp.setOperation((int) aPacket.operation);//Operation
                    arp.setSenderHardaddr(BytesToHexString(aPacket.sender_hardaddr));//发送者硬件地址
                    arp.setSenderProtoaddr(BytesToHexString(aPacket.sender_protoaddr));//发送者协议地址
                    arp.setTargetHardaddr(BytesToHexString(aPacket.target_hardaddr));//目标硬件地址
                    arp.setTargetProtoaddr(BytesToHexString(aPacket.target_protoaddr));//目标协议地址
                    arpMapper.insertSelective(arp);
                }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

