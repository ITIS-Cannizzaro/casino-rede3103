import java.util.Scanner;
public class Main 
{
	static void Dado(ContoGiocatore A, ContoCasino B,int cont)
	{
		
		Scanner Numl=new Scanner(System.in);
		System.out.println("inserisci il numero che secondo te uscir�");
		int num = Numl.nextInt();
		System.out.println("inserisci la somma che vuoi scommettere");
		int somma = Numl.nextInt();
		int ris=(int)(1+Math.random()*((6-1)+1));
		System.out.println("il risultato del dado �: " + ris);
		if (ris==num)
		{
			A.Trasferimento(num,somma,A,B);
		}
		else
		{
			B.Trasferimento(num,somma,A,B);
		}
		System.out.println("il conto del giocatore �: " + A.ContoCorrente);
		System.out.println("il conto del casino �: " + B.ContoCorrente);
		if(cont<3)
		System.out.println("vuoi continuare?");
		else if(cont>3)
		System.out.println("sei diventato panont...");
		else
		System.out.println("vuoi continuare? ricorda il gioco fa male non essere come panont");
		int risposta = Numl.nextInt();
		if(risposta==1 && A.ContoCorrente>0)
		{
			cont++;
			Dado(A, B, cont);
		}
		else if(A.ContoCorrente<=0)
		{
			System.out.println("hai finito soldi");
		}
	}
	public static void main(String[]args)
	{
		int cont=0;
		ContoGiocatore Panont=new ContoGiocatore(0);
		ContoCasino MonteCarlo=new ContoCasino(0);
		Dado(Panont,MonteCarlo,cont);
		System.out.println("il conto del giocatore �: " + Panont.ContoCorrente);
		System.out.println("il conto del casino �: " + MonteCarlo.ContoCorrente);
	}
}
