package com.example.demo.web;

import com.example.demo.domain.Persona;
import lombok.extern.slf4j.Slf4j;
import com.example.demo.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/")
    public String inicio(Model model) {
        Iterable<Persona> lista =  personaService.listarPersonas();
        log.info("ejecutando el controlador spring MVC");
        model.addAttribute("personas", lista);
        return "index";
    }

}
