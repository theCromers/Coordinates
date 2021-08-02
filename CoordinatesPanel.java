import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CoordinatesPanel extends JPanel {
	private final int SIZE = 6;
	private int x = 50, y = 50;
	private String s = "";
	public CoordinatesPanel() {
		addMouseListener(new CoordinatesListener());
		setBackground(Color.black);
		setPreferredSize(new Dimension(300, 200));
	}

	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		page.setColor(Color.green);
		page.fillOval(x, y, SIZE, SIZE);
		page.drawString("Coordinates: (" + x + ", " + y + ")", 5, 15);
		page.drawString(s, 5, 25);
	}

	private class CoordinatesListener implements MouseListener {

		public void mousePressed(MouseEvent event) {
			x = event.getX();
			y = event.getY();
			repaint();
		}

		public void mouseClicked(MouseEvent event) {
			s= "Mouse clicked.";
			
		}

		public void mouseReleased(MouseEvent event) {
			s="Mouse released.";
		}

		public void mouseEntered(MouseEvent event) {
			s="Mouse entered.";
		}

		public void mouseExited(MouseEvent event) {
			s="Mouse exited.";
		}
	}
}
