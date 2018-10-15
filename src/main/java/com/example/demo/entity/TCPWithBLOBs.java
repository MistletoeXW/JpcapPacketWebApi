package com.example.demo.entity;

public class TCPWithBLOBs extends TCP {
    private String sequence;

    private String ackNum;

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence == null ? null : sequence.trim();
    }

    public String getAckNum() {
        return ackNum;
    }

    public void setAckNum(String ackNum) {
        this.ackNum = ackNum == null ? null : ackNum.trim();
    }
}