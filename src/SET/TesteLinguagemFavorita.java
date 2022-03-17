package SET;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TesteLinguagemFavorita {
	public static void main(String[] args) {
		LinguagemFavorita l1 = new LinguagemFavorita("Java", 1991, "Eclipse");
		LinguagemFavorita l2 = new LinguagemFavorita("Python", 1990, "Pycharm");
		LinguagemFavorita l3 = new LinguagemFavorita("PHP", 1994, "Notepad++");

		Set<LinguagemFavorita> ordemInsercao = new LinkedHashSet<>();
		ordemInsercao.add(l1);
		ordemInsercao.add(l2);
		ordemInsercao.add(l3);
		System.out.println("Na ordem de inserção");
		for (LinguagemFavorita lista : ordemInsercao) {
			System.out.println("[+]Nome: " + lista.getNome() + "," + "Foi criado em " + lista.getAnoCriacao() + ","
					+ "IDE " + lista.getIde());
		}
		
		Set<LinguagemFavorita> ordemNome = new TreeSet<>();
		ordemNome.add(l1);
		ordemNome.add(l2);
		ordemNome.add(l3);
		System.out.println("Na ordem Natural(Nome)");
		for (LinguagemFavorita lista : ordemNome) {
			System.out.println("[+]Nome: " + lista.getNome() + "," + "Foi criado em " + lista.getAnoCriacao() + ","
					+ "IDE " + lista.getIde());
		}
		
		Set<LinguagemFavorita> ordemIde= new TreeSet<>(new ComparatorIde());
		ordemIde.add(l1);
		ordemIde.add(l2);
		ordemIde.add(l3);
		System.out.println("Na ordem Natural(IDE)");
		for (LinguagemFavorita lista : ordemIde) {
			System.out.println("[+]Nome: " + lista.getNome() + "," + "Foi criado em " + lista.getAnoCriacao() + ","
					+ "IDE " + lista.getIde());
		}
		
		Set<LinguagemFavorita> anoCriacaoeNome= new TreeSet<>(new AnoCriacaoNome());
		anoCriacaoeNome.add(l1);
		anoCriacaoeNome.add(l2);
		anoCriacaoeNome.add(l3);
		System.out.println("Na ordem ano de Criação e Nome");
		for (LinguagemFavorita lista : anoCriacaoeNome) {
			System.out.println("[+]Nome: " + lista.getNome() + "," + "Foi criado em " + lista.getAnoCriacao() + ","
					+ "IDE " + lista.getIde());
		}
		
		Set<LinguagemFavorita> nomeAnoCriacaoIde= new TreeSet<>(new NomeAnoCriacaoIde());
		nomeAnoCriacaoIde.add(l1);
		nomeAnoCriacaoIde.add(l2);
		nomeAnoCriacaoIde.add(l3);
		System.out.println("Na ordem de nome,ano de Criacao,ide");
		for (LinguagemFavorita lista : nomeAnoCriacaoIde) {
			System.out.println("[+]Nome: " + lista.getNome() + "," + "Foi criado em " + lista.getAnoCriacao() + ","
					+ "IDE " + lista.getIde());
		}
		
		System.out.println("Linguagens");
		for (LinguagemFavorita lista : ordemInsercao) {
			System.out.println(lista.getNome());
		}
	}
}
