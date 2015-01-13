package PistaHorizontal;

import java.awt.Image;

import javax.swing.ImageIcon;

import Pista.Pista;

public class PistaHorizontal extends Pista {
	double x;
	double y;
	double w;
	double h;
	double limiteSup;
	double limiteInf;
	ImageIcon pista;
	
	public PistaHorizontal(double x, double y, double w, double h){	
		this.x = x*w;
		this.y=y*w;
		this.w=w;
		this.h=h;
		this.limiteSup=this.y+this.h*60/300+5;
		this.limiteInf=this.y+this.h*240/300-20;
		this.pista= new ImageIcon("src/jeuControleur/horizontal2.png");
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	public double getLimiteSup(){
		return limiteSup;
		
	}
	public double getLimiteInf(){
		return limiteInf;
	}
	public ImageIcon getPista(){
		return pista;
	}
	public Image getImage(){
		return pista.getImage();
	}
	public boolean testeColisao(double x, double y){
		if ((y<=limiteSup)||(y>=limiteInf)){
			return true;
		} else{
			return false;
		}
	}
	public String tipo(){
		return "pistaHorizontal";
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
		if((this.x<x)&&(x<=(this.x+this.w))&&(this.y<y)&&(y<=(this.y+this.h))){
			pertence= true;
		}
		return pertence;
	}
}
