package com.learning.book;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MakeGrid extends JFrame {

	private JPanel contentPane;
	private JTextField txtHeigth;
	private JTextField txtWidth;
	private JLabel lblQuantity;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MakeGrid frame = new MakeGrid();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MakeGrid() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 434, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblGridCompany = new JLabel("Book Company S.A");
		lblGridCompany.setBounds(194, 12, 156, 26);
		contentPane.add(lblGridCompany);

		JPanel panel = new JPanel();
		panel.setBounds(32, 75, 374, 195);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblLargoDeLa = new JLabel("Largo de la hoja en cm");
		lblLargoDeLa.setBounds(12, 31, 169, 25);
		panel.add(lblLargoDeLa);

		JLabel lblNewLabel = new JLabel("Ancho de la hoja en cm");
		lblNewLabel.setBounds(15, 102, 181, 15);
		panel.add(lblNewLabel);

		txtHeigth = new JTextField();
		txtHeigth.setBounds(192, 34, 158, 19);
		panel.add(txtHeigth);
		txtHeigth.setColumns(10);

		txtWidth = new JTextField();
		txtWidth.setBounds(192, 100, 158, 19);
		panel.add(txtWidth);
		txtWidth.setColumns(10);

		JButton btnCalclate = new JButton("Calcular");GridCalculate gridcalculate = new GridCalculate();
		btnCalclate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GridCalculate gridcalculate = new GridCalculate();
				try {

					lblQuantity.setText(
							"La hoja tiene " + gridcalculate.measurements(Double.parseDouble(txtWidth.getText()),
									Double.parseDouble(txtHeigth.getText())) + " cuadros");

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "solo se permiten numeros");
					 txtHeigth.setText("");
                     txtWidth.setText("");
				}

			}
		});
		btnCalclate.setBounds(12, 170, 117, 25);
		panel.add(btnCalclate);

		lblQuantity = new JLabel("");
		lblQuantity.setBounds(12, 129, 338, 26);
		panel.add(lblQuantity);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(MakeGrid.class.getResource("/com/learning/images/ingles.png")));
		lblNewLabel_2.setBounds(50, 0, 93, 85);
		contentPane.add(lblNewLabel_2);
	}
}
