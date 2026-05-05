package com.igor.petrov.learn_spring_framework.enterprise.web;

import com.igor.petrov.learn_spring_framework.enterprise.bisness.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWebController {
    @Autowired
    private BusinessService businessService;

    public long returnValueFromBusinessService() {
        return businessService.calculateSum();
    }

}




