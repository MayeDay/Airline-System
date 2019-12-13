package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class BookNow extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public BookNow() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 801, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 50, 734, 209);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"Airline", "Departure", "Arrival", "Destination"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Available Flights");
		lblNewLabel.setBackground(new Color(0, 0, 153));
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 11, 193, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Airline");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 299, 96, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(116, 299, 124, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDeparture = new JLabel("Departure");
		lblDeparture.setFont(new Font("SansSerif", Font.PLAIN, 18));
		lblDeparture.setBounds(10, 324, 114, 29);
		contentPane.add(lblDeparture);
		
		JLabel lblArrival = new JLabel("Arrival");
		lblArrival.setFont(new Font("SansSerif", Font.PLAIN, 18));
		lblArrival.setBounds(10, 364, 65, 14);
		contentPane.add(lblArrival);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(115, 333, 124, 20);
		contentPane.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(115, 364, 124, 20);
		contentPane.add(dateChooser_1);
		
		JButton btnSelect = new JButton("Select Flight");
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Payment pay = new Payment();
				pay.setVisible(true);
				pay.setResizable(false);
				pay.setLocationRelativeTo(null);
			}
		});
		btnSelect.setBounds(267, 295, 144, 35);
		contentPane.add(btnSelect);
		
		JLabel lblDestination = new JLabel("Destination");
		lblDestination.setFont(new Font("SansSerif", Font.PLAIN, 18));
		lblDestination.setBounds(10, 395, 96, 14);
		contentPane.add(lblDestination);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(115, 395, 124, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(new Color(0, 0, 153));
		lblNewLabel_2.setForeground(new Color(0, 0, 153));
		lblNewLabel_2.setBounds(0, 11, 771, 404);
		contentPane.add(lblNewLabel_2);
	}
}
