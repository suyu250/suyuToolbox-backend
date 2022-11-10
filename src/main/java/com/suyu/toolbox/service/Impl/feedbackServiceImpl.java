package com.suyu.toolbox.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.suyu.toolbox.mapper.FeedbackMapper;
import com.suyu.toolbox.service.feedbackService;
import com.suyu.toolbox.utils.feedback;
import org.springframework.stereotype.Service;

@Service
public class feedbackServiceImpl extends ServiceImpl<FeedbackMapper, feedback> implements feedbackService {
}
