import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

public class MenuListener implements ActionListener {
	private Graphics g;
	
	public MenuListener(Graphics g) {
		this.g = g;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem item = (JMenuItem)e.getSource();
		//色メニュー
		if(item.getText().compareTo("赤") == 0) {
			g.setColor(new Color(255, 0, 0));
		}else if(item.getText().compareTo("青") == 0) {
			g.setColor(new Color(0, 0, 255));
		}else if(item.getText().compareTo("緑") == 0) {
			g.setColor(new Color(0, 255, 0));
		}else if(item.getText().compareTo("黒") == 0) {
			g.setColor(new Color(0,0,0));
		}
		
		//太さメニュー
		if(item.getText().compareTo("大") == 0) {
			Graphics2D g2 = (Graphics2D)g;
			BasicStroke bs = new BasicStroke(8);
			g2.setStroke(bs);
		}else if(item.getText().compareTo("中") == 0) {
			Graphics2D g2 = (Graphics2D)g;
			BasicStroke bs = new BasicStroke(5);
			g2.setStroke(bs);
		}else if(item.getText().compareTo("小") == 0) {
			Graphics2D g2 = (Graphics2D)g;
			BasicStroke bs = new BasicStroke(3);
			g2.setStroke(bs);
		}else if(item.getText().compareTo("極小") == 0) {
			Graphics2D g2 = (Graphics2D)g;
			BasicStroke bs = new BasicStroke(1);
			g2.setStroke(bs);
		}
		
		
		
	}

}
