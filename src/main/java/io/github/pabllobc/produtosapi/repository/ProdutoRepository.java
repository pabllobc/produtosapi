package io.github.pabllobc.produtosapi.repository;

import io.github.pabllobc.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

}
