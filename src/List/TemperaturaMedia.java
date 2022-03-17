package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

/*Faça um programa que receba a temperatura média dos 6 primeiros meses do ano
 * e armazene em uma lista.
 * Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas
 * acima desta média, e em que mês elas ocorreram(mostrar o mês por extenso: 1 - Janeiro
 * 2-Fevereiro, etc.)
 * 
 */
public class TemperaturaMedia {

	public static void main(String[] args) {
		Scanner msg = new Scanner(System.in);
		List<Double> listaTemperaturas = new ArrayList<>();
		lerTemperatura(msg, listaTemperaturas);
		double media = calcularMedia(listaTemperaturas);
		List<Double> acimaMedia = mesesTemperaturasAcimaDaMedia(media, listaTemperaturas);
		if (!acimaMedia.isEmpty()) {
			System.out.println("Temperaturas acima da média: " + acimaMedia.toString());
		} else {
			System.out.println("Não foi encontrado temperaturas acima da média");
		}
		System.out.println("Media: " + media);
	}

	public static void lerTemperatura(Scanner msg, List<Double> lista) {
		String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho" };
		for (int i = 0; i < 6; i++) {
			System.out.println("Digite a temperatura do mês " + meses[i] + ": ");
			lista.add(msg.nextDouble());
		}
	}

	public static double calcularMedia(List<Double> lista) {
		Double soma = 0d;
		for (Double list : lista) {
			soma += list;
		}
		return soma / lista.size();
	}

	public static List<Double> mesesTemperaturasAcimaDaMedia(Double media, List<Double> lista) {
		String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho" };
		List<Double> tempAcimaMedia = new ArrayList<>();
		for (int i = 0; i < lista.size(); i++) {
			if (media < lista.get(i)) {
				tempAcimaMedia.add(lista.get(i));
				System.out.println("Mês acima da média: " + (i + 1) + " - " + meses[i]);
			}
		}
		return tempAcimaMedia;
	}

}