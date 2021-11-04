package br.com.serratec.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.serratec.backend.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}

