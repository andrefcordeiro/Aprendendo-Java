package br.uel.singleton;

public class Incremental {
	
	private int count;
	private static Incremental instance;
	
	private Incremental(){
		this.count = 0;
	}
	
	public static Incremental getInstance() {
		if(Incremental.instance == null) {
			Incremental.instance = new Incremental();
		}
		
		return Incremental.instance;
		
	}
	
	public String toString(){
		return "Incremental " + this.count;
	}
	
	public void incrementar(){
		count++;
	}
	
	public int getCount() {
		return count;
	}
}
