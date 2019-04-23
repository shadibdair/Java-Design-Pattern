package model;

public class ShadiCharacterReceiver {
	
	private String name;
	
	public void moveUp() {
		System.out.println(getName() + " jumping Up!");
	}

	public void moveLeft() {
		System.out.println(getName() + " moving Left!");
	}
	
	public void moveRight() {
		System.out.println(getName() + " moving Righ!");
	}

	public void moveDown() {
		System.out.println(getName() + " moving Down!");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
