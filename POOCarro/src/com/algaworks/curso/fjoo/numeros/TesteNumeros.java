package com.algaworks.curso.fjoo.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class TesteNumeros {

	public static void main(String[] args) {
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		double valorProduto = 1300.59;
		
		System.out.println(valorProduto); //sem formatar
		System.out.println(formatador.format(valorProduto)); //formatado padrao br
		
		//transformando
		String entrada = "R$ 50,34";
		try {
			double numero = formatador.parse(entrada).doubleValue();
			System.out.println("numero extraido " + numero);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Entrada invalida");
		}

		//bigdecimal
		
		BigDecimal bg = new BigDecimal(5000);
		bg.divide(bg.TEN);
	}

}
