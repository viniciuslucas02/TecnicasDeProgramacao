package br.edu.fatecsp.progabstracao.view;
import br.edu.fatecsp.progabstracao.model.Carro;
public class Main {

	public static void main(String[] args) {
		System.out.println("Teste");
		Carro meuCarro = new Carro();
		meuCarro.marca = "Renault";
		meuCarro.modelo = "Logan";
		meuCarro.ano = 2015;
		System.out.println("O ano do meu carro é: " + meuCarro.ano);
		
		Carro meuCarroNovo = new Carro();
		
		meuCarroNovo.ano = 2025;
		System.out.println("O ano do meu carro novo é: " + meuCarroNovo.ano);
	
		meuCarro.ligar();
		meuCarro.acelerar();

	}

}
