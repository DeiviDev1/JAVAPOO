package funcionario;

public class Gerente extends Funcionario{
	
     private String experiencia;
	public Gerente(String nome, String cargo, String nivel, String empresa, float salario, String experiencia) {
		super(nome, cargo, nivel, empresa, salario);
		this.experiencia = experiencia;
			
		
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	
	
     public void visualizar() {
		 super.visualizar();
		  System.out.println("\nTempo de experiencia : " + getExperiencia());
	} 
	

}
