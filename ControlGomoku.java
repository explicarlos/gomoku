// Control de juego para la clase Gomoku
// versión: 20240421
// Carlos Grasa Lambea

import javax.swing.*;
import java.util.ArrayList;

import static javax.swing.JOptionPane.showMessageDialog;

public interface ControlGomoku {

	// campos
	int marcaVacia=0; // marca de casilla vacía
	int marcaA=1; // marca de jugador A
	int marcaB=-1; // marca de jugador B

	int numFilas=15; // filas virtuales de la matriz de casillas
	int numColumnas=15; // columnas virtuales de la matriz de casillas
	int numCasillas=numFilas*numColumnas;

	java.awt.Color colorA=new java.awt.Color(204,255,153); // color usado por jugador A
	java.awt.Color colorB=new java.awt.Color(255,204,153); // color usado por jugador B
	ArrayList<JLabel> casillas=new ArrayList<>(); // matriz virtual de casillas
	int[] marcas=new int[numCasillas];

	// métodos
	default java.awt.Color getColorA() { // devuelve color de marca A
		return colorA;
	}
	default java.awt.Color getColorB() { // devuelve color de marca B
		return colorB;
	}
	default void vectorizarCasilla(javax.swing.JLabel casilla) { // añade casilla al vector de casillas
		casillas.add(casilla);
		return;
	}
	default ArrayList<JLabel> getCasillas() { // devuelve vector de casillas
		return casillas;
	}
	default JLabel getCasilla(int ordinal) { // devuelve una casilla del vector
		return casillas.get(ordinal);
	}
	default JLabel getCasilla(int fila, int columna) { // devuelve una casilla según coordenadas virtuales
		return getCasilla(filaColumnaToOrdinal(fila, columna));
	}
	default int filaColumnaToOrdinal(int fila, int columna) { // devuelve ordinal a partir de fila y columna
		return fila * numFilas + numColumnas;
	}
	default int ordinalToFila(int ordinal) { // devuelve fila a partir de ordinal
		return ordinal/numColumnas;
	}
	default int ordinalToColumna(int ordinal) { // devuelve fila a partir de ordinal
		return ordinal%numColumnas;
	}
	default int getMarca(int ordinal) { // devuelve marca de la casilla según ordinal
		return marcas[ordinal];
	}
	default int getMarca(int fila, int columna) { // devuelve marca de la casilla por coordenadas virtuales
		return marcas[filaColumnaToOrdinal(fila, columna)];
	}
	default void setMarca(int ordinal, int cualMarca) { // establece marca de la casilla por ordinal
		marcas[ordinal] = cualMarca;
		return;
	}
	default void setMarca(int fila, int columna, int cualMarca) { // establece marca de la casilla por número
		marcas[filaColumnaToOrdinal(fila, columna)]=cualMarca;
		return;
	}
	default void borrarMarcas() { // marcar casillas como vacías
		for (int n=0; n<numCasillas; n++)
			marcas[n]=marcaVacia;
		return;
	}
	default int getOrdinal(JLabel casilla) {
		return casillas.indexOf(casilla);
	}
}
