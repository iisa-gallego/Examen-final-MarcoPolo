package Model;
import processing.core.PApplet;

	public class Polo implements Runnable {

		private int posX, posY;
		private final float tam = 30;
		private PApplet app;

		public Polo(int posX, int posY, PApplet app) {
			this.posX = posX;
			this.posY = posY;
			this.app = app;

		}

		public void paint() {
			app.fill(255, 87, 51);
			app.noStroke();
			app.ellipse(posX, posY, tam, tam);
		}

		public void move() {
			posX += app.random(-2, 1);
			posY += app.random(-2, 1);

		}
		
		/*public void bounce() {
			if() 
		}*/

		public void run() {
			move();
		}

}
