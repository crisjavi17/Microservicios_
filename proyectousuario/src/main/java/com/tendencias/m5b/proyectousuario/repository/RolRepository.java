/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tendencias.m5b.proyectousuario.repository;

import com.tendencias.m5b.proyectousuario.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @Lenovo
 */
public interface RolRepository extends JpaRepository<Rol, Integer>{
        @Query(value = "Select * from rol r where r.tipo = :tipo", nativeQuery = true)
    public Rol buscarUsuario(String tipo);
}
