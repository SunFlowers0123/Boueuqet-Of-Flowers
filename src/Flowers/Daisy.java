package Flowers;
import Enums.Color;
import Enums.NameOfFlower;

public class Daisy extends Flower{
	
	public Daisy(NameOfFlower nameOfFlower , Color color , int price , int numberOfDays) {
		setName(nameOfFlower);
		setColor(color);
		setPrice(price);
		setNumberOfDays(numberOfDays);
	}
	

}
