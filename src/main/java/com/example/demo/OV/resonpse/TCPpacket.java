package com.example.demo.OV.resonpse;

import lombok.Data;

@Data
public class TCPpacket {
    public int src_port;
    public int dst_port;
    public long sequence;
    public long ack_num;
    public boolean urg;
    public boolean ack;
    public boolean psh;
    public boolean rst;
    public boolean syn;
    public boolean fin;
    public int window;
    public short urgent_pointer;
    public String option;
}
