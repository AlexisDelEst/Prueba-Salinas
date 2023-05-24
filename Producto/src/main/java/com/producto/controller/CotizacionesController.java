package com.producto.controller;

import com.producto.entity.Abono;
import com.producto.entity.Plazos;
import com.producto.entity.Producto;
import com.producto.repository.ProductoRepository;
import com.producto.service.CotizacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("cotizaciones")
public class CotizacionesController {
    @Autowired
    CotizacionesService cotizacionesService;
    @GetMapping("/buscar/{id}")
    public Optional<Producto> getProducto(@PathVariable Integer id){
        return cotizacionesService.getProducto(id);
    }
    @GetMapping("/buscar/{nombre}")
    public Producto getProductoNombre(@PathVariable String nombre){
        return cotizacionesService.getProductoNombre(nombre);
    }
    @GetMapping("/plazos")
    public List<Plazos> getPlazos() {
        return cotizacionesService.getPlazos();
    }
    @GetMapping("/cotizar/{idProducto}/{idPlazo}")
    public Abono generarCotizacion(@PathVariable int idProducto,@PathVariable int idPlazo){
        Abono abono=cotizacionesService.generarCotizacion(idProducto, idPlazo);
        return abono;
    }
}
