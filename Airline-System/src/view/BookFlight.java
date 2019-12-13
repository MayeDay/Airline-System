package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Color;

import controller.MainController;
import model.Location;
public class BookFlight extends JFrame {

	private static final long serialVersionUID = -4003151185768053322L;
	
	private static BookFlight bookflight;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private MainController maincontroller;
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
	/*public static BookFlight getBookFlight() {
		if(bookflight == null)
			bookflight = new BookFlight();
	}*/

	BookFlight() {
		
		maincontroller = MainController.getMainController();
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\James Maye\\Downloads\\maa.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 760, 474);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Come Fly With Us....");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Gabriola", Font.ITALIC, 19));
		lblNewLabel.setBounds(10, 37, 167, 20);
		contentPane.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 70, 725, 356);
		contentPane.add(tabbedPane);
		
		JPanel Returning = new JPanel();
		tabbedPane.addTab("Returning", null, Returning, null);
		Returning.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Origin:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 30, 49, 18);
		Returning.add(lblNewLabel_1);
		
		JLabel lblDestination = new JLabel("Destination:");
		lblDestination.setFont(new Font("Arial", Font.PLAIN, 15));
		lblDestination.setBounds(10, 76, 77, 18);
		Returning.add(lblDestination);
		
		JLabel lblDepartureDate = new JLabel("Departure Date:");
		lblDepartureDate.setFont(new Font("Arial", Font.PLAIN, 15));
		lblDepartureDate.setBounds(308, 30, 104, 18);
		Returning.add(lblDepartureDate);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(424, 30, 112, 20);
		Returning.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(424, 74, 112, 20);
		Returning.add(dateChooser_1);
		
		JLabel lblArrivalDate = new JLabel("Return Date:");
		lblArrivalDate.setFont(new Font("Arial", Font.PLAIN, 15));
		lblArrivalDate.setBounds(308, 76, 104, 18);
		Returning.add(lblArrivalDate);
		
		JLabel lblNewLabel_2 = new JLabel("Passengers");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 119, 96, 14);
		Returning.add(lblNewLabel_2);
		
		JLabel lblAdult = new JLabel("Adult");
		lblAdult.setFont(new Font("Arial", Font.PLAIN, 15));
		lblAdult.setBounds(10, 156, 49, 18);
		Returning.add(lblAdult);
		
		JComboBox<Integer> comboBox = new JComboBox<Integer>();
		for(int i = 1; i < 8; i++) {
			comboBox.addItem(i);
		}	
		comboBox.setBounds(50, 155, 69, 22);
		Returning.add(comboBox);
		
		JLabel lblChild = new JLabel("Child");
		lblChild.setFont(new Font("Arial", Font.PLAIN, 15));
		lblChild.setBounds(155, 156, 49, 18);
		Returning.add(lblChild);
		
		JComboBox<Integer> comboBox_1 = new JComboBox<Integer>();
		for(int i = 1; i < 8; i++) {
			comboBox_1.addItem(i);
		}	
		comboBox_1.setBounds(199, 155, 69, 22);
		Returning.add(comboBox_1);
		
		JLabel lblInfant = new JLabel("Infant");
		lblInfant.setFont(new Font("Arial", Font.PLAIN, 15));
		lblInfant.setBounds(293, 156, 49, 18);
		Returning.add(lblInfant);
		
		JComboBox<Integer> comboBox_2 = new JComboBox<Integer>();
		for(int i = 1; i < 8; i++) {
			comboBox_2.addItem(i);
		}	
		comboBox_2.setBounds(340, 155, 69, 22);
		Returning.add(comboBox_2);
		
		JLabel lblCabinClass = new JLabel("Cabin Class");
		lblCabinClass.setFont(new Font("Arial", Font.BOLD, 15));
		lblCabinClass.setBounds(10, 202, 96, 14);
		Returning.add(lblCabinClass);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Economy", "Preminium Economy", "Business Class", "First Class"}));
		comboBox_3.setBounds(10, 236, 96, 22);
		Returning.add(comboBox_3);
		
		JButton btnBook = new JButton("Search");
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBook.setBounds(155, 230, 119, 35);
		Returning.add(btnBook);
		
		JComboBox<String> cboReturning = new JComboBox<String>();
		for(int i = 0; i < maincontroller.getLocationList().size(); i++) {
			Location local = maincontroller.getLocationList().get(i);
			cboReturning.addItem(local.getCountry() + ", " + local.getCity() + ", " + local.getAcro());
		}
		cboReturning.setBounds(92, 28, 204, 22);
		Returning.add(cboReturning);
		
		JComboBox<String> cboDestination = new JComboBox<String>();
		for(int i = 0; i < maincontroller.getLocationList().size(); i++) {
			Location local = maincontroller.getLocationList().get(i);
			cboDestination.addItem(local.getCountry() + ", " + local.getCity() + ", " + local.getAcro());
		}		
		cboDestination.setBounds(92, 74, 204, 22);
		Returning.add(cboDestination);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\James Maye\\Downloads\\Airplane Aircraft Wallpaper 19114 Wallpaper High Resolution.png"));
		lblNewLabel_5.setBounds(0, 0, 720, 326);
		Returning.add(lblNewLabel_5);
		
		JPanel OneWay = new JPanel();
		OneWay.setLayout(null);
		tabbedPane.addTab("OneWay", null, OneWay, null);
		
		JLabel label_25 = new JLabel("Origin:");
		label_25.setFont(new Font("Arial", Font.PLAIN, 15));
		label_25.setBounds(10, 30, 49, 18);
		OneWay.add(label_25);
		
		JLabel label_26 = new JLabel("Destination:");
		label_26.setFont(new Font("Arial", Font.PLAIN, 15));
		label_26.setBounds(10, 76, 77, 18);
		OneWay.add(label_26);
		
		JLabel label_27 = new JLabel("Departure Date:");
		label_27.setFont(new Font("Arial", Font.PLAIN, 15));
		label_27.setBounds(305, 30, 104, 18);
		OneWay.add(label_27);
		
		JDateChooser dateChooser_7 = new JDateChooser();
		dateChooser_7.setBounds(443, 30, 112, 20);
		OneWay.add(dateChooser_7);
		
		JLabel label_29 = new JLabel("Passengers");
		label_29.setFont(new Font("Arial", Font.BOLD, 15));
		label_29.setBounds(10, 119, 96, 14);
		OneWay.add(label_29);
		
		JLabel label_30 = new JLabel("Adult");
		label_30.setFont(new Font("Arial", Font.PLAIN, 15));
		label_30.setBounds(10, 156, 49, 18);
		OneWay.add(label_30);
		
		JComboBox<Integer> comboBox_12 = new JComboBox<Integer>();
		for(int i = 1; i < 8; i++) {
			comboBox_12.addItem(i);
		}
		comboBox_12.setBounds(50, 155, 69, 22);
		OneWay.add(comboBox_12);
		
		JLabel label_31 = new JLabel("Child");
		label_31.setFont(new Font("Arial", Font.PLAIN, 15));
		label_31.setBounds(155, 156, 49, 18);
		OneWay.add(label_31);
		
		JComboBox<Integer> comboBox_13 = new JComboBox<Integer>();
		for(int i = 1; i < 8; i++) {
			comboBox_13.addItem(i);
		}		
		comboBox_13.setBounds(199, 155, 69, 22);
		OneWay.add(comboBox_13);
		
		JLabel label_32 = new JLabel("Infant");
		label_32.setFont(new Font("Arial", Font.PLAIN, 15));
		label_32.setBounds(293, 156, 49, 18);
		OneWay.add(label_32);
		
		JComboBox<Integer> comboBox_14 = new JComboBox<Integer>();
		for(int i = 1; i < 8; i++) {
			comboBox_14.addItem(i);
		}		
		comboBox_14.setBounds(340, 155, 69, 22);
		OneWay.add(comboBox_14);
		
		JLabel label_33 = new JLabel("Cabin Class");
		label_33.setFont(new Font("Arial", Font.BOLD, 15));
		label_33.setBounds(10, 202, 96, 14);
		OneWay.add(label_33);
		
		JComboBox<String> comboBox_15 = new JComboBox<String>();
		for(int i = 0; i < maincontroller.getLocationList().size(); i++) {
			Location local = maincontroller.getLocationList().get(i);
			comboBox_15.addItem(local.getCountry() + ", " + local.getCity() + ", " + local.getAcro());
		}			
		comboBox_15.setBounds(10, 236, 96, 22);
		OneWay.add(comboBox_15);
		
		JButton button_2 = new JButton("Book Now");
		button_2.setBounds(185, 223, 119, 35);
		OneWay.add(button_2);
		
		JComboBox<String> cboOriginOneway = new JComboBox<String>();
		for(int i = 0; i < maincontroller.getLocationList().size(); i++) {
			Location local = maincontroller.getLocationList().get(i);
			cboOriginOneway.addItem(local.getCountry() + ", " + local.getCity() + ", " + local.getAcro());
		}		
		cboOriginOneway.setBounds(97, 28, 171, 22);
		OneWay.add(cboOriginOneway);
		
		JComboBox<String> cboOnewayDestination = new JComboBox<String>();
		for(int i = 0; i < maincontroller.getLocationList().size(); i++) {
			Location local = maincontroller.getLocationList().get(i);
			cboOnewayDestination.addItem(local.getCountry() + ", " + local.getCity() + ", " + local.getAcro());
		}		
		cboOnewayDestination.setBounds(99, 74, 169, 22);
		OneWay.add(cboOnewayDestination);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(0, 0, 720, 326);
		OneWay.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\James Maye\\Downloads\\Airplane Aircraft Wallpaper 19114 Wallpaper High Resolution.png"));
		
		JPanel MultiCity = new JPanel();
		MultiCity.setLayout(null);
		tabbedPane.addTab("Multi City", null, MultiCity, null);
		
		JLabel label = new JLabel("Origin:");
		label.setFont(new Font("Arial", Font.PLAIN, 15));
		label.setBounds(24, 30, 49, 18);
		MultiCity.add(label);
		
		JLabel label_1 = new JLabel("Destination:");
		label_1.setFont(new Font("Arial", Font.PLAIN, 15));
		label_1.setBounds(222, 30, 77, 18);
		MultiCity.add(label_1);
		
		JLabel label_2 = new JLabel("Departure Date:");
		label_2.setFont(new Font("Arial", Font.PLAIN, 15));
		label_2.setBounds(468, 30, 104, 18);
		MultiCity.add(label_2);
		
		JDateChooser dateChooser_2 = new JDateChooser();
		dateChooser_2.setBounds(584, 30, 112, 20);
		MultiCity.add(dateChooser_2);
		
		JLabel label_5 = new JLabel("Passengers");
		label_5.setFont(new Font("Arial", Font.BOLD, 15));
		label_5.setBounds(24, 201, 96, 14);
		MultiCity.add(label_5);
		
		JLabel label_6 = new JLabel("Adult");
		label_6.setFont(new Font("Arial", Font.PLAIN, 15));
		label_6.setBounds(278, 199, 49, 18);
		MultiCity.add(label_6);
		
		JComboBox<Integer> comboBox_4 = new JComboBox<Integer>();
		for(int i = 0; i < 8; i++) {
			comboBox_4.addItem(i);
		}		
		comboBox_4.setBounds(468, 198, 69, 22);
		MultiCity.add(comboBox_4);
		
		JLabel label_7 = new JLabel("Child");
		label_7.setFont(new Font("Arial", Font.PLAIN, 15));
		label_7.setBounds(130, 199, 49, 18);
		MultiCity.add(label_7);
		
		JComboBox<Integer> comboBox_5 = new JComboBox<Integer>();
		for(int i = 0; i < 8; i++) {
			comboBox_5.addItem(i);
		}	
		comboBox_5.setBounds(175, 198, 69, 22);
		MultiCity.add(comboBox_5);
		
		JLabel label_8 = new JLabel("Infant");
		label_8.setFont(new Font("Arial", Font.PLAIN, 15));
		label_8.setBounds(419, 199, 49, 18);
		MultiCity.add(label_8);
		
		JComboBox<Integer> comboBox_6 = new JComboBox<Integer>();
		for(int i = 0; i < 8; i++) {
			comboBox_6.addItem(i);
		}	
		comboBox_6.setBounds(325, 198, 69, 22);
		MultiCity.add(comboBox_6);
		
		JLabel label_11 = new JLabel("Cabin Class");
		label_11.setFont(new Font("Arial", Font.BOLD, 15));
		label_11.setBounds(24, 245, 96, 14);
		MultiCity.add(label_11);
		
		JComboBox<String> comboBox_7 = new JComboBox<String>();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"Economy", "Preminium Economy", "Business Class", "First Class"}));
		comboBox_7.setBounds(130, 242, 96, 22);
		MultiCity.add(comboBox_7);
		
		JButton button = new JButton("Book Now");
		button.setBounds(242, 276, 119, 35);
		MultiCity.add(button);
		
		JLabel label_4 = new JLabel("Origin:");
		label_4.setFont(new Font("Arial", Font.PLAIN, 15));
		label_4.setBounds(24, 71, 49, 18);
		MultiCity.add(label_4);
		
		JLabel label_17 = new JLabel("Destination:");
		label_17.setFont(new Font("Arial", Font.PLAIN, 15));
		label_17.setBounds(222, 71, 77, 18);
		MultiCity.add(label_17);
		
		JLabel label_18 = new JLabel("Departure Date:");
		label_18.setFont(new Font("Arial", Font.PLAIN, 15));
		label_18.setBounds(468, 71, 104, 18);
		MultiCity.add(label_18);
		
		JDateChooser dateChooser_4 = new JDateChooser();
		dateChooser_4.setBounds(584, 69, 112, 20);
		MultiCity.add(dateChooser_4);
		
		JLabel label_19 = new JLabel("Origin:");
		label_19.setFont(new Font("Arial", Font.PLAIN, 15));
		label_19.setBounds(24, 112, 49, 18);
		MultiCity.add(label_19);
		
		JLabel label_20 = new JLabel("Destination:");
		label_20.setFont(new Font("Arial", Font.PLAIN, 15));
		label_20.setBounds(222, 112, 77, 18);
		MultiCity.add(label_20);
		
		JLabel label_21 = new JLabel("Departure Date:");
		label_21.setFont(new Font("Arial", Font.PLAIN, 15));
		label_21.setBounds(468, 112, 104, 18);
		MultiCity.add(label_21);
		
		JDateChooser dateChooser_5 = new JDateChooser();
		dateChooser_5.setBounds(584, 110, 112, 20);
		MultiCity.add(dateChooser_5);
		
		JLabel label_22 = new JLabel("Origin:");
		label_22.setFont(new Font("Arial", Font.PLAIN, 15));
		label_22.setBounds(24, 154, 49, 18);
		MultiCity.add(label_22);
		
		JLabel label_23 = new JLabel("Destination:");
		label_23.setFont(new Font("Arial", Font.PLAIN, 15));
		label_23.setBounds(222, 154, 77, 18);
		MultiCity.add(label_23);
		
		JLabel label_24 = new JLabel("Departure Date:");
		label_24.setFont(new Font("Arial", Font.PLAIN, 15));
		label_24.setBounds(468, 154, 104, 18);
		MultiCity.add(label_24);
		
		JDateChooser dateChooser_6 = new JDateChooser();
		dateChooser_6.setBounds(584, 152, 112, 20);
		MultiCity.add(dateChooser_6);
		
		JComboBox<String> comboBox_16 = new JComboBox<String>();
		comboBox_16.setBounds(72, 28, 138, 22);
		MultiCity.add(comboBox_16);
		
		JComboBox<String> comboBox_17 = new JComboBox<String>();
		comboBox_17.setBounds(71, 69, 138, 22);
		MultiCity.add(comboBox_17);
		
		JComboBox<String> comboBox_18 = new JComboBox<String>();
		comboBox_18.setBounds(71, 110, 138, 22);
		MultiCity.add(comboBox_18);
		
		JComboBox<String> comboBox_19 = new JComboBox<String>();
		comboBox_19.setBounds(72, 152, 138, 22);
		MultiCity.add(comboBox_19);
		
		JComboBox<String> comboBox_20 = new JComboBox<String>();
		comboBox_20.setBounds(311, 28, 138, 22);
		MultiCity.add(comboBox_20);
		
		JComboBox<String> comboBox_21 = new JComboBox<String>();
		comboBox_21.setBounds(311, 69, 138, 22);
		MultiCity.add(comboBox_21);
		
		JComboBox<String> comboBox_22 = new JComboBox<String>();
		comboBox_22.setBounds(311, 110, 138, 22);
		MultiCity.add(comboBox_22);
		
		JComboBox<String> comboBox_23 = new JComboBox<String>();
		comboBox_23.setBounds(311, 152, 138, 22);
		MultiCity.add(comboBox_23);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\James Maye\\Downloads\\Airplane Aircraft Wallpaper 19114 Wallpaper High Resolution.png"));
		lblNewLabel_4.setBounds(0, 0, 720, 326);
		MultiCity.add(lblNewLabel_4);
		
		for(int i = 0; i < maincontroller.getLocationList().size(); i++) {
			Location local = maincontroller.getLocationList().get(i);
			comboBox_16.addItem(local.getCountry() + ", " + local.getCity() + ", " + local.getAcro());
			comboBox_17.addItem(local.getCountry() + ", " + local.getCity() + ", " + local.getAcro());
			comboBox_18.addItem(local.getCountry() + ", " + local.getCity() + ", " + local.getAcro());
			comboBox_19.addItem(local.getCountry() + ", " + local.getCity() + ", " + local.getAcro());
			comboBox_20.addItem(local.getCountry() + ", " + local.getCity() + ", " + local.getAcro());
			comboBox_21.addItem(local.getCountry() + ", " + local.getCity() + ", " + local.getAcro());
			comboBox_22.addItem(local.getCountry() + ", " + local.getCity() + ", " + local.getAcro());
			comboBox_23.addItem(local.getCountry() + ", " + local.getCity() + ", " + local.getAcro());

		}	
		
		JButton btnBack = new JButton("Login");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(maincontroller.employeeAuthentication(textField_1.getText(), passwordField.getText())) {
					Admin admin = new Admin();
					admin.setVisible(true);
					admin.setResizable(false);
					admin.setLocationRelativeTo(null);
					dispose();
				}else {
					JOptionPane.showMessageDialog(null, "Invalid username or password");
				}
			}
		});
		btnBack.setBounds(388, 14, 77, 19);
		contentPane.add(btnBack);
		
		textField_1 = new JTextField();
		textField_1.setBounds(477, 13, 116, 21);
		textField_1.setColumns(10);
		textField_1.setText("Username");
		textField_1.setForeground(Color.LIGHT_GRAY);
		textField_1.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField_1.setText("");
				textField_1.setForeground(Color.BLACK);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
				

		contentPane.add(textField_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(605, 13, 119, 20);
		passwordField.setText("Password");
		passwordField.setVisible(true);
		passwordField.setForeground(Color.LIGHT_GRAY);
		passwordField.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				passwordField.setText("");
				passwordField.setForeground(Color.BLACK);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		contentPane.add(passwordField);
		setLocationRelativeTo(null);
	}
	
}
