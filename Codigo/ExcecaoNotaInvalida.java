
public class ExcecaoNotaInvalida extends Exception{

	
	private static final long serialVersionUID = 1L;
	public ExcecaoNotaInvalida(double nota,int val) {
		super("A nota "+ nota+" nao pode ser adicionada na atividade de valor:"+ val);
	}

}
