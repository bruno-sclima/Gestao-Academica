
public class Graduacao implements IAcademico{

	@Override
	public boolean aprovado(Matricula materia) {
		boolean is = false;
		if(materia.notaFinal() >= 60) {
			materia.setSituacao(Situacao.APROVADO);
			is = true;
			
		}
		else {
			materia.setSituacao(Situacao.REPROVADO);
		}
		return is;
	}
	
	@Override
	public int creditos(Matricula materia) {
		int horas = materia.getDisciplina().getCargaHoraria();
		int creditos = horas / 60;
		return creditos;
	}

}
