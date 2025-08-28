import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("paint");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setResizable(false);
		
		JMenuBar menubar = new JMenuBar();
		//色メニュー
		JMenu color = new JMenu("色");
		JMenuItem red = new JMenuItem("赤");
		JMenuItem blue = new JMenuItem("青");
		JMenuItem green = new JMenuItem("緑");
		JMenuItem black = new JMenuItem("黒");
		menubar.add(color);
		color.add(red);
		color.add(blue);
		color.add(green);
		color.add(black);
		
		//太さメニュー
		JMenu thickness = new JMenu("太さ");
		JMenuItem large = new JMenuItem("大");
		JMenuItem medium = new JMenuItem("中");
		JMenuItem small = new JMenuItem("小");
		JMenuItem mini = new JMenuItem("極小");
		menubar.add(thickness);
		thickness.add(large);
		thickness.add(medium);
		thickness.add(small);
		thickness.add(mini);
		
		frame.setJMenuBar(menubar);//メニューバーを設置
		
		//コンボボックス
		JComboBox combo = new JComboBox();
		combo.addItem("ペン");
		combo.addItem("直線");
		combo.addItem("三角形");
		combo.addItem("虹色ペン");
		combo.setBounds(20,10,50,20);
		frame.add(combo);
		
		frame.setVisible(true);//setVisibleの後にGraphicsを置く
		
		Graphics g = frame.getGraphics();
		
		//マウスのリスナー
		MousePaintListener mouselistener = new MousePaintListener(g,combo);
		frame.addMouseListener(mouselistener);
		frame.addMouseMotionListener(mouselistener);
		
		//メニューのリスナー
		ActionListener menulistener = new MenuListener(g);
		red.addActionListener(menulistener);
		blue.addActionListener(menulistener);
		green.addActionListener(menulistener);
		black.addActionListener(menulistener);
		large.addActionListener(menulistener);
		medium.addActionListener(menulistener);
		small.addActionListener(menulistener);
		mini.addActionListener(menulistener);
	}
}
	