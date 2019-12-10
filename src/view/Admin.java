package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class Admin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 663, 412);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin");
		lblNewLabel.setForeground(SystemColor.textHighlightText);
		lblNewLabel.setBackground(SystemColor.window);
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblNewLabel.setBounds(25, 27, 205, 26);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Update Flight");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				UpdateFlight update = new UpdateFlight();
				update.setVisible(true);
				update.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton.setBounds(25, 76, 121, 37);
		contentPane.add(btnNewButton);
		
		JButton btnCancelFlight = new JButton("Cancel Flight");
		btnCancelFlight.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancelFlight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				CancelFlight cancel = new CancelFlight();
				cancel.setLocationRelativeTo(null);
				cancel.setVisible(true);
				cancel.setResizable(false);
				dispose();
			}
		});
		btnCancelFlight.setBounds(25, 135, 121, 37);
		contentPane.add(btnCancelFlight);
		
		JButton btnBookFlight = new JButton("Book Flight");
		btnBookFlight.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBookFlight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				BookFlight Flight = new BookFlight();
				Flight.setVisible(true);
				Flight.setResizable(false);
				Flight.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnBookFlight.setBounds(25, 193, 121, 37);
		contentPane.add(btnBookFlight);
		
		JButton btnView = new JButton("View Flight Info");
		btnView.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewFlightInfo vfi = new ViewFlightInfo();
				vfi.setVisible(true);
				vfi.setLocationRelativeTo(null);
				vfi.setResizable(false);
				dispose();
				
			}
		});
		btnView.setBounds(25, 251, 121, 37);
		contentPane.add(btnView);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Louie\\Downloads\\home.jpg"));
		lblNewLabel_1.setBounds(179, 38, 458, 303);
		contentPane.add(lblNewLabel_1);
		
		JButton btnViewBookPassengers = new JButton("Booked Passengers");
		btnViewBookPassengers.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnViewBookPassengers.setBounds(25, 304, 121, 37);
		contentPane.add(btnViewBookPassengers);
	}
}
