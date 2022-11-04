package game;

public class Console extends Game{
	
	
     private String novoConsole;
	public Console(String xbox, String play5, String nitendo, String cadeiraGamer, String rTX3070, String novoConsole) {
		super(xbox, play5, nitendo, cadeiraGamer, rTX3070);
		this.novoConsole = novoConsole;
	}
	
	public String getNovoConsole() {
		return novoConsole;
	}
	public void setNovoConsole(String novoConsole) {
		this.novoConsole = novoConsole;
	}
	
	public void visualizar() {
		 super.visualizar();
		  System.out.println("\nNovo VideoGame : " + getNovoConsole());
	} 
	
	
	
	

}
