package Model;

import processing.core.PApplet;

public class Marco implements Runnable {
	PApplet app;

	private int posX;
	private int posY;
	private int dirX;
	private int dirY;
	private final int tam = 60;
	private int velocity;
	private String sign;

	public Marco(PApplet app, int posX, int posY, int velocity) {

		this.app = app;
		this.posX = posX;
		this.posY = posY;
		dirX = 1;
		dirY = 1;
		this.velocity = velocity;
		

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
		posX += dirX * velocity;
		posY += dirY * velocity;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getDirX() {
		return dirX;
	}

	public void setDirX(int dirX) {
		this.dirX = dirX;
	}

	public int getDirY() {
		return dirY;
	}

	public void setDirY(int dirY) {
		this.dirY = dirY;
	}

}
