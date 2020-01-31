package com.ealaboratorios.siglo.controladores;

import com.ealaboratorios.siglo.modelos.Muestra;
import com.ealaboratorios.siglo.servicios.IMuestrasServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/muestra")
public class MuestrasController {

    @Autowired
    private IMuestrasServicio muestrasServicio;

    @PostMapping("/crear")
    public Muestra agregarMuestra(@RequestBody Muestra muestra) {
        Muestra creada = muestrasServicio.saveMuestra(muestra);
        return creada;
    }

    @GetMapping("/todas")
    public List<Muestra> traerMuestras(){
        List<Muestra> lista = muestrasServicio.listaMuestras();
        return lista;
    }

}