import java.util.Scanner;

	public class exercicio32 {
		public static void main(String[] args){
			Scanner notas= new Scanner(System.in);
			int op;
			System.out.print("Introduza a tabuada que deseja:");
			op= notas.nextInt();
			if(op<100 && op>0){
				for(int i=1; i<=10; i++){
					
					System.out.printf("|%d * %d = %d\n" ,op, i, i*op);}
			}else{System.out.print("Entre 0 e 100 seu anormal\n");}
		}
	
}

