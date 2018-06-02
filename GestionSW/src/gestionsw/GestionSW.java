/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionsw;

import java.util.Scanner;

/**
 *
 * @author EST_1F_GC1_010
 */
public class GestionSW {

  
    public static void main(String[] args) {
        int numCaracteres = 0; 
        int numPalabras = 0; 
        int numEspacios = 0; 
        Scanner teclado=new Scanner(System.in);
        System.out.println("Escriba una frase: ");
        String cadena = teclado.nextLine(); 
        numPalabras = contarPalabras(cadena);
        numCaracteres = contarCaracteres(cadena); 
        reporte(numCaracteres, numPalabras);
        
    }
    public static void reporte(int _numCaracteres, int _numPalabras){
        
        System.out.println("Numero de caracteres: "+ _numCaracteres);
        System.out.println("Numero de palabras: "+ _numPalabras);
        System.out.println("Numero de espacios: "+ (_numPalabras - 1));
    }
    
    public static int contarCaracteres(String _cadena){
        char[] arreglo = _cadena.toCharArray();
        return arreglo.length; 
    }
    public static int contarPalabras(String _cadena){
       char[] arreglo = _cadena.toCharArray();
        int contador = 1; 
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i]== ' ') {
               contador++;  
            }
        }
        return contador; 
    }
  }
    

