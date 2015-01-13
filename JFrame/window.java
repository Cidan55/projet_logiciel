package JFrame;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

import javax.swing.ImageIcon;
import javax.swing.JFrame; 
import criarPista.criarPista;

public class window extends JFrame implements KeyListener{
	 BufferedImage backBuffer; //cela est le buffer
	 //ImageIcon planoDeFundo = new ImageIcon("src/jeuControleur/map1.png");
	 criarPista pista= new criarPista( W,  H, backBuffer);
	 pista= pista.fazerPista();
	 int W=900;
	 int H=900;
	 
	public static void main(String args[])
	
	{
		
		window window= new window();
		window.inicializacao();
		window.desenharGraficos();
		
	}
	
	
	
	public void inicializacao() 
	
	{
	
		setTitle("~~Super`s Print~~");
		  setSize(W, H);
		  setResizable(false);
		  setDefaultCloseOperation(EXIT_ON_CLOSE);  
		  setLayout(null);
		  setVisible(true);
		  addKeyListener(this);
		  backBuffer = new BufferedImage(W, H, BufferedImage.TYPE_INT_RGB);//Cree le buffer image
		
	}
	
	public void desenharGraficos() 
	
	 {
		Graphics janela = getGraphics();
		Graphics graficos = backBuffer.getGraphics();
		//Ici on mettre les dessins sur la fenetre
		graficos.drawImage(ImagemPlanoDeFundo,0, 0, this);   
		
		janela.drawImage(backBuffer, 0, 0, this);
	
	 }


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
