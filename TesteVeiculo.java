package Aula16_17;

import java.util.Scanner;

public class TesteVeiculo {

	public static void main(String[] args) {
		// cria um objeto chamado minivan
		Veiculo minivan = new Veiculo();// Veiculo = a classe
		// instanciação usa a classe para fazer um objeto como demonstrado a cima
		int autonomia1, autonomia2;
		// cria um objeto veiculo chamado de carroEsportivo
		Veiculo carroEsportivo = new Veiculo();
		// atribui valores aos atributos ao objeto minivan
		double litros;
		double dist  = 300;
		
		minivan.passageiros = 7;
		minivan.capCombustivel = 50;
		minivan.kpl = 15;
		// calcula a autonimia

		// atribui valor ao carro esportivo
		carroEsportivo.passageiros = 2;
		carroEsportivo.capCombustivel = 30;
		carroEsportivo.kpl = 10;

		litros = minivan.combustivelNecessario(dist);
		
		System.out.println("para percorrer a distancia "+dist+"km a minivam precisa de "+ litros+ " de combustiveis");
		
		litros = carroEsportivo.combustivelNecessario(dist);
		System.out.println("para percorrer a distancia "+dist+"km carro esportivo precisa de "+ litros+ " de combustiveis");
		
		
		
//		System.out.print("uma minivam pode carregar " + minivan.passageiros + " passageiros");
//		System.out.println(minivan.autonimia());
//		
//		System.out.print("uma minivam pode carregar " + carroEsportivo.passageiros + " passageiros");
//		System.out.println(" "+carroEsportivo.autonimia());
		
		


	}

}
