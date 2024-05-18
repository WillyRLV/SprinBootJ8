/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.web;

import com.example.domain.Persona;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.dao.PersonaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

@Controller
@Slf4j
public class ControladorInicio {
   @Autowired
    private PersonaDao personaDao;
    @GetMapping("/")
    public String inicio(Model model) {
        
    List<>personas = personaDao.findAll();
        log.info("ejecutando el controlador spring MVC");

        return "index";
    }

}
