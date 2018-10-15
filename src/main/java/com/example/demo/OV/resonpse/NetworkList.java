package com.example.demo.OV.resonpse;


import java.util.ArrayList;
import java.util.List;

public class NetworkList {

    private List<Network> networkList = new ArrayList<>();

    public List<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(Network map) {
        this.networkList.add(map);
    }
}
