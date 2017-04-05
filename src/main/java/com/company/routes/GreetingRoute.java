/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.routes;

import com.company.services.GreetingService;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author 
 */
@Component
public class GreetingRoute extends RouteBuilder{

    @Autowired
    GreetingService service;
    
    @Override
    public void configure() throws Exception {
         from("direct:greetingRequest")
                .setExchangePattern(ExchangePattern.InOut)
                .bean(service, "getGreeting");
    }
    
}
