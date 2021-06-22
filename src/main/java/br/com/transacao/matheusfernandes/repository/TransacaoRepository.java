package br.com.transacao.matheusfernandes.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.transacao.matheusfernandes.model.Transacao;

public interface TransacaoRepository extends CrudRepository<Transacao, String>{

	List<Transacao> findTop10ByCartaoIdOrderByEfetivadaEmDesc(String cartaoId);
}
