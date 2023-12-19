
public abstract class Animal implements Run{

	private static int counter=0;
	protected int id;
	protected float poids;
	protected String cri;
	
	public Animal() {
		counter++;
		this.id=counter;
	}

	public Animal(float poids, String cri) {
		counter++;
		this.id=counter;
		this.poids = poids;
		this.cri = cri;
	}
	public abstract void crier();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPoids() {
		return poids;
	}

	public void setPoids(float poids) {
		this.poids = poids;
	}

	public String getCri() {
		return cri;
	}

	public void setCri(String cri) {
		this.cri = cri;
	}

	@Override
	public String toString() {
		String type=this.getClass().getSimpleName();
		return type+ "[id=" + id + ", poids=" + poids + ", cri=" + cri + "]";
	}
	
	
}
