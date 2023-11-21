package tp1;

public class Calculatrice {

	//encapsulation
	private float nbr1;
	private float nbr2;
	// constructors
	public Calculatrice() {
		this.nbr1=0;
		this.nbr2=0;
	}
	public Calculatrice(float nbr1,float nbr2) {
		this.nbr1=nbr1;
		this.nbr2=nbr2;
	}
	//getters & setters
	public float getNbr1() {
		return this.nbr1;
	}
	public float getNbr2() {
		return this.nbr2;
	}
	public void setNbr1(float nbr1) {
		this.nbr1=nbr1;
	}
	public void setNbr2(float nbr2) {
		this.nbr2=nbr2;
	}
	// les methodes
	public float somme() {
		return this.nbr1+this.nbr2;
	}
	public float produit() {
		return this.nbr1*this.nbr2;
	}
	public void description() {
		System.out.println(this.nbr1);
		System.out.println(this.nbr2);
	}
}
