import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.border.LineBorder;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("値入力");
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null); //サイズ変化に伴う自動レイアウト禁止
		frame.setResizable(false); //サイズ変更禁止
		
		//ラベル追加
		JLabel label = new JLabel("0"); //文字の0に設定
		label.setBounds(90, 20, 80, 28);
		frame.add(label);
		
		//スクロールバー
		JScrollBar sb = new JScrollBar(JScrollBar.HORIZONTAL, 0, 10, 0, 110);
		sb.setBounds(10, 40, 180, 18);
		frame.add(sb);
		
		//棒グラフ追加
		JLabel rod = new JLabel("");
		rod.setBounds(10, 90, 0, 28);
		rod.setBorder(new LineBorder(Color.BLACK, 1, false));
		frame.add(rod);
		
		sb.addAdjustmentListener(new sbListener(label,sb,rod));//スクロールバーが変化したとき
		
		frame.setVisible(true);
	}

}
