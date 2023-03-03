package com.algaworks.curso.fjoo.sobrecarga;

public class TesteCadastro {

	public static void main(String[] args) {
		CadastroPessoa cadastro = new CadastroPessoa();
		Pessoa pessoa = new Pessoa("José", 32);
		cadastro.cadastrar(pessoa);
		
		//------ Sobrecarga sem precisar instanciar novamente o objeto pessoa

		cadastro.cadastrar("Maria", 25);
		cadastro.cadastrar("Jean");

	}

}
