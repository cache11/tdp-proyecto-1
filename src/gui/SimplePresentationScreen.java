package gui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.util.Calendar;


@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JLabel lblNewLabel;
	private JTextField textGithub;
	private JTextField textEmail;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textLU;
	private JLabel horaEjecucion;

	public SimplePresentationScreen(Student studentData) {
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2022 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 250));
		setResizable(false);
		setContentPane(contentPane);
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		
		init();
	}
	
	private void init() {
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 430, 184);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 250));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		
		lblNewLabel = new JLabel("LU");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_1_2 = new JLabel("E-mail");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_1_3 = new JLabel("Github URL");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textGithub = new JTextField();
		textGithub.setEditable(false);
		textGithub.setColumns(10);
		textGithub.setText(studentData.getGithubURL());
		
		textEmail = new JTextField();
		textEmail.setEditable(false);
		textEmail.setColumns(10);
		textEmail.setText(studentData.getMail());
		
		textNombre = new JTextField();
		textNombre.setEditable(false);
		textNombre.setColumns(10);
		textNombre.setText(studentData.getFirstName());
		
		textApellido = new JTextField();
		textApellido.setEditable(false);
		textApellido.setColumns(10);
		textApellido.setText(studentData.getLastName());
		
		textLU = new JTextField();
		textLU.setEditable(false);
		textLU.setColumns(10);
		textLU.setText(""+studentData.getId());
		
		GroupLayout gl_tabInformation = new GroupLayout(tabInformation);
		gl_tabInformation.setHorizontalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_tabInformation.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
							.addComponent(textApellido, GroupLayout.PREFERRED_SIZE, 333, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_tabInformation.createSequentialGroup()
							.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
							.addComponent(textNombre, GroupLayout.PREFERRED_SIZE, 333, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_tabInformation.createSequentialGroup()
							.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
							.addComponent(textEmail, GroupLayout.PREFERRED_SIZE, 333, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(lblNewLabel_1_3)
							.addGap(10)
							.addComponent(textGithub, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_tabInformation.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
							.addComponent(textLU, GroupLayout.PREFERRED_SIZE, 333, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_tabInformation.setVerticalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(textLU, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addGap(8)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(textApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(textNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(textEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(textGithub, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_3))
					.addContainerGap(10, Short.MAX_VALUE))
		);
		tabInformation.setLayout(gl_tabInformation);
		contentPane.add(tabbedPane);
		
		JLabel labelFotoEstudiante = new JLabel("");
		labelFotoEstudiante.setBounds(445, 20, 144, 169);
		labelFotoEstudiante.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource(studentData.getPathPhoto())));
		contentPane.add(labelFotoEstudiante);
		
		horaEjecucion = new JLabel("New label");
		horaEjecucion.setFont(new Font("Tahoma", Font.BOLD, 11));
		horaEjecucion.setBounds(15, 197, 414, 14);
		agregarFechaYHora(horaEjecucion);
		contentPane.add(horaEjecucion);
		
	}
	
	private void agregarFechaYHora(JLabel label) {
		Calendar calendario = Calendar.getInstance();
		String hora = calendario.get(Calendar.HOUR_OF_DAY)+":"+calendario.get(Calendar.MINUTE)+":"+calendario.get(Calendar.SECOND);
		
		String fecha = ""+LocalDate.now();
		String fechaParte[] = fecha.split("-");
		fecha = fechaParte[2] +"-"+fechaParte[1] +"-"+fechaParte[0];
        
        label.setText("Esta ventana fue generada el "+fecha+" a las "+hora);
	}
}
