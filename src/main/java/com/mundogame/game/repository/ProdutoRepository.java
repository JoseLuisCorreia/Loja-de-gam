package com.mundogame.game.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mundogame.game.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List<Produto> findAllByNomeJogoContainingIgnoreCase(String nomeJogo);

}
