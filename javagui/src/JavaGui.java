import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;


public class JavaGui {

	private JFrame frame;
	private JTextField nameTextField;
	private JTextField ageTextField;
	private JLabel studentLabel;
	private JButton whoButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaGui window = new JavaGui();
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
	public JavaGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel nameLabel = new JLabel("My Name is");
		nameLabel.setBounds(45, 34, 75, 34);
		frame.getContentPane().add(nameLabel);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(119, 34, 205, 34);
		frame.getContentPane().add(nameTextField);
		nameTextField.setColumns(10);
		
		JLabel ageLabel = new JLabel("I am");
		ageLabel.setBounds(45, 84, 75, 34);
		frame.getContentPane().add(ageLabel);
		
		ageTextField = new JTextField();
		ageTextField.setBounds(119, 84, 205, 34);
		frame.getContentPane().add(ageTextField);
		ageTextField.setColumns(10);
		
		studentLabel = new JLabel("I am a student of Year Up");
		studentLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		studentLabel.setHorizontalAlignment(SwingConstants.CENTER);
		studentLabel.setBounds(119, 129, 205, 34);
		frame.getContentPane().add(studentLabel);
		
		whoButton = new JButton("Who Are You?");
		whoButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		whoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if (whoButton.getText().equals("Who Are You?"))
				{
					nameTextField.setText("Roderick Morris");
					ageTextField.setText("22");
					whoButton.setText("Clear Me!");
				}
				else if (whoButton.getText().equals("Clear Me!"))
					{
						nameTextField.setText("");
						ageTextField.setText("");
						whoButton.setText("Who Are You?");
					}
			}
				
		});
		whoButton.setBounds(119, 179, 205, 42);
		frame.getContentPane().add(whoButton);
	}
}

