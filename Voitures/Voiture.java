package Voitures;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Voiture {
	double xVoiture;
	 double yVoiture;
	 double wVoiture= 70;
	 double hVoiture= 40;
	 double vitesseVoiture=0;
	 double thetaVoiture=Math.toRadians(180);
	 boolean colisao=true;
	 ImageIcon voitureImageIcon;
	 Image voitureImage;
	 double cxVoiture=xVoiture+(wVoiture/2);
	 double cyVoiture=yVoiture+(hVoiture/2);
	 double sinal = 1;

	public Voiture(double posicaoX,double posicaoY,double tipo) {
		// TODO Auto-generated constructor stub
		this.xVoiture=posicaoX ;
		this.yVoiture=posicaoY ;
		if(tipo==1){
			this.voitureImageIcon = new ImageIcon("src/jeuControleur/car1.png");	
		}else if(tipo==2){
			this.voitureImageIcon = new ImageIcon("src/jeuControleur/car2.png");
		}else if(tipo==3){
			this.voitureImageIcon = new ImageIcon("src/jeuControleur/car3.png");
		}else if(tipo==4){
			this.voitureImageIcon = new ImageIcon("src/jeuControleur/car4.png");
		}
	this.voitureImage= voitureImageIcon.getImage();
	}
	
	public Image getImage(){
		return voitureImage;
	}
	public ImageIcon getImageIcon(){
		return voitureImageIcon;
	}
	public double getX(){
		return xVoiture;
	}
	public void setX(double x){
		xVoiture=x;
	}
	public double getY(){
		return yVoiture;
	}
	public void setY(double y){
		yVoiture=y;
	}
	public double getW(){
		return wVoiture;
	}
	public double getH(){
		return hVoiture;
	}
	public double getVitesse(){
		return vitesseVoiture;
	}
	public void setVitesse(double vitesse){
		vitesseVoiture=vitesse;
	}
	public void acellerate(){
		vitesseVoiture= vitesseVoiture + 0.2;
	}
	public void frenage(){
		vitesseVoiture=vitesseVoiture -0.3;
	}
	public double getTheta(){
		return thetaVoiture;
	}
	public void setTheta(double theta){
		thetaVoiture =theta;
	}
	public void turnLeft(){
		thetaVoiture= thetaVoiture+Math.toRadians(10);
	}
	public void turnRight(){
		thetaVoiture= thetaVoiture-Math.toRadians(10);
	}
	public double getCx(){
		return cxVoiture;
	}
	public double getCy(){
		return cyVoiture;
	}
	public void moveVoiture(double sinal){
		yVoiture= yVoiture+  sinal*vitesseVoiture*Math.sin(thetaVoiture);
		 xVoiture= xVoiture+ sinal*vitesseVoiture*Math.cos(thetaVoiture);
	}
	public void setSinal(double s){
		sinal=s;
	}

}
