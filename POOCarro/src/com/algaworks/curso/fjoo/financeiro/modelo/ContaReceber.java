package com.algaworks.curso.fjoo.financeiro.modelo;

public class ContaReceber extends Conta{

	final double valorBarrarCancelamentoContas = 50000.00;
	private Cliente cliente;

	ContaReceber(){}
	
	public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
		this.cliente = cliente;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}
	
	public void cancelar() {
		if(validarPossibilidadeCancelamento()) {
			super.cancelar();
		}
	}
	public boolean validarPossibilidadeCancelamento() {
		if(this.getValor() < valorBarrarCancelamentoContas) {
			return false;
		}
		return true;
	}
	public void receber() {
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode receber uma conta que já está paga: " 
				+ this.getDescricao() + ".");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode receber uma conta que está cancelada: " 
				+ this.getDescricao() + ".");
		} else {
			System.out.println("Recebendo conta " + this.getDescricao() + " no valor de " 
				+ this.getValor() + " e vencimento em " + this.getDataVencimento() 
				+ " do cliente xptoqia.");
				
			// altera situação da conta para PAGA
			this.situacaoConta = SituacaoConta.PAGA;
		}
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return this.valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getDataVencimento() {
		return this.dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public Fornecedor getFornecedor() {
		return this.fornecedor;
	}
	public void setFornecedor(Cliente cliente) {
		this.cliente = cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
