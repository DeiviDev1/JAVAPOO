package game;

public class Jogo extends Game {

	private String nitendoSwitch;
	public Jogo(String xbox, String play5, String nitendo, String cadeiraGamer, String rTX3070, String nitendoSwitch) {
		super(xbox, play5, nitendo, cadeiraGamer, rTX3070);
		this.nitendoSwitch = nitendoSwitch;
			
	}
	public String getNitendoSwitch() {
		return nitendoSwitch;
	}
	public void setNitendoSwitch(String nitendoSwitch) {
		this.nitendoSwitch = nitendoSwitch;
	}
	 public void visualizar() {
		 super.visualizar();
		  System.out.println("\nNovo Console : " + getNitendoSwitch());
	} 
	
	
	
	
	
}
