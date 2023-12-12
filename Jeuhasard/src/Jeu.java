
public class Jeu {

	public static void jouer(int nbr, ISuccess iSuccess, IEchec iEchec) {
		double random = Math.random()*10;
		int luckYNumber = (int) random; // entre 0 et 9
		if(luckYNumber == nbr)
			iSuccess.win();
		else iEchec.loose(luckYNumber);
	}
}
