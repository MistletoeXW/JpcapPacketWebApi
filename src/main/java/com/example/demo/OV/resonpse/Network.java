package com.example.demo.OV.resonpse;

import java.util.*;

public class Network {

    private Map<String,String> networkmap = new HashMap<>();

    public Map<String, String> getNetwork() {
        return networkmap;
    }

    public void setNetwork(String name,String address,String otheraddress) {
        this.networkmap.put("name",name);
        this.networkmap.put("address",address);
        this.networkmap.put("otherAddress",otheraddress);
    }



}
