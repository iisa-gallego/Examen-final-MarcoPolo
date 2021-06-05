package Model;
import java.util.ArrayList;
//import Model.Marco;
import processing.core.PApplet;

public class Logic {

	PApplet app;
	Marco marco;
	private ArrayList<Polo> Polos;
	private float MinDist; //Distancia Minima
	private float IniDist; //Distancia Inicial
	private int PoloIndex; // Es para guardar i

	public Logic(PApplet app) {
      marco= new Marco(app, 250, 250, 2);
      Polos = new ArrayList<Polo>();
      IniDist = 500;
      
      for (int i = 0; i < 20; i++) {
			int posX = (int) app.random(30,470 );
			int posY = (int) app.random(30,470);

			Polos.add(new Polo(posX, posY, app, 1));
      }
      
	}
	public void draw(){
		  marco.paint();
		  marco.move();
		  
		  for (Polo Polos : Polos) {
				Polos.paint();
				new Thread(Polos).start(); //llamada al método run de Polo
		  }	
		  
		  for (int i = 0; i < Polos.size(); i++) {
			 MinDist = app.dist(Polos.get(i).getPosX(), Polos.get(i).getPosY() , marco.getPosX(), marco.getPosY());
			if (MinDist < IniDist) {
				IniDist = MinDist;
				PoloIndex = i; //este i, indica el polo más cercano 
			}
		}
		  
		marco.setDirX(Polos.get(PoloIndex).getPosX()-marco.getPosX());			
		 marco.setDirY(Polos.get(PoloIndex).getPosY()-marco.getPosY());
	}
}
