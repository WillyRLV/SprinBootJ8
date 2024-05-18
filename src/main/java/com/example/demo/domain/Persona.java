package com.example.demo.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //validaciones
    private Long idPersona;
    
    @NotEmpty(message = "ta vació papu")
    private String nombre;
    
    @NotEmpty
    private String apellido;
    
    private String edad;

}
