package com.qx.consumer.service;

import com.qx.core.api.DemoApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DemoService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoService.class);

    @Autowired
    private DemoApi demoApi;

    public Map<String, Object> demo(){
        return demoApi.demo();
    }
}
