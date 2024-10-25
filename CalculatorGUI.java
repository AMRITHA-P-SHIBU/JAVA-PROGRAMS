package lab24;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CalculatorGUI implements ActionListener{
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bmul,bdiv,beq,bclr;
	JTextField t1;
	int a=0,b=0;
	String operator;
	double result=0;
	
	CalculatorGUI(){
	JFrame f=new JFrame("MY CALCULATOR");
	t1=new JTextField();
	t1.setBounds(100,100,200,30);
	b1=new JButton("1");
	b1.setBounds(100,140,50,30);
	b2=new JButton("2");
	b2.setBounds(150,140,50,30);
	b3=new JButton("3");
	b3.setBounds(200,140,50,30);
	badd=new JButton("+");
	badd.setBounds(250,140,50,30);
	b4=new JButton("4");
	b4.setBounds(100,170,50,30);
	b5=new JButton("5");
	b5.setBounds(150,170,50,30);
	b6=new JButton("6");
	b6.setBounds(200,170,50,30);
	bsub=new JButton("-");
	bsub.setBounds(250,170,50,30);
	b7=new JButton("7");
	b7.setBounds(100,200,50,30);
	b8=new JButton("8");
	b8.setBounds(150,200,50,30);
	b9=new JButton("9");
	b9.setBounds(200,200,50,30);
	bmul=new JButton("*");
	bmul.setBounds(250,200,50,30);
	b0=new JButton("0");
	b0.setBounds(100,230,50,30);
	bclr=new JButton("C");
	bclr.setBounds(150,230,50,30);
	beq=new JButton("=");
	beq.setBounds(200,230,50,30);
	bdiv=new JButton("/");
	bdiv.setBounds(250,230,50,30);

	f.add(t1);f.add(b1);f.add(b2);f.add(b3);f.add(badd);f.add(b4);f.add(b5);f.add(b6);
	f.add(bsub);f.add(b7);f.add(b8);f.add(b9);f.add(bmul);f.add(b0);f.add(bclr);f.add(beq);f.add(bdiv);
	f.setLayout(null);
	f.setSize(350,350);
	f.setVisible(true);
	f.setResizable(true);

	t1.addActionListener(this);b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);
	badd.addActionListener(this);b4.addActionListener(this);b5.addActionListener(this);b6.addActionListener(this);
	bsub.addActionListener(this);b7.addActionListener(this);b8.addActionListener(this);b9.addActionListener(this);
	bmul.addActionListener(this);b0.addActionListener(this);bclr.addActionListener(this);beq.addActionListener(this);
	bdiv.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)t1.setText(t1.getText()+"1");
		if(e.getSource()==b2)t1.setText(t1.getText()+"2");
		if(e.getSource()==b3)t1.setText(t1.getText()+"3");
		if(e.getSource()==b4)t1.setText(t1.getText()+"4");
		if(e.getSource()==b5)t1.setText(t1.getText()+"5");
		if(e.getSource()==b6)t1.setText(t1.getText()+"6");
		if(e.getSource()==b7)t1.setText(t1.getText()+"7");
		if(e.getSource()==b8)t1.setText(t1.getText()+"8");
		if(e.getSource()==b9)t1.setText(t1.getText()+"9");
		if(e.getSource()==b0)t1.setText(t1.getText()+"0");
		if(e.getSource()==badd) {
			a=Integer.parseInt(t1.getText());
			operator="+";
			t1.setText(null);;
		}
		if(e.getSource()==bsub) {
			a=Integer.parseInt(t1.getText());
			operator="-";
			t1.setText(null);;
		}
		if(e.getSource()==bmul) {
			a=Integer.parseInt(t1.getText());
			operator="*";
			t1.setText(null);;
		}
		if(e.getSource()==bdiv) {
			a=Integer.parseInt(t1.getText());
			operator="/";
			t1.setText(null);;
		}
		if(e.getSource()==bclr) {
			t1.setText(null);;
		}
		if(e.getSource()==bdiv) {
			a=Integer.parseInt(t1.getText());
			operator="/";
			t1.setText(null);;
		}
		if(e.getSource()==beq) {
			b=Integer.parseInt(t1.getText());
		switch(operator) {
		case "+":
			result=a+b;
			break;
		case "-":
			result=a-b;
			break;
		case "*":
			result=a*b;
			break;
		case "/":
			try {
			result=a/b;
			}catch(ArithmeticException ea) {
				t1.setText("Error:/ by zero");
				return;
			}
			break;
		}t1.setText(""+result);
	}
	}
	public static void main(String[] args) {
		new CalculatorGUI();
	}
}