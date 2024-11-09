package lab24;
import java.awt.event.*;
import javax.swing.*;
public class AwtCounterGui implements ActionListener {
	JLabel l;JTextField t;JButton bup,bdown,breset;
	String operator;
	int a,b;
	int result;
	AwtCounterGui(){
		JFrame f=new JFrame("AWT COUNTER");
		l=new JLabel("COUNTER: ");
		l.setBounds(55, 50, 200, 30);
	    f.add(l);
		t=new JTextField("0");
		t.setBounds(150,50,80,30);
		f.add(t);
		bup=new JButton("+");
		bup.setBounds(35,150,50,30);
		f.add(bup);
		bdown=new JButton("-");
		bdown.setBounds(145,150,50,30);
		f.add(bdown);
		breset=new JButton("R");
		breset.setBounds(250,150,50,30);
		f.add(breset);
		
		bup.addActionListener(this);bdown.addActionListener(this);breset.addActionListener(this);
		
		f.setSize(350,350);
	    f.setLayout(null);
	    f.setVisible(true);
	    f.setResizable(false);
	}
	public static void main(String[] args) {
		new AwtCounterGui();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bup) {
			a=Integer.parseInt(t.getText());
			result=a+1;
			t.setText(""+result);
		}
		if(e.getSource()==bdown) {
			b=Integer.parseInt(t.getText());
			result=b-1;
			t.setText(""+result);
		}
		if(e.getSource()==breset) {
			t.setText("0");
		}
	}

}
