/*
 * exercicio8_3
 */
import java.io.*;
import java.util.Scanner;

public class exercicio8_3 {
	
	public static void main (String[] args) throws IOException {
			File f= new File(args[0]);
			Scanner fic= new Scanner(f);
			if(!f.exists() && !f.canRead()) System.out.print("f não existe\n");
			else{
			
			int[] z= new int[100];
			
			int i=0, m=0, media, maximo=0, minimo=0,z1=0;
			z[0]= 0;
			while(i<100 && fic.hasNextInt()){
				z1=z[i];
				z[i]= fic.nextInt();
				
				m += z[i];
				if(z[i]>z1) maximo= z[i];
				if(z[i]<z1) minimo= z[i];
				
				i++;
				
			}
			media= m/i;
			
			fic.close();
			stats novo= new stats();
			novo.media= media;
			novo.maximo= maximo;
			novo.numeros= i;
			novo.minimo= minimo;
			}
		}
	public static void updatestats(stats i){
		Scanner ler= new Scanner(System.in);
		int y, x;
		do{
			System.out.print("Adicione números:");
			y=ler.nextInt();
			i.media= ((i.numeros*i.media)+ y)/i.numeros+1;
			
			if(y> i.maximo) i.maximo= y;
			
			if(y< i.minimo) i.minimo= y;
			
			i.numeros += 1;
			
			
			System.out.print("Deseja adicionar mais: 1- sim / 0- Nao");
			y=ler.nextInt();
		}while(y==1);
	}
}
class stats{
	int media, maximo, minimo, numeros;

}
