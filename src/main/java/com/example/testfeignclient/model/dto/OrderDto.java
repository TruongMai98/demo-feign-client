package com.example.testfeignclient.model.dto;

import java.time.LocalDate;

public class OrderDto {
    private Long orderId;
    private Long customerId;
    private LocalDate date;
    private Double total;

    public OrderDto(Long orderId, Long customerId, LocalDate date, Double total) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.date = date;
        this.total = total;
    }

    public OrderDto() {
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
