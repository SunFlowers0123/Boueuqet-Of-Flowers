package runner;
import java.util.Scanner;

import Flowers.BouquetOfFlowers;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BouquetOfFlowers bouquetOfFlowers = new BouquetOfFlowers(); 	// create bouquet 
		System.out.println("\tFlower Shop");
		int flower;int color; 											// atributes that select flower and color
		System.out.println("We have a bouquet that consists of : ");
		bouquetOfFlowers.printBouquete();								// creat bouquete that is int the store
		bouquetOfFlowers.printSumOfTheBouquet();						// print sum of bouquet 
		System.out.println("You can consist bouquet yourself" );
		System.out.println("Choose flower");
		System.out.println("1  - add to bouquet one rose "    );
		System.out.println("2  - add to bouquet one daisy"    );
		System.out.println("3  - add to bouquet one Chamomile");
		System.out.println("Choose color flower");
		System.out.println("1 - choose PINK color" );
		System.out.println("2 - choose RED color"  );
		System.out.println("3 - choose WHITE color");
		System.out.println("Press 'Y' to pay");
		
		while(true) {				// the loop where you select the flower and color
				System.out.print("Choose flower : ");flower= scan.nextInt();
				System.out.print("Choose color flower : ");color=scan.nextInt();
				switch(flower) {
				case 1 : 
					bouquetOfFlowers.yourBouquet(flower,color);
					System.out.println("Added");
					break;
				case 2 : 
					bouquetOfFlowers.yourBouquet(flower,color);
					System.out.println("Added");
					break;
				case 3 : 
					bouquetOfFlowers.yourBouquet(flower,color);
					System.out.println("Added");
					break;
				default :
					System.out.println("We haven`t this flower");
					break;
				}
				System.out.println("Press Y to pay or N to continue");
				String exit=scan.next();	
				if(exit.equalsIgnoreCase("y")) {
					bouquetOfFlowers.printyourBouquet();  // print your bouquet 
					bouquetOfFlowers.printSumOfTheYourBouquet(); // print sum of your bouquet 
					break;
				}
			}
		
		System.out.println("Here is your sorted bouquet : ");
		bouquetOfFlowers.printSortedBouquet();  // sorted bouquet by price
		
		
		}
		
	}

