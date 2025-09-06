package br.edu.fatecsp.progabstracao.model;

public class Carro {
	public String marca;
	public String modelo;
	public int ano;	
	public boolean ligado = false;
	
	public void ligar() {
		if(ligado) {
			System.out.println("Carro já está ligado!");

		}
		else {
			System.out.println("Carro Ligado!");
		}
	}
	public void acelerar() {
		if(ligado) {
			System.out.println("Carro Andando...");
		}
		else {
			System.out.println("Carro desligado");
			this.ligar();
			this.acelerar();
		}
	}
	public void desligar() {
		if(ligado) {
			System.out.println("Carro Desligado");
			ligado = false;
		}
		else {
			System.out.println("O carro já está desligado");
		}
	}
}
