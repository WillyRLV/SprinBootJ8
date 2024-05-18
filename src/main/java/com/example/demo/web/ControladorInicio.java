package com.example.demo.web;

import com.example.demo.domain.Persona;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import com.example.demo.dao.PersonaDao;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private PersonaDao personaDao;

    @GetMapping("/")
    public String inicio(Model model) {
        Iterable<Persona> lista =  personaDao.findAll();
        log.info("ejecutando el controlador spring MVC");
        model.addAttribute("personas", lista);
        return "index";
    }

}
