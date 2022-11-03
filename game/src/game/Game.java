package game;

public class Game {
	
	
	
	private String xbox;
	private String play5;
	private String nitendo;
	private String CadeiraGamer;
	private String RTX3070;
	public Game(String xbox, String play5, String nitendo, String cadeiraGamer, String rTX3070) {
		
		this.xbox = xbox;
		this.play5 = play5;
		this.nitendo = nitendo;
		CadeiraGamer = cadeiraGamer;
		RTX3070 = rTX3070;
		
		
		
	}
	public String getXbox() {
		return xbox;
	}
	public void setXbox(String xbox) {
		this.xbox = xbox;
	}
	public String getPlay5() {
		return play5;
	}
	public void setPlay5(String play5) {
		this.play5 = play5;
	}
	public String getNitendo() {
		return nitendo;
	}
	public void setNitendo(String nitendo) {
		this.nitendo = nitendo;
	}
	public String getCadeiraGamer() {
		return CadeiraGamer;
	}
	public void setCadeiraGamer(String cadeiraGamer) {
		CadeiraGamer = cadeiraGamer;
	}
	public String getRTX3070() {
		return RTX3070;
	}
	public void setRTX3070(String rTX3070) {
		RTX3070 = rTX3070;
	}
	

	public void visualizar() {
		
		System.out.println("\n --------------------- MUNDO GEEK----------");
		System.out.println("\n ----PRODUTOS EM OFERTA ----");
		System.out.println("\nVIDEO GAMES com 50% de desconto: " + getXbox() );
		System.out.println("\nVIDEO GAMES com 30% de desconto: " + getPlay5() );
		System.out.println("\nVIDEO GAMES com 20% de desconto: " + getNitendo() );
		System.out.println("\nCadeiras: " + getCadeiraGamer());
		System.out.println("\nPlacas de Video: " + getRTX3070());
		
		
	}
	
	
}
