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
        numEspacios = contarEspacios(cadena); 
        reporte(numCaracteres, numPalabras, numEspacios);    
    }
    public static void reporte(int _numCaracteres, int _numPalabras, int _numEspacios){
        System.out.println("Numero de caracteres: "+ _numCaracteres);
        System.out.println("Numero de palabras: "+ _numPalabras);
        System.out.println("Numero de espacios: "+ _numEspacios );
    }
    
    public static int contarCaracteres(String _cadena){
        char[] arreglo = _cadena.toCharArray();
        return arreglo.length; 
    }
    public static int contarPalabras(String _cadena){
       char[] arreglo = _cadena.toCharArray();
       char caracterOld; 
        int contador = 1; 
        for (int i = 1; i < arreglo.length; i++) {
            caracterOld = arreglo[i-1]; 
            if (arreglo[i]!= ' ' && caracterOld==' ') {
               contador++;  
            }
        }
        return (contador==1)?0:contador; 
    }
     public static int contarEspacios(String _cadena){
       char[] arreglo = _cadena.toCharArray();
        int contador = 0; 
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i]== ' ') {
               contador++;  
            }
        }
        return contador; 
    }
  }
    
