import java.io.*;
import java.util.Scanner;

	public class exercicio72 {
		public static void main(String[] args) throws IOException{
			
			Scanner sc= new Scanner(System.in);
			File f= new File(args[0]);
			Scanner fic= new Scanner(f);
			if(!f.exists() && !f.canRead()) System.out.print("f não existe\n");
			else{
			
			int[] z= new int[100];
			
			int i=0;
			while(i<100 && fic.hasNextInt()){
				z[i]= fic.nextInt();;
				i++;
				
			}
			fic.close();
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

}
