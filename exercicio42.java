
import java.util.Scanner;

	public class exercicio42 {
		public static void main(String[] args){
			Scanner notas= new Scanner(System.in);
			int op;
			int n=1;
			op= notas.nextInt();
			while(op>=0){
				n = n * op;
				op= notas.nextInt();
				
			}
			System.out.printf("Números= %d",n);
		}
	
}
