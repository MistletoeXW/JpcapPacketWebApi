package com.example.demo.OV;

import lombok.Data;

@Data
public class countResponse {

    private Integer ipv4;
    private Integer tcp;
    private Integer udp;
    private Integer arp;
}
