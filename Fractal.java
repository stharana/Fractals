
import java.awt.*; /* java abstract window toolkit */
import java.awt.event.*; 
import javax.swing.*;
import java.awt.geom.Line2D;
import java.util.Random;
/**
 *
 * @author StharanaS
 */
public class Fractal extends JPanel{
    
    private int width, height; 
    
	/*default minimum and maximum real number
     *default minimum and maxium comoke number
     *are assigend here
     */
    double x_min = -1;
    double x_max = 1;
    double y_min = -1;
    double y_max = 1;

    int maxIteration = 1000; //default max iterations
    
    public Fractal(int width, int height) {
	this.width  = width; 
	this.height = height; 
	setPreferredSize(new Dimension(width,height));
    }
    
    protected static void printPoint(Graphics2D frame, Color c, Point p) {

	frame.setColor(c); 
	frame.draw(new Line2D.Double(p.getX(), p.getY(), p.getX(), p.getY())); 
    }
     
     public void paintComponent(Graphics g) { 
	
		super.paintComponent(g); 
     }
    
     public static void main(String [] args) { 
     
         JFrame frame = new JFrame("Fractal");
         
         if(args[0].equals("Mandelbrot")){
				frame.setTitle("Mandelbrot");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
                try{
					frame.setContentPane(new Mandelbrot(800,800,Double.parseDouble(args[1]),Double.parseDouble(args[2]),Double.parseDouble(args[3]),Double.parseDouble(args[4]),Integer.parseInt(args[5]))); 
				}catch(ArrayIndexOutOfBoundsException e1){
					try{
						frame.setContentPane(new Mandelbrot(800,800,Double.parseDouble(args[1]),Double.parseDouble(args[2]),Double.parseDouble(args[3]),Double.parseDouble(args[4]))); 
					}catch(ArrayIndexOutOfBoundsException e2){
						frame.setContentPane(new Mandelbrot(800,800));
					}
				}   
         }
         
         if(args[0].equals("Julia")){
				frame.setTitle("Julia");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
                try{
				frame.setContentPane(new Julia(800,800,Double.parseDouble(args[1]),Double.parseDouble(args[2]),Integer.parseInt(args[3]))); 
				}catch(ArrayIndexOutOfBoundsException e1){
					try{
						frame.setContentPane(new Julia(800,800,Double.parseDouble(args[1]),Double.parseDouble(args[2]))); 
					}catch(ArrayIndexOutOfBoundsException e2){
						frame.setContentPane(new Julia(800,800));
					}
				}
         }
         
    frame.pack(); 
	frame.setLocationRelativeTo(null); 
	frame.setVisible(true); 
     }
}
