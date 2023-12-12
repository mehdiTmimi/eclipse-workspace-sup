
public class SuccessConsole implements ISuccess{

	private Main main;
	public SuccessConsole(Main main) {
		this.main=main;
	}
	@Override
	public void win() {
		System.out.println("Congratulations !!!!!!");
		main.incremenetSuccess();
	}

}
