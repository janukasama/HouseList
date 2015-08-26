/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chamodh
 */
import java.io.*;

public class HouseFile {

    private static BufferedReader inputFile;
    private static PrintWriter outputFile;
    private static boolean inputFileOpen = false;
    private static boolean outputFileOpen = false;
    private static String inputString = "";

    public static void checkAvailability()
	{
		try {
			File sourcer = new File("house.dat"); 
			if(!sourcer.exists())
			sourcer.createNewFile();
			
	        } catch (Exception e) {
	        	System.out.println("Issue in "+e);
	                              }			
	}

    public static void reset() {
        try {

            if (inputFileOpen) {
                inputFile.close();
            }
            if (outputFileOpen) {
                outputFile.close();
            }
            inputFile = new BufferedReader(new FileReader("house.dat"));
            inputFileOpen = true;
            inputString = inputFile.readLine();

        } catch (IOException e) {
            System.out.println("Issue in " + e);
        }

    }

    public static void rewrite() {

        try {

            if (inputFileOpen) {
                inputFile.close();
            }
            if (outputFileOpen) {
                outputFile.close();
            }
            outputFile = new PrintWriter(new FileWriter("house.dat"));
            outputFileOpen = true;

        } catch (Exception e) {
            System.out.println("Issue in " + e);
        }

    }

    public static boolean moreHouses() {
        if (!inputFileOpen || (inputString == null)) {
            return false;
        } else {
            return true;
        }
    }

    public static ListHouse getNextHouse() {
        String lastName = "lname";
        String firstName = "fname";
        int lotNumber = 0;
        int listedPrice = 0;
        int squareFeet = 0;
        int noOfBedRooms = 0;

        try {

            lastName = inputString;
            firstName = inputFile.readLine();
            lotNumber = Integer.parseInt(inputFile.readLine());
            listedPrice = Integer.parseInt(inputFile.readLine());
            squareFeet = Integer.parseInt(inputFile.readLine());
            noOfBedRooms = Integer.parseInt(inputFile.readLine());
            inputString = inputFile.readLine();
        } catch (IOException e) {
            System.out.println("Issue in " + e);
        }

        ListHouse house = new ListHouse(lotNumber, firstName, lastName, listedPrice, squareFeet, noOfBedRooms );
        return house;

    }

    public static void putToFile(ListHouse house) {
        try {

            outputFile.println(house.lastName());
            outputFile.println(house.firstName());
            outputFile.println(house.lotNumber());
            outputFile.println(house.listedPrice());
            outputFile.println(house.squareFeet());
            outputFile.println(house.noOfBedRooms());
        } catch (Exception e) {
            System.out.println("Issue in " + e);
        }

    }

    public static void close() {

        try {

            if (inputFileOpen) {
                inputFile.close();
            }
            if (outputFileOpen) {
                outputFile.close();
            }
            inputFileOpen = false;
            outputFileOpen = false;

        } catch (IOException e) {
            System.out.println("Issue in " + e);
        }

    }

}
