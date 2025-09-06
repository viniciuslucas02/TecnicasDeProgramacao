package br.edu.fatecpg.atvabstracao.view;
import br.edu.fatecpg.atvabstracao.model.Celular;
import br.edu.fatecpg.atvabstracao.model.Televisao;


public class Main {

	public static void main(String[] args) {
		Celular meuCelular = new Celular();
		
		meuCelular.marca = "Samsung";
		meuCelular.modelo = "J2 Prime";
		meuCelular.sistemaOperacional = "Android";
		
		System.out.println("A marca do celular é: " + meuCelular.marca);
		System.out.println("O modelo do celular é: " + meuCelular.modelo);
		System.out.println("O sistema operacional do celular é: " + meuCelular.sistemaOperacional);
		
		
		meuCelular.tirarFoto();
		
		Televisao minhaTelevisao = new Televisao();
		
		minhaTelevisao.resolucao  = "1080x720";
		
		System.out.println("A resolução da TV é de: " + minhaTelevisao.resolucao);
		
		minhaTelevisao.trocarCanal();
		
		
		
	}

}
