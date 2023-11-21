package tp1;

public class Main {

	public static void main(String[] args) {
		Calculatrice c1 = new Calculatrice();
		c1.setNbr1(10);
		c1.setNbr2(20);
		c1.description();
		System.out.println(c1.somme());
		System.out.println(c1.produit());
		
		System.out.println("----------");
		Calculatrice c2 = new Calculatrice(10,20);
		c2.description();
		System.out.println(c2.somme());
		System.out.println(c2.produit());
	}
}
