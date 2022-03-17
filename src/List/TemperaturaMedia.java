package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

/*Fa�a um programa que receba a temperatura m�dia dos 6 primeiros meses do ano
 * e armazene em uma lista.
 * Ap�s isto, calcule a m�dia semestral das temperaturas e mostre todas as temperaturas
 * acima desta m�dia, e em que m�s elas ocorreram(mostrar o m�s por extenso: 1 - Janeiro
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
			System.out.println("Temperaturas acima da m�dia: " + acimaMedia.toString());
		} else {
			System.out.println("N�o foi encontrado temperaturas acima da m�dia");
		}
		System.out.println("Media: " + media);
	}

	public static void lerTemperatura(Scanner msg, List<Double> lista) {
		String[] meses = { "Janeiro", "Fevereiro", "Mar�o", "Abril", "Maio", "Junho" };
		for (int i = 0; i < 6; i++) {
			System.out.println("Digite a temperatura do m�s " + meses[i] + ": ");
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
		String[] meses = { "Janeiro", "Fevereiro", "Mar�o", "Abril", "Maio", "Junho" };
		List<Double> tempAcimaMedia = new ArrayList<>();
		for (int i = 0; i < lista.size(); i++) {
			if (media < lista.get(i)) {
				tempAcimaMedia.add(lista.get(i));
				System.out.println("M�s acima da m�dia: " + (i + 1) + " - " + meses[i]);
			}
		}
		return tempAcimaMedia;
	}

}