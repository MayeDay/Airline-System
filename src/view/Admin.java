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
import java.awt.Color;

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
		setBounds(100, 100, 662, 413);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 153));
		panel.setBounds(0, 0, 644, 366);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnViewBookPassengers = new JButton("Book Passenger");
		btnViewBookPassengers.setBounds(27, 295, 123, 37);
		panel.add(btnViewBookPassengers);
		btnViewBookPassengers.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton btnNewButton = new JButton("Update Flight");
		btnNewButton.setBounds(27, 90, 121, 37);
		panel.add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton btnCancelFlight = new JButton("Cancel Flight");
		btnCancelFlight.setBounds(27, 140, 121, 37);
		panel.add(btnCancelFlight);
		btnCancelFlight.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel = new JLabel("Administrator HomePage");
		lblNewLabel.setBounds(27, 51, 257, 26);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(SystemColor.textHighlightText);
		lblNewLabel.setBackground(SystemColor.window);
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));
		
		JButton btnBookFlight = new JButton("Book Flight");
		btnBookFlight.setBounds(27, 192, 121, 37);
		panel.add(btnBookFlight);
		btnBookFlight.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton btnView = new JButton("View Flight Info");
		btnView.setBounds(26, 245, 121, 37);
		panel.add(btnView);
		btnView.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(12, 43, 620, 323);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\James Maye\\Downloads\\Airplane Aircraft Wallpaper 19114 Wallpaper High Resolution.png"));
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewFlightInfo vfi = new ViewFlightInfo();
				vfi.setVisible(true);
				vfi.setLocationRelativeTo(null);
				vfi.setResizable(false);
				dispose();
				
			}
		});
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				UpdateFlight update = new UpdateFlight();
				update.setVisible(true);
				update.setLocationRelativeTo(null);
				dispose();
			}
		});
	}
}
