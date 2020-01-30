package com.ealaboratorios.siglo.servicios;

import com.ealaboratorios.siglo.modelos.Muestra;
import com.ealaboratorios.siglo.repositorios.MuestrasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MuestrasServicio implements IMuestrasServicio{

    @Autowired
    private MuestrasRepo muestrasRepo;

    @Override
    public Muestra saveMuestra(Muestra muestra) {
        return muestrasRepo.save(muestra);
    }

    @Override
    public List<Muestra> listaMuestras() {
        List<Muestra> lista = muestrasRepo.findAll();
        return lista;
    }
}
