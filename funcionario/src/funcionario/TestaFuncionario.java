package funcionario;



public class TestaFuncionario {

	public static void main(String[] args) {
		
		
	Funcionario c1 = new Funcionario("Deivison Rocha", "Developer","JUNIOR","MELI", 10000f);
		c1.visualizar();
	
	Gerente c2 = new Gerente("Deivion","Gerente","SENIOR","MELI",50000f,"5 ANOS ATUANDO NA AREA");
		c2.visualizar();
		
	Vendedor c3 = new Vendedor ( "Deivion","Vendedor","não definido","MELI",50000f,1000f );	
		c3.visualizar();
		
		
	}

}
