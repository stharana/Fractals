
import java.awt.*; /* java abstract window toolkit */
import java.awt.event.*; 
import javax.swing.*;
import java.awt.geom.Line2D;


/**
 *
 * @author StharanaS
 */
public class Julia extends Fractal {
	private double real = -0.4;
	private double complex = 0.6;
    
    public Julia(int width,int height,double real,double complex,int maxIteration) { 
    
        super(width,height);
		this.real=real;
		this.complex=complex;
		this.maxIteration=maxIteration;
    }
     public Julia(int width,int height,double real,double complex) { 
    
        super(width,height);
		this.real=real;
		this.complex=complex;		
    }
    
    public Julia(int width, int height){
		super(width,height);
    }
   public void paintComponent(Graphics g) { 
   super.paintComponent(g);  
   
   for(int x=0;x<799;x++){
   
       for(int y=0;y<799;y++){
       
           Point p= new Point(x,y);
                    
		    double z0Real = (x-400)*((x_max-x_min)/800)+((x_max+x_min)/2);
		    double z0Complex = (y-400)*((y_max-y_min)/800)+((y_max+y_min)/2);
                    
           int i=0;  
           
           for (i=0;(z0Real*z0Real+z0Complex*z0Complex)<=4 && i < maxIteration;i++){
               
               double z0RealTemp= (z0Real*z0Real-z0Complex*z0Complex)+real;
		       z0Complex=2*z0Real*z0Complex+complex;
		       z0Real=z0RealTemp;      
           }
           
           
          if(i<maxIteration){
          
              float[] hsb=new float[3];
              
              if (i==1){
                 hsb = Color.RGBtoHSB(6,0,125, hsb);
		 
              }
              else if (i==2){
                 hsb = Color.RGBtoHSB(27,15,255, hsb);
		 
              }
              else if (i==3){
                 hsb = Color.RGBtoHSB(9,73,223, hsb);
		 
              }
              else if (i==4){
                 hsb = Color.RGBtoHSB(55,63,248, hsb);
		 
              }
              else if (i==5){
                  hsb = Color.RGBtoHSB(147,152,255, hsb);
                  
              }
              else if (i==6){
                 hsb = Color.RGBtoHSB(0,121,0, hsb);
		 
              }
              else if (i==7){
                 hsb = Color.RGBtoHSB(0,198,5, hsb);
		 
              }
              else if (i==8){
                  hsb = Color.RGBtoHSB(35,252,255, hsb);
                  
              }
              else if (i==9){
                 hsb = Color.RGBtoHSB(5,209,209, hsb);
		 
              }
              else if (i==10){
                 hsb = Color.RGBtoHSB(148,252,252, hsb);
		 
              }
              else if (i>10 && i<20){
                 hsb = Color.RGBtoHSB(170,170,170, hsb);
		 
              }
              else if (i>10 && i<30){
                 hsb = Color.RGBtoHSB(125,125,125, hsb);
                 
              }
              else if (i>10 && i<40){
                 hsb = Color.RGBtoHSB(80,80,80, hsb);
		 
              }
              else if (i>10 && i<50){
                hsb = Color.RGBtoHSB(50,50,50, hsb);
		
              }
              else if (i>10 && i<100){
                hsb = Color.RGBtoHSB(0,0,0, hsb);
		
              }
              else if (i>10 && i<200){
                hsb = Color.RGBtoHSB(50,0,0, hsb);
		
              }
              else if (i>10 && i<300){
                 hsb = Color.RGBtoHSB(60,0,0, hsb);
		 
              }
              else if (i>10 && i<400){
                hsb = Color.RGBtoHSB(100,0,0, hsb);
		
              }
              else if (i>10 && i<500){
                hsb = Color.RGBtoHSB(110,0,0, hsb);
		
              }
              else if (i>10 && i<600){
                hsb = Color.RGBtoHSB(120,0,0, hsb);
	
              }
              else if (i>10 && i<700){
                hsb = Color.RGBtoHSB(140,0,0, hsb);
		
              }
              else if (i>10 && i<800){
                hsb = Color.RGBtoHSB(150,0,0, hsb);
		
              }
              else if (i>10 && i<900){
                hsb = Color.RGBtoHSB(160,0,0, hsb);
		
              }
              else if (i>10 && i<1000){
                hsb = Color.RGBtoHSB(170,0,0, hsb);
	
              }
              
              printPoint((Graphics2D)g, Color.getHSBColor(hsb[0], hsb[1], hsb[2]), p);
          
          }
          else{
            printPoint((Graphics2D)g, Color.BLACK, p);
             }
       
       }
       int y=0;
   
   }
   
   
   
   
   } 
    
    
    
}
