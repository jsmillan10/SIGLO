package com.ealaboratorios.siglo.servicios;

import com.ealaboratorios.siglo.modelos.Muestra;

import java.util.List;

public interface IMuestrasServicio {

    Muestra saveMuestra(Muestra nombre);
    List<Muestra> listaMuestras();

}
