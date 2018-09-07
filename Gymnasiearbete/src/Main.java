import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Main extends JFrame implements KeyListener{

	  private boolean gameRunning = true;

	    public Main(){
	        addKeyListener(this);
	        gameLoop();
	    }

	    public void update(){
	    }

	    public void render(){
	    }

	    public void gameLoop(){
	        while(gameRunning){
	            update();
	            render();
	            
	            try {
	        	    Thread.sleep(10);
	               } catch (InterruptedException e) {}

	        }
	    }


		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
}