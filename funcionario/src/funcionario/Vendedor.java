package funcionario;

public class Vendedor extends Funcionario {

	
	
	private float comissao;
	public Vendedor(String nome, String cargo, String nivel, String empresa, float salario,float comissao) {
		super(nome, cargo, nivel, empresa, salario);
		this.comissao = comissao;
	}
	public float getComissao() {
		return comissao;
	}
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	 public void visualizar() {
		 super.visualizar();
		  System.out.println("\nComissão recebida : " + getComissao());
	} 
	
	
	
	
	
	

}
