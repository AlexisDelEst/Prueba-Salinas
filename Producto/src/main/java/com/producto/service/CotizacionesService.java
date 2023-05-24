package com.producto.service;

import com.producto.entity.Abono;
import com.producto.entity.Cotizaciones;
import com.producto.entity.Plazos;
import com.producto.entity.Producto;
import com.producto.repository.CotizacionesRepository;
import com.producto.repository.PlazosRepository;
import com.producto.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

@Service
public class CotizacionesService {
    @Autowired
    ProductoRepository productoRepository;
    @Autowired
    PlazosRepository plazosRepository;
    public Optional<Producto> getProducto(Integer id){
        return productoRepository.findById(id);
    }
    public Producto getProductoNombre(String nombre){
        return productoRepository.findByNombre(nombre);
    }
    public List<Plazos> getPlazos() {
        return plazosRepository.findAll();
    }
    public Abono generarCotizacion(int idProducto, int idPlazo){
        Producto producto=productoRepository.findById(idProducto).get();
        Plazos plazos=plazosRepository.findById(idPlazo).get();

        double normal=((producto.getPrecio()*plazos.getTasaNormal())+producto.getPrecio())/plazos.getDuracionSemanas();
        double puntual=((producto.getPrecio()*plazos.getTasaPuntual())+producto.getPrecio())/plazos.getDuracionSemanas();

        Abono abono=new Abono(normal, puntual);
        return abono;
    }
}
