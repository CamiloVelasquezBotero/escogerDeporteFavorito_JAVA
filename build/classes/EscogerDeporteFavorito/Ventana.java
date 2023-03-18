
package EscogerDeporteFavorito;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ventana extends JFrame{
    private JPanel panel;
    private JLabel etiqueta, imagen;
    private JRadioButton b1, b2, b3, b4;
    
    public Ventana(){
        setTitle("Escoger Deporte Favorito");
        setSize(600, 400);
        setLocationRelativeTo(null);
        
        iniciarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void iniciarComponentes(){
        panel();
        radioBotones();
        colocarEtiqueta();
    }
    
    public void panel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    
    public void colocarEtiqueta(){
        etiqueta = new JLabel("Escoge tu deporte favorito:");
        etiqueta.setBounds(20, 20, 350, 80);
        etiqueta.setFont(new Font("cooper black", 3, 20));
        panel.add(etiqueta);
    }
    
    public void radioBotones(){
        b1 = new JRadioButton("FootBall");
        b1.setBounds(30, 120, 150, 50);
        b1.setFont(new Font("arial", 1, 20));
        panel.add(b1);
        b2 = new JRadioButton("Tenis");
        b2.setBounds(30, 170, 150, 50);
        b2.setFont(new Font("arial", 1, 20));
        panel.add(b2);
        b3 = new JRadioButton("BasckBall");
        b3.setBounds(30, 220, 150, 50);
        b3.setFont(new Font("arial", 1, 20));
        panel.add(b3);
        b4 = new JRadioButton("Natacion");
        b4.setBounds(30, 270, 150, 50);
        b4.setFont(new Font("arial", 1, 20));
        panel.add(b4);
        
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(b1);
        grupo.add(b2);
        grupo.add(b3);
        grupo.add(b4);
        
        eventoDeAccion();
    }
    
    public void eventoDeAccion(){
        imagen = new JLabel();
        imagen.setBounds(200, 100, 350, 210);
        panel.add(imagen);
        
        final ImageIcon imagenFootball = new ImageIcon(getClass().getResource("/Imagenes/football.jpg"));          
        final ImageIcon imagenBascketball = new ImageIcon(getClass().getResource("/Imagenes/bascketball.jpg")); 
        final ImageIcon imagenTenis = new ImageIcon(getClass().getResource("/Imagenes/tenis.jpg"));  
        final ImageIcon imagenNatacion= new ImageIcon(getClass().getResource("/Imagenes/natacion.jpg"));
               
        ActionListener eventoDeAccion1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setIcon(new ImageIcon(imagenFootball.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        b1.addActionListener(eventoDeAccion1);
               
        ActionListener eventoDeAccion2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setIcon(new ImageIcon(imagenTenis.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        b2.addActionListener(eventoDeAccion2);
                
        ActionListener eventoDeAccion3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setIcon(new ImageIcon(imagenBascketball.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        b3.addActionListener(eventoDeAccion3);
                 
        ActionListener eventoDeAccion4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setIcon(new ImageIcon(imagenNatacion.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        b4.addActionListener(eventoDeAccion4);
    }
}
