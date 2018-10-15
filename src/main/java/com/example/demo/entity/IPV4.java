package com.example.demo.entity;

public class IPV4 {
    private Integer id;

    private Integer version;

    private Integer priority;

    private Integer rsvTos;

    private Integer length;

    private String option;

    private String dstIp;

    private String srcIp;

    private Integer ident;

    private Integer protocol;

    private Integer hopLimit;

    private Integer offset;

    private Boolean moreFrag;

    private Boolean dontFrag;

    private Integer sortId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getRsvTos() {
        return rsvTos;
    }

    public void setRsvTos(Integer rsvTos) {
        this.rsvTos = rsvTos;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option == null ? null : option.trim();
    }

    public String getDstIp() {
        return dstIp;
    }

    public void setDstIp(String dstIp) {
        this.dstIp = dstIp == null ? null : dstIp.trim();
    }

    public String getSrcIp() {
        return srcIp;
    }

    public void setSrcIp(String srcIp) {
        this.srcIp = srcIp == null ? null : srcIp.trim();
    }

    public Integer getIdent() {
        return ident;
    }

    public void setIdent(Integer ident) {
        this.ident = ident;
    }

    public Integer getProtocol() {
        return protocol;
    }

    public void setProtocol(Integer protocol) {
        this.protocol = protocol;
    }

    public Integer getHopLimit() {
        return hopLimit;
    }

    public void setHopLimit(Integer hopLimit) {
        this.hopLimit = hopLimit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Boolean getMoreFrag() {
        return moreFrag;
    }

    public void setMoreFrag(Boolean moreFrag) {
        this.moreFrag = moreFrag;
    }

    public Boolean getDontFrag() {
        return dontFrag;
    }

    public void setDontFrag(Boolean dontFrag) {
        this.dontFrag = dontFrag;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }
}