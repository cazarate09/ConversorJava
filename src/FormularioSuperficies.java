import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class FormularioSuperficies extends JFrame
{
	protected JLabel mensaje;
	protected JButton bConvertir, bRegresar;
	protected Border border;
	protected JComboBox combo;
	protected JTextField area;
	
	
	public FormularioSuperficies() {
		// TODO Auto-generated constructor stub
		
		
		Container content = getContentPane();
		content.setLayout(new BorderLayout());
		
		
		//border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		
		
		JPanel pNorte = crearPNorte();
		content.add(pNorte, BorderLayout.NORTH);
		
		JPanel pCentro = crearPCentro();
		content.add(pCentro, BorderLayout.CENTER);
		
		JPanel pSur = crearSur(); 
		content.add(pSur,BorderLayout.SOUTH);
		
		
		setSize(300, 150);
		setLocationRelativeTo(null);
		setVisible(false);
	}
	
	

	private JPanel crearPNorte() {
		// TODO Auto-generated method stub
		JPanel p = new JPanel(new BorderLayout());
		
		Font fuente = new Font("Arial", 3, 20);
		
		mensaje = new JLabel("Ingrese cantidad:  ");
		p.add(mensaje, BorderLayout.WEST);
		
		area = new JTextField(10);
		area.setFont(fuente);
		
		p.add(area, BorderLayout.EAST);
		
		return p;
	}
	
	

	private JPanel crearPCentro() {
		// TODO Auto-generated methd stub
		JPanel p = new JPanel(new FlowLayout());
		
		combo = new JComboBox();
		
		p.add(combo);
		
		
		combo.addItem("Convertir de metros a kilómetros");
		combo.addItem("Convertir de metros  a millas");
		combo.addItem("Convertir de metros a yardas");
		combo.addItem("Convertir de metros a pulgadas");
		combo.addItem("Convertir de metros a pies");
		combo.addItem("Convertir de kilómetros a metros");
		combo.addItem("Convertir de millas a metros");
		combo.addItem("Convertir de yardas a metros");
		combo.addItem("Convertir de pulgadas a metros");
		combo.addItem("Convertir de pies a metros");  
		
		return p;
	}


	private JPanel crearSur()
	{
		
		JPanel p = new JPanel(new FlowLayout());
		
		
		bConvertir = new JButton("Calcular");
		p.add(bConvertir,BorderLayout.EAST);
		
		bRegresar = new JButton("Regresar");
		p.add(bRegresar,BorderLayout.WEST);
		
		
		bConvertir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				try 
				{
						int opcion = combo.getSelectedIndex();
						
						float valor = Float.valueOf( area.getText());
						
						
						switch (opcion)
						{
							case 0:		JOptionPane.showMessageDialog(null, "El valor " + valor + " metros equivale a "
										+ valor / 1000 + " kilómetros" );
								
										break;
							
							case 1:		JOptionPane.showMessageDialog(null, "El valor " + valor + " metros equivale a "
										+ valor / 1609.344 + " millas" );
							
										break;
										
							case 2:		JOptionPane.showMessageDialog(null, "El valor " + valor + " metros equivale a "
										+ valor / 1.0936 + " yardas" );
						
										break;
										
							case 3:		JOptionPane.showMessageDialog(null, "El valor " + valor + " metros equivale a "
										+ valor * 39.3701 + " pulgadas" );
					
										break;
									
							case 4:		JOptionPane.showMessageDialog(null, "El valor " + valor + " metros equivale a "
										+ valor / 3.37 + " pies" );
					
										break;
							
										
							case 5:		JOptionPane.showMessageDialog(null, "El valor " + valor + " kilómetros equivale a "
										+ valor * 1000 + " metros" );
								
										break;
						
							case 6:		JOptionPane.showMessageDialog(null, "El valor " + valor + " millas equivale a "
										+ valor * 1609.344 + " metros" );
							
										break;
										
							case 7:		JOptionPane.showMessageDialog(null, "El valor " + valor + " yardas equivale a "
										+ valor * 0.9144 + " metros" );
						
										break;
										
							case 8:		JOptionPane.showMessageDialog(null, "El valor " + valor + " pulgadas equivale a "
										+ valor * 0.0254 + " metros" );
					
										break;
									
							case 9:		JOptionPane.showMessageDialog(null, "El valor " + valor + " pies equivale a "
										+ valor * 0.3048  + " metros" );
					
										break;
							
							default:	throw new IllegalArgumentException("Unexpected value: " + opcion);
						}
						
						
				} 
				
				
				catch (Exception e2)
				{
					JOptionPane.showMessageDialog(null, "Debe ingresar valor válido" );

				}
				
				
				
			}
		});
		
	    bRegresar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				dispose();
				Principal v = new Principal();
				
			}
		});
		
		return p;
	}
	
	
	
}
