package com.example.maven.calculator_niklass;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodListener;
import java.awt.event.ActionEvent;

public class MainFrame {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Calculator");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 12, 406, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r = textField.getText();	
				textField.setText(r + "1");
			}
		});
		button_1.setBounds(26, 184, 42, 25);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r = textField.getText();	
				textField.setText(r + "2");
			}
		});
		button_2.setBounds(80, 184, 42, 25);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r = textField.getText();	
				textField.setText(r + "3");
			}
		});
		button_3.setBounds(134, 184, 42, 25);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r = textField.getText();	
				textField.setText(r + "4");
			}
		});
		button_4.setBounds(26, 147, 42, 25);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r = textField.getText();	
				textField.setText(r + "6");
			}
		});
		button_5.setBounds(80, 147, 42, 25);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r = textField.getText();	
				textField.setText(r + "6");
			}
		});
		button_6.setBounds(134, 147, 42, 25);
		frame.getContentPane().add(button_6);
		
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r = textField.getText();	
				textField.setText(r + "0");
			}
		});
		button_0.setBounds(26, 222, 42, 25);
		frame.getContentPane().add(button_0);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r = textField.getText();	
				textField.setText(r + "7");
			}
		});
		button_7.setBounds(26, 108, 42, 25);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r = textField.getText();	
				textField.setText(r + "8");
			}
		});
		button_8.setBounds(80, 108, 42, 25);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r = textField.getText();	
				textField.setText(r + "9");
			}
		});
		button_9.setBounds(134, 108, 42, 25);
		frame.getContentPane().add(button_9);
	}
}
