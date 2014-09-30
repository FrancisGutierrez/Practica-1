import java.util.Comparator;

public class ComparadorCochePorCaballos implements Comparator<Coche> {
		
		public int compare(Coche c1, Coche c2) {
			return c1.getCaballos()-c2.getCaballos();
		}
		// comentario eclipse B
}
