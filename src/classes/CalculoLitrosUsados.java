package classes;
import java.util.Scanner;

public class CalculoLitrosUsados {

	public static void main(String[] args) {
		//criando a instancia para leitura
		Scanner ler = new Scanner(System.in);
		
		//entradas
		double tempo, velocidade, km_litro, distancia, litros_usados;
		
		System.out.println("Insira o tempo da viagem: ");
		tempo = ler.nextDouble();
		
		System.out.println("Insira a velocidade: ");
		velocidade = ler.nextDouble();
		
		System.out.println("Insira o consumo por litro: ");
		km_litro = ler.nextDouble();
		
		//processamento
		distancia = tempo * velocidade;
		litros_usados = distancia / km_litro;
		
		//saida
		System.out.println("A velocidade média da viagem foi de " + velocidade + " Km/h");
		System.out.println("O tempo da viagem foi de " + tempo + " Horas");
		System.out.println("A distância percorrida foi de " + distancia + " Km");
		System.out.println("O consumo de combustível foi de " + litros_usados + " Km");


	}

}
