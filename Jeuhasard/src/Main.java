import java.util.Scanner;

public class Main {
	
	public Main() {
		Scanner scanner= new Scanner(System.in);
		SuccessConsole successConsole = new SuccessConsole();
		EchecConsole echecConsole = new EchecConsole();
		do {
			System.out.println("nbr Success : " + 
		successConsole.getNbrSuccess());
			System.out.println("nbr Echec : " + 
		echecConsole.getNbrEchec());
			System.out.println("donnez votre nombre : ");
			int guess = scanner.nextInt();
			
			Jeu.jouer(guess,successConsole,echecConsole);
		}
		while(true);
	}
	public static void main(String[] args) {
		new Main();
	}
}
