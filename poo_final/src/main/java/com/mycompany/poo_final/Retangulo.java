/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_final;

/**
 *
 * @author João Igor
 */
public class Retangulo implements Interface {
    //atributos
    private double comprimento;
    private double largura;
    
    //construtor
    public Retangulo() {
        this.setComprimento(0);
        this.setLargura(0);
    }
    
    //get e set 
    public double getComprimento() {
        return comprimento;
    }
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    //implementando os métodos abstratos 
    @Override
    public double getPerimetro() {
        return ((this.getComprimento() * 2) + (this.getLargura() * 2));
    }
    @Override
    public double getArea() {
        return (this.getComprimento() * this.getLargura());
    }
    
    //método para imprimir 
    public void imprimir(){
        System.out.println("-=- Calculando a área e o perímetro de Retângulo; -=- ");
        System.out.println("Valor do 'Comprimento': " + this.getComprimento());
        System.out.println("Valor da 'Largura': " + this.getLargura());
        System.out.println("Valor da Área: " + this.getArea());
        System.out.println("Valor do Perímetro: " + this.getPerimetro());
    }
}
