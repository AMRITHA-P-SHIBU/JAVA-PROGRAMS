package lab24;
import java.awt.event.*;
import javax.swing.*;
import java.awt.color.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics.*;
public class TrafficLightGui extends JFrame implements ActionListener{
	JRadioButton r1,r2,r3;
	Color red_c,yellow_c,green_c;
	TrafficLightGui(){
		r1= new JRadioButton("Red");
		r2= new JRadioButton("Yellow");
		r3= new JRadioButton("Green");
		ButtonGroup gb = new ButtonGroup();
		gb.add(r1);
		gb.add(r2);
		gb.add(r3);
		r1.setBounds(50,10,100,30);
		r2.setBounds(150,10,100,30);
		r3.setBounds(250,10,100,30);
		add(r1);
		add(r2);
		add(r3);
	    red_c = getBackground();
	    yellow_c = getBackground();
	    green_c = getBackground();
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TrafficLightGui();
	}
	public void actionPerformed(ActionEvent e) {
		if (r1.isSelected()){
			red_c=Color.red;
			yellow_c=getBackground();
			green_c=getBackground();
			}
		else if(r2.isSelected()) {
			red_c=getBackground();
			yellow_c=Color.yellow;
			green_c=getBackground();
			}
		else if(r3.isSelected()) {
			red_c=getBackground();
			yellow_c=getBackground();
			green_c=Color.green;
			}
		repaint();
	}
	public void paint(Graphics g) {
		super.paint(g);
		g.drawOval(50,100,50,50);
		g.drawOval(50,160,50,50);
		g.drawOval(50,220,50,50);
		g.setColor(red_c);
		g.fillOval(50,100,50,50);
		g.setColor(yellow_c);
		g.fillOval(50,160,50,50);
		g.setColor(green_c);
		g.fillOval(50,220,50,50);
	}
}
