import java.util.Scanner;

public class Main {
	int nbrSuccess = 0;
	int nbrEchec = 0;
	public Main() {
		/**/
		Scanner scanner= new Scanner(System.in);
		do {
			System.out.println("nbr Success : " + nbrSuccess);
			System.out.println("nbr Echec : " + nbrEchec);
			System.out.println("donnez votre nombre : ");
			int guess = scanner.nextInt();
			Jeu.jouer(guess,()->{
				nbrSuccess++;
				System.out.println("Congratulations !!!!!!");
			}, (x)->{
				nbrEchec++;
				System.err.println("sorry , u lost. "+
			"the lucky number was " +x);
			});
		}
		while(true);
	}
	public static void main(String[] args) {
		new Main();
	}
}
