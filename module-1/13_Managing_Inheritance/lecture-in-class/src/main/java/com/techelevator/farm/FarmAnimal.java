package com.techelevator.farm;

public abstract class FarmAnimal implements Singable {
	private String name;
	private String sound;
    private boolean isAsleep;

	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}

	public String getName( ) {
		return this.encryptName();
	}

	protected String encryptName(){
		return this.name.substring(0,2);
	}

	public void sleep( boolean isAsleep){
		this.isAsleep = isAsleep;
	}

	public abstract String eat();

	public final String getSound(){
		if (isAsleep){
			return "Zzzzzz...";
		}
		return sound;
	}

}