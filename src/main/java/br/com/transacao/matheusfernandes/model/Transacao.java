package br.com.transacao.matheusfernandes.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Transacao {

	@Id
	private String id;
	private BigDecimal valor;
	@ManyToOne(cascade = CascadeType.ALL)
	private Estabelecimento estabelecimento;
	@ManyToOne(cascade = CascadeType.ALL)
	private Cartao cartao;
	private LocalDateTime efetivadaEm;

	public Transacao() {
	}

	public Transacao(String id, BigDecimal valor, Estabelecimento estabelecimento, Cartao cartao,
			LocalDateTime efetivadaEm) {
		this.id = id;
		this.valor = valor;
		this.estabelecimento = estabelecimento;
		this.cartao = cartao;
		this.efetivadaEm = efetivadaEm;
	}

	public String getId() {
		return id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public LocalDateTime getEfetivadaEm() {
		return efetivadaEm;
	}
	
}