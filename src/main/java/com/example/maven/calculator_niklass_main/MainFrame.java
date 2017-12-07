package com.example.maven.calculator_niklass_main;

import javax.swing.JFrame;
import javax.swing.JTextField;

import com.example.maven.calculator_niklass_class.CalculatorAdvancedOperations;
import com.example.maven.calculator_niklass_class.CalculatorBasicOperations;

import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.util.StringTokenizer;
import java.awt.event.ActionEvent;

public class MainFrame {

	
	//private JTextField textField;
	private JFrame frame = new JFrame();
	private JTextField textField = new JTextField();
	
	private JButton button_1 = new JButton("1");
	private JButton button_2 = new JButton("2");
	private JButton button_3 = new JButton("3");
	private JButton button_4 = new JButton("4");
	private JButton button_5 = new JButton("5");
	private JButton button_6 = new JButton("6");
	private JButton button_7 = new JButton("7");
	private JButton button_8 = new JButton("8");
	private JButton button_9 = new JButton("9");
	private JButton button_0 = new JButton("0");

	private JButton button_come = new JButton(".");
	private JButton button_equal = new JButton("=");
	private JButton Button_percentage = new JButton("%");
	private JButton Button_xy = new JButton("X^Y");
	private JButton Button_square = new JButton("x²");
	private JButton Button_cube = new JButton("x³");
	private JButton Button_pi = new JButton(" π ");
	private JButton Button_sqrt = new JButton("√");
	private JButton Button_clean = new JButton("C");

	private JButton Button_division = new JButton("÷");
	private JButton Button_multiplication = new JButton("x");
	private JButton button_subtraction = new JButton("-");
	private JButton button_addition = new JButton("+");
	
	CalculatorBasicOperations cbo = new CalculatorBasicOperations();
	CalculatorAdvancedOperations cao = new CalculatorAdvancedOperations();

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
		addComponetsToFrame();
		addActionListeners();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//properties for frame
		frame.setTitle("Calculator");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		//set to main
		frame.setVisible(true);

		//properties for label


		//properties for textField
		textField.setBounds(12, 12, 406, 29);	
		textField.setColumns(10);
		
		//properties for button
		button_0.setBounds(26, 221, 52, 25);
		button_1.setBounds(26, 184, 52, 25);
		button_2.setBounds(80, 184, 52, 25);
		button_3.setBounds(134, 184, 52, 25);
		button_4.setBounds(26, 147, 52, 25);
		button_5.setBounds(80, 147, 52, 25);
		button_6.setBounds(134, 147, 52, 25);
		button_7.setBounds(26, 108, 52, 25);
		button_8.setBounds(80, 108, 52, 25);
		button_9.setBounds(134, 108, 52, 25);
	
