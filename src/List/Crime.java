package List;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/*Utilizando Listas, fa�a um programa que fa�a 5 perguntas para uma pessoa
 * sobre um crime.As perguntas s�o:
 * 1. "Telefonou para a v�tima?"
 * 2. "Esteve no local do crime?"
 * 3. "Mora Perto da v�tima?"
 * 4. "Devia para a v�tima?"
 * 5. "J� Trabalhou com a v�tima?"
 * 
 * Se a pessoa responder positivamente a 2 quest�es ela deve ser classificada
 * como "Suspeita", entre 3 e 4 como "C�mplice" e 5 como "Assassina".Caso contr�rio
 * ela ser� classificada como "Inocente"
 */

public class Crime {
	public static void main(String[] args) {
		List<String> perguntas = adicionarPerguntas();
		List<String> respostas = perguntar(perguntas);
		System.out.println("Resultado: "+obterResultado(respostas));
	}

	public static List<String> adicionarPerguntas() {
		List<String> perguntas = new ArrayList<>();
		perguntas.add("Telefonou para a v�tima?(sim/nao)");
		perguntas.add("Esteve no local do crime?(sim/nao)");
		perguntas.add("Mora Perto da v�tima?(sim/nao)");
		perguntas.add("Devia para a v�tima?(sim/nao)");
		perguntas.add("J� Trabalhou com a v�tima?(sim/nao)");
		return perguntas;
	}

	public static List<String> perguntar(List<String> perguntas) {
		List<String> respostas = new ArrayList<>();
		for (int i = 0; i < perguntas.size(); i++) {
			String resposta = JOptionPane.showInputDialog(perguntas.get(i));
			respostas.add(resposta);
		}
		return respostas;
	}

	public static String obterResultado(List<String> respostas) {
		int sim = 0;
		String retorno;
		for (String resposta : respostas) {
			if (resposta.equalsIgnoreCase("sim")) {
				sim++;
			}
		}
		
		switch (sim) {
		case 2:
			retorno = "Suspeita";
			break;
		case 3, 4:
			retorno = "C�mplice";
			break;
		case 5:
			retorno = "Assassina";
			break;
		default:
			retorno = "Inocente";
			break;
		}
		return retorno;

	}
}