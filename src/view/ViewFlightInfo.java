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
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewFlightInfo extends JFrame {

	private JPanel contentPane;
	private JTable tblFlights;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewFlightInfo frame = new ViewFlightInfo();
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
	public ViewFlightInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Flight Information");
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 33, 135, 20);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 77, 677, 210);
		contentPane.add(scrollPane);
		
		tblFlights = new JTable();
		tblFlights.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, "", null, null, null},
			},
			new String[] {
				"FlightID", "Flight #", "Airplane", "Origin", "Destination", "Departure Date", "Returning Date", "Passengers"
			}
		));
		tblFlights.getColumnModel().getColumn(5).setPreferredWidth(96);
		tblFlights.getColumnModel().getColumn(6).setPreferredWidth(94);
		tblFlights.setFont(new Font("SansSerif", Font.PLAIN, 15));
		scrollPane.setViewportView(tblFlights);
		
		JButton button = new JButton("Back to Menu");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin admin = new Admin();
				admin.setLocationRelativeTo(null);
				admin.setVisible(true);
				admin.setLocationRelativeTo(null);
				dispose();
			}
		});
		button.setBounds(568, 28, 119, 35);
		contentPane.add(button);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlHighlight);
		panel.setBounds(10, 333, 677, 172);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Seach Flight ID:");
		lblNewLabel_1.setBounds(10, 303, 113, 19);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 15));
		
		textField = new JTextField();
		textField.setBounds(119, 302, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("Search ");
		btnSearch.setBounds(225, 303, 89, 23);
		contentPane.add(btnSearch);
	}
}
