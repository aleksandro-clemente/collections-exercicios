package SET;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExericiosPropostos {
	public static void main(String[] args) {		
		Set<String> coresArcoIris = new HashSet<>(
				Arrays.asList("vermelha", "laranja", "amarela", "verde", "azul", "azul-escuro", "violeta"));
		System.out.println("Cores do arco íris");
		for (String cor : coresArcoIris) {
			System.out.println("Cor:" + cor);
		}
		List<String> coresArcoIrisLista = new ArrayList<>(coresArcoIris);
		System.out.println("\n");
		System.out.println("Cores do arco íris invertidas");
		Collections.reverse(coresArcoIrisLista);
		for(String cor: coresArcoIrisLista) {
			System.out.println("Cor:" +cor);
		}
		
		System.out.println("\n");
		System.out.println("O arco íris tem: " + coresArcoIris.size() + " cores");
		System.out.println("\n");
		System.out.println("Cores do arco íris em ordem alfabética");

		Set<String> coresArcoIris1 = new TreeSet<>(coresArcoIris);
		for (String cor : coresArcoIris1) {
			System.out.println("Cor:" + cor);
		}

		System.out.println("\n");
		System.out.println("Cores do arco íris que iniciam com a letra v");
		for (String cor : coresArcoIris1) {
			if (cor.startsWith("v")) {
				System.out.println("Cor: " + cor);
			}
		}
		System.out.println("Limpar Set coresArcoIris1: ");
		coresArcoIris1.clear();
		System.out.println("O conjunto está vazio? " + (coresArcoIris1.isEmpty() ? "Sim" : "Não"));

	}

}
