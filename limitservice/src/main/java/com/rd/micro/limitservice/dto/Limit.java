package com.rd.micro.limitservice.dto;

public class Limit {
    private Integer maximum;

    private Integer minimum;

    public Limit(){}

    public Limit(Integer maximum, Integer minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }

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
        return "Limit{" +
                "maximum=" + maximum +
                ", minimum=" + minimum +
                '}';
    }
}