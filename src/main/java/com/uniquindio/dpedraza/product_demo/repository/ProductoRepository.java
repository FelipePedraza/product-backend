package com.uniquindio.dpedraza.product_demo.repository;

import com.uniquindio.dpedraza.product_demo.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}