import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class MissileEntity extends Entity {

    public void draw(Graphics2D g){
        if(missile != null && missile.getActive()){
            missile.draw(g);   
        }
        super.draw(g);
    }
    
    public void draw(Graphics2D g){
        if(missile != null && missile.getActive()){
            missile.draw(g);   
        }
        super.draw(g);
    }
    
    public boolean tryToFire(){
        if(missile == null || !missile.getActive()){
            missile = new MissileEntity(new 
             ImageIcon("images/missile.png").getImage(), xPos+13, yPos, 10);
            missile.setActive(true);
            return true;
        }else
            return false;
    }
	
    public MissileEntity(Image image, double xPos, double yPos, int speed) {
        super(image, xPos, yPos, speed);
        dy = -1;
        this.setActive(false);
    }

    @Override
    public void move(long deltaTime) {
        yPos += dy*(deltaTime/1000000000.0)*speed;
    }
    
    public MissileEntity missile = null;
    
}
