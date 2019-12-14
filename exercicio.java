import java.util.Scanner;

	public class exercicio {
		public static void main(String[] args){
			Scanner notas= new Scanner(System.in);
			double nota1, nota2, nota3, notafinal, notam;
			
			System.out.print("Nota 1 : \n");
			nota1= notas.nextDouble();
			
			System.out.print("Nota 2:\n");
			nota2= notas.nextDouble();
			
			System.out.print("Nota 3: \n");
			nota3= notas.nextDouble();
			
			notafinal=( nota1*0.2 +nota2*0.3 + nota3* 0.5);
			if(notafinal > 9.5) {System.out.print("aluno foi aprovado");
				}else{System.out.print("Aluno foi reprovado");}
		}
	}
