import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class Calculator extends JFrame {

	

	private JPanel contentPane;
	private JTextField txtnumber;
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private JButton b6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator r = new Calculator();
					r.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setFont(null);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 335, 477);
		contentPane = new JPanel();
		contentPane.setVerifyInputWhenFocusTarget(false);
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton negative = new JButton("+/-");
		negative.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(String.valueOf(txtnumber.getText()));
				a=a*(-1);
				txtnumber.setText(String.valueOf(a));
			}
		});
		negative.setForeground(new Color(0, 0, 0));
		negative.setBackground(new Color(255, 255, 255));
		negative.setBounds(10, 388, 67, 37);
		contentPane.add(negative);
		
		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=txtnumber.getText()+b0.getText();
				txtnumber.setText(number);
			}
		});
		b0.setForeground(new Color(0, 0, 0));
		b0.setBackground(new Color(255, 255, 255));
		b0.setBounds(87, 388, 67, 37);
		contentPane.add(b0);
		
		JButton bdot = new JButton(".");
		bdot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=txtnumber.getText()+bdot.getText();
				txtnumber.setText(number);
			}
		});
		bdot.setForeground(new Color(0, 0, 0));
		bdot.setBackground(new Color(255, 255, 255));
		bdot.setBounds(164, 388, 67, 37);
		contentPane.add(bdot);
		
		JButton total = new JButton("=");
		total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String answer;
				second=Double.parseDouble(txtnumber.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f", result);
					txtnumber.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					txtnumber.setText(answer);
				}
				else if(operation=="x")
				{
					result=first*second;
					answer=String.format("%.2f", result);
					txtnumber.setText(answer);
				}
				else if(operation=="÷")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					txtnumber.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f", result);
					txtnumber.setText(answer);
				}
				
					}
			

			});
		total.setForeground(Color.WHITE);
		total.setBackground(new Color(0, 64, 128));
		total.setBounds(241, 388, 67, 37);
		contentPane.add(total);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=txtnumber.getText()+b1.getText();
				txtnumber.setText(number);
			}
		});
		b1.setForeground(new Color(0, 0, 0));
		b1.setBackground(Color.WHITE);
		b1.setBounds(10, 340, 67, 37);
		contentPane.add(b1);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=txtnumber.getText()+b2.getText();
				txtnumber.setText(number);
			}
		});
		b2.setForeground(new Color(0, 0, 0));
		b2.setBackground(Color.WHITE);
		b2.setBounds(87, 340, 67, 37);
		contentPane.add(b2);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=txtnumber.getText()+b4.getText();
				txtnumber.setText(number);
			}
		});
		b4.setForeground(new Color(0, 0, 0));
		b4.setBackground(Color.WHITE);
		b4.setBounds(10, 292, 67, 37);
		contentPane.add(b4);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=txtnumber.getText()+b7.getText();
				txtnumber.setText(number);
			}
		});
		b7.setForeground(new Color(0, 0, 0));
		b7.setBackground(Color.WHITE);
		b7.setBounds(10, 244, 67, 37);
		contentPane.add(b7);
		
		JButton inverse = new JButton("1/x");
		inverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a =1/ Math.sqrt(Double.parseDouble(txtnumber.getText()));
				txtnumber.setText("");
				txtnumber.setText(txtnumber.getText()+a);
			}
		});
		inverse.setForeground(new Color(0, 0, 0));
		inverse.setBackground(Color.WHITE);
		inverse.setBounds(10, 196, 67, 37);
		contentPane.add(inverse);
		
		JButton percent = new JButton("%");
		percent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(txtnumber.getText());
				txtnumber.setText("");
				operation="%";
			}
		});
		percent.setForeground(new Color(0, 0, 0));
		percent.setBackground(Color.WHITE);
		percent.setBounds(10, 148, 67, 37);
		contentPane.add(percent);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=txtnumber.getText()+b5.getText();
				txtnumber.setText(number);
			}
		});
		b5.setForeground(new Color(0, 0, 0));
		b5.setBackground(Color.WHITE);
		b5.setBounds(87, 292, 67, 37);
		contentPane.add(b5);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=txtnumber.getText()+b8.getText();
				txtnumber.setText(number);
			}
		});
		b8.setForeground(new Color(0, 0, 0));
		b8.setBackground(Color.WHITE);
		b8.setBounds(87, 244, 67, 37);
		contentPane.add(b8);
		
		JButton power2 = new JButton("x² ");
		power2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a = (Double.parseDouble(txtnumber.getText()));
				a=a*a;
				txtnumber.setText("");
				txtnumber.setText(txtnumber.getText()+a);
			}
		});
		power2.setForeground(new Color(0, 0, 0));
		power2.setBackground(Color.WHITE);
		power2.setBounds(87, 196, 67, 37);
		contentPane.add(power2);
		
		JButton ClearAll = new JButton("CE");
		ClearAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtnumber.setText(null);
			}
		});
		ClearAll.setForeground(new Color(0, 0, 0));
		ClearAll.setBackground(Color.WHITE);
		ClearAll.setBounds(87, 148, 67, 37);
		contentPane.add(ClearAll);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=txtnumber.getText()+b3.getText();
				txtnumber.setText(number);
				}
		});
		b3.setForeground(new Color(0, 0, 0));
		b3.setBackground(Color.WHITE);
		b3.setBounds(164, 340, 67, 37);
		contentPane.add(b3);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=txtnumber.getText()+b6.getText();
				txtnumber.setText(number);
			}
		});
		b6.setForeground(new Color(0, 0, 0));
		b6.setBackground(Color.WHITE);
		b6.setBounds(164, 292, 67, 37);
		contentPane.add(b6);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=txtnumber.getText()+b9.getText();
				txtnumber.setText(number);
			}
		});
		b9.setForeground(new Color(0, 0, 0));
		b9.setBackground(Color.WHITE);
		b9.setBounds(164, 244, 67, 37);
		contentPane.add(b9);
		
		JButton squareroot = new JButton("²√x");
		squareroot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a = Math.sqrt(Double.parseDouble(txtnumber.getText()));
				txtnumber.setText("");
				txtnumber.setText(txtnumber.getText()+a);
			}
		});
		squareroot.setForeground(new Color(0, 0, 0));
		squareroot.setBackground(Color.WHITE);
		squareroot.setBounds(164, 196, 67, 37);
		contentPane.add(squareroot);
		
		JButton clear = new JButton("C");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtnumber.setText(null);
			}
		});
		clear.setForeground(new Color(0, 0, 0));
		clear.setBackground(Color.WHITE);
		clear.setBounds(164, 148, 67, 37);
		contentPane.add(clear);
		
		JButton delete = new JButton("x");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(txtnumber.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(txtnumber.getText());
					str.deleteCharAt(txtnumber.getText().length()-1);
					backSpace=str.toString();
					txtnumber.setText(backSpace);
				}
			}
		});
		delete.setForeground(new Color(0, 0, 0));
		delete.setBackground(Color.WHITE);
		delete.setBounds(241, 148, 67, 37);
		contentPane.add(delete);
		
		JButton divide = new JButton("÷");
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(txtnumber.getText());
				txtnumber.setText("");
				operation="÷";
			}
		});
		divide.setForeground(new Color(0, 0, 0));
		divide.setBackground(Color.WHITE);
		divide.setBounds(241, 196, 67, 37);
		contentPane.add(divide);
		
		JButton multiply = new JButton("×");
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(txtnumber.getText());
				txtnumber.setText("");
				operation="x";
			}
		});
		multiply.setForeground(new Color(0, 0, 0));
		multiply.setBackground(Color.WHITE);
		multiply.setBounds(241, 244, 67, 37);
		contentPane.add(multiply);
		
		JButton subtract = new JButton("-");
		subtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(txtnumber.getText());
				txtnumber.setText("");
				operation="-";
			}
			
		});
		subtract.setForeground(new Color(0, 0, 0));
		subtract.setBackground(Color.WHITE);
		subtract.setBounds(241, 292, 67, 37);
		contentPane.add(subtract);
		
		JButton add = new JButton("+");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(txtnumber.getText());
				txtnumber.setText("");
				operation="+";
			}
		});
		add.setForeground(new Color(0, 0, 0));
		add.setBackground(Color.WHITE);
		add.setBounds(241, 340, 67, 37);
		contentPane.add(add);
		

		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Standard");
		lblNewJgoodiesLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewJgoodiesLabel.setBounds(10, 11, 92, 28);
		contentPane.add(lblNewJgoodiesLabel);
		
		txtnumber = new JTextField();
		txtnumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtnumber.setEditable(false);
		txtnumber.setHorizontalAlignment(SwingConstants.TRAILING);
		txtnumber.setBounds(10, 89, 298, 48);
		contentPane.add(txtnumber);
		txtnumber.setColumns(10);
	}
	}
