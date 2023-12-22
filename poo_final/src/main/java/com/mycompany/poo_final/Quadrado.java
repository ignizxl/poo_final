/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_final;

/**
 *
 * @author João Igor
 */

public class Quadrado implements Interface {
    //atributos
    private double lado;
   
    //construtor
    public Quadrado() {
        this.setLado(0);
    }
    
    //get e set
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    
    //implementando os métodos abstratos
    @Override
    public double getPerimetro() {
        return 4 * this.getLado();
    }

    @Override
    public double getArea() {
        return (this.getLado() * this.getLado());
    }
    
    //método para imprimir 
    public void imprimir(){
        System.out.println("-=- Calculando a área e o perímetro de Quadrado -=- ");
        System.out.println("Valor da área: " + this.getArea());
        System.out.println("Valor do perímetro: "+ this.getPerimetro() );
    }
}
