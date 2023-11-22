package graphics;

/**
 *
 * @author Héctor Quej Cosgaya
 * @author Jose Aguilar Canepa
 * 
 * ¡Esta clase necesita tu ayuda!
 */
public class Triangulo extends FiguraGrafica {

	private	int[]x = {50, 15, 85};
	private	int[]y = {15, 65, 65};
	
	@Override
	public void dibujar(Graphics g) {
		g.drawPolygon(x,y,3);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void encojer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void agrandar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cambiarColor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}
    
}
