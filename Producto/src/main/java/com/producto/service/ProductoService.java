package com.producto.service;

import com.producto.entity.Producto;
import com.producto.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository productoRepository;
    public Optional<Producto> getProducto(Integer id){
        return productoRepository.findById(id);
    }
    public List<Producto> getProducto(){
        return productoRepository.findAll();
    }
    public Producto insertarProducto(Producto producto){
        return productoRepository.save(producto);
    }
    public void eliminarProducto(Integer id){
        productoRepository.deleteById(id);
    }
    public Producto modificarProducto(Producto producto){
        return productoRepository.save(producto);
    }
}
