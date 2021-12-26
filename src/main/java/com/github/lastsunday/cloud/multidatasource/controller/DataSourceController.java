package com.github.lastsunday.cloud.multidatasource.controller;

import com.github.lastsunday.cloud.multidatasource.bo.ProductBO;
import com.github.lastsunday.cloud.multidatasource.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DataSourceController {

    @Resource
    private UserService userService;

    //access url http://localhost:7867/test
    @GetMapping(path = "test")
    public String test(){
        ProductBO productBO = new ProductBO();
        productBO.setGoodId(1L);
        userService.selectFromMaster(productBO);
        userService.selectFromSlave1(productBO);
        userService.selectFromSlave2(productBO);
        return "hello world!";
    }
}
