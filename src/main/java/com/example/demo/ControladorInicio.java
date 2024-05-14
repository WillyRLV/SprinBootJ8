/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import com.example.domain.Persona;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

@Controller
@Slf4j
public class ControladorInicio {

    @Value("${index.saludo}")
    private String saludo;

    @GetMapping("/")
    public String inicio(Model model) {
        String saludar = "Hola mundo con tymeleaf";
        //log.info("ejecutando pai");
        //traemos el dominio persona
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        persona.setEmail("jPerez@gmail.com");

        model.addAttribute("mensaje", saludar);
        //si deseamos obtener un valor desde  application.properties
        model.addAttribute("mensaje2", saludo);
        //aqui usamos el valor del dominio en un nuevo modelo
        model.addAttribute("persona", persona);

        return "index";
    }

}
