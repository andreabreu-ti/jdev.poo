package jdev.poo;

import java.math.BigDecimal;

public class ExecutarTeste {

	public static void main(String[] args) {

		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("Modulo Orientacao Objeto");
		produto1.setValor(BigDecimal.valueOf(100));

		Produto produto2 = new Produto();
		produto2.setId(2L);
		produto2.setNome("Modulo Spring Boot API REST");
		produto2.setValor(BigDecimal.valueOf(300));

		Produto produto3 = new Produto();
		produto3.setId(2L);
		produto3.setNome("Modulo de Angular 9");
		produto3.setValor(BigDecimal.valueOf(197));

		Venda venda = new Venda();
		venda.setDescricaoVenda("Venda Curso Formacao Java");
		venda.setEnderecoEntrega("Entrega pelo E-mail");
		venda.setId(10L);
		venda.setNomeCLiente("Andre Abreu");
		venda.setValorTotal(BigDecimal.valueOf(197.00));

		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2);/*Não faz validação*/
		venda.addProduto(produto3); /*Faz validação antes de adicionar*/
		
		

		System.out.println("Descricao Venda :" + venda);

	}

}
