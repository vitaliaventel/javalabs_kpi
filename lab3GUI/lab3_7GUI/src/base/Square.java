package base;

public class Square extends Rectangle {
	protected String name;
	
	public Square(){
		
	}
	
	public Square(int a){
		height = a;
		weight = a;
	}
	
	public void setParam(int a, String name) {
		height = a;
		weight = a;
		this.name = name;
	}

	public int getSquareSide() {
		return height;
	}

	public int searchSquare() {
		return height * weight;
	}
}
