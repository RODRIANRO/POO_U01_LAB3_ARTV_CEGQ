/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.principallab3;
import java.util.Scanner;
/**
 *
 * @author NOTEBOOK
 */
public class PrincipalLab3 {

        
    public static void main(String[] args) {
        
        var empresa1 = new Empresa();
        empresa1.nombre="Colinial";
        empresa1.direccion="Parque Industrial";
        empresa1.tipo="Muebles";
        var empleado1 = new Empleado();
        empleado1 .nombre="Miguel Angel";
        empleado1 .edad=35;
        empleado1 .areaTrabajo="Ingeniero Mecanico";
        empleado1 .contrato=5;
        var departamento1=new Departamento();
        departamento1.cargoOcupado="M";
        System.out.println("Nombre de la empresa: "+empresa1.nombre+
                           " ubicada en la "+empresa1.direccion);
        System.out.println("Nombre del emmpleado: "+empleado1.nombre);
        System.out.println("Edad: "+empleado1.edad);
        System.out.println("Profesion: "+empleado1.areaTrabajo);
         System.out.println("Departamento en el que trabaja: "+departamento1.verCargoDisponible());
        System.out.println("Estado del contrato laboral: "+empleado1.anoTrabajo());
        //////////////////////////
     
    }     
}
