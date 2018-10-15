package com.example.demo.service;

import com.example.demo.OV.Result;
import com.example.demo.OV.ResultTool;
import com.example.demo.OV.resonpse.PacketInfo;
import com.example.demo.OV.resonpse.TCPpacket;
import com.example.demo.OV.resonpse.UDPpacket;
import jpcap.PacketReceiver;
import jpcap.packet.IPPacket;
import jpcap.packet.Packet;
import jpcap.packet.TCPPacket;
import jpcap.packet.UDPPacket;

public class PackReceiverService implements PacketReceiver{

    public PacketInfo packetInfo;

    private String BytesToHexString(byte[] b) {
        String hs = "";
        String stmp = "";
        for (int n = 0; n < b.length; n++) {
            stmp = (Integer.toHexString(b[n] & 0XFF));
            if (stmp.length() == 1)
                hs = hs + "0" + stmp;
            else
                hs = hs + stmp;
        }
        return hs.toUpperCase();
    }

    /**
     * 实现的接包方法:
     */

    public void receivePacket(Packet packet) {
        try {
            if (packet instanceof IPPacket) {     //分析IP
                IPPacket iPacket = (IPPacket) packet;
                if (iPacket.version == 4) {      //分析IPv4协议
                    packetInfo.setVersion(iPacket.version); //IP版本
                    packetInfo.setRsv_tos(iPacket.rsv_tos); //服务类型
                    packetInfo.setPriority(iPacket.priority); //优先级
                    packetInfo.setLength(iPacket.length); //长度
                    packetInfo.setIdent(iPacket.ident); //标识
                    packetInfo.setDont_frag(iPacket.dont_frag); //Don't Frag?
                    packetInfo.setMore_frag(iPacket.more_frag); //More Frag?
                    packetInfo.setOffset(iPacket.offset);//片偏移
                    packetInfo.setHop_limit(iPacket.hop_limit);  //生存时间
                    packetInfo.setProtocol(iPacket.protocol); //协议
                    packetInfo.setSrc_ip(iPacket.src_ip.getHostAddress());
                    packetInfo.setDst_ip(iPacket.dst_ip.getHostAddress()); //目的IP
                    packetInfo.setOption(BytesToHexString(iPacket.option));//数据报首部的可变部分
                }

                if (iPacket instanceof UDPPacket) { //分析UDP协议
                    UDPpacket udpPacket = new UDPpacket();
                    UDPPacket uPacket = (UDPPacket) iPacket;
                    udpPacket.setSrc_port(uPacket.src_port);//源端口
                    udpPacket.setDst_port(uPacket.dst_port); //目的端口
                    udpPacket.setLength(uPacket.length); //长度
                    packetInfo.setSort("udp", udpPacket);
                }

                if (iPacket instanceof TCPPacket) {      //分析TCP协议
                    TCPpacket tcpPacket = new TCPpacket();
                    TCPPacket tPacket = (TCPPacket) iPacket;
                    tcpPacket.setSrc_port(tPacket.src_port); //源端口
                    tcpPacket.setDst_port(tPacket.dst_port); //目的端口
                    tcpPacket.setSequence(tPacket.sequence); //序号
                    tcpPacket.setAck_num(tPacket.ack_num); //确认序号
                    tcpPacket.setUrg(tPacket.urg);  //URG
                    tcpPacket.setAck(tPacket.ack);  //ACK
                    tcpPacket.setPsh(tPacket.psh); //PSH
                    tcpPacket.setRst(tPacket.rst); //RST
                    tcpPacket.setSyn(tPacket.syn); //SYN
                    tcpPacket.setFin(tPacket.fin); //FIN
                    tcpPacket.setWindow(tPacket.window); //窗口大小
                    tcpPacket.setUrgent_pointer(tPacket.urgent_pointer); //紧急指针
                    tcpPacket.setOption(BytesToHexString(tPacket.option));//数据报首部的可变部分
                    packetInfo.setSort("tcp", tcpPacket);
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
