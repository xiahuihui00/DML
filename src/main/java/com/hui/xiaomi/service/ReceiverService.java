package com.hui.xiaomi.service;

import com.github.pagehelper.PageInfo;
import com.hui.xiaomi.pojo.Receiver;

import java.util.List;

public interface ReceiverService {
    List<Receiver> selectReceiverById(Integer receiverId);
    int insertReceiverInfo(Receiver receiver);
    int deleteBatchReceiver(Integer[] receiverId);
    int updatePartReceiver(Receiver receiver);
    PageInfo<Receiver> selectReceiverPageList(Integer pageNum,Integer pageSize);
}
