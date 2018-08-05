package com.rdmservice.limitservice.limitservice.web.resource.dto;

public class LimitDTO {
    private Integer minimum;

    private Integer maximum;

    public Integer getMinimum() {
        return minimum;
    }

    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }

    public Integer getMaximum() {
        return maximum;
    }

    public void setMaximum(Integer maximum) {
        this.maximum = maximum;
    }

    @Override
    public String toString() {
        return "LimitDTO{" +
                "minimum=" + minimum +
                ", maximum=" + maximum +
                '}';
    }
}
