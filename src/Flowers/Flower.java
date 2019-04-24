package Flowers;
import Enums.Color;
import Enums.NameOfFlower;

public abstract class Flower {
	
	private NameOfFlower nameOfFlower;
	private Color color;
	private int numberOfDays;
	private int price ;	
	
	
	
	public int getNumberOfDays() {
		return numberOfDays;
	}
	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public NameOfFlower getName() {
		return nameOfFlower;
	}
	public void setName(NameOfFlower nameOfFlower) {
		this.nameOfFlower = nameOfFlower;
	}
}
