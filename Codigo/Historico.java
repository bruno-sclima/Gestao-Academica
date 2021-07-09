import java.util.HashSet;
import java.util.Set;

public class Historico {
    private Set<Matricula> disciplinas;
    
    public Historico(){
        this.disciplinas = new HashSet<Matricula>();
    }

    public boolean addMateria(Matricula aprovada) throws ExcecaoHistorico{
    	boolean a= false;
    	if(aprovada.getSituacao() == Situacao.APROVADO) {
       a = this.disciplinas.add(aprovada);
        }
    	else throw new ExcecaoHistorico(aprovada.getSituacao());
    	return a;
    }

	@Override
	public String toString() {
		return "Historico [disciplinas=" + disciplinas + "]";
	}
    
}