package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App2 {

	public static void main(String[] args) {
		//cria��o do cliente
			Cliente pedro = new Cliente();
			pedro.setNome("Pedro Ferreira");
			pedro.setCep("066026080");
			pedro.setTelefone("(11)94320-6152");
			pedro.setCpf("46023666874");

			// criar conta do pedo 
			Conta contaPedro = new Conta();
			contaPedro.setTitular(pedro);
			contaPedro.depositar(100);
			contaPedro.setNumero("22222-22");
			
			System.out.println(contaPedro.getTitular().getTelefone());
	}

}
