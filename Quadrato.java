import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Quadrato implements ActionListener {
	//dichiarazione
	JFrame Finestra = new JFrame("Quadrato");//finestra dove viene contenuto il programma
	Container Contenitore = new Container();//area che si poggia sulla finestra
	JPanel Pannello = new JPanel();//il pannello è una sub area che suddivide ancora 
	JLabel lblLato = new JLabel("Lato");
	JLabel lblPerimetro = new JLabel("Perimetro");
	JLabel lblArea = new JLabel("Area");
	JLabel lblDiagonale= new JLabel("Diagonale");
	JTextField txtLato = new JTextField();
	JTextField txtPerimetro = new JTextField();
	JTextField txtArea = new JTextField();
	JTextField txtDiagonale = new JTextField();
	JButton btnCalcola = new JButton("Calcola");
	JButton btnAnnulla = new JButton("Annulla");
	
	GridLayout Griglia = new GridLayout(5,2,10,10);
	//fine dichiarazione
	
	public Quadrato() {
		Contenitore = Finestra.getContentPane();
		
		Contenitore.add(Pannello);
		
		Pannello.setLayout(Griglia);
		
		//oggetti grafici disposti sul pannello
		Pannello.add(lblLato);
		Pannello.add(txtLato);
		Pannello.add(lblPerimetro);
		Pannello.add(txtPerimetro);
		Pannello.add(lblArea);
		Pannello.add(txtArea);
		Pannello.add(lblDiagonale);
		Pannello.add(txtDiagonale);
		Pannello.add(btnCalcola);
		Pannello.add(btnAnnulla);
		
		Finestra.setSize(450,450);
		Finestra.setLocation(300,100);
		Finestra.setVisible(true);
		Finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Font tipoCarattere = new Font("TimesRoman", Font.PLAIN, 18);
		
		lblLato.setFont(tipoCarattere);
		lblLato.setHorizontalAlignment(JLabel.RIGHT);
		
		lblPerimetro.setFont(tipoCarattere);
		lblPerimetro.setForeground(Color.red);
		lblPerimetro.setHorizontalAlignment(JLabel.RIGHT);
		
		lblArea.setFont(tipoCarattere);
		lblArea.setForeground(Color.red);
		lblArea.setHorizontalAlignment(JLabel.RIGHT);
		
		lblDiagonale.setFont(tipoCarattere);
		lblDiagonale.setForeground(Color.red);
		lblDiagonale.setHorizontalAlignment(JLabel.RIGHT);
		
		txtPerimetro.setEditable(false);
		txtPerimetro.setBackground(Color.yellow);
		
		txtArea.setEditable(false);
		txtArea.setBackground(Color.yellow);
		
		txtDiagonale.setEditable(false);
		txtDiagonale.setBackground(Color.yellow);
		
		btnCalcola.setForeground(Color.white);
		btnAnnulla.setForeground(Color.white);
		
		btnCalcola.setBackground(Color.darkGray);
		btnAnnulla.setBackground(Color.darkGray);
		
		btnCalcola.addActionListener(this); 
		btnAnnulla.addActionListener(this);	
	}
	
	public void actionPerformed(ActionEvent evento) {
		
		String nomeBottone = evento.getActionCommand();
		String lato=txtLato.getText();
		Double perimetro;
		Double area;
		Double diagonale;
		if(nomeBottone.equals("Calcola")) {
			try {
				perimetro = Double.valueOf(lato)*4;
				area = Double.valueOf(lato)*Double.valueOf(lato);
				diagonale = Double.valueOf(lato)*1.414;
				txtPerimetro.setText(""+perimetro);
				txtArea.setText(""+area);
				txtDiagonale.setText(""+diagonale);
			}catch(Exception Eccezione){
				txtPerimetro.setText("Errore");
				txtArea.setText("Errore");
				txtDiagonale.setText("Errore");
			}
		}
		if(nomeBottone.equals("Annulla")) {
			txtLato.setText("");
			txtPerimetro.setText("");
			txtArea.setText("");
			txtDiagonale.setText("");
			txtLato.requestFocus();
		}
	}
	public static void main(String[] args) {
		Quadrato finestraQuadrato = new Quadrato();
	}

}