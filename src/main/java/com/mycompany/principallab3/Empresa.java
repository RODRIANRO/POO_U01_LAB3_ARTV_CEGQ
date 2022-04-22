/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principallab3;

/**
 *
 * @author NOTEBOOK
 */
public class Empresa {
    String nombre;
    String direccion;
    String tipo;
    Empleado datosTrabajador;
    Departamento areaTrbajo;
    public boolean existeEmpresa(){
        var retorno=false;
        if(this.nombre=="Quito MOtors"){
            retorno=true;
        }
        return retorno;
    }
}
