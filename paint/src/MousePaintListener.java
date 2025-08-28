import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;

import javax.swing.JComboBox;
import javax.swing.event.MouseInputListener;

public class MousePaintListener implements MouseInputListener {
	private Graphics g;
	private int count = 0;	//直線，三角形モードで使用
	private Point draggPoint;//なめらかな線を書くための座標
	private Point draggPoint2;//なめらかな線を書くための座標
	private Point point;//直線モードで使用
	private int xPoint[] = new int[3];//三角形モードで使用
	private int yPoint[] = new int[3];//
	private int R = 0;	//虹色ペンで使用
	private int G = 255;//
	private int B = 127;//
	
	
	//コンボボックス
	private JComboBox combo;
	
	public MousePaintListener(Graphics g,JComboBox combo) {
		this.g = g;
		this.combo = combo;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		draggPoint = e.getPoint();
		if((String)combo.getSelectedItem() == "直線") {//直線モード
			if(count == 0) {
				point = new Point(e.getX(),e.getY());
				count += 1;
			}else {
				g.drawLine(point.x, point.y, e.getX(), e.getY());
				count = 0;
			}
		}else if((String)combo.getSelectedItem() == "三角形") {//三角モード 
			if(count == 0) {
				xPoint[0] = e.getX();
				yPoint[0] = e.getY();
				count += 1;
			}else if(count == 1) {
				xPoint[1] = e.getX();
				yPoint[1] = e.getY();
				count += 1;
			}else {
				xPoint[2] = e.getX();
				yPoint[2] = e.getY();
				g.drawPolygon(xPoint, yPoint, 3);
				count = 0;
			}
		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if((String)combo.getSelectedItem() == "ペン") {
			draggPoint2 = e.getPoint();
			g.drawLine((int)draggPoint.getX(),(int)draggPoint.getY(), (int)draggPoint2.getX(), (int)draggPoint2.getY());
			draggPoint = e.getPoint();
			//早くドラッグしたときの丸と丸の間をdrawlineを用いて直線を引くようにして，線を滑らかにしました．
		} 
		if((String)combo.getSelectedItem() == "虹色ペン") {
			
		}
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {


	}

}
