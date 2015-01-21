package Interfaces;

public class Hourse extends ChessPiece implements Movalble, Printable {

	
	public Hourse(String positon){
		
		this.position = positon;
	}
	
	@Override
	public void print() {
		System.out.println("Hourse Position: " + this.position);
	}

	@Override
	public void move(String position) {
		this.position = position;
	}

}
