package SET;

import java.util.Comparator;

public class AnoCriacaoNome implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
		int anoCriacao = Integer.compare(l1.getAnoCriacao(), l2.getAnoCriacao());
		if(anoCriacao!=0) {
			return anoCriacao;
		}	
		return l1.getNome().compareTo(l2.getNome());
	}

}
