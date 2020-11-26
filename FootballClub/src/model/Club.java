package model

public class Club{

	private int MAX_PLAYER = 25;
	//private int MAX_TRAINER=;
	//private int MAX_TR_ASSI=;

	//Atributes
	private String name;
	private String nit;
	private String fDate; //foundtation date

	//Relationships
	private Trainer[] trainer;
	private TrAssistant[] trAssistant;
	private Player[] player;

	public Club(String name, String nit, String fDate){
		this.name = name;
		this.nit = nit;
		this.fDate = fDate;
		trainer = new Trainer[2]; //
		trAssistant = new TrAssistant[2]; //
		player = new Player[MAX_PLAYER]
	}
}