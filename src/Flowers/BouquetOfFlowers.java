package Flowers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import Enums.Color;
import Enums.NameOfFlower;
import Flowers.*;


public class BouquetOfFlowers {
	private Random rand = new Random();
	private List<Flower> bouquetOfFlowers;
	private List<Flower> listOfFlowers = new ArrayList<Flower>();;
	private List<Daisy> listOfDaisy;
	private List<Rose> listOfRose;
	private List<—hamomile> listOf—hamomile;
		 
	private int price ;
	
	public List<Flower> bouquet() {		// The method that creates a bouquet of flowers
			bouquetOfFlowers= new ArrayList<Flower>();
			bouquetOfFlowers.addAll(bouqueteOfDaisy());
			bouquetOfFlowers.addAll(bouqueteOfRose());
			bouquetOfFlowers.addAll(bouqueteOfChamomile());
		return bouquetOfFlowers;
	}
	
	 private List<Daisy> bouqueteOfDaisy() {// The method that creates a bouquet of Daisy
		listOfDaisy = new ArrayList<Daisy>();
		int numublerOfFlower = rand.nextInt(5)+1;
		int whichOfFlower;
		for(int i=0;i<numublerOfFlower;i++) {
			whichOfFlower = rand.nextInt(5)+1;
			if(whichOfFlower==1)listOfDaisy.add(new Daisy(NameOfFlower.DAISY,Color.WHITE,15,3));
			if(whichOfFlower==2)listOfDaisy.add(new Daisy(NameOfFlower.DAISY,Color.RED,25,2));
			if(whichOfFlower==3)listOfDaisy.add(new Daisy(NameOfFlower.DAISY,Color.PINK,30,1));
			if(whichOfFlower==4)listOfDaisy.add(new Daisy(NameOfFlower.DAISY,Color.RED,17,3));
			if(whichOfFlower==5)listOfDaisy.add(new Daisy(NameOfFlower.DAISY,Color.WHITE,27,2));
		}
		return listOfDaisy;
	}
	
	private List<Rose> bouqueteOfRose() {// The method that creates a bouquet of Rose
		listOfRose =  new ArrayList<Rose>();
		int numublerOfFlower = rand.nextInt(5)+1;
		int whichOfFlower;
		for(int i=0;i<numublerOfFlower;i++) {
			whichOfFlower = rand.nextInt(5)+1;
			if(whichOfFlower==1)listOfRose.add(new Rose(NameOfFlower.ROSE,Color.WHITE,15,3));
			if(whichOfFlower==2)listOfRose.add(new Rose(NameOfFlower.ROSE,Color.RED,25,2));
			if(whichOfFlower==3)listOfRose.add(new Rose(NameOfFlower.ROSE,Color.PINK,30,1));
			if(whichOfFlower==4)listOfRose.add(new Rose(NameOfFlower.ROSE,Color.RED,17,3));
			if(whichOfFlower==5)listOfRose.add(new Rose(NameOfFlower.ROSE,Color.WHITE,27,2));
		}
		return listOfRose;
	}
	
	private List<—hamomile> bouqueteOfChamomile() {// The method that creates a bouquet of Chamomile
		listOf—hamomile = new ArrayList<—hamomile>();
		int numublerOfFlower = rand.nextInt(5)+1;
		int whichOfFlower;
		for(int i=0;i<numublerOfFlower;i++) {
			whichOfFlower = rand.nextInt(5)+1;
			if(whichOfFlower==1)listOf—hamomile.add(new —hamomile(NameOfFlower.CHAMOMILE,Color.WHITE,15,3));
			if(whichOfFlower==2)listOf—hamomile.add(new —hamomile(NameOfFlower.CHAMOMILE,Color.WHITE,25,2));
			if(whichOfFlower==3)listOf—hamomile.add(new —hamomile(NameOfFlower.CHAMOMILE,Color.WHITE,30,1));
			if(whichOfFlower==4)listOf—hamomile.add(new —hamomile(NameOfFlower.CHAMOMILE,Color.WHITE,17,3));
			if(whichOfFlower==5)listOf—hamomile.add(new —hamomile(NameOfFlower.CHAMOMILE,Color.WHITE,27,2));
		}
		return listOf—hamomile;
	}
	
	public void yourBouquet(int button , int color) {	// The method that creates flower and bouquet that you chose
		if(button==1) {
			if(color==1) listOfFlowers.add(new Rose(NameOfFlower.ROSE,Color.PINK,20,6));
			if(color==2) listOfFlowers.add(new Rose(NameOfFlower.ROSE,Color.RED,23,4));
			if(color==3) listOfFlowers.add(new Rose(NameOfFlower.ROSE,Color.WHITE,15,3));}
		if(button==2) { 
			if(color==1) listOfFlowers.add(new Daisy(NameOfFlower.DAISY,Color.PINK,15,2));
			if(color==2) listOfFlowers.add(new Daisy(NameOfFlower.DAISY,Color.RED,12,1));
			if(color==3) listOfFlowers.add(new Daisy(NameOfFlower.DAISY,Color.WHITE,20,4));}
		if(button==3) {
			if(color==1)listOfFlowers.add(new —hamomile(NameOfFlower.CHAMOMILE,Color.PINK,25,7));
			if(color==2)listOfFlowers.add(new —hamomile(NameOfFlower.CHAMOMILE,Color.RED,30,3));
			if(color==3)listOfFlowers.add(new —hamomile(NameOfFlower.CHAMOMILE,Color.WHITE,40,1));}
	}
	
	
	
	public void printSumOfTheYourBouquet() {	// the method that return price of your bouquet
		int sum = 0;
		for(int i=0;i<listOfFlowers.size();i++) {
			sum = sum+listOfFlowers.get(i).getPrice() ;
		}
		System.out.println("The price of the your bouquet : " + sum);
	}
	
	public void printyourBouquet() {	// the method that print bouquet that you created
		System.out.println("The bouquet consist of : ");
		for(int i=0;i<listOfFlowers.size();i++) {
			System.out.println(listOfFlowers.get(i).getName() + " color : "+ listOfFlowers.get(i).getColor() + " price : " + listOfFlowers.get(i).getPrice() );
		}
	}
	
	
	
	public void printSumOfTheBouquet() {	// the method that print the sum of bouquet that you created
		int sum = 0;
		for(int i=0;i<bouquetOfFlowers.size();i++) {
			sum = sum+bouquetOfFlowers.get(i).getPrice();
		}
		System.out.println("The price of the bouquet : " + sum );
	}
	
	public void printBouquete() { // the method that print the bouquet that in the store
		bouquet();
		for(int i=0;i<bouquetOfFlowers.size();i++) {
			System.out.println(i+1 + " ) "+bouquetOfFlowers.get(i).getName() + " color : " + bouquetOfFlowers.get(i).getColor());
		}
	}
	
	public void printSortedBouquet(){  // sort bouquet by name and color
		sortBouquetByPrice(listOfFlowers);
		for(int i=0;i<listOfFlowers.size();i++) {
			System.out.println(listOfFlowers.get(i).getName() + " color : "+ listOfFlowers.get(i).getColor());
		}	
	}
	
	private void sortBouquetByPrice(List<Flower> list){   // sort bouquet by price
        Collections.sort(list, new Comparator<Flower>() {
            @Override
        	public int compare(Flower o1, Flower o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });
	}
	
	
	
}
