package br.com.transacao.matheusfernandes.transacao;

import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;

public class EventoTransacao {

		private String id;
	    private String valor;
	    private EventoEstabelecimento estabelecimento;
	    private EventoCartao cartao;
	    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
	    private LocalDateTime efetivadaEm;

	    public EventoTransacao() {
	    }

	    public String getId() {
	        return id;
	    }

	    public String getValor() {
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

	}
