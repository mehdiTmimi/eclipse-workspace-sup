package interfaces_case;

public class Main {

	public Main() {
		
		Calculatrice calculatrice;
		calculatrice = new Calculatrice(10,3);
		//I consoleExecute = new ConsoleExecute();
		//calculatrice.somme(consoleExecute);
		
		calculatrice.somme(new I() { // instancier un objet d'une classe
			// anonyme qui implemente l'interface I
			@Override
			public void execute(int res) {
				System.out.println("------" + res);
			}
		});
		calculatrice.somme((res) ->{
			System.out.println("simplifie : " + res);
		});
		
	}
	public static void main(String[] args) {
		
		new Main();
	}

}
