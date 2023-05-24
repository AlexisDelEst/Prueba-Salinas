package com.producto.controller;

import com.producto.entity.Plazos;
import com.producto.service.PlazosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("plazos")
public class PlazosController {
    @Autowired
    PlazosService plazosService;

    @GetMapping("/plazos/{id}")
    public Optional<Plazos> buscarPlazos(@PathVariable Integer id) {
        return plazosService.getPlazos(id);
    }

    @GetMapping("/plazos")
    public List<Plazos> getPlazos() {
        return plazosService.getPlazos();
    }

    @PostMapping("/alta")
    public Plazos insertarPlazos(@RequestBody Plazos plazos) {
        return plazosService.insertarPlazos(plazos);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarPlazos(@PathVariable Integer id) {
        plazosService.eliminarPlazos(id);
    }
}