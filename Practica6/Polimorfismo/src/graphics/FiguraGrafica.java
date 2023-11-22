package graphics;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author Héctor Quej Cosgaya
 * @author José Aguilar Canepa
 * 
 * @created 24/02/13 23:38
 * 
 * Esta clase representa una (muy mala) implementación de una figura
 * geométrica. Tu misión es aplicar con éxito los principios del Polimorfismo
 * que aprendiste anteriormente. ¡Suerte!
 */
public abstract class FiguraGrafica {
    
    protected String figura;
    
    public FiguraGrafica(){
        this("cuadrado");
    }
    
    public FiguraGrafica(String figura){
        this.figura = figura;
    }

    public abstract void dibujar(Graphics g);
    
    public abstract void encojer();
    
    public abstract void agrandar();
    
    public abstract void cambiarColor();

    public abstract void mover();
        // WTF?
        // Como muevo a un triangulo!!!???
        // Esto no estaba en mi contrato!!!
}
