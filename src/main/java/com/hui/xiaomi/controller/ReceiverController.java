package com.hui.xiaomi.controller;
import com.github.pagehelper.PageInfo;
import com.hui.xiaomi.pojo.Receiver;
import com.hui.xiaomi.service.ReceiverService;
import com.hui.xiaomi.vo.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/action")
public class ReceiverController {
    @Resource
    ReceiverService receiverService;
    @RequestMapping("/selectReceiverById")
    public Result selectReceiverById(Integer receiverId){
        List<Receiver> receivers = receiverService.selectReceiverById(receiverId);
        return new Result(true,"查询成功",receivers);

    }
    @RequestMapping("/insertReceiverInfo")
    public Result insertReceiverInfo(@RequestBody Receiver receiver){
        int rows = receiverService.insertReceiverInfo(receiver);
        if (rows!=0){
            return new Result(true,"添加成功");
        }
        return new Result(false,"添加失败");
    }
    @RequestMapping("/deleteBatchReceiver")
    public Result deleteBatchReceiver(@RequestBody Integer[] receiverId){
        int rows = receiverService.deleteBatchReceiver(receiverId);
        if (rows!=0){
            return new Result(true,"删除成功");
        }
        return new Result(false,"删除失败");
    }
    @RequestMapping("/updatePartReceiver")
    public Result updatePartReceiver(@RequestBody Receiver receiver){
        int rows = receiverService.updatePartReceiver(receiver);
        if (rows!=0){
            return new Result(true,"更新成功");
        }
        return new Result(false,"更新失败");
    }
    @RequestMapping("/selectReceiverPageList")
    public Result selectReceiverPageList(@RequestParam(defaultValue = "1")Integer pageNum,@RequestParam(defaultValue = "5")Integer pageSize){
        PageInfo<Receiver> pageInfo = receiverService.selectReceiverPageList(pageNum, pageSize);
        return new Result(true,"收货人信息分页成功",pageInfo);
    }
}
