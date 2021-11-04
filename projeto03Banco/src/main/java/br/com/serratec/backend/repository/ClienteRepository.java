package br.com.serratec.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.serratec.backend.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
