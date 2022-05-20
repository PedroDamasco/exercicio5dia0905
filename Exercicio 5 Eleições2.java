package Exercicios;
import java.util.Scanner;
public class Eleicoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Indentificação das Variaveis.
		int cand,pt,pdl,pl,nu,bra,i;
		
		// Informando os valores das Variaveis.
		pt=0;
		pdl=0;
		pl=0;
		nu=0;
		bra=0;
		
		
		// Informando a duração do Ciclo de repetição.
		for (i=0; i<=49;i++) {
		// Expondo as informações ao usuario
		System.out.print("Boa noite escolha seu candito");
		System.out.printf("\nCanditos: \n13 = PT \n12 -> PDL \n22 -> PL \n0 -> Voto nulo \n1 -> Voto em Branco");
		
		// Scanner para seleção de qual e a opcao de escolha.
		cand=sc.nextInt();
		
		// Opções validas de escolha ao usuario.
		switch (cand) {
		case 13:
			// Soma +1 por escolha de cada candidato e expoe qual foi a opcao escolida pelo usuario.
			pt++;
			System.out.print("\nVoto somado ao PT");
			break;
		case 12:
			pdl++;
			System.out.print("\nVoto somado ao PDL");
			break;
		case 22:
			pl++;
			System.out.print("\nVoto somado ao PL");
			break;
		case 0:
			nu++;
			System.out.print("\nVoto Anulado");
			break;
		case 1:
			bra++;
			System.out.print("\nVoto em Branco");
			break;
			// Caso a pcao seja invalida ele ira desconsiderar aquele voto e voltar 1 no contador de i.
			default:
				i=i-1;
				System.out.printf("Opcao invalida tente novamente");		}
		
		//Quando i alcançar o numero desejado expoe o resultado da votacao
		if (i>=49) {
			System.out.printf("\nApos 50 votações o resultado é:\nPT="+pt+".");
			System.out.printf("\nPDL="+pdl+".");
			System.out.printf("\nPL="+pl+".");
			System.out.printf("\nVotos Nulos="+nu+".");
			System.out.printf("\nVotos em Branco="+bra+".");
		}
		
		}

}}
\\ fim