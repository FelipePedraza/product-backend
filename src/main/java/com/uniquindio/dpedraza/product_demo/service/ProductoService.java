package com.uniquindio.dpedraza.product_demo.service;

import com.uniquindio.dpedraza.product_demo.entity.Producto;
import com.uniquindio.dpedraza.product_demo.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> encontrarTodos() {
        return productoRepository.findAll();
    }

    public Optional<Producto> encontrarPorId(Long id) {
        return productoRepository.findById(id);
    }

    public Producto guardar(Producto producto) {
        return productoRepository.save(producto);
    }

    public void eliminarPorId(Long id) {
        productoRepository.deleteById(id);
    }
}