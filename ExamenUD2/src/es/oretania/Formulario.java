package es.oretania;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Choice;
import java.awt.List;
import java.awt.ScrollPane;
import javax.swing.JSplitPane;
import java.awt.Button;

public class Formulario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAnt;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(38, 60, 70, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sexo:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(38, 128, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Edad:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(38, 88, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Intereses:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(38, 170, 70, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("País:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_3.setBounds(38, 210, 46, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Año de nacimiento:");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_4.setBounds(38, 242, 108, 14);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Descripción: ");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_5.setBounds(38, 289, 82, 14);
		contentPane.add(lblNewLabel_1_5);
		
		txtAnt = new JTextField();
		txtAnt.setText("Angel Tobaruela Baños");
		txtAnt.setBounds(176, 60, 182, 14);
		contentPane.add(txtAnt);
		txtAnt.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("22");
		textField_1.setColumns(10);
		textField_1.setBounds(176, 88, 182, 14);
		contentPane.add(textField_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(195, 124, 71, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setBounds(276, 124, 82, 23);
		contentPane.add(rdbtnFemenino);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Deporte");
		chckbxNewCheckBox.setBounds(176, 166, 70, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxMsica = new JCheckBox("Música");
		chckbxMsica.setSelected(true);
		chckbxMsica.setBounds(248, 166, 57, 23);
		contentPane.add(chckbxMsica);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("Lectura");
		chckbxNewCheckBox_1_1.setBounds(307, 166, 61, 23);
		contentPane.add(chckbxNewCheckBox_1_1);
		
		TextField textField = new TextField();
		textField.setText("Vehículo propio");
		textField.setBounds(176, 271, 182, 61);
		contentPane.add(textField);
		
		Choice choice = new Choice();
		choice.setBounds(175, 210, 183, 20);
		contentPane.add(choice);
		
		Button button = new Button("Enviar");
		button.setBounds(117, 338, 70, 22);
		contentPane.add(button);
		
		Button button_1 = new Button("Limpiar");
		button_1.setBounds(196, 338, 70, 22);
		contentPane.add(button_1);
		
		Button button_2 = new Button("Salir");
		button_2.setBounds(276, 338, 70, 22);
		contentPane.add(button_2);
		
		textField_2 = new JTextField();
		textField_2.setText("2003");
		textField_2.setBounds(176, 239, 182, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}
}
