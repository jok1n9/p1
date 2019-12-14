import java.io.*;
import java.util.Scanner;

	public class exercicio71 {
		public static void main(String[] args) throws IOException{
			Scanner ler= new Scanner(System.in);
			int d=0;
			do{
			System.out.print("Dê um nome de um ficheiro:");
			String s= ler.nextLine();
			File f= new File(s);
			if(!f.exists() && !f.canRead()) System.out.print("f não existe\n");
			else{ System.out.print("F existe e pode ser lido");
				d=1;} 
			}while(d!=1);
			

}
}
