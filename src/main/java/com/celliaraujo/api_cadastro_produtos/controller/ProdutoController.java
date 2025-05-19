package com.celliaraujo.api_cadastro_produtos.controller;

import com.celliaraujo.api_cadastro_produtos.model.Produto;
import com.celliaraujo.api_cadastro_produtos.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> listarProdutos(){
        return produtoService.listarProdutos();
    }

    @PostMapping
    public void salvarProduto(@RequestBody Produto produto){
        produtoService.salvarProduto(produto);
    }

    @GetMapping("/{id}")
    public Produto buscarIdProduto(@PathVariable Long id){

        return produtoService.buscarIdProduto(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirProduto(@PathVariable Long id){

        produtoService.excluirProduto(id);
        return ResponseEntity.noContent().build();
    }


}
