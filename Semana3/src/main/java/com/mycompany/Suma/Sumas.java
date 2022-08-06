/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Suma;

import java.util.Scanner;

/**
 *
 * @author Emily Barrientos
 */
public class Sumas {

        public static int matriz[][], nFilas, nColumnas;
        static Scanner t = new Scanner(System.in);
       
    
    public static void definirTamano(){
        
        System.out.println("Ingrese el numero de la Matriz en filas&columnas");
        
        String datosIngresado = t.next();
        
        String[] datos= datosIngresado.split("&");
        
        int nFilas= Integer.parseInt(datos[0]);
        int nColumnas = Integer.parseInt(datos[1]);
        
        
        matriz = new int[nFilas][nColumnas];
 
    }

    
        public static void imprimirDecorado(){
        for(int x=0; x<matriz.length; x++){
            System.out.print("|");
            for(int y=0; y<matriz[x].length; y++){
                System.out.print(matriz[x][y]);
                if(y!= matriz[x].length -1){
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }
       
    public static void ingresoDatos(){
        
        System.out.println("Ingrese valores de la matriz: ");
        for(int f=0; f<matriz.length; f++){
            for(int c=0; c<matriz[f].length; c++){
                matriz [f][c] = Integer.parseInt(t.next());  
            }      
        } 
    }
   
    public static void imprimirMatriz(){
        for(int f=0; f<matriz.length; f++){
            for(int c=0; c<matriz[f].length; c++){
                System.out.println(matriz[f][c]);
            }
            System.out.println();
        }
    }
//    
    public static void SumaF(){
        int totalf=0;
       // System.out.println("Escoja la fila: ");
        for(int i=0; i<matriz.length; i++){
            totalf=0;
            for(int j=0; j<matriz[i].length; j++){
                totalf += matriz[i][j];
            }
             System.out.println("La suma de las fila ["+i+"] es: "+totalf);       
        }
    }
    
    public static void SumaC(){
        int totalc=0;
        for(int j=0; j<matriz.length+1; j++){
            totalc=0;
            for(int i=0; i<matriz.length; i++){
                totalc += matriz[i][j];
            }
            System.out.println("La suma de las columa["+j+"] es: "+totalc);
        }
    }
    
    public static void sumaDiagonalP(){
    
        int sumaDiagP=0;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if(i==j){
                    sumaDiagP += matriz[i][j];
                }
            }
        }
        System.out.println("La suma de la diagonal Principal es de: "+sumaDiagP);
        
    }
    
    public static void sumaDiagonalS(){
        int sumaDiagS=0;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if(i+j ==(matriz.length-1)){
                    sumaDiagS += matriz[i][j];
                }
            }
        }
        System.out.println("La suma de la diagonal Secundaria es de: "+sumaDiagS);
    }
            
    
    public static void main(String[] args) {
        
        definirTamano();
        ingresoDatos();
        imprimirMatriz();
        //SumaF();
        //SumaC();
        sumaDiagonalP();
        sumaDiagonalS();
        imprimirDecorado();
    }
}
