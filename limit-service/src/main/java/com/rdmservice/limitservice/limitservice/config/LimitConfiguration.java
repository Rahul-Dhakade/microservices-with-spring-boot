package com.rdmservice.limitservice.limitservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limit-service")
public class LimitConfiguration {
    private Integer maximum;

    private Integer minimum;

    public Integer getMaximum() {
        return maximum;
    }

    public void setMaximum(Integer maximum) {
        this.maximum = maximum;
    }

    public Integer getMinimum() {
        return minimum;
    }

    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }

    @Override
    public String toString() {
        return "LimitConfiguration{" +
                "maximum=" + maximum +
                ", minimum=" + minimum +
                '}';
    }
}
