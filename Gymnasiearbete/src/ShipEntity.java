import java.awt.Image;

public class ShipEntity extends Entity{

 	public ShipEntity (Image image, double xPos, double yPos, int speed){
      	super(image, xPos, yPos, speed);
 	}
 
 	public void move(long deltaTime){
 	    xPos += dx*(deltaTime/1000000000.0)*speed;
 	}


}