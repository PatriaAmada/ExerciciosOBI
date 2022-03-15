package exercicios;
import java.util.Scanner;

//Antes de montar o programa, fiz no caderno a resolução lógica do problema, o que eu queria que o programa fizesse, 
// Eu queria que o programa recebesse 3 numeros do usuário, colocasse em um array ordenado em ordem crescente, e por fim mostra-se na tela o segundo item do array que seria a idade de camila
//Em seguida, começei a pesquisar como fazer cada função desejada

//Criando classe
public class idade_camila {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		//Criando um array para conter as entradas do usuário, no máximo 3
		int[] listaIdades = new int[3];
		
		//Criando um loop para receber as entradas do usuário e garantir que elas sejam numeros inteiros entre 5 e 100,
		//o loop irá continuar até serem recebidos 3 entradas aceitas
		for (int i = 0; i < 3; i++) {
			
			//Entrada do usuário
			System.out.println("Digite uma idade entre 5 e 100: ");
			String entrada = sc.nextLine();
			
			int idade = 0;
			
			//Essa foi a parte mais difícil do código, meu objetivo era que caso o usuário desse uma entrada que não fosse um numero inteiro
			//A entrada fosse rejeitada e fosse pedida uma nova entrada no lugar, 
			//foram diversas horas procurando uma solução que não fizesse o programa parar de funcionar por completo se o usuário colocasse uma string "a" por exemplo
			//A solução que funcionou foi essa, verificar se era possível transformar a string de entrada em um inteiro antes de passar para o próximo passo, caso não fosse possivel ele pediria a entrada de novo
				try {
                idade = Integer.parseInt(entrada);
				} catch (Exception e) {
				//Mensagem de erro caso o usuário insira um caractere não aceito
                System.out.println("Entrada invalida");
				}
			
				//Validação da entrada do usuário
			while (idade < 5 || idade > 100 || idade != (int)idade) {
			// Mensagem pedindo uma nova entrada
			System.out.println("Por favor insira um numero entre 5 e 100");
			entrada = sc.nextLine();
				try {
                idade = Integer.parseInt(entrada);
				} catch (Exception e) {
                System.out.println("Entrada invalida");
				}
			}
		// Nessa parte cada numero é posto no array, em seguida ordenado em ordem crescente, como na minha resolução do exercicio a idade de camila era a "do meio"
		
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
        System.out.println(listaIdades[i]); 
        }
		    
		System.out.println("Camila possui: " + listaIdades[1] + " anos");
		
	}}
