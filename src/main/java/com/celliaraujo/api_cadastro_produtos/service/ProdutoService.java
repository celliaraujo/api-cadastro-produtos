package com.celliaraujo.api_cadastro_produtos.service;

import com.celliaraujo.api_cadastro_produtos.model.Produto;
import com.celliaraujo.api_cadastro_produtos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
        produtoRepository.deleteById(id);
    }



}
