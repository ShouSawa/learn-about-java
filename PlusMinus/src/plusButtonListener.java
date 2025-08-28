import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class plusButtonListener implements ActionListener {
	private JLabel label;
	
	public plusButtonListener(JLabel label) {
		this.label = label;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = label.getText();//ラベルの数字を獲得
		int num = Integer.parseInt(str);//Stringからintへキャスト
		num += 1;
		label.setText(Integer.toString(num));
	}

}
