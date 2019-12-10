package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BookFlight extends JFrame {

	private static final long serialVersionUID = -4003151185768053322L;
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookFlight frame = new BookFlight();
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
	public BookFlight() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 706, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Book Flight");
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 22, 101, 20);
		contentPane.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 70, 670, 356);
		contentPane.add(tabbedPane);
		
		JPanel Returning = new JPanel();
		tabbedPane.addTab("Returning", null, Returning, null);
		Returning.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Origin:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 30, 49, 18);
		Returning.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(97, 30, 96, 20);
		Returning.add(textField);
		textField.setColumns(10);
		
		JLabel lblDestination = new JLabel("Destination:");
		lblDestination.setFont(new Font("Arial", Font.PLAIN, 15));
		lblDestination.setBounds(10, 76, 77, 18);
		Returning.add(lblDestination);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(97, 76, 96, 20);
		Returning.add(textField_1);
		
		JLabel lblDepartureDate = new JLabel("Departure Date:");
		lblDepartureDate.setFont(new Font("Arial", Font.PLAIN, 15));
		lblDepartureDate.setBounds(261, 33, 104, 18);
		Returning.add(lblDepartureDate);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(398, 30, 112, 20);
		Returning.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(398, 76, 112, 20);
		Returning.add(dateChooser_1);
		
		JLabel lblArrivalDate = new JLabel("Return Date:");
		lblArrivalDate.setFont(new Font("Arial", Font.PLAIN, 15));
		lblArrivalDate.setBounds(261, 76, 104, 18);
		Returning.add(lblArrivalDate);
		
		JLabel lblNewLabel_2 = new JLabel("Passengers");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 119, 96, 14);
		Returning.add(lblNewLabel_2);
		
		JLabel lblAdult = new JLabel("Adult");
		lblAdult.setFont(new Font("Arial", Font.PLAIN, 15));
		lblAdult.setBounds(10, 156, 49, 18);
		Returning.add(lblAdult);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(50, 155, 69, 22);
		Returning.add(comboBox);
		
		JLabel lblChild = new JLabel("Child");
		lblChild.setFont(new Font("Arial", Font.PLAIN, 15));
		lblChild.setBounds(155, 156, 49, 18);
		Returning.add(lblChild);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(199, 155, 69, 22);
		Returning.add(comboBox_1);
		
		JLabel lblInfant = new JLabel("Infant");
		lblInfant.setFont(new Font("Arial", Font.PLAIN, 15));
		lblInfant.setBounds(293, 156, 49, 18);
		Returning.add(lblInfant);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(340, 155, 69, 22);
		Returning.add(comboBox_2);
		
		JLabel lblCabinClass = new JLabel("Cabin Class");
		lblCabinClass.setFont(new Font("Arial", Font.BOLD, 15));
		lblCabinClass.setBounds(10, 202, 96, 14);
		Returning.add(lblCabinClass);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(10, 236, 96, 22);
		Returning.add(comboBox_3);
		
		JButton btnBook = new JButton("Book Now");
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBook.setBounds(185, 223, 119, 35);
		Returning.add(btnBook);
		
		JPanel OneWay = new JPanel();
		OneWay.setLayout(null);
		tabbedPane.addTab("OneWay", null, OneWay, null);
		
		JLabel label_25 = new JLabel("Origin:");
		label_25.setFont(new Font("Arial", Font.PLAIN, 15));
		label_25.setBounds(10, 30, 49, 18);
		OneWay.add(label_25);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(97, 30, 96, 20);
		OneWay.add(textField_12);
		
		JLabel label_26 = new JLabel("Destination:");
		label_26.setFont(new Font("Arial", Font.PLAIN, 15));
		label_26.setBounds(10, 76, 77, 18);
		OneWay.add(label_26);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(97, 76, 96, 20);
		OneWay.add(textField_13);
		
		JLabel label_27 = new JLabel("Departure Date:");
		label_27.setFont(new Font("Arial", Font.PLAIN, 15));
		label_27.setBounds(261, 33, 104, 18);
		OneWay.add(label_27);
		
		JDateChooser dateChooser_7 = new JDateChooser();
		dateChooser_7.setBounds(398, 30, 112, 20);
		OneWay.add(dateChooser_7);
		
		JLabel label_29 = new JLabel("Passengers");
		label_29.setFont(new Font("Arial", Font.BOLD, 15));
		label_29.setBounds(10, 119, 96, 14);
		OneWay.add(label_29);
		
		JLabel label_30 = new JLabel("Adult");
		label_30.setFont(new Font("Arial", Font.PLAIN, 15));
		label_30.setBounds(10, 156, 49, 18);
		OneWay.add(label_30);
		
		JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setBounds(50, 155, 69, 22);
		OneWay.add(comboBox_12);
		
		JLabel label_31 = new JLabel("Child");
		label_31.setFont(new Font("Arial", Font.PLAIN, 15));
		label_31.setBounds(155, 156, 49, 18);
		OneWay.add(label_31);
		
		JComboBox comboBox_13 = new JComboBox();
		comboBox_13.setBounds(199, 155, 69, 22);
		OneWay.add(comboBox_13);
		
		JLabel label_32 = new JLabel("Infant");
		label_32.setFont(new Font("Arial", Font.PLAIN, 15));
		label_32.setBounds(293, 156, 49, 18);
		OneWay.add(label_32);
		
		JComboBox comboBox_14 = new JComboBox();
		comboBox_14.setBounds(340, 155, 69, 22);
		OneWay.add(comboBox_14);
		
		JLabel label_33 = new JLabel("Cabin Class");
		label_33.setFont(new Font("Arial", Font.BOLD, 15));
		label_33.setBounds(10, 202, 96, 14);
		OneWay.add(label_33);
		
		JComboBox comboBox_15 = new JComboBox();
		comboBox_15.setBounds(10, 236, 96, 22);
		OneWay.add(comboBox_15);
		
		JButton button_2 = new JButton("Book Now");
		button_2.setBounds(185, 223, 119, 35);
		OneWay.add(button_2);
		
		JPanel MultiCity = new JPanel();
		MultiCity.setLayout(null);
		tabbedPane.addTab("Multi City", null, MultiCity, null);
		
		JLabel label = new JLabel("Origin:");
		label.setFont(new Font("Arial", Font.PLAIN, 15));
		label.setBounds(24, 30, 49, 18);
		MultiCity.add(label);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(71, 30, 96, 20);
		MultiCity.add(textField_2);
		
		JLabel label_1 = new JLabel("Destination:");
		label_1.setFont(new Font("Arial", Font.PLAIN, 15));
		label_1.setBounds(191, 30, 77, 18);
		MultiCity.add(label_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(278, 30, 96, 20);
		MultiCity.add(textField_3);
		
		JLabel label_2 = new JLabel("Departure Date:");
		label_2.setFont(new Font("Arial", Font.PLAIN, 15));
		label_2.setBounds(404, 30, 104, 18);
		MultiCity.add(label_2);
		
		JDateChooser dateChooser_2 = new JDateChooser();
		dateChooser_2.setBounds(518, 30, 112, 20);
		MultiCity.add(dateChooser_2);
		
		JLabel label_5 = new JLabel("Passengers");
		label_5.setFont(new Font("Arial", Font.BOLD, 15));
		label_5.setBounds(24, 201, 96, 14);
		MultiCity.add(label_5);
		
		JLabel label_6 = new JLabel("Adult");
		label_6.setFont(new Font("Arial", Font.PLAIN, 15));
		label_6.setBounds(278, 199, 49, 18);
		MultiCity.add(label_6);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(468, 198, 69, 22);
		MultiCity.add(comboBox_4);
		
		JLabel label_7 = new JLabel("Child");
		label_7.setFont(new Font("Arial", Font.PLAIN, 15));
		label_7.setBounds(130, 199, 49, 18);
		MultiCity.add(label_7);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(175, 198, 69, 22);
		MultiCity.add(comboBox_5);
		
		JLabel label_8 = new JLabel("Infant");
		label_8.setFont(new Font("Arial", Font.PLAIN, 15));
		label_8.setBounds(419, 199, 49, 18);
		MultiCity.add(label_8);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(325, 198, 69, 22);
		MultiCity.add(comboBox_6);
		
		JLabel label_11 = new JLabel("Cabin Class");
		label_11.setFont(new Font("Arial", Font.BOLD, 15));
		label_11.setBounds(24, 245, 96, 14);
		MultiCity.add(label_11);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBounds(130, 242, 96, 22);
		MultiCity.add(comboBox_7);
		
		JButton button = new JButton("Book Now");
		button.setBounds(242, 276, 119, 35);
		MultiCity.add(button);
		
		JLabel label_4 = new JLabel("Origin:");
		label_4.setFont(new Font("Arial", Font.PLAIN, 15));
		label_4.setBounds(24, 71, 49, 18);
		MultiCity.add(label_4);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(71, 71, 96, 20);
		MultiCity.add(textField_6);
		
		JLabel label_17 = new JLabel("Destination:");
		label_17.setFont(new Font("Arial", Font.PLAIN, 15));
		label_17.setBounds(191, 71, 77, 18);
		MultiCity.add(label_17);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(278, 71, 96, 20);
		MultiCity.add(textField_7);
		
		JLabel label_18 = new JLabel("Departure Date:");
		label_18.setFont(new Font("Arial", Font.PLAIN, 15));
		label_18.setBounds(404, 71, 104, 18);
		MultiCity.add(label_18);
		
		JDateChooser dateChooser_4 = new JDateChooser();
		dateChooser_4.setBounds(518, 71, 112, 20);
		MultiCity.add(dateChooser_4);
		
		JLabel label_19 = new JLabel("Origin:");
		label_19.setFont(new Font("Arial", Font.PLAIN, 15));
		label_19.setBounds(24, 112, 49, 18);
		MultiCity.add(label_19);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(71, 112, 96, 20);
		MultiCity.add(textField_8);
		
		JLabel label_20 = new JLabel("Destination:");
		label_20.setFont(new Font("Arial", Font.PLAIN, 15));
		label_20.setBounds(191, 112, 77, 18);
		MultiCity.add(label_20);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(278, 112, 96, 20);
		MultiCity.add(textField_9);
		
		JLabel label_21 = new JLabel("Departure Date:");
		label_21.setFont(new Font("Arial", Font.PLAIN, 15));
		label_21.setBounds(404, 112, 104, 18);
		MultiCity.add(label_21);
		
		JDateChooser dateChooser_5 = new JDateChooser();
		dateChooser_5.setBounds(518, 112, 112, 20);
		MultiCity.add(dateChooser_5);
		
		JLabel label_22 = new JLabel("Origin:");
		label_22.setFont(new Font("Arial", Font.PLAIN, 15));
		label_22.setBounds(24, 154, 49, 18);
		MultiCity.add(label_22);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(71, 154, 96, 20);
		MultiCity.add(textField_10);
		
		JLabel label_23 = new JLabel("Destination:");
		label_23.setFont(new Font("Arial", Font.PLAIN, 15));
		label_23.setBounds(191, 154, 77, 18);
		MultiCity.add(label_23);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(278, 154, 96, 20);
		MultiCity.add(textField_11);
		
		JLabel label_24 = new JLabel("Departure Date:");
		label_24.setFont(new Font("Arial", Font.PLAIN, 15));
		label_24.setBounds(404, 154, 104, 18);
		MultiCity.add(label_24);
		
		JDateChooser dateChooser_6 = new JDateChooser();
		dateChooser_6.setBounds(518, 154, 112, 20);
		MultiCity.add(dateChooser_6);
		
		JButton btnBack = new JButton("Back to Menu");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin admin = new Admin();
				admin.setVisible(true);
				admin.setResizable(false);
				admin.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnBack.setBounds(561, 23, 119, 35);
		contentPane.add(btnBack);
	}
}
