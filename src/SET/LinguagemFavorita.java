package SET;

import java.util.Objects;

public class LinguagemFavorita implements Comparable<LinguagemFavorita>{
	private String nome;
	private Integer anoCriacao;
	private String ide;
	
	public LinguagemFavorita(String nome,Integer anoCriacao,String ide) {
		this.nome = nome;
		this.anoCriacao = anoCriacao;
		this.ide = ide;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getAnoCriacao() {
		return anoCriacao;
	}
	public void setAnoCriacao(Integer anoCriacao) {
		this.anoCriacao = anoCriacao;
	}
	public String getIde() {
		return ide;
	}
	public void setIde(String ide) {
		this.ide = ide;
	}
	@Override
	public int hashCode() {
		return Objects.hash(anoCriacao, ide, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinguagemFavorita other = (LinguagemFavorita) obj;
		return Objects.equals(anoCriacao, other.anoCriacao) && Objects.equals(ide, other.ide)
				&& Objects.equals(nome, other.nome);
	}
	@Override
	public String toString() {
		return "[nome=" + nome + ", anoCriacao=" + anoCriacao + ", ide=" + ide + "]";
	}
	@Override
	public int compareTo(LinguagemFavorita linguagem) {
		int nome = this.nome.compareTo(linguagem.getNome());
		if(nome != 0) {
			return nome;
		}
		return this.ide.compareTo(linguagem.getIde());
		
	}
	
	
	
	
	
}
