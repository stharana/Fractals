
import java.awt.*; /* java abstract window toolkit */
import java.awt.event.*; 
import javax.swing.*;
import java.awt.geom.Line2D;


/**
 *
 * @author StharanaS
 */
public class Mandelbrot extends Fractal {
    
    public Mandelbrot(int width, int height, double x_min, double x_max, double y_min, double y_max, int maxIteration) { 
    
        super(width,height);
		this.x_min=x_min;
		this.x_max=x_max;
		this.y_min=y_min;
		this.y_max=y_max;
		this.maxIteration=maxIteration;
    }
    
    public Mandelbrot(int width, int height, double x_min, double x_max, double y_min, double y_max) { 
    
        super(width,height);
		this.x_min=x_min;
		this.x_max=x_max;
		this.y_min=y_min;
		this.y_max=y_max;
    }
    
    public Mandelbrot(int width, int height){
		super(width,height);
    }
   public void paintComponent(Graphics g) { 
   super.paintComponent(g); 
   
   
    
   
   for(int x=0;x<799;x++){
   
       for(int y=0;y<799;y++){
       
            Point p= new Point(x,y);
            double z0Real = 0;
		    double z0Complex = 0;
		    double real = (x-400)*((x_max-x_min)/800)+((x_max+x_min)/2);
		    double complex = (y-400)*((y_max-y_min)/800)+((y_max+y_min)/2);
                    
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
                 hsb = Color.RGBtoHSB(255,0,0, hsb);
		 
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
