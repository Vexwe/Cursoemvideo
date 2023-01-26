/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiposprimitivos;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author deyvi
 */
public class Tiposprimitivos {

    public static void main(String[] args) {
        PrintStream show = System.out;
        Scanner teclado = new Scanner(System.in);
        show.print("Qual o seu nome?");
       String nome = teclado.nextLine();
       show.print("quantos anos você tem?");
        String idade = teclado.nextLine();
        show.print("Onde tu  mora?");
         String ondemora = teclado.nextLine();
          show.print("Aqui está sua ficha: \n"+ nome + "\n" + idade +"\n" + ondemora);
        
         
    }
}
