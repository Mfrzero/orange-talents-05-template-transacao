package br.com.transacao.matheusfernandes.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.transacao.matheusfernandes.dto.TransacaoResponse;
import br.com.transacao.matheusfernandes.model.Transacao;
import br.com.transacao.matheusfernandes.repository.CartaoRepository;
import br.com.transacao.matheusfernandes.repository.TransacaoRepository;

@RestController
public class TransacoesController {

	private final TransacaoRepository transacaoRepository;
	private final CartaoRepository cartaoRepository;
	
	public TransacoesController(TransacaoRepository transacaoRepository, CartaoRepository cartaoRepository) {
		this.transacaoRepository = transacaoRepository;
		this.cartaoRepository = cartaoRepository;
	}
	
	@GetMapping("/{idCartao}")
	public ResponseEntity<?> transacoes(@PathVariable String idCartao){
		if(cartaoRepository.findById(idCartao).isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		List<Transacao> transacao = transacaoRepository.findTop10ByCartaoIdOrderByEfetivadaEmDesc(idCartao);
		TransacaoResponse dto = new TransacaoResponse((Transacao) transacao);
		return ResponseEntity.ok(dto);
	}
	
}
