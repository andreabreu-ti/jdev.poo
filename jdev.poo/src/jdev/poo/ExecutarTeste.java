package jdev.poo;

import java.math.BigDecimal;

public class ExecutarTeste {

	public static void main(String[] args) {

		Venda venda = new Venda();
		venda.setDescricaoVenda("Venda Curso Formacao Java");
		venda.setEnderecoEntrega("Entrega pelo E-mail");
		venda.setId(10L);
		venda.setNomeCLiente("Andre Abreu");
		venda.setValorTotal(BigDecimal.valueOf(197.00));
		
		System.out.println("Descricao Venda :" + venda.getDescricaoVenda());

	}

}
