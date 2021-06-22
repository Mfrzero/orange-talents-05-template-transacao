package br.com.transacao.matheusfernandes.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cartao {

	@Id
	private String id;
	private String email;
	@OneToMany(mappedBy = "cartao")
	private List<Transacao> transacoes;

	public Cartao() {
	}

	public Cartao(String id, String email) {
		this.id = id;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

}