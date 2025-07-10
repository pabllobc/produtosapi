package io.github.pabllobc.produtosapi.controller;

import io.github.pabllobc.produtosapi.model.Produto;
import io.github.pabllobc.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        System.out.println("Salvando produto" + produto);

        var id = UUID.randomUUID().toString();
        produto.setId(id);

        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping("{id}")
    public Produto obterPorId(@PathVariable ("id") String id){
        return produtoRepository.findById(id).orElse(null);
    }
}
