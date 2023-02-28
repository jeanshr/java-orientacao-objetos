package com.algaworks.curso.fjoo.financeiro.modelo;

public class ContaPagar {
	private String descricao;
	private Double valor;
	private String dataVencimento;
	private Fornecedor fornecedor;
	private SituacaoConta situacaoConta;
	
	//construtores
	
	ContaPagar(){
		this.situacaoConta = SituacaoConta.PENDENTE;
	}
	ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento){	
		//chamando o construtor padrão
		this();
		
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}
	
	
	//métodos

	void pagar() {
		
		if(situacaoConta.PAGA.equals(getSituacaoConta())) {
			System.out.println("Não pode pagar uma conta que já está paga!");
		} else if(situacaoConta.CANCELADA.equals(getSituacaoConta())) {
			System.out.println("Não pode pagar uma conta cancelada!");
		} else {
		System.out.println("Descrição: " + this.getDescricao() + "\n" + 
		"Valor: " + this.getValor() + " \n" + 
				"Data Vencimento: " + this.getDataVencimento() + "\n" + 
		"Fornecedor: " + this.getFornecedor().getNome());
		System.out.println("---------------------------------");
		
		this.situacaoConta = SituacaoConta.PAGA;
		}
	}
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
	public String getDescricao() {
		return this.descricao;
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
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public SituacaoConta getSituacaoConta() {
		return this.situacaoConta;
	}
}
