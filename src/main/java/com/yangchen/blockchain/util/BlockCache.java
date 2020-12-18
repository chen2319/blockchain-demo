package com.yangchen.blockchain.util;

import com.yangchen.blockchain.model.Block;
import com.yangchen.blockchain.model.Transaction;
import org.java_websocket.WebSocket;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * BlockCache
 * 链式结构对象，按照先后顺序来保存区块对象，形成一个有序的区块链表。
 * 暂且把区块链结构保存在本地缓存中，实际的区块链网络最终会实现持久层的功能，把区块链数据保存至数据库中，例如BTC核心网络采用的是K-V数据库LevelDB
 * @author cy
 */
@ConfigurationProperties(prefix = "block")
@Component
public class BlockCache {

    /**
     * 当前节点的区块链结构
     */
    private List<Block> blockChain = new CopyOnWriteArrayList<Block>();

    /**
     * 已打包保存的业务数据集合
     */
    private List<Transaction> packedTransactions = new CopyOnWriteArrayList<Transaction>();

    /**
     * 当前节点的socket对象
     */
    private List<WebSocket> socketsList = new CopyOnWriteArrayList<WebSocket>();

    /**
     * 挖矿的难度系数
     */
    @Value("${block.difficulty}")
    private int difficulty;

    /**
     * 当前节点p2pserver端口号
     */
    @Value("${block.p2pport}")
    private int p2pport;

    /**
     * 要连接的节点地址
     */
    @Value("${block.address}")
    private String address;

    /**
     * 获取最新的区块，即当前链上最后一个区块
     *
     * @return
     */
    public Block getLatestBlock() {
        return blockChain.size() > 0 ? blockChain.get(blockChain.size() - 1) : null;
    }

    public List<Block> getBlockChain() {
        return blockChain;
    }

    public void setBlockChain(List<Block> blockChain) {
        this.blockChain = blockChain;
    }

    public List<Transaction> getPackedTransactions() {
        return packedTransactions;
    }

    public void setPackedTransactions(List<Transaction> packedTransactions) {
        this.packedTransactions = packedTransactions;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public List<WebSocket> getSocketsList() {
        return socketsList;
    }

    public void setSocketsList(List<WebSocket> socketsList) {
        this.socketsList = socketsList;
    }

    public int getP2pport() {
        return p2pport;
    }

    public void setP2pport(int p2pport) {
        this.p2pport = p2pport;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
