import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TelaApresentacao extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblPreoUnitrio;
	private JLabel lblTipoDeSorvete;
	private JLabel lblSorveteDeFrutas;
	private JLabel lblChocolatefrutas;
	private JLabel lblBola;
	private JLabel lblPoteDe;
	private JButton btnLimpar;
	private JLabel lblNewLabel_1;
	private JButton btnCalcular;
	private JTextField txtPreco1;
	private JTextField txtPreco2;
	private JTextField txtPreco3;
	private JTextField txtPreco4;
	private JTextField txtQnt1;
	private JTextField txtQnt2;
	private JTextField txtQnt3;
	private JTextField txtQnt4;
	private JTextField txtTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaApresentacao frame = new TelaApresentacao();
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
	public TelaApresentacao() {
		setForeground(new Color(0, 0, 128));
		setBackground(new Color(0, 0, 128));
		setTitle("Sorveteria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Qtde");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(142, 11, 133, 14);
		contentPane.add(lblNewLabel);
		
		lblPreoUnitrio = new JLabel("Preço Unitário");
		lblPreoUnitrio.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPreoUnitrio.setBounds(301, 11, 133, 14);
		contentPane.add(lblPreoUnitrio);
		
		lblTipoDeSorvete = new JLabel("Tipo de sorvete");
		lblTipoDeSorvete.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTipoDeSorvete.setBounds(10, 12, 133, 14);
		contentPane.add(lblTipoDeSorvete);
		
		lblSorveteDeFrutas = new JLabel("Sorvete de frutas");
		lblSorveteDeFrutas.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSorveteDeFrutas.setBounds(10, 47, 133, 14);
		contentPane.add(lblSorveteDeFrutas);
		
		lblChocolatefrutas = new JLabel("ChocolateFrutas");
		lblChocolatefrutas.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChocolatefrutas.setBounds(10, 82, 133, 14);
		contentPane.add(lblChocolatefrutas);
		
		lblBola = new JLabel("Bola");
		lblBola.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBola.setBounds(10, 119, 133, 14);
		contentPane.add(lblBola);
		
		lblPoteDe = new JLabel("Pote de 2 Litros");
		lblPoteDe.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPoteDe.setBounds(10, 155, 133, 14);
		contentPane.add(lblPoteDe);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtQnt1.setText("0");
				txtQnt2.setText("0");
				txtQnt3.setText("0");
				txtQnt4.setText("0");

				txtPreco1.setText("0.00");
				txtPreco2.setText("0.00");
				txtPreco3.setText("0.00");
				txtPreco4.setText("0.00");

				txtTotal.setText("0.00");
			}
		});
		btnLimpar.setBounds(301, 216, 148, 23);
		contentPane.add(btnLimpar);
		
		lblNewLabel_1 = new JLabel("Total");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(142, 186, 105, 14);
		contentPane.add(lblNewLabel_1);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			int qnt1;
			int qnt2;
			int qnt3;
			int qnt4;
			Double preco1 ;
			Double preco2;
			Double preco3;
			Double preco4;
			public void actionPerformed(ActionEvent e) {
				try {
				     qnt1 = Integer.parseInt(txtQnt1.getText());
				     qnt2 = Integer.parseInt(txtQnt2.getText());
				     qnt3 = Integer.parseInt(txtQnt3.getText());
				     qnt4 = Integer.parseInt(txtQnt4.getText());
				        
				     preco1 = Double.parseDouble(txtPreco1.getText());
				     preco2 = Double.parseDouble(txtPreco2.getText());
				     preco3 = Double.parseDouble(txtPreco3.getText());
				     preco4 = Double.parseDouble(txtPreco4.getText());
				     
				  } catch (java.lang.NumberFormatException eo) {
				     
				     JOptionPane.showMessageDialog(null, "Digite os valores corretamente.");
				        
				     
				     int option = JOptionPane.showConfirmDialog(null, "Deseja tentar novamente?");
				     if (option != JOptionPane.YES_OPTION) {
				     
				     } else {
				        txtQnt1.setText("");
				        txtQnt2.setText("");
				        txtQnt3.setText("");
				        txtQnt4.setText("");
				        txtPreco1.setText("");
				        txtPreco2.setText("");
				        txtPreco3.setText("");
				        txtPreco4.setText("");
				        }
				    }
				

				Double total = ((qnt1 * preco1)) + ((qnt2 * preco2)) + ((qnt3 * preco3)) + ((qnt4 * preco4));
				txtTotal.setText(String.valueOf(total));
				
			}
		});
		btnCalcular.setBounds(142, 216, 148, 23);
		contentPane.add(btnCalcular);
		
		txtPreco1 = new JTextField();
		txtPreco1.setBounds(301, 36, 148, 31);
		contentPane.add(txtPreco1);
		txtPreco1.setColumns(10);
		
		txtPreco2 = new JTextField();
		txtPreco2.setColumns(10);
		txtPreco2.setBounds(301, 72, 148, 31);
		contentPane.add(txtPreco2);
		
		txtPreco3 = new JTextField();
		txtPreco3.setColumns(10);
		txtPreco3.setBounds(301, 108, 148, 31);
		contentPane.add(txtPreco3);
		
		txtPreco4 = new JTextField();
		txtPreco4.setColumns(10);
		txtPreco4.setBounds(301, 144, 148, 31);
		contentPane.add(txtPreco4);
		
		txtQnt1 = new JTextField();
		txtQnt1.setColumns(10);
		txtQnt1.setBounds(142, 36, 148, 31);
		contentPane.add(txtQnt1);
		
		txtQnt2 = new JTextField();
		txtQnt2.setColumns(10);
		txtQnt2.setBounds(142, 72, 148, 31);
		contentPane.add(txtQnt2);
		
		txtQnt3 = new JTextField();
		txtQnt3.setColumns(10);
		txtQnt3.setBounds(142, 108, 148, 31);
		contentPane.add(txtQnt3);
		
		txtQnt4 = new JTextField();
		txtQnt4.setColumns(10);
		txtQnt4.setBounds(142, 144, 148, 31);
		contentPane.add(txtQnt4);
		
		txtTotal = new JTextField();
		txtTotal.setColumns(10);
		txtTotal.setBounds(301, 186, 148, 22);
		contentPane.add(txtTotal);
	}
}
