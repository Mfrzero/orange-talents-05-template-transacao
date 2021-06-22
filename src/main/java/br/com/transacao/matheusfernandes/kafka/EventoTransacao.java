package br.com.transacao.matheusfernandes.kafka;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;

import br.com.transacao.matheusfernandes.model.Cartao;
import br.com.transacao.matheusfernandes.model.Estabelecimento;
import br.com.transacao.matheusfernandes.model.Transacao;

public class EventoTransacao {

		private String id;
	    private BigDecimal valor;
	    private EventoEstabelecimento estabelecimento;
	    private EventoCartao cartao;
	    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
	    private LocalDateTime efetivadaEm;

	    public EventoTransacao() {
	    }

	    public String getId() {
	        return id;
	    }

	    public BigDecimal getValor() {
	        return valor;
	    }

	    public EventoEstabelecimento getEstabelecimento() {
	        return estabelecimento;
	    }

	    public EventoCartao getCartao() {
	        return cartao;
	    }

	    public LocalDateTime getEfetivadaEm() {
	        return efetivadaEm;
	    }
	    
	    public Transacao toModel() {
	    	Estabelecimento estabelecimento = new Estabelecimento(getEstabelecimento().getNome(), getEstabelecimento().getCidade(), getEstabelecimento().getEndereco());
	    	Cartao cartao = new Cartao(getCartao().getId(), getCartao().getEmail());
	    	return new Transacao(id,valor,estabelecimento,cartao,efetivadaEm);
	    }

	}
