package program;

public class exercicio_4 {

	public static void main(String[] args) {

		// carro = 110km/h
		// caminhão = 80 km/h

		// Como se determinar o local de cruzamento?
		// Colocamos o ponto de referência em Ribeirão Preto.

		// Equação do carro
		// x1 = v1 * t

		// O caminhão sai do local que está a 100km de Ribeirão Preto

		// Equação do caminhão
		// x2 = 100 - v2 * t

		// caminhão tem 2 pedágios e perde 5 minutos em cada um deles,
		// Tso = 100 / 80 = 1,25km/h

		// caminhão perde 10 minutos (ou 0,17 horas) nos pedágios, o tempo de viagem
		// para o caminhão será 1,25h+0,17h=1,42h.

		// Velocidade média do caminhão;
		// v2 = 100 / 1,42

		// ponto em que o carro e o caminhão se cruzam

		// t = x1 / v1
		// t = x2 - 100 / -v2
		// x1 = x2 => x / v1 = x - 100 / -v2
		// - v2 * x = v1 * x - v1 * 100
		// x = v1 * 100 / v1 + v2 = 110 * 100 / 110 + 70,6
		// x = 60.9km/h

		// Essa é a distância da cidade de Ribeirão Preto em que o carro e o caminhão se
		// cruzam, ambos estão à mesma distância.

	}

}
