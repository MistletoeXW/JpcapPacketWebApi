package com.example.demo.entity;

public class TCP {
    private Integer id;

    private Integer srcPort;

    private Integer dstPort;

    private Boolean urg;

    private Boolean ack;

    private Boolean psh;

    private Boolean rst;

    private Boolean syn;

    private Boolean fin;

    private Integer window;

    private Integer urgentPointer;

    private String data;

    private Integer sortId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSrcPort() {
        return srcPort;
    }

    public void setSrcPort(Integer srcPort) {
        this.srcPort = srcPort;
    }

    public Integer getDstPort() {
        return dstPort;
    }

    public void setDstPort(Integer dstPort) {
        this.dstPort = dstPort;
    }

    public Boolean getUrg() {
        return urg;
    }

    public void setUrg(Boolean urg) {
        this.urg = urg;
    }

    public Boolean getAck() {
        return ack;
    }

    public void setAck(Boolean ack) {
        this.ack = ack;
    }

    public Boolean getPsh() {
        return psh;
    }

    public void setPsh(Boolean psh) {
        this.psh = psh;
    }

    public Boolean getRst() {
        return rst;
    }

    public void setRst(Boolean rst) {
        this.rst = rst;
    }

    public Boolean getSyn() {
        return syn;
    }

    public void setSyn(Boolean syn) {
        this.syn = syn;
    }

    public Boolean getFin() {
        return fin;
    }

    public void setFin(Boolean fin) {
        this.fin = fin;
    }

    public Integer getWindow() {
        return window;
    }

    public void setWindow(Integer window) {
        this.window = window;
    }

    public Integer getUrgentPointer() {
        return urgentPointer;
    }

    public void setUrgentPointer(Integer urgentPointer) {
        this.urgentPointer = urgentPointer;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }
}