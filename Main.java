/* Faça um programa no qual o usuário possa escolher uma das opções:
“1 - Multiplicação de inteiros”,
“2 - Divisão de inteiros”,
“3 - Adição de inteiros”,
“4 - Subtração de inteiros” e
“5 – Sair do programa”.
Caso o usuário digite 2, ele poderá entrar com dois números.
O resultado da operação matemática entre eles deverá ser exibido na tela e, logo em seguida, retornar ao menu principal.
Para o caso de divisão por 0, apresentar a devida mensagem de erro para o usuário.
Nome do programa: CalculadoraAritmetica.java */

import java.util.*;

class Main {
  public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);

		boolean fecha = false;
		int opcao, n1, n2;

		while (!fecha) {

			opcao = escolheOpcao();

			switch (opcao) {
				case 1: //1 - Multiplicação de inteiros
					System.out.println("*** Multiplicação de inteiros ***\n");
					break;
				case 2: //2 - Divisão de inteiros
					System.out.println("*** Divisão de inteiros ***\n");
					break;
				case 3: //3 - Adição de inteiros
					System.out.println("*** Adição de inteiros ***\n");
					break;
					case 4: //4 - Subtração de inteiros
					System.out.println("*** Subtração de inteiros ***\n");
					break;
				case 5: //5 – Sair do programa
					System.out.println("*** OBRIGADO. VOLTE SEMPRE!!! ***");
					fecha = true;
					break;
			}
		}
		
  }

	public static int escolheOpcao() {
		Scanner sc = new Scanner(System.in);
		int o=0;
		
		try {
			System.out.println("*** Escolha uma opção ***\n   1 - Multiplicação de inteiros\n   2 - Divisão de inteiros\n   3 - Adição de inteiros\n   4 - Subtração de inteiros\n   5 - Sair do programa");
			o = sc.nextInt();
		} catch (InputMismatchException erro1) {
			System.out.println("Digite uma opção válida!");
			sc.nextLine();
		}

		return o;
	}
}