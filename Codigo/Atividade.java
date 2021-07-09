
public class Atividade {

	 private static final int MAX_VALOR = 30;
	    private int valor;
	    private double nota;
	   
	    
	    public int getValor() {
	        return valor;
	    }
	    
	    public void setValor(int valor) throws ExcecaoAtividades {
	        if(valor>=1 && valor<=MAX_VALOR ) {
	            this.valor = valor;  
	        }
	        else throw new ExcecaoAtividades(valor);
	    }

	    public double getNota() {
	        return nota;
	    }
	    
	    public void lancarNota(double nota) throws ExcecaoNotaInvalida {
	        if(nota>=0 && nota<=this.valor) {
	            this.nota = nota;
	            }
	        else throw new ExcecaoNotaInvalida(nota,this.valor);
	    }

		public Atividade(int valor) throws ExcecaoAtividades {
			
			this.setValor(valor);
			
		}
	    
	    
}
