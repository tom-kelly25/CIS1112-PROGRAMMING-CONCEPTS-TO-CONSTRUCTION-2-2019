package calculatorGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;

public class GUI_Calculator {
	//Declaring Variables
	
	private JFrame frame;
	private JTextField textField;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	
	 //Launch the application
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Calculator window = new GUI_Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 // Create the application.
	public GUI_Calculator() {
		initialize();
	}

	
	  //Initialise the contents of the frame.
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(255, 255, 255));
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 268, 431);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(0, 0, 254, 55);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		//============Row 1==========
		JButton btnDel = new JButton("DEL");
		btnDel.setBackground(new Color(255, 140, 0));
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String del=null;
				//deletes a single value
				if(textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()- 1);
					del = strB.toString();
					textField.setText(del);

				}

			}
		});
		btnDel.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnDel.setBounds(10, 60, 55, 50);
		frame.getContentPane().add(btnDel);
		//Clears the text field 
		JButton btnClear = new JButton("C");
		btnClear.setBackground(new Color(255, 140, 0));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(70, 60, 55, 50);
		frame.getContentPane().add(btnClear);
		//Percentage
		JButton btnPer = new JButton("%");
		btnPer.setBackground(new Color(255, 140, 0));
		btnPer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btnPer.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPer.setBounds(130, 60, 55, 50);
		frame.getContentPane().add(btnPer);
		
		//Addition 
		JButton btnPlus = new JButton("+");
		btnPlus.setBackground(new Color(255, 140, 0));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(190, 60, 55, 50);
		frame.getContentPane().add(btnPlus);

		//============Row 2==========
		//Enters value of 7 into the text field and passes value into a variable 
		JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(192, 192, 192));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 120, 55, 50);
		frame.getContentPane().add(btn7);
		
		//Enters value of 8 into the text field and passes value into a variable 
		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(192, 192, 192));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(70, 120, 55, 50);
		frame.getContentPane().add(btn8);
		
		//Enters value of 9 into the text field and passes value into a variable 
		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(192, 192, 192));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(130, 120, 55, 50);
		frame.getContentPane().add(btn9);
		
		//Minus 
		JButton btnMin = new JButton("-");
		btnMin.setBackground(new Color(255, 140, 0));
		btnMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnMin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMin.setBounds(190, 120, 55, 50);
		frame.getContentPane().add(btnMin);
		
		//============Row 3==========
		//Enters value of 4 into the text field and passes value into a variable 
		JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(192, 192, 192));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 180, 55, 50);
		frame.getContentPane().add(btn4);
		//Enters value of 5 into the text field and passes value into a variable 
		JButton btn5 = new JButton("5");
		btn5.setBackground(new Color(192, 192, 192));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(70, 180, 55, 50);
		frame.getContentPane().add(btn5);
		
		//Enters value of 6 into the text field and passes value into a variable 
		JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(192, 192, 192));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(130, 180, 55, 50);
		frame.getContentPane().add(btn6);

		//Multiplication 
		JButton btnMult = new JButton("*");
		btnMult.setBackground(new Color(255, 140, 0));
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMult.setBounds(190, 180, 55, 50);
		frame.getContentPane().add(btnMult);

				
		//============Row 4==========
		//Enters value of 1 into the text field and passes value into a variable 
		JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(192, 192, 192));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 240, 55, 50);
		frame.getContentPane().add(btn1);
		//Enters value of 2 into the text field and passes value into a variable 
		JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(192, 192, 192));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(70, 240, 55, 50);
		frame.getContentPane().add(btn2);
		//Enters value of 3 into the text field and passes value into a variable 
		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(192, 192, 192));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(130, 240, 55, 50);
		frame.getContentPane().add(btn3);
		//Divides 
		JButton btnDiv = new JButton("/");
		btnDiv.setBackground(new Color(255, 140, 0));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDiv.setBounds(190, 240, 55, 50);
		frame.getContentPane().add(btnDiv);

		//============Row 5==========
		//Enters value of 0 into the text field and passes value into a variable 
		JButton btn0 = new JButton("0");
		btn0.setBackground(new Color(192, 192, 192));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(10, 300, 55, 50);
		frame.getContentPane().add(btn0);
		//Enters . into the text field and passes value into a variable to make the number a floating value
		JButton btnDot = new JButton(".");
		btnDot.setBackground(new Color(255, 140, 0));
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btnDot.getText();
				textField.setText(EnterNumber);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(70, 300, 55, 50);
		frame.getContentPane().add(btnDot);

		JButton btnpm = new JButton("+-");
		btnpm.setBackground(new Color(255, 140, 0));
		btnpm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnpm.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnpm.setBounds(130, 300, 55, 50);
		frame.getContentPane().add(btnpm);

		//Equals
		JButton btnEqual = new JButton("=");
		btnEqual.setBackground(new Color(255, 140, 0));
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Operations
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				if (operations == "+")
				{	
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operations == "-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operations == "*")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operations == "*")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operations == "%")
				{
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}

			}

		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(190, 300, 55, 50);
		frame.getContentPane().add(btnEqual);
	}
}
