	import java.util.Scanner;
public class principal {

		public static void main(String[] args) {
			
			/*aula do dia 21/03 Java basico Menu 
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
	        
	        System.out.println("Resposta = "+n3);*/
	        /*Aula dia 27/03 Blocos de decisão 
			Scanner ler = new Scanner(System.in);
			int n3=0;
			
			System.out.println("Menu");
			System.out.println("[1]Somar");
			System.out.println("[2]Subitrair");
			System.out.println("[3]Multiplicar");
			System.out.println("[4]Dividir");
			System.out.println("Escolha uma opção");
			int opc = ler.nextInt();
			//Do e While em Java:
			do {
				System.out.println("Escolha uma opção valida");
				opc=ler.nextInt();
			}while (opc < 0 || opc > 4);

			System.out.println("Digite o primeiro Número");
			int n1 = ler.nextInt();
			System.out.println("Digite o segundo Número");
			int n2 = ler.nextInt();
			//Switch case:
	        switch(opc) {
	        
	        case 1:
	        	n3 = n1+n2;
	        	break;
	        case 2:
			    n3 = n1-n2;
			    break;
	        case 3:
			    n3 = n1*n2;
			    break;
	        case 4:
			    n3 = n1/n2;
	        default:
	        }
	        
	        System.out.println("Resposta = "+n3);
*/		
			
			
			/*Vetores em Java:
			
			Scanner ler = new Scanner(System.in);	
			System.out.println("Menu");
			System.out.println("[1]Somar");
			System.out.println("[2]Subitrair");
			System.out.println("[3]Multiplicar");
			System.out.println("[4]Dividir");
			System.out.println("Escolha uma opção");
			float n3;
			float n[];
			n = new float[2];
			
			n[0]= ler.nextFloat();
	
			float opc = ler.nextInt();
			do {
				System.out.println("Escolha uma opção valida");
				opc=ler.nextInt();
			}while (opc < 0 || opc > 4);

			System.out.println("Digite o primeiro Número");
			n[0]= ler.nextFloat();
			System.out.println("Digite o segundo Número");
			n[1]= ler.nextFloat();
			
			//Switch case:
	        switch(opc) {
	        case 1:
	        	n3 = n[0]+n[1];
	        	break;
	        case 2:
	        	n3 = n[0]-n[1];
			    break;
	        case 3:
	        	n3 = n[0]*n[1];
			    break;
	        case 4:
	        	n3 = n[0]/n[1];
	        default:
	        }
	        
	        System.out.println("Resposta = "+n3);
		}*/

			Scanner ler = new Scanner(System.in);
			System.out.println("Menu");
			System.out.println("[1]Somar");
			System.out.println("[2]Subitrair");
			System.out.println("[3]Multiplicar");
			System.out.println("[4]Dividir");
			System.out.println("Escolha uma opção");
			
			float n3 = 0;
			float n[];
			n = new float[2];
			
			int opc = ler.nextInt();
			do {
				System.out.println("Escolha uma opção valida");
				opc=ler.nextInt();
			}while (opc < 0 || opc > 4);
			
			int b;
			for(b=0; b<2; b++){
				System.out.println("Digite o "+(b+1)+"ªValor");
				n[b]=ler.nextFloat();
			}
			//Ele está entrando na condição de opção valida mesmo adicionando uma opção valida.
			//Switch case:
			
			switch(opc){
				case 1:
					n3 = n[0]+n[1];
					break;
				case 2:
					n3 = n[0]-n[1];
					break;
				case 3:
					n3 = n[0]*n[1];
					break;
				case 4:
					n3 = n[0]/n[1];
				break;
			}

			System.out.println("Resposta = "+ n3);
		}
	}

			



















