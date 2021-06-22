package br.com.transacao.matheusfernandes.kafka;

public class EventoEstabelecimento {
	private String nome;
	private String cidade;
	private String endereco;

	public EventoEstabelecimento() {
	}

	public String getNome() {
		return nome;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEndereco() {
		return endereco;
	}

}
