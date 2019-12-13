package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagConstraints;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import controller.MainController;

public class ViewFlightInfo extends JFrame {

	private JPanel contentPane;
	private JTable tblFlights;
	private JTextField textField;
	private MainController maincontroller;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public ViewFlightInfo() {
		maincontroller = MainController.getMainController();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 794, 385);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Flight Information");
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 13, 161, 29);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 80, 730, 210);
		contentPane.add(scrollPane);
		
		String data[][] = new String [maincontroller.getAirplaneList().size()][8];
		
		for(int i = 0; i < maincontroller.getAirplaneList().size(); i++) {
			for(int j = 0; j < 8; j++) {
				
			if(j == 0) {
				data[i][j]= String.valueOf(maincontroller.getAirplaneList().get(i).getAirline());
			}else if(j == 1) {
				data[i][j]= maincontroller.getAirplaneList().get(i).getTerminal();
			}else if(j == 2) {
				data[i][j]= maincontroller.getAirplaneList().get(i).getGate();
			}else if(j == 3) {
				data[i][j]= maincontroller.getAirplaneList().get(i).getStatus();
			}else if(j == 4) {
				data[i][j]= String.valueOf(maincontroller.getAirplaneList().get(i).getLocationCity());
			}else if(j == 5) {
				data[i][j]= String.valueOf(maincontroller.getAirplaneList().get(i).getDepartTime());
			}else if(j == 6) {				
				data[i][j]= String.valueOf(maincontroller.getAirplaneList().get(i).getDestinationCity());
			}else if(j == 7) {
				data[i][j]= String.valueOf(maincontroller.getAirplaneList().get(i).getArrivalTime());
			}
			}	
		}
		
		String coloumns [] = {"Airline Name", "Terminal", "Gate", "Flight Status", "Departure City", "Departure Time", "Destination City", "Destination Time"};


		tblFlights = new JTable(data, coloumns);
		tblFlights.setModel(new DefaultTableModel(data, coloumns));
		tblFlights.getColumnModel().getColumn(0).setPreferredWidth(92);
		tblFlights.getColumnModel().getColumn(1).setPreferredWidth(65);
		tblFlights.getColumnModel().getColumn(2).setPreferredWidth(44);
		tblFlights.getColumnModel().getColumn(3).setPreferredWidth(83);
		tblFlights.getColumnModel().getColumn(4).setPreferredWidth(92);
		tblFlights.getColumnModel().getColumn(5).setPreferredWidth(124);
		tblFlights.getColumnModel().getColumn(6).setPreferredWidth(98);
		tblFlights.getColumnModel().getColumn(7).setPreferredWidth(106);
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
		button.setBounds(584, 11, 143, 35);
		contentPane.add(button);
		
		JLabel lblNewLabel_1 = new JLabel("Seach Flight ID:");
		lblNewLabel_1.setBounds(30, 303, 113, 19);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 15));
		
		textField = new JTextField();
		textField.setBounds(139, 303, 130, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("Search ");
		btnSearch.setBounds(281, 302, 130, 23);
		contentPane.add(btnSearch);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\James Maye\\Downloads\\Airplane Aircraft Wallpaper 19114 Wallpaper High Resolution.png"));
		lblNewLabel_2.setBounds(10, 60, 754, 278);
		contentPane.add(lblNewLabel_2);
	}
}
