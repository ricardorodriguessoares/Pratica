
import java.util.Scanner;


public class Media {
    
    public static void main(String [] args){
        
        try (Scanner teclado = new Scanner (System.in)) {
			System.out.println("******Escola EstuDaiOc�******");
			System.out.print("Primeira Nota: ");
			float n1 = teclado.nextFloat();
			System.out.print("Segunda Nota: ");
			float n2 = teclado.nextFloat();
			System.out.print("Terceira Nota ");
			float n3 = teclado.nextFloat();
			float m = (n1+n2+n3)/3;
			System.out.println("Sua m�dia �: " + m);
			if (m>6) {
			    System.out.println("Parab�ns!!! Tu foste Aprovado");            
			}else {
			    System.out.println("Tu Reprovaste!");
			}
		}
        
        
    }
}
