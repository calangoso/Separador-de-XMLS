/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Scanner;

/**
 *
 * @author Lango
 */
public class Obj {
    String nome;
    int idade;
    Double dinheiro;
    
    public Obj(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        this.nome = ler.nextLine();
        System.out.println("Digite sua idade: ");
        this.idade = ler.nextInt();
        System.out.println("Qual seu saldo atual? : ");
        this.dinheiro = ler.nextDouble();
    }
}
