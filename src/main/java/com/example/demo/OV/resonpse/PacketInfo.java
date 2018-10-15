package com.example.demo.OV.resonpse;


import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class PacketInfo {
    public byte version;
    public byte priority;
    public byte rsv_tos;
    public short length;
    public boolean dont_frag;
    public boolean more_frag;
    public short offset;
    public short hop_limit;
    public short protocol;
    public static final short IPPROTO_IP = 4;
    public static final short IPPROTO_TCP = 6;
    public static final short IPPROTO_UDP = 17;
    public int ident;
    public String src_ip;
    public String dst_ip;
    public String option;
    public Map<String,Object> sort = new HashMap<>();

    public void setSort(String name, Object object) {
        this.sort.put(name,object);
    }
}
