/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.alarragas.t1.pkg2;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class SPPALarragaST12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Alfredo Alejandro Lárraga Sosa A01410278 LMC
        // Problema 2 Desarrollar un programa que arroje el perimetro y superfice de un rectángulo
        System.out.println("Perímetro y superficie de un rectángulo");
        
        //Variables
        double base,altu,per,sup;// per=perímetro sup=altura
        //Recepción de datos
        Scanner kb= new Scanner (System.in);
        
        //Asignar Variables
        System.out.println("Introduce la base de tu rectángulo");
        base=kb.nextDouble();
        System.out.println("Introduce su altura");
        altu=kb.nextDouble();
        
        //Operación
        per= 2*(base+altu);
        sup= (base*altu);
        
        //Resultado
        
        System.out.println("El perímetro de tu rectangulo es"+per);
        System.out.println("La superficie de tu rectangulo es"+sup);
        
       
        
    }
    
}
