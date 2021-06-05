package Model;
import java.util.ArrayList;
//import Model.Marco;
import processing.core.PApplet;

public class Logic {

	PApplet app;
	Marco marco;
	private ArrayList<Polo> Polos;

	public Logic(PApplet app) {
      marco= new Marco(app, 250, 250);
      Polos = new ArrayList<Polo>();
      
      for (int i = 0; i < 20; i++) {
			int posX = (int) app.random(30,470 );
			int posY = (int) app.random(30,470);

			Polos.add(new Polo(posX, posY, app));
			
			
      }
	}
	public void draw(){
		  marco.paint();
		  marco.move();
		  
		  for (Polo Polos : Polos) {
				Polos.paint();
				new Thread(Polos).start(); //llamada al método run de Polo

		  }	
	}
}
