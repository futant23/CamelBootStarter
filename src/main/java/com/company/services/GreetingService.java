/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.services;

import com.company.domain.Greeting;
import org.springframework.stereotype.Service;

/**
 *
 * @author 
 */
@Service
public class GreetingService {
    
    public Greeting getGreeting() {
        return new Greeting(System.currentTimeMillis(), "some kewl greeting");
    }
}
