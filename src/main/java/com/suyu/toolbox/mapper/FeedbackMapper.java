package com.suyu.toolbox.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.suyu.toolbox.utils.feedback;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FeedbackMapper extends BaseMapper<feedback> {
}
