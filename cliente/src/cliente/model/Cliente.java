package cliente.model;

public class Cliente {
	
	
	
private String nome;	
private String sexo;
private int cep;
private int idade;
private  String religiao;
public Cliente(String nome, String sexo, int cep, int idade, String religiao) {
	
	this.nome = nome;
	this.sexo = sexo;
	this.cep = cep;
	this.idade = idade;
	this.religiao = religiao;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getSexo() {
	return sexo;
}
public void setSexo(String sexo) {
	this.sexo = sexo;
}
public int getCep() {
	return cep;
}
public void setCep(int cep) {
	this.cep = cep;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public String getReligiao() {
	return religiao;
}
public void setReligiao(String religiao) {
	this.religiao = religiao;
}	
	

public void visualizar() {
	
	System.out.println("\n*****************");
	System.out.println("DADOS DO CLIENTE");
	System.out.println("\n*****************");
	System.out.println("\nNome: " + getNome());
	System.out.println("\nSexo: "+ getSexo());
	System.out.println("\nCEP "+ getCep());
	System.out.println("\nIdade "+ getIdade());
	System.out.println("\nReligiao "+ getReligiao());
}





}
