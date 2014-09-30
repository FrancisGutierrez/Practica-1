import java.util.ArrayList;
import java.util.Collections;


public class Comparador {
	public static void main(String[]args){
		Coche c1 = new Coche("4590-GNN", 1990, 90);
		Coche c2 = new Coche("3218-UDE", 3000, 200);
		Coche c3 = new Coche("8675-OIF", 900, 50);
		Coche c4 = new Coche("6952-HGF", 8000, 950);
						
		ArrayList<Coche> list = new ArrayList<Coche>();
		
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		
		Collections.shuffle(list);
		System.out.println("Lista de Coches");
		System.out.println(list);
		
		Collections.sort(list, new ComparadorCochePorCilindrada());
		System.out.println("Lista de Coches ordenada por Cilindrada");
		System.out.println(list);
		Collections.sort(list, new ComparadorCochePorCaballos());
		System.out.println("Lista de Coches ordenada por Caballos");
		System.out.println(list);
		Collections.sort(list, new ComparadorCochePorMatricula());
		System.out.println("Lista de Coches ordenada por Matricula");
		System.out.println(list);
	}
}
