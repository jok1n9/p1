import java.util.Scanner;

public class ex6_2 {
	
	public static void main (String[] args) {
			Scanner sc= new Scanner(System.in);
			int[] z= new int[100];
			System.out.print("Introduza números:");
			int i=0;
			int x;
			x= sc.nextInt();
			while(i<100 && x>=0){
				z[i]= x;
				i++;
				x=sc.nextInt();
			}
			System.out.print("que número deseja verificar?");
			int a= sc.nextInt();
			int num=0;
			
			for(int b=0; b<100; b++){
				if(z[b]== a){
					num += 1;}
			}
			System.out.print(num);
}
}
