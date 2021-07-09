import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private int matricula;
	private IAcademico nivel;
	private List<Matricula> disciplinas;
	private Historico historico;
	public String nome;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public IAcademico getNivel() {
		return nivel;
	}
	public void setNivel(IAcademico nivel) {
		this.nivel = nivel;
	}
	public List<Matricula> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Matricula> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public Historico getHistorico() {
		return historico;
	}
	public void setHistorico(Historico historico) {
		this.historico = historico;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Aluno(int matricula, IAcademico nivel, Historico historico, String nome) {
		this.setMatricula(matricula);
		this.setNivel( nivel);
		this.disciplinas = new ArrayList<Matricula>();
		this.setHistorico(historico);
		this.setNome(nome);
	}
	public void addDisciplina(Matricula mat) {
		disciplinas.add(mat);
	}
	public void removeDisciplina() {
		disciplinas.remove(0);
	}
	
	public int getCreditos() {
		int creditos =0;
		for(Matricula d : disciplinas) {
			creditos += nivel.creditos(d);
		}
		return creditos;
	}
	public boolean formado() {
		boolean is = false;
		int creditos = this.getCreditos();
		if(this.nivel instanceof Graduacao) {
			if(creditos >=50) {
				is = true;
			}
		}
		else if(this.nivel instanceof PosGraduacao) {
			if(creditos >= 20) {
				is = true;
			}
		}
		return is;
	}
	public boolean aprovado(String nomeDisc) {
		boolean is = false;
		for(Matricula d : disciplinas) {
			if(d.getDisciplina().getNome().equals(nomeDisc)) {
				if(d.fecharSemestre()) {
				if(nivel.aprovado(d)) {
					is = true;
					
				}
				}
			}
		}
		return is;
	}
	public String imprimirHistorico() {
		
		return this.historico.toString();
	}
	
	
	
}
