package com.streamxhub.spark.monitor.core.service.impl;


import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.streamxhub.spark.monitor.core.dao.SparkConfRecordMapper;
import com.streamxhub.spark.monitor.core.domain.SparkConfRecord;
import com.streamxhub.spark.monitor.core.service.SparkConfRecordService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author benjobs
 */
@Service("sparkConfRecordService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class SparkConfRecordServiceImpl extends ServiceImpl<SparkConfRecordMapper, SparkConfRecord> implements SparkConfRecordService {

    @Override
    public void delete(String myId) {
        UpdateWrapper wrapper = new UpdateWrapper<SparkConfRecord>();
        wrapper.eq("MY_ID", myId);
        baseMapper.delete(wrapper);
    }
}
