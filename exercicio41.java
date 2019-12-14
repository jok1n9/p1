import java.util.Scanner;

	public class exercicio41 {
		public static void main(String[] args){
			Scanner notas= new Scanner(System.in);
			int op;
			int n=0;
			
			do{
				
				n++;
				op= notas.nextInt();
				
			}while(op>0);
			System.out.printf("Números= %d",n);
		}
	
}
