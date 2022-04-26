package com.hui.xiaomi.dao;

import com.hui.xiaomi.pojo.Receiver;

import java.util.List;

public interface ReceiverMapper {
    List<Receiver> selectReceiverById(Integer receiverId);
    int insertReceiverInfo(Receiver receiver);
    int deleteBatchReceiver(Integer[] receiverId);
    int updatePartReceiver(Receiver receiver);
    List<Receiver> selectReceiverPageList();
}
