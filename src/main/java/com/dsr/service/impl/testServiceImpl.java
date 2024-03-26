package com.dsr.service.impl;

import com.dsr.service.testService;
import org.springframework.stereotype.Service;

@Service
public class testServiceImpl implements testService {
    @Override
    public String test(){
        return "test";
    }
}