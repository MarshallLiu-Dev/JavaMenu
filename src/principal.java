	import java.util.Scanner;
public class principal {

		public static void main(String[] args) {
			//aula do dia 21/03 Java basico Menu 
			Scanner ler = new Scanner(System.in);
			int n3=0;
			
			System.out.println("Menu");
			System.out.println("[1]Somar");
			System.out.println("[2]Subitrair");
			System.out.println("[3]Multiplicar");
			System.out.println("[4]Dividir");
			System.out.println("Escolha uma opção");
			int opc = ler.nextInt();

			System.out.println("Digite o primeiro Número");
			int n1 = ler.nextInt();
			System.out.println("Digite o segundo Número");
			int n2 = ler.nextInt();
			
			
	        if(opc == 1) {
			    n3 = n1+n2;
	        }else if(opc == 2 ){
			    n3 = n1-n2;
	        }else if(opc == 3 ){
			    n3 = n1*n2;
	        }else if(opc == 4 ){
			    n3 = n1/n2;
	        }
	        
	        System.out.println("Resposta = "+n3);
	     
		}
	}


