package com.yangchen.blockchain.model;

import java.io.Serializable;
import java.util.List;

/**
 * Block
 * 区块结构
 *
 * @author cy
 */
public class Block implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 区块索引号(区块高度)
     */
    private int index;
    /**
     * 当前区块的hash值,区块唯一标识
     */
    private String hash;
    /**
     * 前一个区块的hash值
     */
    private String previousHash;
    /**
     * 生成区块的时间戳
     */
    private long timestamp;
    /**
     * 工作量证明，计算正确hash值的次数
     */
    private int nonce;
    /**
     * 当前区块存储的业务数据集合（例如转账交易信息、票据信息、合同信息等）
     */
    private List<Transaction> transactions;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public int getNonce() {
        return nonce;
    }

    public void setNonce(int nonce) {
        this.nonce = nonce;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
