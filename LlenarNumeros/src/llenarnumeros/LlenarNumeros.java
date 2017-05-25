/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llenarnumeros;

/**
 *
 * @author Jose
 */
public class LlenarNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int n=5;
        int j;
        int[] tabla= new int[n];
        
        tabla=Llenar(n);
        int suma=Sumar(tabla);
        System.out.println("La suma es: "+suma);
    }
    
    /**
     *
     * @param n
     * @return
     */
    public static int[]  Llenar(int n){
        int[] tabla= new int[n];
        
        for(int i=0; i<n; i++){
            tabla[i]=i+10;
        }
        return tabla;
    }
    
    /**
     *
     * @param tabla
     * @return
     */
    public static int  Sumar(int[] tabla){
        int suma=0;
        int n=tabla.length;
        
        for(int i=0; i<n; i++){
            suma=suma+tabla[i];
        }
        return suma;
    }
    
    
    
}
