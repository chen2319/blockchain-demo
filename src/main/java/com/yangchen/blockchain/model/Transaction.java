package com.yangchen.blockchain.model;

import java.io.Serializable;

/**
 * Transaction
 * 区块存储的业务数据，例如转账交易信息、票据信息、合同信息等
 *
 * @author cy
 */
public class Transaction implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 唯一标识
     */
    private String id;
    /**
     * 业务数据
     */
    private String businessInfo;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getBusinessInfo() {
        return businessInfo;
    }
    public void setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
    }
}
