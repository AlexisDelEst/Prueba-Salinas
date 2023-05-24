package com.producto.service;

import com.producto.entity.Plazos;
import com.producto.repository.PlazosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlazosService {
    @Autowired
    PlazosRepository plazosRepository;

    public Optional<Plazos> getPlazos(Integer id) {
        return plazosRepository.findById(id);
    }

    public List<Plazos> getPlazos() {
        return plazosRepository.findAll();
    }

    public Plazos insertarPlazos(Plazos plazos) {
        return plazosRepository.save(plazos);
    }

    public void eliminarPlazos(Integer id) {
        plazosRepository.deleteById(id);
    }

    public Plazos modificarPlazos(Plazos plazos) {
        return plazosRepository.save(plazos);
    }
}
