package com.producto.controller;

import com.producto.entity.Producto;
import com.producto.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("producto")
public class ProductoController {
    @Autowired
    ProductoService productoService;
    @GetMapping("/producto/{id}")
    public Optional<Producto> buscarProducto(@PathVariable Integer id){
        return productoService.getProducto(id);
    }
    @GetMapping("/producto")
    public List<Producto> getProducto(){
        return productoService.getProducto();
    }
    @PostMapping("/insertar")
    public Producto insertarProducto(@RequestBody Producto producto){
        return productoService.insertarProducto(producto);
    }
    @DeleteMapping("/eliminar/{id}")
    public void eliminarProducto(@PathVariable Integer id){
        productoService.eliminarProducto(id);
    }
    @PutMapping("/modificar")
    public Producto modificarProducto(@RequestBody Producto producto){
        return productoService.modificarProducto(producto);
    }
}
