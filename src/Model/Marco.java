package Model;

import processing.core.PApplet;

public class Marco implements Runnable {
	PApplet app;

	private int posX;
	private int posY;
	private final int tam = 60;
	private String sign;

	public Marco(PApplet app, int posX, int posY) {

		this.app = app;
		this.posX = posX;
		this.posY = posY;

	}

	public void run() { // Para poder usar el Hilo
		try {
			Thread.sleep(2000);
			searchSign();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	private void searchSign() {
		sign = "Marco Marco!";
		
	}

	public void paint() {
		app.fill(245, 227, 45);
		app.noStroke();
		app.ellipse(posX, posY, tam, tam);

	}
	
	public void move() {
		posX += app.random(-2, 1);
		posY += app.random(-2, 1);
		
		//if(dist )
	}

}
