package com.hui.xiaomi.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hui.xiaomi.dao.ReceiverMapper;
import com.hui.xiaomi.pojo.Receiver;
import com.hui.xiaomi.service.ReceiverService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ReceiverServiceImpl implements ReceiverService {
    @Resource
    ReceiverMapper receiverMapper;
    @Override
    public List<Receiver> selectReceiverById(Integer receiverId) {
        List<Receiver> receivers = receiverMapper.selectReceiverById(receiverId);
        return receivers;
    }

    @Override
    public int insertReceiverInfo(Receiver receiver) {
        int rows = receiverMapper.insertReceiverInfo(receiver);
        return rows;
    }

    @Override
    public int deleteBatchReceiver(Integer[] receiverId) {
        int rows = receiverMapper.deleteBatchReceiver(receiverId);
        return rows;
    }

    @Override
    public int updatePartReceiver(Receiver receiver) {
        int rows = receiverMapper.updatePartReceiver(receiver);
        return rows;
    }

    @Override
    public PageInfo<Receiver> selectReceiverPageList(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Receiver> receivers = receiverMapper.selectReceiverPageList();
        PageInfo<Receiver> pageInfo = new PageInfo<>(receivers);
        return pageInfo;
    }
}
