/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;


@Controller
@Slf4j
public class ControladorInicio {
    @GetMapping("/")
    public String inicio(){
        log.info("ejecutando pai");
        
    return "index";
    }
    
  
   
}
