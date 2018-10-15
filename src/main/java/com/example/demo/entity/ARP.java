package com.example.demo.entity;

public class ARP {
    private Integer id;

    private String targetProtoaddr;

    private String targetHardaddr;

    private String senderProtoaddr;

    private String senderHardaddr;

    private String operation;

    private Integer plen;

    private Integer hlen;

    private Integer prototype;

    private Integer hardtype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTargetProtoaddr() {
        return targetProtoaddr;
    }

    public void setTargetProtoaddr(String targetProtoaddr) {
        this.targetProtoaddr = targetProtoaddr == null ? null : targetProtoaddr.trim();
    }

    public String getTargetHardaddr() {
        return targetHardaddr;
    }

    public void setTargetHardaddr(String targetHardaddr) {
        this.targetHardaddr = targetHardaddr == null ? null : targetHardaddr.trim();
    }

    public String getSenderProtoaddr() {
        return senderProtoaddr;
    }

    public void setSenderProtoaddr(String senderProtoaddr) {
        this.senderProtoaddr = senderProtoaddr == null ? null : senderProtoaddr.trim();
    }

    public String getSenderHardaddr() {
        return senderHardaddr;
    }

    public void setSenderHardaddr(String senderHardaddr) {
        this.senderHardaddr = senderHardaddr == null ? null : senderHardaddr.trim();
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    public Integer getPlen() {
        return plen;
    }

    public void setPlen(Integer plen) {
        this.plen = plen;
    }

    public Integer getHlen() {
        return hlen;
    }

    public void setHlen(Integer hlen) {
        this.hlen = hlen;
    }

    public Integer getPrototype() {
        return prototype;
    }

    public void setPrototype(Integer prototype) {
        this.prototype = prototype;
    }

    public Integer getHardtype() {
        return hardtype;
    }

    public void setHardtype(Integer hardtype) {
        this.hardtype = hardtype;
    }
}