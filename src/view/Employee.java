package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class Employee extends JFrame {

	private JPanel contentPane;
	private JTable tblFlights;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee frame = new Employee();
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
	public Employee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 738, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee");
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 28, 117, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TIME");
		lblNewLabel_1.setBounds(477, 34, 48, 14);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 82, 704, 227);
		contentPane.add(scrollPane);
		
		tblFlights = new JTable();
		tblFlights.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, "", null, null},
			},
			new String[] {
				"FlightID", "Flight #", "Airplane", "Origin", "Destionation", "Passengers", "Departure Date", "ReturnDate"
			}
		));
		scrollPane.setViewportView(tblFlights);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(593, 24, 119, 35);
		contentPane.add(btnLogout);
	}

}
