import java.util.Scanner;

public class Main {
	private int nbrSuccess = 0;
	private int nbrEchec = 0;
	public Main() {
		Scanner scanner= new Scanner(System.in);
		SuccessConsole successConsole = 
				new SuccessConsole(this);
		EchecConsole echecConsole = new EchecConsole();
		echecConsole.setMain(this);
		do {
			System.out.println("nbr Success : " + nbrSuccess);
			System.out.println("nbr Echec : " + nbrEchec);
			System.out.println("donnez votre nombre : ");
			int guess = scanner.nextInt();
			
			Jeu.jouer(guess,successConsole,echecConsole);
		}
		while(true);
	}
	public static void main(String[] args) {
		new Main();
	}
	public void incremenetSuccess() {
		nbrSuccess++;
	}
	public void incrementEchec() {
		nbrEchec++;
	}
}
