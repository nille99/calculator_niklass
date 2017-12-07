package com.example.maven.calculator_niklass_main;

import javax.swing.JFrame;
import javax.swing.JLabel;
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
	private JLabel label_calculation = new JLabel("");
	
	CalculatorBasicOperations cbo = new CalculatorBasicOperations();
	CalculatorAdvancedOperations cao = new CalculatorAdvancedOperations();
	
	private double resulted = 0.0;
	private String resultedString = "";
	private String textInput = textField.getText();	
	private double dblNum1 = 0;
	private double dblNum3 = 0;
	private String dblObr = "";
	String dblObrCheck = "";

	
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
		frame.setBounds(100, 100, 352, 363);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		//set to main
		frame.setVisible(true);

		//properties for label
		label_calculation.setBounds(29, 24, 300, 15);
	//properties for textField
		textField.setBounds(26, 51, 300, 29);
		textField.setColumns(10);	
					
	//properties for button
		button_0.setBounds(26, 271, 52, 25);
		button_1.setBounds(26, 234, 52, 25);
		button_2.setBounds(80, 234, 52, 25);		
		button_3.setBounds(134, 234, 52, 25);			
		button_4.setBounds(26, 197, 52, 25);
		button_5.setBounds(80, 197, 52, 25);			
		button_6.setBounds(134, 197, 52, 25);
		button_7.setBounds(26, 158, 52, 25);
		button_8.setBounds(80, 158, 52, 25);			
		button_9.setBounds(134, 158, 52, 25);
		button_come.setBounds(80, 271, 52, 25);
		Button_clean.setBounds(252, 271, 62, 25);			
		Button_sqrt.setBounds(188, 103, 52, 25);
		Button_pi.setBounds(134, 103, 52, 25);
		Button_cube.setBounds(80, 103, 52, 25);
		Button_square.setBounds(26, 103, 52, 25);
		Button_xy.setBounds(252, 197, 62, 25);
		Button_percentage.setBounds(252, 158, 62, 25);
		button_addition.setBounds(188, 271, 52, 25);
		button_subtraction.setBounds(188, 234, 52, 25);
		Button_multiplication.setBounds(188, 197, 52, 25);
		Button_division.setBounds(188, 158, 52, 25);
		button_equal.setBounds(134, 271, 52, 25);
			
		
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
		frame.getContentPane().add(label_calculation);
	}
	
	public void addActionListeners(){
		button_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textInput = textField.getText();
				StringTokenizer st = new StringTokenizer(textInput, " ");
				resultedString = "Error";
				dblNum1 = 0;
				dblNum3 = 0;
				dblObr = "";
				dblObrCheck = "";
				resulted = 0;

				while (st.hasMoreTokens()) {

					if (resulted == 0) {
						dblNum1 = Double.parseDouble(st.nextToken().trim());
					} else {
						dblNum1 = resulted;
					}

					dblObr = st.nextToken().trim();		
					dblObrCheck =st.nextToken().trim();				
	
					//if the user use ex + +
			        for (int i = 1; i < 2; i++) {
						if (isInteger(dblObrCheck)) {
							dblNum3 = Double.parseDouble(dblObrCheck);
						}else {
							dblObrCheck =st.nextToken().trim();
							i = 0;
						}
			        }	
	

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
						if( resulted == -0.123456789 ) {
							resultedString ="";
							textInput ="";
						}else {
							resultedString = Double.toString(resulted);
						}
						
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
				if (textInput !="") {
					label_calculation.setText(textInput + " = " + resultedString);
				}
				textField.setText(resultedString);
			}
		});
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textInput = textField.getText();
				textField.setText(textInput + "1");
			}
		});
		
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textInput = textField.getText();
				textField.setText(textInput + "2");
			}
		});

		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textInput = textField.getText();
				textField.setText(textInput + "3");
			}
		});

		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textInput = textField.getText();
				textField.setText(textInput + "4");
			}
		});

		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textInput = textField.getText();
				textField.setText(textInput + "5");
			}
		});
	
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textInput = textField.getText();
				textField.setText(textInput + "6");
			}
		});
		
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textInput = textField.getText();
				textField.setText(textInput + "0");
			}
		});
		
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textInput = textField.getText();
				textField.setText(textInput + "7");
			}
		});
		
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textInput = textField.getText();
				textField.setText(textInput + "8");
			}
		});
		
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textInput = textField.getText();
				textField.setText(textInput + "9");
			}
		});
		
		button_come.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textInput = textField.getText();
				textField.setText(textInput + ".");
			}
		});

		Button_division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textInput = textField.getText();
				textField.setText(textInput + " ÷ ");
			}
		});
		
		Button_multiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textInput = textField.getText();
				textField.setText(textInput + " x ");
			}
		});

		
		button_subtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textInput = textField.getText();
				textField.setText(textInput + " - ");
			}
		});

		
		button_addition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textInput = textField.getText();
				textField.setText(textInput + " + ");
			}
		});
		
		
		Button_percentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textInput = textField.getText();
				textField.setText(textInput + " % ");
			}
		});
		
		Button_xy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textInput = textField.getText();
				textField.setText(textInput + " X^Y ");
			}
		});	
		
		Button_square.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				textInput = textField.getText();	
				resulted = cao.square(Double.parseDouble(textInput));
				resultedString = Double.toString(resulted);
				label_calculation.setText(textInput + " x² " + resultedString);
				textField.setText(resultedString);
			}
		});
		
		Button_cube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textInput= textField.getText();	
				resulted = cao.cube(Double.parseDouble(textInput));
				resultedString = Double.toString(resulted);
				label_calculation.setText(textInput + " x³ " + resultedString);
				textField.setText(resultedString);
			}
		});
		Button_pi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textInput = textField.getText();	
				resulted = cao.pi(Double.parseDouble(textInput));
				resultedString = Double.toString(resulted);
				label_calculation.setText(textInput + " π  " + resultedString);
				textField.setText(resultedString);
			}
		});
		
		Button_sqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textInput = textField.getText();	
				resulted = cao.sqrt(Double.parseDouble(textInput));
				resultedString = Double.toString(resulted);
				label_calculation.setText(textInput + " √ " + resultedString);
				textField.setText(resultedString);
			}
		});
		
		Button_clean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				label_calculation.setText("");
			}
		});
	}
	public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    // only got here if we didn't return false
	    return true;
	}
}