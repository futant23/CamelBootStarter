/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.web;

import com.company.domain.Greeting;
import org.apache.camel.ProducerTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 
 */
@RestController
public class GreetingController {
    
    private final static Logger log =LoggerFactory.getLogger(GreetingController.class);
    
    @Autowired
    private ProducerTemplate template;
    
    @RequestMapping("/greeting")
    public Greeting greeting() {

        Greeting greeting =template.requestBody("direct:greetingRequest", null, Greeting.class);
        log.info("greeting: "+greeting);
        return greeting;
    }
}
