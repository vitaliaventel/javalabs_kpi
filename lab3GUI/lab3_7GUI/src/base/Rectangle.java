package base;

public class Rectangle {

	protected int height;
	protected int weight;

	public Rectangle() {

	}

	public Rectangle(int height, int weight) {
		this.height = height;
		this.weight = weight;
	}

	public void setParam(int height, int weight) {
		this.height = height;
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public int searchSquare() {
		return height * weight;
	}

}
