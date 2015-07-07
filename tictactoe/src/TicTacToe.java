import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;


public class TicTacToe {

	private JFrame frame;
	private String m_previousMove = null;
	private JButton[][]m_allButtons = new JButton[3][3];
	private static String s_x = "X";
	private static String s_o = "O";
	private JTextField textField;
	private JTextField textField_1;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
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
	public TicTacToe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 643, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JButton button1 = new JButton("");
		button1.setBounds(10, 29, 100, 100);
		frame.getContentPane().add(button1);
		m_allButtons[0][0]= button1;
		
		JButton button2 = new JButton("");
		button2.setBounds(120, 29, 100, 100);
		frame.getContentPane().add(button2);
		m_allButtons[2][0]= button2;
		
		JButton button3 = new JButton("");
		button3.setBounds(230, 29, 100, 100);
		frame.getContentPane().add(button3);
		m_allButtons[1][0]= button3;
		
		JButton button4 = new JButton("");
		button4.setBounds(10, 141, 100, 100);
		frame.getContentPane().add(button4);
		m_allButtons[0][1]= button4;
		
		JButton button5 = new JButton("");
		button5.setBounds(120, 141, 100, 100);
		frame.getContentPane().add(button5);
		m_allButtons[2][1]= button5;
		
		JButton button6 = new JButton("");
		button6.setBounds(230, 141, 100, 100);
		frame.getContentPane().add(button6);
		m_allButtons[1][1]= button6;
		
		JButton button7 = new JButton("");
		button7.setBounds(10, 252, 100, 100);
		frame.getContentPane().add(button7);
		m_allButtons[0][2]= button7;
		
		JButton button8 = new JButton("");
		button8.setBounds(120, 252, 100, 100);
		frame.getContentPane().add(button8);
		m_allButtons[2][2]= button8;
		
		JButton button9 = new JButton("");
		button9.setBounds(230, 252, 100, 100);
		frame.getContentPane().add(button9);
		m_allButtons[1][2]= button9;
		AddAllEventHandlers();
		
		JLabel lblTictactoe = new JLabel("TIC-TAC-TOE");
		lblTictactoe.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTictactoe.setHorizontalAlignment(SwingConstants.CENTER);
		lblTictactoe.setBounds(404, 11, 184, 82);
		frame.getContentPane().add(lblTictactoe);
		
		JLabel lblPlayer1 = new JLabel("Player 1");
		lblPlayer1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPlayer1.setBounds(373, 115, 91, 37);
		frame.getContentPane().add(lblPlayer1);
		
		JLabel lblPlayer2 = new JLabel("Player 2");
		lblPlayer2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPlayer2.setBounds(373, 195, 91, 37);
		frame.getContentPane().add(lblPlayer2);
		
		textField = new JTextField();
		textField.setBounds(445, 115, 160, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(445, 195, 160, 37);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
	
	private void ChangeButtonText(JButton button)
	{
		if (m_previousMove != null)
		{
			if (m_previousMove.equals(s_o))
			{
				button.setText(s_x);
				button.setEnabled(false);
				m_previousMove = s_x;
			}
			else if (m_previousMove.equals(s_x))
			{
				button.setText(s_o);
				button.setEnabled(false);
				m_previousMove = s_o;
			}
		}
		else
		{
			button.setText(s_o);
			button.setEnabled(false);
			m_previousMove = s_o;
		}
	}

        void DisableAllButtons()
	{
		if (m_allButtons != null)
		{
			for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
				{
				m_allButtons[i][j].setEnabled(false);
				}
			}
		}
	}
	private void AddAllEventHandlers()
	{
		if (m_allButtons != null)
		{
			for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
				{
					JButton currentButton = m_allButtons[i][j];
					currentButton.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
						ChangeButtonText(currentButton);
						currentButton.setEnabled(false);
						CheckGameWinner();
					}
				});
				}
			}
		}
	}
	private void CheckGameWinner()
	{
		if (m_allButtons != null)
		{
			for (int i = 0; i < 3; i++)
			{
				String one = m_allButtons[i][0].getText();
				String two = m_allButtons[i][1].getText();
				String three = m_allButtons[i][2].getText();
				
				boolean empty = one.isEmpty() || two.isEmpty() || three.isEmpty();
				
				if(! empty)
				{
					boolean same = (one == two) && (two == three);
					
					if (same)
					{
						m_allButtons[i][0].setBackground(Color.green);
						m_allButtons[i][1].setBackground(Color.green);
						m_allButtons[i][2].setBackground(Color.green);
						DisableAllButtons();
					}
				}
			}
			
			for (int i = 0; i < 3; i++)
			{
				String one = m_allButtons[0][i].getText();
				String two = m_allButtons[1][i].getText();
				String three = m_allButtons[2][i].getText();
				
				boolean empty = one.isEmpty() || two.isEmpty() || three.isEmpty();
				
				if(! empty)
				{
					boolean same = (one == two) && (two == three);
					
					if (same)
					{
						m_allButtons[0][i].setBackground(Color.green);
						m_allButtons[1][i].setBackground(Color.green);
						m_allButtons[2][i].setBackground(Color.green);
						DisableAllButtons();
					}
				}
			}
			
			String one = m_allButtons[0][0].getText();
			String two = m_allButtons[1][1].getText();
			String three = m_allButtons[2][2].getText();
		
			boolean diagonalOneEmpty = one.isEmpty() || two.isEmpty() || three.isEmpty();
		
			if(! diagonalOneEmpty)
			{
				boolean diagonalOneSame = (one == two) && (two == three);
			
				if(diagonalOneSame)
				{
					m_allButtons[0][0].setBackground(Color.green);
					m_allButtons[1][1].setBackground(Color.green);
					m_allButtons[2][2].setBackground(Color.green);
					DisableAllButtons();
				
				}
			}
		
			String four = m_allButtons[0][2].getText();
			String five= m_allButtons[1][1].getText();
			String six = m_allButtons[2][0].getText();
		
			boolean diagonalTwoEmpty = four.isEmpty() || five.isEmpty() || six.isEmpty();
		
			if(! diagonalTwoEmpty)
			{
			boolean diagonalTwoSame = (four == five) && (five == six);
			
				if(diagonalTwoSame)
				{
					m_allButtons[0][2].setBackground(Color.green);
					m_allButtons[1][1].setBackground(Color.green);
					m_allButtons[2][0].setBackground(Color.green);
					DisableAllButtons();
				
				}
			}
		}
	}
}
