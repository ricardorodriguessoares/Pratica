import java.util.Scanner;

/*Software que recebe diversos nomes de frutas e impreme ao contrário
  */
public class Frutas {

	public static void main(String[] args) {
		int qntd;
		//Declarando um Vetor
		String frutas[];
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Informe A quantidade de frutas: ");
		qntd = Integer.parseInt(teclado.nextLine());
		
		//Definindo o Tamanho do Vetor
		frutas = new String[qntd];
		
		for (int i = 0; i < qntd; i++) {
			System.out.println("Informe a " + (i + 1)+ " Fruta: ");
			frutas[i] = teclado.nextLine();
			
		}
		
		for (int i = 2; i >= 0; i--) {
			System.out.println(frutas [i]);
		}
		
		teclado.close();

	}

}
