/*

 */
import java.util.Scanner;

public class ex6_1 {
	
	public static void main (String[] args) {
			Scanner sc= new Scanner(System.in);
			
			System.out.print("Introduza um número:");
			int x= sc.nextInt();
			
			int[] z= new int[x];
			System.out.print("Agora insira números:\n");
			for(int i=0; i<z.length; i++){
				z[i]= sc.nextInt();}
			
			for(int s=(z.length-1); s>=0; s--){
				System.out.println("Número="+z[s]);
				
	}
}
}
