/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo_final;

import java.util.Scanner;

/**
 *
 * @author João Igor
 */
public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Quadrado quadrado00 = new Quadrado();
        Retangulo retangulo00 = new Retangulo();
            
        try {
            System.out.println("---- Exemplo do Quadrado: ----\n");
            System.out.println("Informe o 'lado' do quadrado: ");
            quadrado00.setLado(input.nextDouble());
            quadrado00.imprimir();
        } catch (Exception erro){
            System.out.println("Erro: " + erro);
            System.out.println("Verifique se o valor inserido é válido e tente novamente!"
                    + " Veja o exemplo abaixo: \n");
            System.out.println("Informe o 'lado' do quadrado: 2.0\n");
            quadrado00.setLado(2.0);
            quadrado00.imprimir();
        }
        
        try {
            System.out.println("--- Exemplo do Retângulo: ----\n");
            System.out.println("Informe o 'comprimento' do retângulo: ");
            retangulo00.setComprimento(input.nextDouble());
            System.out.println("Informe a 'largura' do retângulo: ");
            retangulo00.setLargura(input.nextDouble());
            retangulo00.imprimir();
        } catch (Exception erro){
            System.out.println("Erro: " + erro);
            System.out.println("Verifique se os valores inseridos são válidos e tente novamente!"
                    + " Veja o exemplo abaixo: \n");
            System.out.println("Informe o 'comprimento' do retângulo: 3.4");
            System.out.println("Informe a 'largura' do retângulo: 5.0");
            retangulo00.setComprimento(3.4);
            retangulo00.setLargura(5.0);
        }
    }  
}
