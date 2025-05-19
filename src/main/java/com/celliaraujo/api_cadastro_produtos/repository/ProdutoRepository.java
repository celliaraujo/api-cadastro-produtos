package com.celliaraujo.api_cadastro_produtos.repository;

import com.celliaraujo.api_cadastro_produtos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
