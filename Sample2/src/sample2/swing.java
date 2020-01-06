package sample2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class swing {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing window = new swing();
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
	public swing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 825, 547);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Application Form");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(238, 11, 162, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setBounds(238, 53, 61, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setBounds(238, 99, 61, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Date Of Birth");
		lblNewLabel_3.setBounds(238, 144, 69, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mobile");
		lblNewLabel_4.setBounds(238, 189, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Gender");
		lblNewLabel_5.setBounds(238, 234, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Email");
		lblNewLabel_6.setBounds(238, 291, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		final JTextPane txt1 = new JTextPane();
		txt1.setBounds(357, 47, 92, 20);
		frame.getContentPane().add(txt1);
		
		final JTextPane txt2 = new JTextPane();
		txt2.setBounds(357, 93, 92, 20);
		frame.getContentPane().add(txt2);
		
		final JTextPane txt3 = new JTextPane();
		txt3.setBounds(357, 144, 92, 20);
		frame.getContentPane().add(txt3);
		
		final JTextPane txt4 = new JTextPane();
		txt4.setBounds(357, 189, 92, 20);
		frame.getContentPane().add(txt4);
		
		final JTextPane txt5 = new JTextPane();
		txt5.setBounds(357, 285, 92, 20);
		frame.getContentPane().add(txt5);
		
		final JRadioButton rdb = new JRadioButton("M");
		rdb.setBounds(357, 230, 40, 23);
		frame.getContentPane().add(rdb);
		//
		final JRadioButton rdb2 = new JRadioButton("F");
		rdb2.setBounds(415, 230, 34, 23);
		frame.getContentPane().add(rdb2);
		
		final JTextArea textArea = new JTextArea();
		textArea.setBounds(43, 342, 591, 142);
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Registration Successful!! Your details are:\n");
				textArea.append("First Name:    "+txt1.getText()+"\n");
				textArea.append("Last Name:    "+txt2.getText()+"\n");
				textArea.append("DOB            :    "+txt3.getText()+"\n");
				textArea.append("Mobile         :   "+txt4.getText()+"\n");
				if(rdb.isSelected())
				{
			     textArea.append("Gender       :    Male\n");
				}
				else if(rdb2.isSelected())
				{
				 textArea.append("Gender       :    FeMale\n");
				}
				textArea.append("Email          :    "+txt5.getText());
			
		
			}
		});
		btnNewButton.setBounds(280, 316, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
