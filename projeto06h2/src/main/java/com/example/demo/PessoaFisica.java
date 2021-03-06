package com.example.demo;

import java.time.LocalDate;

public class PessoaFisica extends Fornecedor {
	
	private String cpf;
	private String rg;
	private String orgaoExpedidor;
	private LocalDate dataExpedicao;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getOrgaoExpedidor() {
		return orgaoExpedidor;
	}
	public void setOrgaoExpedidor(String orgaoExpedidor) {
		this.orgaoExpedidor = orgaoExpedidor;
	}
	public LocalDate getDataExpedicao() {
		return dataExpedicao;
	}
	public void setDataExpedicao(LocalDate dataExpedicao) {
		this.dataExpedicao = dataExpedicao;
	}
	


}
