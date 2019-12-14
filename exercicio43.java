import java.util.Scanner;

	public class exercicio43 {
		public static void main(String[] args){
			Scanner notas= new Scanner(System.in);
			double op, y=0, media, menor=0, maior=0;
			double n=0, x=0;
			op= notas.nextDouble();
			while(n != op){
				n= notas.nextDouble();
				x=x+n;
				y++;
				if(y==1){menor=n;}			
				else if(n<menor){
					menor=n;
				}			
				if(y==1){maior=n;}
				if(n>maior) {maior= n;}
				
			}
			media= x/y;
			System.out.printf("Números= %3.1f\n",y+1);
			System.out.printf("Média= %3.1f\n",media);
			System.out.printf("Menor= %3.1f\n",menor);
			System.out.printf("Maior= %3.1f\n",maior);



			
			
		}
	
}