		button_come.setBounds(80, 221, 52, 25);
		Button_clean.setBounds(252, 221, 117, 25);
		Button_sqrt.setBounds(188, 53, 52, 25);
		Button_pi.setBounds(134, 53, 52, 25);
		Button_cube.setBounds(80, 53, 52, 25);
		Button_square.setBounds(26, 53, 52, 25);
		Button_xy.setBounds(252, 147, 62, 25);
		Button_percentage.setBounds(252, 108, 62, 25);
		button_addition.setBounds(188, 221, 52, 25);
		button_subtraction.setBounds(188, 184, 52, 25);
		Button_multiplication.setBounds(188, 147, 52, 25);
		Button_division.setBounds(188, 108, 52, 25);
		button_equal.setBounds(134, 221, 52, 25);
			
		
	}
	public void addComponetsToFrame() {
		frame.getContentPane().add(textField);
		frame.getContentPane().add(button_0);	
		frame.getContentPane().add(button_1);		
		frame.getContentPane().add(button_2);
		frame.getContentPane().add(button_3);
		frame.getContentPane().add(button_4);		
		frame.getContentPane().add(button_5);		
		frame.getContentPane().add(button_6);	
		frame.getContentPane().add(button_7);
		frame.getContentPane().add(button_8);
		frame.getContentPane().add(button_9);
		
		frame.getContentPane().add(button_come);	
		frame.getContentPane().add(Button_clean);
		frame.getContentPane().add(Button_sqrt);
		frame.getContentPane().add(Button_pi);
		frame.getContentPane().add(Button_cube);
		frame.getContentPane().add(Button_square);
		frame.getContentPane().add(Button_xy);		
		frame.getContentPane().add(Button_percentage);
		frame.getContentPane().add(button_addition);
		frame.getContentPane().add(button_subtraction);
		frame.getContentPane().add(Button_multiplication);
		frame.getContentPane().add(Button_division);
		frame.getContentPane().add(button_equal);
	}
	
	public void addActionListeners(){
		button_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r = textField.getText();
				String resultedString = "Error";
				StringTokenizer st = new StringTokenizer(r, " ");
				double dblNum1 = 0;
				double dblNum3 = 0;
				String dblObr = "";
				double resulted = 0;

				while (st.hasMoreTokens()) {

					if (resulted == 0) {
						dblNum1 = Double.parseDouble(st.nextToken().trim());
					} else {
						dblNum1 = resulted;
					}

					dblObr = st.nextToken().trim();
					dblNum3 = Double.parseDouble(st.nextToken().trim());

					if (dblObr.equalsIgnoreCase("+")) {
						resulted = cbo.addition(dblNum1, dblNum3);
						resultedString = Double.toString(resulted);
					}
					else if(dblObr.equalsIgnoreCase("-")) {
						resulted = cbo.subtraction(dblNum1, dblNum3);
						resultedString = Double.toString(resulted);
					}
					else if(dblObr.equalsIgnoreCase("x")) {
						resulted = cbo.multiplication(dblNum1, dblNum3);
						resultedString = Double.toString(resulted);
					}
					else if(dblObr.equalsIgnoreCase("÷")) {
						resulted = cbo.division(dblNum1, dblNum3);
						resultedString = Double.toString(resulted);
					}
					else if(dblObr.equalsIgnoreCase("%")) {
						resulted = cao.percentage(dblNum1, dblNum3);
						resultedString = Double.toString(resulted);
					}
					else if(dblObr.equalsIgnoreCase("X^Y")) {
						resulted = cao.raisedToThePowerOf(dblNum1, dblNum3);
						resultedString = Double.toString(resulted);
					}
	
				}

				textField.setText(resultedString);
			}
		});
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r = textField.getText();
				textField.setText(r + "1");
			}
		});
		
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r = textField.getText();
				textField.setText(r + "2");
			}
		});

		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r = textField.getText();
				textField.setText(r + "3");
			}
		});

		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r = textField.getText();
				textField.setText(r + "4");
			}
		});

		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r = textField.getText();
				textField.setText(r + "5");
			}
		});
	
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r = textField.getText();
				textField.setText(r + "6");
			}
		});
		
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r = textField.getText();
				textField.setText(r + "0");
			}
		});
		
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r = textField.getText();
				textField.setText(r + "7");
			}
		});
		
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r = textField.getText();
				textField.setText(r + "8");
			}
		});
		
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r = textField.getText();
				textField.setText(r + "9");
			}
		});
		
		button_come.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r = textField.getText();
				textField.setText(r + ".");
			}
		});

		Button_division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r = textField.getText();
				textField.setText(r + " ÷ ");
			}
		});
		
		Button_multiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r = textField.getText();
				textField.setText(r + " x ");
			}
		});

		
		button_subtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r = textField.getText();
				textField.setText(r + " - ");
			}
		});

		
		button_addition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r = textField.getText();
				textField.setText(r + " + ");
			}
		});
		
		
		Button_percentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r = textField.getText();
				textField.setText(r + " % ");
			}
		});
		
		Button_xy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r = textField.getText();
				textField.setText(r + " X^Y ");
			}
		});	
		
		Button_square.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				String dblNum = textField.getText();	
				double resulted = cao.square(Double.parseDouble(dblNum));
				String resultedString = Double.toString(resulted);
				textField.setText(resultedString);
			}
		});
		
		Button_cube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dblNum = textField.getText();	
				double resulted = cao.cube(Double.parseDouble(dblNum));
				String resultedString = Double.toString(resulted);
				textField.setText(resultedString);
			}
		});
		Button_pi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dblNum = textField.getText();	
				double resulted = cao.pi(Double.parseDouble(dblNum));
				String resultedString = Double.toString(resulted);
				textField.setText(resultedString);
			}
		});
		
		Button_sqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dblNum = textField.getText();	
				double resulted = cao.sqrt(Double.parseDouble(dblNum));
				String resultedString = Double.toString(resulted);
				textField.setText(resultedString);
			}
		});
		
		Button_clean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
	}
}
