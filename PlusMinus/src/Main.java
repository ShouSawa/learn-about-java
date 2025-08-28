import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("加減算器");
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null); //サイズ変化に伴う自動レイアウト禁止
		frame.setResizable(false); //サイズ変更の禁止
		
		//ラベル追加
		JLabel label = new JLabel("0"); //文字の0に設定
		label.setBounds(90, 20, 80, 28);
		frame.add(label);
		
		//+1ボタン
		JButton plusButton = new JButton("+1"); //+1と書かれたボタンを生成
		plusButton.setSize(80, 28); //サイズ指定
		plusButton.setLocation(10, 60); //配置する位置を指定
		frame.add(plusButton); //フレームに追加
		
		
		
		//-1ボタン
		JButton minusButton = new JButton("-1"); //-1と書かれたボタンを生成
		minusButton.setSize(80, 28); //サイズ指定
		minusButton.setLocation(100, 60); //配置する位置を指定
		frame.add(minusButton); //フレームに追加
		
		plusButton.addActionListener(new plusButtonListener(label));//+1ボタンが押されたとき
		minusButton.addActionListener(new minusButtonListener(label));//1ボタンが押されたとき
		
		frame.setVisible(true);
	}
	
}
