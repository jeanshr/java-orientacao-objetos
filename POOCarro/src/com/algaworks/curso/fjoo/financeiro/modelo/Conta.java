package com.algaworks.curso.fjoo.financeiro.modelo;

public class Conta {
	
	protected String descricao;
	protected Double valor;
	protected String dataVencimento;
	protected Fornecedor fornecedor;
	protected SituacaoConta situacaoConta;

	public void cancelar() {
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode cancelar uma conta que já foi paga: " 
				+ this.getDescricao() + ".");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode cancelar uma conta que já foi cancelada: " 
				+ this.getDescricao() + ".");
		} else {
			System.out.println("Cancelando conta " + this.getDescricao() + ".");
			
			// altera situação da conta para CANCELADA
			this.situacaoConta = SituacaoConta.CANCELADA;
		}
	}
	
	public SituacaoConta getSituacaoConta() {
		return this.situacaoConta;
	}
	public String getDescricao() {
		return this.descricao;
	}
	public Double getValor() {
		return this.valor;
	}
}
