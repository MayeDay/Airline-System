package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import controller.MainController;

public class Merchant extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private MainController maincontroller;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Merchant frame = new Merchant();
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
	public Merchant() {
		maincontroller = MainController.getMainController();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 765, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(183, 55, 533, 285);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel Addairline = new JPanel();
		Addairline.setBackground(new Color(0, 0, 153));
		Addairline.setForeground(new Color(51, 0, 255));
		layeredPane.add(Addairline, "name_31122129232100");
		Addairline.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Airline");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel.setBounds(12, 13, 95, 16);
		Addairline.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("AirLine Name");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(12, 55, 89, 16);
		Addairline.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(113, 52, 116, 22);
		Addairline.add(textField);
		textField.setColumns(10);
		
		JPanel Addairplane = new JPanel();
		Addairplane.setBackground(new Color(0, 0, 153));
		Addairplane.setForeground(new Color(0, 102, 153));
		layeredPane.add(Addairplane, "name_31970166246800");
		Addairplane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Add Airplane");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(12, 13, 89, 16);
		Addairplane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Airplane type:");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(11, 50, 90, 16);
		Addairplane.add(lblNewLabel_3);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(115, 48, 114, 22);
		for(int i= 0;i < maincontroller.getAirplaneList().size(); i++) {
			String airline = maincontroller.getAirplaneList().get(i).getName();
			comboBox.addItem(airline);
		}
		Addairplane.add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Price");
		lblNewLabel_4.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(11, 89, 56, 16);
		Addairplane.add(lblNewLabel_4);
		
		JLabel lblAirline = new JLabel("Airline");
		lblAirline.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblAirline.setForeground(Color.WHITE);
		lblAirline.setBounds(9, 124, 56, 16);
		Addairplane.add(lblAirline);
		
		JLabel lblNewLabel_5 = new JLabel("Terminal");
		lblNewLabel_5.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(13, 159, 88, 16);
		Addairplane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Gate");
		lblNewLabel_6.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(12, 195, 56, 16);
		Addairplane.add(lblNewLabel_6);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(116, 194, 49, 22);
		Addairplane.add(comboBox_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(115, 85, 114, 22);
		Addairplane.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.setBounds(114, 120, 115, 22);
		for(int i= 0;i < maincontroller.getAirlineList().size(); i++) {
			String airline = maincontroller.getAirlineList().get(i);
			comboBox_2.addItem(airline);
		}
		Addairplane.add(comboBox_2);
		
		JComboBox<Character> comboBox_3 = new JComboBox<Character>();
		comboBox_3.setBounds(115, 158, 49, 22);
		
		for(int i = 0; i < 26; i++) {
			int x = 65 + i;
			comboBox_3.addItem((char) x);
		}
		Addairplane.add(comboBox_3);
		
		comboBox_3.getItemAt(comboBox.getSelectedIndex());
		
		JLabel lblNewLabel_7 = new JLabel("Departime");
		lblNewLabel_7.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(256, 50, 76, 16);
		Addairplane.add(lblNewLabel_7);
		
		JLabel lblArrivaltime = new JLabel("ArrivalTime");
		lblArrivaltime.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblArrivaltime.setForeground(Color.WHITE);
		lblArrivaltime.setBounds(256, 89, 76, 16);
		Addairplane.add(lblArrivaltime);
		
		JLabel lblDestinationcity = new JLabel("DestinationCity");
		lblDestinationcity.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblDestinationcity.setForeground(Color.WHITE);
		lblDestinationcity.setBounds(256, 124, 104, 16);
		Addairplane.add(lblDestinationcity);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(375, 50, 121, 22);
		Addairplane.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(375, 89, 121, 22);
		Addairplane.add(dateChooser_1);
		
		JComboBox<String> comboBox_4 = new JComboBox<String>();
		comboBox_4.setBounds(378, 122, 120, 22);
		for(int i = 0; i < maincontroller.getLocationList().size(); i++) {
			String city = maincontroller.getLocationList().get(i).getAcro() + ", " + maincontroller.getLocationList().get(i).getCity();
			comboBox_4.addItem(city);
		}
		Addairplane.add(comboBox_4);
		
		JLabel lblLocationCity = new JLabel("Location City");
		lblLocationCity.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblLocationCity.setForeground(Color.WHITE);
		lblLocationCity.setBounds(256, 159, 89, 16);
		Addairplane.add(lblLocationCity);
		
		JComboBox<String> comboBox_6 = new JComboBox<String>();
		comboBox_6.setBounds(378, 157, 120, 22);
		for(int i = 0; i < maincontroller.getLocationList().size(); i++) {
			String city = maincontroller.getLocationList().get(i).getAcro() + ", " + maincontroller.getLocationList().get(i).getCity();
			comboBox_6.addItem(city);
		}
		Addairplane.add(comboBox_6);
		
		JButton btnAdd = new JButton("Add Airplane");
		btnAdd.setBounds(12, 247, 114, 25);
		Addairplane.add(btnAdd);
		
		JButton btnNewButton = new JButton("Add Airline");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Addairline.setVisible(true);
				Addairplane.setVisible(false);
			}
		});
		btnNewButton.setBounds(12, 84, 130, 38);
		contentPane.add(btnNewButton);
		
		JButton btnAddAirplane = new JButton("Add Airplane");
		btnAddAirplane.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Addairplane.setVisible(true);
				Addairline.setVisible(false);
			}
		});
		btnAddAirplane.setBounds(12, 151, 130, 38);
		contentPane.add(btnAddAirplane);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\James Maye\\Downloads\\Airplane Aircraft Wallpaper 19114 Wallpaper High Resolution.png"));
		lblNewLabel_8.setForeground(new Color(0, 0, 102));
		lblNewLabel_8.setBackground(new Color(0, 255, 0));
		lblNewLabel_8.setBounds(0, 0, 747, 415);
		contentPane.add(lblNewLabel_8);
	}
}
