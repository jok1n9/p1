import java.io.*;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class TesteFinal {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) throws IOException{
    Aluno [] alunos = lerFich("t3.txt");
    printArray(alunos,"");
    System.out.print("Pesquisar: ");
    String input = sc.nextLine();
    Aluno [] filtro = filtrar(alunos,input);
    printArray(filtro,"Lista");
    System.out.print("Nome do ficheiro: ");
    input = sc.nextLine();
    escreverFich(filtro,input);

  }

  static String retiraEspacos(String s) {
    String r = "";
    char anterior = ' ';
    for(int i = 0; i < s.length(); i++) {
      if(!(s.charAt(i) == ' ' && anterior == ' ')) r = r + s.charAt(i);
      anterior = s.charAt(i);
    }
    return r;
  }

  static Aluno[] lerFich(String nome) throws IOException {
    File f = new File(nome);
    int lines = 0;
    Scanner read = new Scanner(f);
    //conta o numero de linhas
    while(read.hasNextLine()) {
      lines++;
      read.nextLine();
    }
    read.close();

    Aluno[] alunos = new Aluno[lines];  //cria o array com o tamanho igual ao numero de linhas

    read = new Scanner(f);  //repoe o scanner
    int i = 0;

    while(read.hasNextLine()) {
      alunos[i] = new Aluno();                            //guarda espaço na memoria

      alunos[i].numero = read.nextInt();
      alunos[i].nota = read.nextDouble();
      alunos[i].nome = read.nextLine();                   //guarda os valores no array

      alunos[i].nome = retiraEspacos(alunos[i].nome.trim());  //retira os espaços indesejados
      
      i++;
    }
    read.close();
    return alunos;
  }

  static String alunoToString(Aluno a) {
    String s = String.format("%s %d %.1f",a.nome,a.numero,a.nota);
    return s;
  }

  static void printArray(Aluno[] a, String mensagem) {
    System.out.printf("%s\n",mensagem);
    for(int i = 0; i < a.length; i++) {
      System.out.printf("%d %s %.1f\n",a[i].numero,a[i].nome,a[i].nota);
    }
  }

  static Aluno[] filtrar(Aluno[] alunos, String s) {
    Aluno[] space = new Aluno[alunos.length];
    for(int i = 0; i < alunos.length; i++) {  //reserva espaço para um array auxiliar
      space[i] = new Aluno();
    }
    String info;
    int k = 0;    // serve como contador de ocasiões em que a string é encontrada e como indice do array


    for(int j = 0; j < alunos.length; j++) {
      info = alunoToString(alunos[j]);
      if(info.indexOf(s) != -1) {             //caso seja diferente de '-1' significa que a string s existe em info
        space[k] = alunos[j];                 // logo guarda no array auxiliar
        k++;
      }
    }
    if (k == 0) return null;              //caso nao seja encontrado nada
    else {
      Aluno[] fin = new Aluno[k];       //cria um ultimo array com o tamanho do numero de ocasioes para ser devolvido

      for(int f = 0; f < k; f++) {      // copia os elementos do array auxiliar para o array final
        fin[f] = new Aluno();         //reserva espaço na memoria
        fin[f] = space[f];
      }
      return fin;
    }
  }

  static void escreverFich (Aluno[] alunos, String nome) throws IOException {
    File f = new File(nome);
    PrintWriter pw = new PrintWriter(f);
    String line;

    for(int i = 0; i < alunos.length; i++) {
      line = alunoToString(alunos[i]);
      pw.println(line);
    }
    pw.close();
  }

}

class Aluno {
  String nome;
  int numero;
  double nota;
}
