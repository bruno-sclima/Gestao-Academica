
public class App {

	 public static void main(String[] args) throws Exception {
	     
		 Disciplina disc = new Disciplina("LPM", 60);
		Matricula m1 = new Matricula(Situacao.CURSANDO,disc);
		Matricula m2 = new Matricula(Situacao.CURSANDO,disc);
		Historico h1 = new Historico();
		Historico h2 = new Historico();
		Aluno a1 = new Aluno(4, new Graduacao(), h1, "Bruno");
		Aluno a2 = new Aluno(5, new PosGraduacao(), h2, "Jorge");
		
		a1.addDisciplina(m1);
		a2.addDisciplina(m2);
		
		Atividade nova = new Atividade(25);
		Atividade nova2 = new Atividade(25);
		Atividade nova3 = new Atividade(25);
		Atividade nova4 = new Atividade(25);
		
		Atividade nova8 = new Atividade(25);
		Atividade nova5 = new Atividade(25);
		Atividade nova6 = new Atividade(25);
		Atividade nova7 = new Atividade(25);
		
		m1.addAtividade(nova);
		m1.addAtividade(nova2);
		m1.addAtividade(nova3);
		m1.addAtividade(nova4);
		m2.addAtividade(nova8);
		m2.addAtividade(nova5);
		m2.addAtividade(nova6);
		m2.addAtividade(nova7);
		
		
		nova.lancarNota(14);
		nova2.lancarNota(21);
		nova3.lancarNota(21);
		nova4.lancarNota(13);
		
		nova8.lancarNota(14);
		nova5.lancarNota(21);
		nova6.lancarNota(21);
		nova7.lancarNota(13);
		
		m2.fecharSemestre();
		m1.fecharSemestre();
		
		System.out.println(a1.aprovado("LPM"));
		System.out.println(a2.aprovado("LPM"));
		
		
		
		
		
	    }
}
