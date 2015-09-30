package sk.ness.game.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	private String password;
	
	private List<Score> scoresOfUser = new ArrayList<Score>();
	
	public User(){
		
	}
	
	public User(String name,String pass){
		this.name=name;
		this.password=pass;
	}
	
	public void  addScore(Score s){
		scoresOfUser.add(s);
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getId() {
		return id;
	}


	
	
	
	
}
