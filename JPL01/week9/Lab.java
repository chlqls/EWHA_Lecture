//예제6
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Species implements Serializable {
	private String name;
	private int population;
	private double growthRate;
	
	public Species() {
		name = null;
		population = 0;
		growthRate = 0;
	}
	
	public Species(String initialName, int initialPopulation, double initialGrowthRate) {
		name = initialName;
		
		if(initialPopulation >= 0)
			population = initialPopulation;
		else {
			System.out.println("ERROR: Negative population.");
			System.exit(0);
		}
		growthRate = initialGrowthRate;
	}
	
	public String toString() {
		return ("Name = " + name + "\n" + "Population = " + population + "\nGrowth rate = " + growthRate + "%");
	}
}


public class Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Species[] oneArray = new Species[2];
		oneArray[0] = new Species("Calif Condor", 27, 0.02);
		oneArray[1] = new Species("Black Rhino", 100, 1.0);
		
		String fileName = "array.dat";
		
		try {
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
			outputStream.writeObject(oneArray);
			outputStream.close();
		}
		catch(IOException e) {
			System.out.println("ERROR writing to file " + fileName + ".");
			System.exit(0);
		}
		System.out.println("Array written to file " + fileName + " and file is closed.");
		
		Species[] anotherArray = null;
		
		try {
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
			anotherArray = (Species[])inputStream.readObject();
			System.out.println(anotherArray[0]);
			System.out.println(anotherArray[1]);
			inputStream.close();
		}
		catch(EOFException e) {
			System.out.println("End of File Exception.");
		}
		catch(FileNotFoundException e) {
			System.out.println("File not Found Exception.");
		}
		catch(IOException e) {
			System.out.println("IO Exception.");
		}
		catch(Exception e) {
			System.out.println("Exception.");
		}
		System.out.println("End of program.");
		
	}

}
