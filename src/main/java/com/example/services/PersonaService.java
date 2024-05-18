package com.example.services;

import com.example.demo.domain.Persona;
import java.util.List;

public interface PersonaService {

    public List<Persona> listarPersonas();

    public void guardar(Persona persona);

    public void eliminar(Persona persona);

    public void encontrarPersona(Persona persona);

   

}
