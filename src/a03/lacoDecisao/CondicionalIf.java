package a03.lacoDecisao;

import java.util.Scanner;

public class CondicionalIf {

	public static void main(String[] args) {
		
		/* ----- LAÇOS CONDICIONAIS
		 * 
		 * Laços condicionais são estruturas que auxiliam na tomada de decisão. As condicionais usadas para criar as condições responsáveis pela decisão muitas vezes envolvem o uso de operadores relacionais e operadores lógicos. Existem três estruturas básicas de laços condicionais em java:
		 * 
		 * * IF:
		 * * * É o mais simples, usado para testar uma única condição (pode ser simples ou, fazendo uso de operadores lógicos, composta) e/ou variável. Caso a condição seja atendida, um bloco específico de código será executada. Caso não seja, o código seguirá o fluxo normal.
		 * 
		 * * IF ELSE:
		 * * * Envolve o uso de uma estrutura ELSE, que permite a criação de uma bloco de código para ser executada se a condição não for atendida. Diferentemente do IF simples que é usado onde apenas um dos casos afeta a execução do programa, o IF ELSE é usado quando ambos os casos afetam.
		 * * * É possível encadeiar mais condições usando ELSE IF a esta estrutura. É útil quando diversas condições precisam ser testadas. Exemplo:
		 * 
		 * * * if(condição 01){
		 * * *    [Bloco de código 01]
		 * * * }else if(condição 02){
		 * * *    [Bloco de código 02]
		 * * * }else{
		 * * *    [Bloco de código 03]
		 * * * }
		 * 
		 * * SWITCH CASE:
		 * * * Representa de uma maneira mais simples e legível a mesma informação dos laços IF, é geralmente utilizada para diminuir a complexidade de estruturas IF encadeadas e lida melhor com valores exatos e precisos. No exemplo abaixo, a estrutura SWITCH pega o valor da variável VAR e compara com cada CASE (deve ser do mesmo tipo de VAR e não pode ser uma variável ou um teste lógico). Caso um CASE seja atendido, o bloco de código dele é executado, a keyword BREAK termina a execução do laço e os outros CASE não são checados. Caso nenhum CASE seja atendido, o bloco de código na estrutura DEFAULT será executado. Exemplo:
		 * 
		 * * * switch(var){
		 * * *    case 1:
		 * * *         [Bloco de código 01]
		 * * *         break;
		 * * *    case 2:
		 * * *         [Bloco de código 02]
		 * * *         break;
		 * * *    case 3:
		 * * *         [Bloco de código 03]
		 * * *         break;
		 * * *
		 * * *    default: [Bloco de código 04]
		 * * * }
		 *
		 */
		
		// EXEMPLO DE CONDICIONAL IF ELSE
		// !!!!! Para o exemplo de Switch...Case, vá para o arquivo nomeado SwitchCase, nessa mesma pasta
		
		// Programa que calcula a média e retorna se o estudante foi aprovado, ficou de recuperação ou foi reprovado usando a condicional if
		
		// Criação das variáveis e do Scanner
		float n1, n2, n3, media;
		
		Scanner input = new Scanner(System.in);
		
		// Leitura dos inputs
		System.out.print("Insira a primeira nota: ");
		n1 = input.nextFloat();
		
		System.out.print("Insira a segunda nota: ");
		n2 = input.nextFloat();
		
		System.out.print("Insira a terceira nota: ");
		n3 = input.nextFloat();
		
		// Cálculo e exibição da média
		media = (n1 + n2 + n3)/3;
		
		System.out.printf("\nMédia: %.2f", media);
		
		// Laço If para decidir a aprovação ou a reprovação
		if(media >= 7.0 && media <= 10) {
			System.out.print("\nAlune aprovade.");
		}else if(media >= 5.0 && media < 7.0) {
			System.out.print("\nAlune de recuperação.");
		}else{
			System.out.print("\nAlune reprovade.");
		}
	}

}
