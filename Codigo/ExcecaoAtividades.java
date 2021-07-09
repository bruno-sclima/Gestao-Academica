
public class ExcecaoAtividades extends Exception{

	private static final long serialVersionUID = 1L;
	
	public ExcecaoAtividades(int val) {
		super("Atividade com valor "+ val+" nao pode ser adicionada");
	}

}
