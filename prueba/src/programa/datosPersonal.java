package programa;

import java.awt.FlowLayout; 
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class datosPersonal extends JFrame{

private JPanel panelAux,panelAux1,paneldatosPersona,paneldatosRegistro;
private JLabel lbldatosPersona,lbldatosper,lblcedula,lblnombre,lblsexo, lblcasado; 
private JTextField txtcedula,txtnombre; 
private JRadioButton RbtnSi,RbtnNo;
private JButton btnguardar, btncerrar;
private JComboBox combosexo;

public datosPersonal(){

    lbldatosPersona=new JLabel("Datos de Personas:");
    lblcedula=new JLabel ("Cedula:");
    lblnombre=new JLabel ("Nombre:");

    lblsexo=new JLabel ("Sexo:");

    lblcasado=new JLabel ("Casado:");

    txtcedula=new JTextField(8);
    txtnombre=new JTextField(20);

    RbtnSi=new JRadioButton("Si");
    RbtnNo=new JRadioButton("No");
    btnguardar=new JButton("Guardar");

    btncerrar=new JButton("Cerrar");


    String[] sexo={"Masculino","Femenino"};
    combosexo = new JComboBox(sexo);

    paneldatosPersona=new JPanel(new GridLayout(6,1));
    paneldatosPersona.add(lbldatosPersona);

    panelAux=new JPanel(new FlowLayout());
    panelAux.add(lblcedula);
    panelAux.add(txtcedula);
    panelAux.add(lblnombre);
    panelAux.add(txtnombre);


    paneldatosPersona.add(panelAux);


    panelAux=new JPanel(new FlowLayout());


    panelAux.add(lblsexo);
    panelAux.add(combosexo);

    paneldatosPersona.add(panelAux);

    panelAux=new JPanel(new FlowLayout());

    panelAux.add(lblcasado);
    panelAux.add(RbtnSi);
    panelAux.add(RbtnNo);

    paneldatosPersona.add(panelAux);

    panelAux=new JPanel(new FlowLayout());


    paneldatosPersona.add(panelAux);

    panelAux=new JPanel(new FlowLayout());
    panelAux.add(btnguardar);

    panelAux.add(btncerrar);

    paneldatosPersona.add(panelAux);


    this.add(paneldatosPersona);
    this.pack();
    this.setLocationRelativeTo(null);
    this.setVisible(true);
}

public static void main(String[] args) {
	new datosPersonal();
}
	}