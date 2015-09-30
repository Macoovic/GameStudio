package sk.ness.game.model;

public class Comment {

	private String text;
	
	private String game;

	public Comment(){
		
	}
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}
	
}
