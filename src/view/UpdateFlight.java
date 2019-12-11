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
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateFlight extends JFrame {

	private JPanel contentPane;
	private JTable tblClientFlight;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public UpdateFlight() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Update Client Flight");
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 18));
		lblNewLabel.setBounds(22, 11, 185, 24);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 61, 668, 188);
		contentPane.add(scrollPane);
		
		tblClientFlight = new JTable();
		tblClientFlight.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"ClientID", "Airline", "Seat", "DepartureDate", "ArrivalDate", "Gate", "Terminal"
			}
		));
		tblClientFlight.getColumnModel().getColumn(3).setPreferredWidth(118);
		tblClientFlight.getColumnModel().getColumn(4).setPreferredWidth(94);
		tblClientFlight.getColumnModel().getColumn(6).setPreferredWidth(83);
		scrollPane.setViewportView(tblClientFlight);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlHighlight);
		panel.setBounds(22, 310, 668, 171);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblDeparture = new JLabel("Departure:");
		lblDeparture.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblDeparture.setBounds(10, 30, 142, 14);
		panel.add(lblDeparture);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(146, 24, 123, 20);
		panel.add(textField_1);
		
		JLabel lblArrival = new JLabel("Arrival:");
		lblArrival.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblArrival.setBounds(301, 30, 142, 14);
		panel.add(lblArrival);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(420, 30, 123, 20);
		panel.add(textField_2);
		
		JLabel lblDeparturedate = new JLabel("DepartureDate:");
		lblDeparturedate.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblDeparturedate.setBounds(10, 78, 142, 14);
		panel.add(lblDeparturedate);
		
		JLabel lblArrivaldate = new JLabel("ArrivalDate:");
		lblArrivaldate.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblArrivaldate.setBounds(301, 78, 142, 14);
		panel.add(lblArrivaldate);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(146, 72, 123, 20);
		panel.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(420, 72, 123, 20);
		panel.add(dateChooser_1);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(229, 120, 89, 23);
		panel.add(btnUpdate);
		
		JLabel lblNewLabel_1 = new JLabel("Search Client ID:");
		lblNewLabel_1.setBounds(22, 277, 142, 14);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 16));
		
		textField = new JTextField();
		textField.setBounds(151, 277, 123, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(283, 276, 89, 23);
		contentPane.add(btnSearch);
		
		JButton button = new JButton("Back to Menu");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin admin = new Admin();
				admin.setLocationRelativeTo(null);
				admin.setVisible(true);
				dispose();
			}
		});
		button.setBounds(480, 15, 119, 35);
		contentPane.add(button);
	}
}
