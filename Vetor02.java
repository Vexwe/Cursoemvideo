/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetor02;

import java.util.Arrays;

/**
 *
 * @author deyvi
 */
public class Vetor02 {

    public static void main(String[] args) {
       int vetor[] = new int [20];
       Arrays.fill(vetor, 2);
       for(int v:vetor){
        System.out.println("Tem exatamente" + v);
       }
    }
}
