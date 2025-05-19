package com.celliaraujo.api_cadastro_produtos.service;

import com.celliaraujo.api_cadastro_produtos.model.Produto;
import com.celliaraujo.api_cadastro_produtos.repository.ProdutoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService{

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarProdutos(){
        return produtoRepository.findAll();

    }

    public void salvarProduto(Produto produto){
        produtoRepository.save(produto);
    }

    public Produto buscarIdProduto(Long id){
        return (Produto) produtoRepository.findById(id).orElse(null);
    }

    public void excluirProduto(Long id){
        if(id == null){
            throw new IllegalArgumentException("O id não pode ser nulo.");
        }
        if (!produtoRepository.existsById(id)) {
            throw new EntityNotFoundException("Produto com id " + id + " não encontrado.");
        }
        produtoRepository.deleteById(id);

    }



}
