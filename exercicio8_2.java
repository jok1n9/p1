/*
 * exercicio8_2
 */
import java.util.Scanner;

public class exercicio8_2 {
	
	public static void main (String[] args) {
		Scanner ler= new Scanner(System.in);
		double z=0, c=0, distance1=0, distance=0, o=0, p=0;
		Ponto2D pontos= new Ponto2D();
		do{
			System.out.print("Introduza um ponto:\n");
			System.out.print("x:");
			pontos.x = ler.nextDouble();
			System.out.print("y:");
			pontos.y = ler.nextDouble();
			distance1= distance;
			distance= Math.sqrt((Math.pow(pontos.x , 2)+ Math.pow(pontos.y, 2)));
			if(distance> distance1){ 
				o= pontos.x;
				p= pontos.y;
			}
			z+= distance;
			c++;
			}while(pontos.x !=0 && pontos.y != 0);
		System.out.printf("Número de pontos:%3.3f\n", c);
		System.out.printf("Distancia entre pontos:%3.3f\n", z);
		System.out.printf("Ponto mais longe da origem:(%3.3f, %3.3f)\n", o,p); 
	}
	

}
class Ponto2D{
	double x;
	double y;
}
