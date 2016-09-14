package pucrs.facin.comp_grafica.trabalho01;

import java.awt.Point;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class Vivente {
	private final int id;
	private static int contadeiro = 0;
	private SortedMap<Integer,Point> movimentos;
	
	public Vivente() {		
		contadeiro++;
		id = contadeiro;
		movimentos = new TreeMap<Integer,Point>(); 
	}
	
	public void addMovimento(int x, int y, int tempo) {
		movimentos.put(tempo, new Point(x, y));
	}
	
	public SortedMap<Integer,Point> getMovimentos() {
		return movimentos;
	}
	
	public String toString(){
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("Vivente " + id + "\n");
		for(Entry<Integer,Point> tupla : movimentos.entrySet()) {
			buffer.append(tupla.getKey() + ": ");
			buffer.append(tupla.getValue().getX() + "," + tupla.getValue().getY());
			buffer.append('\n');
		}
		
		return buffer.toString();
	}
}
