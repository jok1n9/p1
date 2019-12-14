import java.util.Scanner;

	public class exercicio32 {
		public static void main(String[] args){
			Scanner notas= new Scanner(System.in);
			int op;
			int c = 1;
			System.out.print("Introduza um número:\n");
			op= notas.nextInt();
			for(int i=op; i >0; i--){
				c *=i; // c= c*i;
		}
	
}
