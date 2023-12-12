
public class SuccessConsole implements ISuccess{

	private int nbrSuccess;
	public SuccessConsole() {
		nbrSuccess=0;
	}
	@Override
	public void win() {
		System.out.println("Congratulations !!!!!!");
		this.nbrSuccess++;
	}
	public int getNbrSuccess() {
		return this.nbrSuccess;
	}
}
