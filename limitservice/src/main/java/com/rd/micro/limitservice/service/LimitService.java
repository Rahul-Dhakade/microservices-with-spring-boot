package com.rd.micro.limitservice.service;

import com.rd.micro.limitservice.config.LimitConfiguration;
import com.rd.micro.limitservice.dto.Limit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LimitService {
    @Autowired
    private LimitConfiguration limitConfiguration;

    public Limit getLimits(){
        return new Limit(limitConfiguration.getMaximum(),limitConfiguration.getMinimum());
    }
}