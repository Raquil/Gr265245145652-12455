package Processus;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PI extends JButton{

	private int Id_PI;
	private float Abscisse;
	private float Ordonee;
	private String ImagePI;
	private String Libelle;
	private String TexteCourt;
	private String Description;
	private JPanel panel;
	
	public PI(){
		try {
			Image img = ImageIO.read(getClass().getResource("Poibleu.png"));
		    this.setIcon(new ImageIcon(img));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    this.addMouseListener(new MouseListener()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	Consulter_PI();
	        }
	        public void mousePressed(MouseEvent e) {}
	        public void mouseReleased(MouseEvent e) {}
	        public void mouseEntered(MouseEvent e) {}
	        public void mouseExited(MouseEvent e) {}
	    });
	}
	
	public void setId_PI(int Id_PI){
		this.Id_PI = Id_PI;
	}
	public int getId_PI(){
		return Id_PI;
	}
	public void setAbscisse(float Abscisse){
		this.Abscisse = Abscisse;
	}
	public float getAbscisse(){
		return Abscisse;
	}
	public void setpanel(JPanel panel){
		this.panel = panel;
	}
	public JPanel getpanel(){
		return panel;
	}
	public void setOrdonee(float Ordonee){
		this.Ordonee = Ordonee;
	}
	public float getOrdonee(){
		return Ordonee;
	}
	public void setImage(String ImagePI){
		this.ImagePI = ImagePI;
	}
	public String getImage(){
		return ImagePI;
	}
	public void setLibelle(String Libelle){
		this.Libelle = Libelle;
	}
	public String getLibelle(){
		return Libelle;
	}
	public void setTexteCourt(String TexteCourt){
		this.TexteCourt = TexteCourt;
	}
	public String getTexteCourt(){
		return TexteCourt;
	}
	public void setDescription(String Description){
		this.Description = Description;
	}
	public String getDescription(){
		return Description;
	}
	
	public void Consulter_PI(){
		this.panel = new JPanel();
		
		
	}
	
	public void Ajouter_PI(){
		
	}
	
	public void Supprimer_PI(){
		
	}
	
	public void Modifier_PI(){
		
	}
}