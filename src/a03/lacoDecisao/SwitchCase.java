package a03.lacoDecisao;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// EXEMPLO DE SWITCH...CASE
		// !!!!! Para o exemplo de IF ELSE, vá para o arquivo nomeado CondicionalIf, nessa mesma pasta
		
		// Programa que oferece um menu de elogios, pede para que o usuário escolha um deles e retorna o elogios correspondente
		
		// Criação das variáveis e do scanner
		int opcao;
		
		Scanner input = new Scanner(System.in);
		
		// Exibição do menu e leitura do input
		System.out.print("Menu de Elogios: ");
		System.out.print("\n\tElogio 1 - DETERMINADO");
		System.out.print("\n\tElogio 2 - DEDICADO");
		System.out.print("\n\tElogio 3 - ALEGRE");
		System.out.print("\n\tElogio 4 - PERSISTENTE");
		System.out.print("\nEscolha a sua opção de elogio: ");
		
		opcao = input.nextInt();
		
		// Switch...Case
		
		switch(opcao) {
			case 1:
				System.out.print("\nVocê é muito determinado.");
				break;
			case 2:
				System.out.print("\nVocê é muito dedicado.");
				break;
			case 3:
				System.out.print("\nVocê é muito alegre.");
				break;
			case 4:
				System.out.print("\nVocê é muito persistente.");
				break;
				
			default: System.out.print("\nOpção inválida.");
		}
	}
}
