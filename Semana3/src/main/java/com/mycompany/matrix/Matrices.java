/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matrix;

/**
 *
 * @author Emily Barrientos
 */
public class Matrices {
    private static String[][] ma = new String [8][8];
    
    private static void cargaMatriz(){
        
        for (int c=0; c<ma.length; c++){
            for(int f=0; f<ma.length; f++){
                ma[f][c] = "X";
            }
        }
    }
    
    private static void imprimeMatriz(){
        
          for (int c=0; c<ma.length; c++){
            for(int f=0; f<ma.length; f++){
                System.out.print(ma[f][c]); 
            }
              System.out.println(" ");
        }
    }
    
    public static void imprimirDecorado(){
        for(int x=0; x<ma.length; x++){
            System.out.print("|");
            for(int y=0; y<ma[x].length; y++){
                System.out.print(ma[x][y]);
                if(y!= ma[x].length -1){
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }
    
    public static void columnasPares(){
        for(int f=0; f<ma.length; f++){
            for(int c=0; c<ma.length; c++){
                if(c%2==0){
                    ma[f][c]="P";
                }
            }
        }
    }
    
    public static void columnasX(){
        int columnas=0;
        int b=ma.length-1;
        try{
            for(int f=0; f<ma.length; f++, b--){
            ma[f][f]="\\";
            //columnas = ma.length -f;
            
            if (columnas != 8)
                {
                    ma[f][b]="/";
                }
            }
        }catch(Exception e){
            System.out.println("direccion index bound:"+ columnas);
        }
               
    }
    
    public static void Lnormal(){
        
        int colum=0;
        int y=ma.length-1;
        
        for(int f=0; f<ma.length; f++){
            for(int c=0; c<ma.length; c++){
                if (c==0)
                {
                    ma[f][c]="*";
                }
                else if(f==y){
                    ma[f][c]="*";
                }
            }
                    
        }
    }
    
    public static void LyLinvertida(){
        int columnas=0;
        int y=ma.length-1;
        
        for(int f=0; f<ma.length; f++){
            for(int c=0; c<ma.length; c++){
                if(f == 0){
                    ma[f][c]="0";
                }
                else if(c==y){
                    ma[f][c]="0";
                }
            }
        }
    }
    

    
    public static void main(String[] args) {
        cargaMatriz();
        //imprimeMatriz();
        //columnasPares();
        //columnasX();
        Lnormal();
        LyLinvertida();
        imprimirDecorado();
    }
    
}
