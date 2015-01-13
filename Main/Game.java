package Main;

import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import criarPista.criarPista;
import JFrame.window;
public class Game {
int FPS=30;
int W=900;
int H=900;
int largura=W/4;
int altura=largura;

	
	public static void main(String[] args)

	{
		Game game=new Game();
				game.run();

	}

	public void run() {
		
		window window= new window();
		window.inicializacao();
		
		
		  while (true) {
			 // testeColisao();
		   window.desenharGraficos();
		    try {
		     Thread.sleep(1000/FPS); // cela fait le program attend pour 1000/FPS miliseconds
		    } catch (Exception e) {
		     System.out.println("Erreur");
		    }
		  }
		}
	public criarPista1(){
		BufferedImage buffer;
		 ImageIcon voiture1ImageIcon = new ImageIcon("src/jeuControleur/car1.png");
		
		for (int i=1;i<=4;i++){
			"pistaVertical"+i=
			for (int j=1;j<=4;i++){
				
			}
		}
	}
	
}

