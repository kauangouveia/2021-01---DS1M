package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {

		
		Conta contaDaAnaGomes = new Conta();
		Conta contaDoJoao = new Conta();
		// ** conta da anna 
		//contaDaAnaGomes.setTitular("Ana Gomes"); 
		contaDaAnaGomes.setNumero ("111-98");
		contaDaAnaGomes.setTipo("Poupan�a");
		contaDaAnaGomes.isAtiva (true);
		contaDaAnaGomes.setChequeEspecial(200);
		contaDaAnaGomes.getSaldo ();
		contaDaAnaGomes.depositar(100);
		contaDaAnaGomes.mostrarSaldoDaConta();
		contaDaAnaGomes.depositar(30);
		contaDaAnaGomes.mostrarSaldoDaConta();
		contaDaAnaGomes.sacar(50);
		contaDaAnaGomes.mostrarSaldoDaConta();
		contaDaAnaGomes.sacar(500);
		contaDaAnaGomes.mostrarSaldoDaConta();
		contaDaAnaGomes.sacar(50);
		contaDaAnaGomes.mostrarSaldoDaConta();
		contaDaAnaGomes.sacar(80);
		contaDaAnaGomes.mostrarSaldoDaConta();
		contaDaAnaGomes.depositar(100);
		contaDaAnaGomes.mostrarSaldoDaConta();
		contaDaAnaGomes.getSaldo();
		
		double saldoDaConta = contaDaAnaGomes.getSaldo();
		System.out.println(" **************O saldo da conta � "+ saldoDaConta);
		
		System.out.println(" Titular da conta :" + contaDaAnaGomes.getTitular());
		
		System.out.println(" Seu saldo : " + contaDaAnaGomes.getSaldo());
		
		System.out.println(" Numero " +contaDaAnaGomes.getNumero());
		
		System.out.println(" Conta :" + contaDaAnaGomes.getTipo());
		
		System.out.println(" Cheque especial : " + contaDaAnaGomes.getChequeEspecial());
		
		Cliente cliente= new Cliente ();
		
	}
	
}
 