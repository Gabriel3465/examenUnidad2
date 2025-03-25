package examen_unidad_2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class factura extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					factura frame = new factura();
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
	public factura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 700);
        setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 192));
		panel.setBounds(0, 0, 586, 77);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Factura en Java - NetBeans - ArrayList y POO\r\n");
		lblNewLabel.setBounds(10, 10, 429, 25);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("[Sin base de datos]");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 45, 114, 13);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 93, 566, 97);
		panel_1.setOpaque(false); // Hace que el panel no tenga fondo
		panel_1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK, 1), "Datos de cliente"));		
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Documento:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(22, 27, 77, 13);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Dirección:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(22, 60, 77, 13);
		panel_1.add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBounds(109, 23, 145, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(109, 56, 145, 19);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Nombres:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(287, 27, 77, 13);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Telefono:");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_2_1.setBounds(287, 60, 77, 13);
		panel_1.add(lblNewLabel_2_2_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(374, 23, 145, 19);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBounds(374, 56, 145, 19);
		panel_1.add(textField_3);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setOpaque(false);
		panel_1_1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK, 1), "Datos de factura"));
		panel_1_1.setBounds(10, 200, 566, 67);
		contentPane.add(panel_1_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("N° factura:");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_3.setBounds(22, 27, 77, 13);
		panel_1_1.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Fecha:");
		lblNewLabel_2_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_2_2.setBounds(287, 27, 77, 13);
		panel_1_1.add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("1");
		lblNewLabel_2_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_3_1.setBounds(122, 27, 77, 13);
		panel_1_1.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_3_1_1 = new JLabel("25/03/2025");
		lblNewLabel_2_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_3_1_1.setBounds(374, 28, 130, 13);
		panel_1_1.add(lblNewLabel_2_3_1_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setOpaque(false);
		panel_1_1_1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		panel_1_1_1.setBounds(10, 277, 566, 153);
		contentPane.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setOpaque(false);
		btnNewButton.setIcon(new ImageIcon(factura.class.getResource("/examen_unidad_2/icono logo (1).jpg")));
		btnNewButton.setBounds(10, 5, 28, 27);
		panel_1_1_1.add(btnNewButton);
		
		JLabel lblNewLabel_2_3_2 = new JLabel("Ver listado de facturas");
		lblNewLabel_2_3_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_3_2.setBounds(47, 10, 149, 13);
		panel_1_1_1.add(lblNewLabel_2_3_2);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setIcon(new ImageIcon(factura.class.getResource("/examen_unidad_2/anadir (1).png")));
		btnNewButton_1.setBounds(368, 5, 28, 27);
		panel_1_1_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_2_3_2_1 = new JLabel("Añadir");
		lblNewLabel_2_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_3_2_1.setBounds(406, 10, 46, 13);
		panel_1_1_1.add(lblNewLabel_2_3_2_1);
		
		JLabel lblNewLabel_2_3_2_1_1 = new JLabel("Eliminar");
		lblNewLabel_2_3_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_3_2_1_1.setBounds(510, 11, 46, 13);
		panel_1_1_1.add(lblNewLabel_2_3_2_1_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setOpaque(false);
		btnNewButton_1_1.setIcon(new ImageIcon(factura.class.getResource("/examen_unidad_2/icono eliminar (1).jpg")));
		btnNewButton_1_1.setBounds(475, 5, 28, 27);
		panel_1_1_1.add(btnNewButton_1_1);
		
        // Tabla de productos con JScrollPane
        table = new JTable();
        table.setModel(new DefaultTableModel(
            new Object[][] {
                {"Laptop HP", 1, 1200.00, 1200.00},
                {"Mouse inalámbrico", 2, 25.50, 51.00},
                {"Teclado mecánico", 1, 89.90, 89.90},
                {"Monitor 24\"", 1, 199.99, 199.99},
                {"Cable HDMI", 3, 12.00, 36.00},
                {"Disco SSD 500GB", 1, 75.50, 75.50},
                {"Webcam HD", 1, 45.00, 45.00},
                {"Auriculares", 1, 59.99, 59.99}
            },
            new String[] {
                "Producto", "Cantidad", "Precio Unitario", "Subtotal"
            }
        ));

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 42, 541, 101);
        panel_1_1_1.add(scrollPane);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBounds(10, 443, 566, 190);
        contentPane.add(panel_2);
        panel_2.setLayout(null);
        
        JLabel lblNewLabel_2_3_3 = new JLabel("SubTotal:");
        lblNewLabel_2_3_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_2_3_3.setBounds(10, 23, 77, 13);
        panel_2.add(lblNewLabel_2_3_3);
        
        JLabel lblNewLabel_2_3_1_2 = new JLabel("9842.78");
        lblNewLabel_2_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_2_3_1_2.setBounds(107, 23, 77, 13);
        panel_2.add(lblNewLabel_2_3_1_2);
        
        JLabel lblNewLabel_2_3_3_1 = new JLabel("% Descuento");
        lblNewLabel_2_3_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_2_3_3_1.setBounds(10, 57, 77, 13);
        panel_2.add(lblNewLabel_2_3_3_1);
        
        textField_4 = new JTextField();
        textField_4.setHorizontalAlignment(SwingConstants.LEFT);
        textField_4.setText("8");
        textField_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
        textField_4.setBounds(107, 55, 51, 19);
        panel_2.add(textField_4);
        textField_4.setColumns(10);
        
        JLabel lblNewLabel_2_3_3_1_1 = new JLabel("IVA 19%");
        lblNewLabel_2_3_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_2_3_3_1_1.setBounds(10, 90, 77, 13);
        panel_2.add(lblNewLabel_2_3_3_1_1);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("");
        chckbxNewCheckBox.setBounds(176, 54, 21, 21);
        panel_2.add(chckbxNewCheckBox);
        
        JLabel lblNewLabel_2_3_3_2 = new JLabel("Valor descontado");
        lblNewLabel_2_3_3_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_2_3_3_2.setBounds(238, 58, 106, 13);
        panel_2.add(lblNewLabel_2_3_3_2);
        
        JLabel lblNewLabel_2_3_1_2_1 = new JLabel("875.8");
        lblNewLabel_2_3_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_2_3_1_2_1.setBounds(382, 57, 77, 13);
        panel_2.add(lblNewLabel_2_3_1_2_1);
        
        JLabel lblNewLabel_2_3_1_2_2 = new JLabel("7815.5");
        lblNewLabel_2_3_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_2_3_1_2_2.setBounds(107, 91, 77, 13);
        panel_2.add(lblNewLabel_2_3_1_2_2);
        
        JLabel lblNewLabel_2_3_3_1_1_1 = new JLabel("Total factura:");
        lblNewLabel_2_3_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_2_3_3_1_1_1.setBounds(10, 123, 77, 13);
        panel_2.add(lblNewLabel_2_3_3_1_1_1);
        
        JLabel lblNewLabel_2_3_1_2_2_1 = new JLabel("9887.7");
        lblNewLabel_2_3_1_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_2_3_1_2_2_1.setBounds(107, 124, 77, 13);
        panel_2.add(lblNewLabel_2_3_1_2_2_1);
        
        JButton btnNewButton_2 = new JButton("Finalizar factura");
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JOptionPane.showMessageDialog(null, "La factura se ha realizado con exito"); 
        	}
        });
        btnNewButton_2.setBounds(307, 159, 136, 21);
        btnNewButton_2.setBorder(new LineBorder(Color.decode("#3cd3ee"), 2));
        panel_2.add(btnNewButton_2);
        
        JButton btnNewButton_3 = new JButton("Limpiar");
        btnNewButton_3.setBounds(453, 159, 85, 21);
        panel_2.add(btnNewButton_3);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(0, 128, 255));
        panel_3.setBounds(0, 643, 586, 20);
        contentPane.add(panel_3);

		

	}
	
}
