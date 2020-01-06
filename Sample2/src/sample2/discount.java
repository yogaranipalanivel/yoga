package sample2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class discount {

	private JFrame frame;
	private JTextField p;
	private JTextField d;
	private JTextField t;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					discount window = new discount();
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
	public discount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.setBounds(100, 100, 863, 458);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DISCOUNT CALCULATOR");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(234, 11, 298, 63);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PRICIPAL AMOUNT");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(177, 106, 147, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DISCOUNT PERCENTAGE");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(177, 185, 147, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NET PRICE");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_3.setBounds(177, 318, 147, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("CALCULATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int p1=Integer.parseInt(p.getText());
				int d1=Integer.parseInt(d.getText());
			
				int s;
	
				s=p1-(p1*d1/100);
				int s1=s;
				t.setText(String.valueOf(s1));
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(287, 254, 127, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("RS");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_4.setBounds(495, 109, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("%");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_5.setBounds(495, 185, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("RS");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_6.setBounds(495, 318, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		p = new JTextField();
		p.setBounds(385, 106, 86, 20);
		frame.getContentPane().add(p);
		p.setColumns(10);
		
		d = new JTextField();
		d.setBounds(385, 182, 86, 20);
		frame.getContentPane().add(d);
		d.setColumns(10);
		
		t = new JTextField();
		t.setBounds(385, 315, 86, 20);
		frame.getContentPane().add(t);
		t.setColumns(10);
	}
}
