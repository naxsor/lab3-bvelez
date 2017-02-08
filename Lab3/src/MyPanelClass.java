import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
                        int centerx = (width/2)-(55/2);
                        int centery = (height/2)-(55/2);
                        
 
                        //Paint the background
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1, width+1, height+1);
                        
//                        //Draw a border
//                        g.setColor(Color.MAGENTA);
//                        g.fillRect(x1+5, y1+5, width-10, height-10);
//                        
//                        //Draw a border
//                        g.setColor(Color.BLACK);
//                        g.fillRect(x1+10, y1+10, width-20, height-20);
//                        
//                        //Draw a border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width, height);
//                        
//                        //Draw lines
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                        g.setColor(Color.ORANGE);
//                        g.drawLine(x1, y2, x2, y1);
//                        
//                        //Draw Oval
//                        g.setColor(Color.LIGHT_GRAY);
//                        g.fillOval(centerx, centery, 55, 55);
//                      
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
                        
                        //Draw Rectangle
                        g.setColor(Color.RED);
                        g.fillRect(x1+10, y1+10, x1+210, y1+140);
                        
                        g.setColor(Color.WHITE);
                        g.fillRect(x1+10, y1+35, x1+210, 28);
                        
                        g.setColor(Color.WHITE);
                        g.fillRect(x1+10, y1+90, x1+210, 28);
                        
                        //Draw Triangle
                        Polygon p3 = new Polygon();
                        p3.addPoint(x1+10,y1+10);
                        p3.addPoint(x1+115, y1+75);
                        p3.addPoint(x1+10, y1+150);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p3);
                        
                        //Draw Star
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 25, y1 + 73);
                        p2.addPoint(x1 + 41, y1 + 73);
                        p2.addPoint(x1 + 47, y1 + 58);
                        p2.addPoint(x1 + 53, y1 + 73);
                        p2.addPoint(x1 + 69, y1 + 73);
                        p2.addPoint(x1 + 56, y1 + 83);
                        p2.addPoint(x1 + 61, y1 + 98);
                        p2.addPoint(x1 + 47, y1 + 88);
                        p2.addPoint(x1 + 34, y1 + 98);
                        p2.addPoint(x1 + 38, y1 + 83);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);                     
                       
            }
}