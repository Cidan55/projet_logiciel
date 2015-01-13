package PistaCurva;

import java.awt.Image;

import javax.swing.ImageIcon;

import Pista.Pista;

public class PistaCurva extends Pista{
		double x;
		double y;
		double cx;
		double cy;
		double limiteSup;
		double limiteInf;
		ImageIcon pista;
		String direitaInf= "direitaInf";
		String direitaSup="direitaSup";
		String esquerdaInf="esquerdaInf";
		String esquerdaSup="esquerdaSup";
		String curva;
		double Rm;
		double RM;
		double w;
		double h;
		
		public PistaCurva(double x, double y, double cx, double cy,double w, double h){	
			this.Rm=w*60/300-20;
			this.RM=w*240/300+40;
			this.cx=cx*w;
			this.cy=cy*w;
			this.x =x*w;
			this.y=y*w;
			this.h=h;
			this.w=w;
			if (this.cx==this.x&&this.cy==this.y){
				
				curva=direitaInf;
			}else if(this.cx==this.x&&this.cy==(this.y+this.h)){
				curva= direitaSup;
				
			}else if(this.cx==(this.x+this.w)&&this.cy==this.y){
				curva= esquerdaInf;
			}else if(this.cx==(this.x+this.w)&&this.cy==(this.y+this.h)){
				curva= esquerdaSup;
			}
			this.pista= new ImageIcon("src/jeuControleur/"+curva+"2.png");
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
		public boolean testeColisao(double xVoiture, double yVoiture){
			int equacao=((int)(xVoiture-this.cx)^2+(int)(yVoiture-this.cy)^2);
			
			if ((equacao<=((int)this.Rm^2))||(equacao>=((int)this.RM^2))){
				return true;
			} else{
				return false;
			}
		}
		public Image getImage(){
			return pista.getImage();
		}
		public String tipo(){
			return "pistaCurva";
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
			if((this.x<x)&&(x<=(this.y+this.x))&&(this.y<y)&&(y<=(this.y+this.x))){
				pertence= true;
			}
			return pertence;
		}
}
