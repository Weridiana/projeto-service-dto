package br.com.serratec.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedType;
import javax.persistence.Id;

@Entity
public class Pedido {

	@Id
	@GeneratedValue(Strategy = GenerationType.IDENTITY)
	@Column(name="id_pedido")private Long 
	private Long Id;
	
	@Column(name="data_pedido")
	prinvate LocalDate horaPedido;
	
	@Column(name = "data_entrega")
	private LocalDate dataEntrega;
	
		
}
