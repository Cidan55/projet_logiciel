package PistaVertical;

import java.awt.Image;

import javax.swing.ImageIcon;

import Pista.Pista;

public class PistaVertical extends Pista {

	double x;
	double y;
	double w;
	double h;
	double limiteDir;
	double limiteEsq;
	ImageIcon pista;
	
	public PistaVertical(double x, double y, double w, double h){	
		this.x =x*w;
		this.y=y*w;
		this.w=w;
		this.h=h;
		this.limiteDir=this.x+this.w*240/300-20;
		this.limiteEsq=this.x+this.w*60/300;
		this.pista= new ImageIcon("src/jeuControleur/vertical2.png");
		
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	public double getlimiteDir(){
		return limiteDir;
		
	}
	public double getlimiteEsq(){
		return limiteEsq;
	}
	public ImageIcon getPista(){
		return pista;
	}
	public boolean testeColisao(double x, double y){
		if ((x<=limiteEsq)||(x>=limiteDir)){
			return true;
		}else{
			return false;
		}
	}
	public Image getImage(){
		return pista.getImage();
	}
	public String tipo(){
		return "pistaVertical";
	}
	public double getBoundX(){
		double boundX=this.x+this.w;
		return boundX;
	}
	public double getBoundY(){
		double boundY=this.y+this.h;
		return boundY;
	}
	public boolean pertence(double x, double y){
		boolean pertence=false;
		if((getX()<x)&&(x<=getBoundX())&&(getY()<y)&&(y<=getBoundY())){
			pertence= true;
		}
		return pertence;
	}
}


