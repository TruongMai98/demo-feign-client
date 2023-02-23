package com.example.testfeignclient.client;

import com.example.testfeignclient.model.dto.OrderDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "feignDemo", url = "http://localhost:8080/api/orders")
public interface FeignServiceUtil {
    @GetMapping("/")
    String findAllOrders();

    @GetMapping("/{id}")
    String getOneOrder(@PathVariable("id") Long id);

    @PostMapping("/")
    String createOder(@RequestBody OrderDto orderDto);

    @DeleteMapping("/{id}")
    String deleteOrder(@PathVariable("id") Long id);

    @PutMapping("/")
    String updateOrder(@RequestBody OrderDto orderDto);
}
