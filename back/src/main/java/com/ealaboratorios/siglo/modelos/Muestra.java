package com.ealaboratorios.siglo.modelos;

import org.springframework.data.annotation.Id;

public class Muestra {

    @Id
    private String id;
    private String nombre;

    public Muestra(){};

    public Muestra(String nombre){
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
