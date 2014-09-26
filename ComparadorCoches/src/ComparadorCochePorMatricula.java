import java.util.Comparator;

public class ComparadorCochePorMatricula implements Comparator<Coche> {

	@Override
	public int compare(Coche c1, Coche c2) {
		return c1.getMatricula().compareTo(c2.getMatricula());
	}

}
