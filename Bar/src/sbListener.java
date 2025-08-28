import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class sbListener implements AdjustmentListener {
	private JLabel label;
	private JScrollBar sb;
	private JLabel rod;
	
	public sbListener(JLabel label,JScrollBar sb,JLabel rod) {
		this.label = label;
		this.sb = sb;
		this.rod = rod;
	}
	
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		int value = sb.getValue();//スクロールバーの値を獲得
		label.setText(Integer.toString(value));//Stringにキャストしてラベルを変更
		rod.setSize(value,28);//幅をラベルの値と連動
		
	}

}
