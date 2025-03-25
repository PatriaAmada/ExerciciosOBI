package exercicios;
import java.util.Scanner;

//(PT/BR)Antes de montar o programa, fiz no caderno a resolução lógica do problema, o que eu queria que o programa fizesse, 
// Eu queria que o programa recebesse 3 numeros do usuário, colocasse em um array ordenado em ordem crescente, e por fim mostra-se na tela o segundo item do array que seria a idade de camila
//Em seguida, começei a pesquisar como fazer cada função desejada

//(ENG)Before setting up the program, I did the logical resolution of the problem in my notebook, what I wanted the program to do, 
// I wanted the program to receive 3 numbers from the user, put them in an array sorted in ascending order, and finally show on the screen the second item of the array, which would be Camila's age. 
//Then, I started researching how to do each desired function.

//(PT/BR)Criando classe

//(ENG)Creating class
public class idade_camila {
	public static void main(String[] args) throws Exception {
		try (Scanner sc = new Scanner(System.in)){
		
		//(PT/BR)Criando um array para conter as entradas do usuário, no máximo 3

		//(ENG)Creating an array to contain user input, 3 max
		int[] listaIdades = new int[3];
		
		//(PT/BR)Criando um loop para receber as entradas do usuário e garantir que elas sejam numeros inteiros entre 5 e 100,
		//o loop irá continuar até serem recebidos 3 entradas aceitas

		//(ENG)Creating a loop to receive user input and ensure that it is an integer between 5 and 100,
		//the loop will continue until 3 accepted inputs are received
		for (int i = 0; i < 3; i++) {
			
			//(PT/BR)Entrada do usuário

			//(ENG) User entry
			System.out.println("Digite uma idade entre 5 e 100: ");
			String entrada = sc.nextLine();
			
			int idade = 0;
			
			//(PT/BR)Essa foi a parte mais difícil do código, meu objetivo era que caso o usuário desse uma entrada que não fosse um numero inteiro
			//A entrada fosse rejeitada e fosse pedida uma nova entrada no lugar, 
			//foram diversas horas procurando uma solução que não fizesse o programa parar de funcionar por completo se o usuário colocasse uma string "a" por exemplo
			//A solução que funcionou foi essa, verificar se era possível transformar a string de entrada em um inteiro antes de passar para o próximo passo, caso não fosse possivel ele pediria a entrada de novo

			//(ENG)This was the hardest part of the code, my goal was that if the user gave an input that was not an integer,
			//The input would be rejected and a new input would be requested instead,
			//I spent several hours looking for a solution that would not make the program stop working completely if the user entered a string "a" for example
			//The solution that worked was this, checking if it was possible to transform the input string into an integer before moving on to the next step, if it was not possible it would ask for the input again
				try {
                idade = Integer.parseInt(entrada);
				} catch (Exception e) {
				//(PT/BR)Mensagem de erro caso o usuário insira um caractere não aceito

				//(ENG)Error message in case a character is not accepted
                System.out.println("Entrada invalida");
				}
			
				//Validação da entrada do usuário
			while (idade < 5 || idade > 100 || idade != (int)idade) {
			//(PT/BR) Mensagem pedindo uma nova entrada

			//(ENG) Asking the user to re-input
			System.out.println("Por favor insira um numero entre 5 e 100");
			entrada = sc.nextLine();
				try {
                idade = Integer.parseInt(entrada);
				} catch (Exception e) {
                System.out.println("Entrada invalida");
				}
			}
		//(PT/BR) Nessa parte cada numero é posto no array, em seguida ordenado em ordem crescente, como na minha resolução do exercicio a idade de camila era a "do meio"

		//(ENG) In this part, each number is placed in the array, then sorted in ascending order, as in my resolution of the exercise, Camila's age was the "middle" one.
		listaIdades[i] = idade;
		}
		int temporario;
		for (int i = 0; i < listaIdades.length; i++) {
            for (int j = i + 1; j < listaIdades.length; j++) {
                if (listaIdades[i] > listaIdades[j]) {
                    temporario = listaIdades[i];
                    listaIdades[i] = listaIdades[j];
                    listaIdades[j] = temporario;
                }
            }
        }
		//(PT/BR) Resultado final

		//(ENG) Final result
		System.out.println("Camila possui: " + listaIdades[1] + " anos");
		
		}
	}}
