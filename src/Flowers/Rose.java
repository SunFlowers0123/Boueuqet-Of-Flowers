package Flowers;
import Enums.Color;
import Enums.NameOfFlower;

public class Rose extends Flower {

	public Rose(NameOfFlower nameOfFlower , Color color , int price , int numberOfDays) {
		setName(nameOfFlower);
		setColor(color);
		setPrice(price);
		setNumberOfDays(numberOfDays);
	}
	
}
