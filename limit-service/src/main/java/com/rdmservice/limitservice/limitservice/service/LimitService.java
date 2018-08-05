package com.rdmservice.limitservice.limitservice.service;

import com.rdmservice.limitservice.limitservice.config.LimitConfiguration;
import com.rdmservice.limitservice.limitservice.model.Limit;
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
