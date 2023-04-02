package Aula16_17;

public class Veiculo {
	int passageiros;
	int capCombustivel;
	int kpl;
	
	//metodo que calcula a autonomia
	int autonimia( ) {			
		return capCombustivel*kpl;
	}
	//metodo que calcula o combustivel 
	//necessario para cobrir uma dada distancia
	//paramentros para fazer a conta

	double combustivelNecessario(double dist) {
		return (double) dist/kpl;
	}
}