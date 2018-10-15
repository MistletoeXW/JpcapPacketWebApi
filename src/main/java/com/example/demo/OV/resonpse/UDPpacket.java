package com.example.demo.OV.resonpse;

import lombok.Data;

@Data
public class UDPpacket {
    public int src_port;
    public int dst_port;
    public int length;
}
