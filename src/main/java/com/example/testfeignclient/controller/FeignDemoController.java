package com.example.testfeignclient.controller;

import com.example.testfeignclient.client.FeignServiceUtil;
import com.example.testfeignclient.model.dto.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo-feign")
public class FeignDemoController {
    @Autowired
    private FeignServiceUtil feignServiceUtil;

    @GetMapping("/get-orders")
    public String getOrders(){
        return feignServiceUtil.findAllOrders();
    }

    @GetMapping("/get-one-order/{id}")
    public String getOneOrder(@PathVariable("id") Long id) {
        return feignServiceUtil.getOneOrder(id);
    }

    @PostMapping("/create-order")
    public String createOrder(@RequestBody OrderDto orderDto) {
        return feignServiceUtil.createOder(orderDto);
    }

    @DeleteMapping("/delete-order/{id}")
    public String deleteOrder(@PathVariable("id") Long id) {
        return feignServiceUtil.deleteOrder(id);
    }

    @PutMapping("/update-order")
    public String updateOrder(@RequestBody OrderDto orderDto) {
        return feignServiceUtil.updateOrder(orderDto);
    }
}
