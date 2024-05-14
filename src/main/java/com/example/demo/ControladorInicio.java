/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import com.example.domain.Persona;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        ////Persona 1
        Persona persona1 = new Persona();
        persona1.setNombre("Juan");
        persona1.setApellido("Perez");
        persona1.setEmail("jPerez@gmail.com");
        ////Persona 2
        Persona persona2 = new Persona();
        persona2.setNombre("Jorge");
        persona2.setApellido("Suarez");
        persona2.setEmail("jSuarez@gmail.com");

        //dominio persona con iteracion
        //Con arrayList
        //primera forma
//        List<Persona> personas = new ArrayList();
//        personas.add(persona1);
//        personas.add(persona2);
        //segunda forma
        List<Persona> lista = Arrays.asList(persona1, persona2);

        model.addAttribute("mensaje", saludar);
        //si deseamos obtener un valor desde  application.properties
        model.addAttribute("mensaje2", saludo);
        //aqui usamos el valor del dominio en un nuevo modelo
        model.addAttribute("persona", persona1);
        //aqui usamos el array para iterar en el html
        //model.addAttribute("personas", lista);

        return "index";
    }

}
