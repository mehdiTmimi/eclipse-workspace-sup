package interfaces_case;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class GraphicExecute implements I{

	@Override
	public void execute(int res) {
		JFrame frame= new JFrame();
		JTextField text = new JTextField(res+"");
		frame.add(text);
		frame.setVisible(true);
		frame.show();
	}

}
