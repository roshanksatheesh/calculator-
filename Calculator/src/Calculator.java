import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	
	double temp;
	boolean isOperatedClicked=false;
	float result;
	String oldValue,string,operation,answer,value;
	JFrame jf;
	JLabel displayLabel;
	JButton sevenbutton;
	JButton eightbutton;
	JButton ninebutton;
	JButton fourbutton;
	JButton fivebutton;
	JButton sixbutton;
	JButton onebutton;
	JButton twobutton;
	JButton threebutton;
	JButton dotbutton,zerobutton,equalsbutton;
	JButton divisionbutton,
	        multiplicationbutton,
	        subtractionbutton,
	        additionbutton,
	        clearbutton,
	        deletebutton,
	        negativebutton;
	
		public Calculator () {
			jf=new JFrame("Calculator");
			jf.setLayout(null);
			jf.setSize(600,600);
			jf.setLocation(300, 50);
			
			displayLabel=new JLabel();
			displayLabel.setBounds(30, 50, 540, 50);
			displayLabel.setBackground(Color.gray);
			displayLabel.setOpaque(true);
			displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			displayLabel.setForeground(Color.white);
			displayLabel.setFont(new Font("Arial", Font.BOLD, 30));
			
			
			sevenbutton=new JButton("7");
			sevenbutton.setBounds(30, 130, 70,70);
			sevenbutton.addActionListener(this);
			sevenbutton.setFont(new Font("Arial",Font.PLAIN,40));
			
			eightbutton=new JButton("8");
			eightbutton.setBounds(120, 130, 70,70);
			eightbutton.addActionListener(this);
			eightbutton.setFont(new Font("Arial",Font.PLAIN,40));

			ninebutton=new JButton("9");
			ninebutton.setBounds(210, 130, 70,70);
			ninebutton.addActionListener(this);
			ninebutton.setFont(new Font("Arial",Font.PLAIN,40));
			
			fourbutton=new JButton("4");
			fourbutton.setBounds(30, 230, 70,70);
			fourbutton.addActionListener(this);
			fourbutton.setFont(new Font("Arial",Font.PLAIN,40));
			
			fivebutton=new JButton("5");
			fivebutton.setBounds(120, 230,70,70);
			fivebutton.addActionListener(this);
			fivebutton.setFont(new Font("Arial",Font.PLAIN,40));

			sixbutton=new JButton("6");
			sixbutton.setBounds(210, 230,70,70);
			sixbutton.addActionListener(this);
			sixbutton.setFont(new Font("Arial",Font.PLAIN,40));
			
			onebutton=new JButton("1");
			onebutton.setBounds(30, 330,70,70);
			onebutton.addActionListener(this);
			onebutton.setFont(new Font("Arial",Font.PLAIN,40));
			
			twobutton=new JButton("2");
			twobutton.setBounds(120, 330,70,70);
			twobutton.addActionListener(this);
			twobutton.setFont(new Font("Arial",Font.PLAIN,40));

			threebutton=new JButton("3");
			threebutton.setBounds(210, 330,70,70);
			threebutton.addActionListener(this);
			threebutton.setFont(new Font("Arial",Font.PLAIN,40));
			
			dotbutton=new JButton(".");
			dotbutton.setBounds(30, 450, 70,70);
			dotbutton.addActionListener(this);
			dotbutton.setFont(new Font("Arial",Font.PLAIN,40));
			
			zerobutton=new JButton("0");
			zerobutton.setBounds(120, 450, 70,70);
			zerobutton.addActionListener(this);
			zerobutton.setFont(new Font("Arial",Font.PLAIN,40));

			equalsbutton=new JButton("=");
			equalsbutton.setBounds(210, 450, 70,70);
			equalsbutton.addActionListener(this);
			equalsbutton.setFont(new Font("Arial",Font.PLAIN,40));	
			
			divisionbutton=new JButton("/");
			divisionbutton.setBounds(320, 130, 70,70);
			divisionbutton.addActionListener(this);
			divisionbutton.setFont(new Font("Arial",Font.PLAIN,40));	
			
			multiplicationbutton=new JButton("*");
			multiplicationbutton.setBounds(320, 230, 70,70);
			multiplicationbutton.addActionListener(this);
			multiplicationbutton.setFont(new Font("Arial",Font.PLAIN,40));			

			subtractionbutton=new JButton("-");
			subtractionbutton.setBounds(320, 330,70,70);
			subtractionbutton.addActionListener(this);
			subtractionbutton.setFont(new Font("Arial",Font.PLAIN,40));
			
			additionbutton=new JButton("+");
			additionbutton.setBounds(320, 450, 70,70);
			additionbutton.addActionListener(this);
			additionbutton.setFont(new Font("Arial",Font.PLAIN,40));
			
			clearbutton=new JButton("clear");
			clearbutton.setBounds(420, 450, 120,70);
			clearbutton.addActionListener(this);
			clearbutton.setFont(new Font("Arial",Font.PLAIN,30));
			
			deletebutton=new JButton("DEL");
			deletebutton.setBounds(420, 330, 120,70);
			deletebutton.addActionListener(this);
			deletebutton.setFont(new Font("Arial",Font.PLAIN,30));
			
			negativebutton=new JButton("(-)");
			negativebutton.setBounds(420, 230, 120,70);
			negativebutton.addActionListener(this);
			negativebutton.setFont(new Font("Arial",Font.PLAIN,30));
			
			
			jf.add(displayLabel);
			jf.add(sevenbutton);
			jf.add(eightbutton);
			jf.add(ninebutton);
			jf.add(fourbutton);
			jf.add(fivebutton);
			jf.add(sixbutton);
			jf.add(onebutton);
			jf.add(twobutton);
			jf.add(threebutton);
			jf.add(dotbutton);
			jf.add(zerobutton);
			jf.add(equalsbutton);
			jf.add(divisionbutton);
			jf.add(multiplicationbutton);
			jf.add(subtractionbutton);
			jf.add( additionbutton);
			jf.add( clearbutton);
			jf.add( deletebutton);
			jf.add( negativebutton);
			
			jf.setVisible(true);
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	
 public static void main(String[] args) {
	new Calculator();
}

@Override
public void actionPerformed(ActionEvent e) {
	
	if(e.getSource()== sevenbutton) {
		if(isOperatedClicked) {
			displayLabel.setText("7");
			isOperatedClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText()+"7");
		}
		
	}if(e.getSource()== eightbutton) {
		if(isOperatedClicked) {
			displayLabel.setText("8");
			isOperatedClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText()+"8");
		}
		
		
	}else if (e.getSource()==ninebutton) {
		if(isOperatedClicked) {
			displayLabel.setText("9");
			isOperatedClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText()+"9");
		}
		
		
	}else if (e.getSource()==fourbutton) {
		if(isOperatedClicked) {
			displayLabel.setText("4");
			isOperatedClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText()+"4");
		}
		
		
	}else if (e.getSource()==fivebutton) {
		if(isOperatedClicked) {
			displayLabel.setText("5");
			isOperatedClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText()+"5");
		}
		
		
	}else if (e.getSource()==sixbutton) {
		if(isOperatedClicked) {
			displayLabel.setText("6");
			isOperatedClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText()+"6");
		}
		
		
	}else if (e.getSource()==onebutton) {
		if(isOperatedClicked) {
			displayLabel.setText("1");
			isOperatedClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText()+"1");
		}
		
		
	}else if (e.getSource()==twobutton) {
		if(isOperatedClicked) {
			displayLabel.setText("2");
			isOperatedClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText()+"2");
		}
		
		
	}else if (e.getSource()==threebutton) {
		if(isOperatedClicked) {
			displayLabel.setText("3");
			isOperatedClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText()+"3");
		}
		
		
	}else if (e.getSource()==dotbutton) {
		displayLabel.setText(displayLabel.getText()+".");
	
		
	}else if (e.getSource()==zerobutton) {
		if(isOperatedClicked) {
			displayLabel.setText("0");
			isOperatedClicked=false;
		}
		else {
			displayLabel.setText(displayLabel.getText()+"0");
		}
		
		
	}else if (e.getSource()==equalsbutton) {
		
		String newValue=displayLabel.getText();
		float oldValueA=Float.parseFloat(oldValue);
		float newValueA=Float.parseFloat(newValue);
		
		if(operation=="+") {
			result=oldValueA+newValueA;
			answer=String.valueOf(result);
			displayLabel.setText(answer);	
		}
		if(operation=="-") {
			result=oldValueA-newValueA;
			answer=String.valueOf(result);
			displayLabel.setText(answer);		
		}
		if(operation=="*") {
			result=oldValueA*newValueA;
			answer=String.valueOf(result);
			displayLabel.setText(answer);
		}
		if(operation=="/") {
			result=oldValueA/newValueA;
			answer=String.valueOf(result);
			displayLabel.setText(answer);	
		}
		
		
		
		
	}else if (e.getSource()==divisionbutton) {
		isOperatedClicked=true;
		oldValue= displayLabel.getText();
		operation="/";
		
	}else if (e.getSource()==multiplicationbutton) {
		isOperatedClicked=true;
		oldValue= displayLabel.getText();
		operation="*";
		
	}else if (e.getSource()==subtractionbutton) {
		isOperatedClicked=true;
		oldValue= displayLabel.getText();
		operation="-";	
		
	}else if (e.getSource()==additionbutton) {
		isOperatedClicked=true;
		oldValue= displayLabel.getText();
		operation="+";
		
	}else if (e.getSource()==clearbutton) {
		displayLabel.setText("");
		
	}
	else if (e.getSource()==deletebutton) {
		String string = displayLabel.getText();
		displayLabel.setText("");
		for(int i=0;i<string.length()-1;i++) {
			displayLabel.setText(displayLabel.getText()+string.charAt(i));
	}
	}
	else if (e.getSource()==negativebutton) {
		double temp = Double.parseDouble(displayLabel.getText());
		temp*=-1;
		displayLabel.setText(String.valueOf(temp));
	}
}
}
