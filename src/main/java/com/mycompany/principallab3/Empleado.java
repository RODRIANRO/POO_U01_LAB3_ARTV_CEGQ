/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principallab3;

/**
 *
 * @author NOTEBOOK
 */
public class Empleado {
    String nombre;
    int edad;
    String areaTrabajo;
    float contrato;
     public String anoTrabajo(){
         var retorno = "--- ";
            if(contrato>=0 && contrato<=1){
               retorno= " se renovara contrato : ";
            }else{
            if(contrato>=1 && contrato<=5){
                retorno= " Aumento del 3% salario : ";
            }else{
             if(contrato>=5 && contrato<=10){
                retorno= "Liquidacion por tiempo de trabajo :";
             } 
            }          
         }    
        return retorno;
    }
}

