package funcionario;

public class Funcionario {

	
	
	private String nome;
	private String cargo;
	private String nivel;
	private String empresa;
	private float salario;
	public Funcionario(String nome, String cargo, String nivel, String empresa, float salario) {
		
		this.nome = nome;
		this.cargo = cargo;
		this.nivel = nivel;
		this.empresa = empresa;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}

	
	public void visualizar() {
		
		System.out.println("\n ------------**************-------------");
		System.out.println("\nDados do funcionario");
		System.out.println("\nNome: " + getNome());
		System.out.println("\nCargo: " + getCargo());
		System.out.println("\nNivel: "+getNivel());
		System.out.println("\nEmpresa: "+getEmpresa());
		System.out.println("\nSalario: "+getSalario());
		System.out.println("\n *****************************************");
		
		
	}
	
	
	
	
	
	
	
}
