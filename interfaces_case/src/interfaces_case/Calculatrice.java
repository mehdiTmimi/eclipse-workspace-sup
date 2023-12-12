package interfaces_case;

public class Calculatrice {
	private int nbr1;
	private int nbr2;
	public Calculatrice() {
		super();
	}
	public Calculatrice(int nbr1, int nbr2) {
		super();
		this.nbr1 = nbr1;
		this.nbr2 = nbr2;
	}
	public void somme(I i) {
		int sum = nbr1+nbr2;
		i.execute(sum);
	}
	
	public int getNbr1() {
		return nbr1;
	}
	public void setNbr1(int nbr1) {
		this.nbr1 = nbr1;
	}
	public int getNbr2() {
		return nbr2;
	}
	public void setNbr2(int nbr2) {
		this.nbr2 = nbr2;
	}
	
}
