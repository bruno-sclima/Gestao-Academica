
public class ExcecaoHistorico extends Exception{

	private static final long serialVersionUID = 1L;
	
	public ExcecaoHistorico(Situacao s) {
		super("A disciplina nao pode ser adicionada pois a materia esta com situacao"+ s);
	}

}
