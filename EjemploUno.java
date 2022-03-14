package com.mycompany.ejemplouno;
import java.util.Scanner;
/**
 *
 * @author Kevin-Martinez
 */
public class EjemploUno {

    public static void main(String[] args) {
       Scanner leer =  new Scanner(System.in); 
       String nombre = "";
       String apellido = ""; 
       int numUno = 0, numDos = 0,numTres = 0, resultado = 0; 
       
        System.out.print("¿Cual es su nombre?");
        nombre = leer.nextLine(); 
        
        System.out.print("¿Cual es su apellido?");
        apellido = leer.nextLine(); 
        
        System.out.print("Ingrese su primera nota a promediar: ");
        numUno = leer.nextInt(); 
        System.out.print("Ingrese su segunda nota a promediar: ");
        numDos = leer.nextInt(); 
        System.out.print("Ingrese su tercera nota a promediar: ");
        numTres = leer.nextInt(); 
       
        resultado = (numUno + numDos + numTres) / 3;
        
        if(resultado < 11){
            System.out.println("El alumno" + nombre + apellido + " reprobó, su promedio es de: " + resultado);
        } else if (resultado >= 11 && resultado < 17){
            System.out.println("El alumno" + nombre + apellido + " aprobó , excelente, su nota es de: " + resultado);
        }else if(resultado >= 17 && resultado <= 20){
            System.out.println("El alumno" + nombre + apellido + " aprobó, felicidades, su nota es de: " + resultado);
        }
        
        
        
    }
}
