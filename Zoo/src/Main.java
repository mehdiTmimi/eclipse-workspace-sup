import java.util.Scanner;

public class Main {

	Zoo zoo;
	Scanner scanner;
	public Main() {
		scanner = new Scanner(System.in);
		zoo = new Zoo("fes zoo","adarissa fes maroc");
		zoo.getAnimals().add(new Elephant(1000,"uhoooo"));
		zoo.getAnimals().add(new Tigre(200,"Roaar"));
		int choix;
		do {
			choix = menu();
			switch (choix) {
			case 1:
				afficherInfoZoo();
				break;
			case 2: 
				ajouterAnimal();
				break;
			case 3:
				crierAnimal();
				break;
			case 4:
				runAnimal();
				break;
			case 5: 
				System.out.println("goodbye!");
				break;
			default:
					System.out.println("choix incorrect");
					break;
			
			}
		}while(choix!=5);
		//afficherInfoZoo();
	}
	
	public static void main(String[] args) {
		new Main();
	}
	private int menu() {
		System.out.println("---------Menu--------");
		System.out.println("1 - info zoo");
		System.out.println("2 - ajouter");
		System.out.println("3 - crier");
		System.out.println("4 - run");
		System.out.println("5 - quitter");
		return scanner.nextInt();
	}
	private void crierAnimal() {
		for(Animal animal:zoo.getAnimals()) {//for(Type variable:list)
			animal.crier();// polymorphisme
		}
	}
	private void runAnimal() {
		for(Animal animal:zoo.getAnimals()) {//for(Type variable:list)
			animal.run();// polymorphisme
		}
	}
	private void afficherInfoZoo() {
		System.out.println(zoo.getNom()+" : "+ zoo.getAddress());
		for(Animal animal:zoo.getAnimals()) {//for(Type variable:list)
			System.out.println(animal);
		}
	}
	private void ajouterAnimal() {
		System.out.println("choisissez le type:");
		System.out.println("0 - Elephant");
		System.out.println("1 - Tigre");
		System.out.println("2 - Lion");
		int choix = scanner.nextInt();
		String cri;
		float poids;
		System.out.println("donnez le poids");
		poids = scanner.nextFloat();
		System.out.println("donnez le cri");
		scanner.nextLine(); // absorb the return
		cri = scanner.nextLine();
		Animal animal=null;
		if(choix == 0)
			animal = new Elephant(poids,cri);
		else if(choix == 1)
			animal = new Tigre(poids,cri);
		else
			animal = new Lion(poids,cri);
		zoo.getAnimals().add(animal);
	}
}
