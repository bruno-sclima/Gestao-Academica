import java.util.ArrayList;
import java.util.List;

public class Matricula {
	private Disciplina disciplina;
	private Situacao situacao;
	private List<Atividade> atividades;
	
	public double notaFinal() {
		double notaF = 0;
		for(Atividade ativ : atividades ) {
			notaF += ativ.getNota();
		}
		return notaF;
	}
	public void lancarNota(int avaliacao, double nota) throws ExcecaoNotaInvalida {
		atividades.get(avaliacao).lancarNota(nota);
		
	}
	public boolean fecharSemestre() {
		boolean fecha = false;
		int aux = this.sumValAtividades();
		if(aux == 100) {
			fecha = true;
		}
		return fecha;
		
	}
	private int sumValAtividades() {
		int sum=0;
		for(Atividade a : atividades) {
			sum += a.getValor();
		}
		return sum;
	}
	public void addAtividade(Atividade nova) throws ExcecaoAtividades {
		int sum = this.sumValAtividades();
		if( sum + nova.getValor() <= 100) {
			atividades.add(nova); 
		}
		else throw new ExcecaoAtividades(nova.getValor());
	}
	public Matricula(Situacao situ, Disciplina disciplina){
		atividades = new ArrayList<Atividade>();
		this.setSituacao(situ);
		this.setDisciplina(disciplina);
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public Situacao getSituacao() {
		return situacao;
	}
	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
	public List<Atividade> getAtividades() {
		return atividades;
	}
	

	
}
