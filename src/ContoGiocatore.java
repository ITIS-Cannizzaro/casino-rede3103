public class ContoGiocatore extends Conto
{
	ContoGiocatore(double contocorrente)
	{
		super(contocorrente);
		ContoCorrente=1000;
	}
	void Trasferimento(int num,double somma, ContoGiocatore A, ContoCasino B)
	{ 
		System.out.println("il casin� ha perso");
		System.out.println("il giocatore ha vinto");
		B.ContoCorrente-=somma*num;
		this.ContoCorrente+=somma*num;
	}
}
