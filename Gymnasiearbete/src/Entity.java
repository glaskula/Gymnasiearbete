import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

public abstract class Entity {
	private Image image;
	private Rectangle rec = null;
	   
    protected double xPos, yPos;   // Positionen
   
    protected int speed;           // Hastighet i x- o y-led
   
    protected int dx = 0, dy = 0;  // Rörelseriktning
   
    private boolean active = true; // Gör alla nya objekt aktiva.
   
    /**
     * Konstruktor
     */
    public Entity (Image image, double xPos, double yPos, int speed){
     	this.image = image;   
     	this.xPos = xPos;
     	this.yPos = yPos;
     	this.speed = speed;
     	
     	rec = new Rectangle((int)xPos, (int)yPos, image.getWidth(null), 
                image.getHeight(null));
    }
    
    public Rectangle getRectangle(){
        rec.setLocation((int)xPos, (int)yPos);
        return rec;
    }
    
    public boolean collision(Entity entity){
        getRectangle(); // Uppdaterar positionen på den egna rektangeln
        return rec.intersects(entity.getRectangle());
    }
   
    /**
     * Ritar bilden på ytan g
     */
    public void draw(Graphics2D g) {
     	g.drawImage(image,(int)xPos,(int)yPos,null);
    }
    
   
    /**
     * Vilken riktning i x-led
     * @param dx 0 = stilla, 1 = höger, -1 = vänster
     */
    public void setDirectionX(int dx){
     	this.dx = dx;
    }
   
    /**
     * Vilken riktning i y-led
     * @param dy 0 = stilla, 1 = höger, -1 = vänster
     */
    public void setDirectionY(int dy){
     	this.dy = dy;
    }

    /**
     * Metod som gör förflyttningen, dvs ändrar xPos och yPos
     * Måste skaps i klasser som ärver entity
     */
    public abstract void move(long deltaTime);
}


