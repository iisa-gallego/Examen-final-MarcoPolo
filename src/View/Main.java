package View;

import Controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet {

	private Controller controller;

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}

	public void settings() {
		size(500, 500);
	}

	public void setup() {
		controller = new Controller(this);
	}

	public void draw() {
		background(88, 24, 69);
		
		controller.draw();

	}
}
