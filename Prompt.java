import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *	Prompt.java - Uses BufferedReader.
 *	Provides utilities for user input.  This enhances the BufferedReader
 *	class so our programs can recover from "bad" input, and also provides
 *	a way to limit numerical input to a range of values.
 *
 *	The advantages of BufferedReader are speed, synchronization, and piping
 *	data in Linux.
 *
 *	@author	Nathan Bao
 *	@since	August 25th, 2022
 */

public class Prompt
{
	// BufferedReader variables
	private static InputStreamReader streamReader = new InputStreamReader(System.in);
	private static BufferedReader buffReader = new BufferedReader(streamReader);
	/**
	 *	Prompts user for string of characters and returns the string.
	 *	@param ask  The prompt line
	 *	@return  	The string input
	 */
	public static String getString (String ask)
	{
		System.out.print(ask + " -> ");
		String input = "";
		try{
			input = buffReader.readLine();
		}
		catch(IOException e){
			System.err.println("Error: BufferedReader could not read line");
		}
		return input;
	}
	
	/**
	 *	Prompts the user for a character and returns the character.
	 *	@param ask  The prompt line
	 *	@return  	The character input
	 */
	 /**
	public static char getChar (String ask)
	{
		char character = ' ';
		while(ask.length!=1){
			System.out.println("Please input one character.");
			ask = buffReader.readLine();
		}
		try{
			character = ask.charAt(0);
		}
		catch(StringIndexOutOfBoundsException e){
			
		}
		return character;
	}
	
	/**
	 *	Prompts the user for an integer and returns the integer.
	 *	@param ask  The prompt line
	 *	@return  	The integer input
	 *
	public static int getInt (String ask)
	{
		int val = 0;
		boolean found = false;
		while(!found){
			String str = getString(ask);
			try{
				val = Integer.parseInt(str);
				found = true;
			}
			catch(NumberFormatException e){
				found = false;
			}
			//java.lang is automatically loaded every time the program compiles
		}
		return val;
	}
	
	/**
	 *	Prompts the user for an integer using a range of min to max,
	 *	and returns the integer.
	 *	@param ask  The prompt line
	 *	@param min  The minimum integer accepted
	 *	@param max  The maximum integer accepted
	 *	@return  	The integer input
	 *
	public static int getInt (String ask, int min, int max)
	{
		int val = 0;
		do{
			val = getInt(ask + "("+min+", "+max+")");
		} while(val<min||val>max);
		return val;
	}
	
	/**
	 *	Prompts the user for a double and returns the double.
	 *	@param ask  The prompt line
	 *	@return  The double input
	 *
	public static double getDouble (String ask)
	{
		return 0.0;
	}
	
	/**
	 *	Prompts the user for a double and returns the double.
	 *	@param ask  The prompt line
	 *	@param min  The minimum double accepted
	 *	@param max  The maximum double accepted
	 *	@return  The double input
	 *
	public static double getDouble (String ask, double min, double max)
	{
		return 0.0;
	}
}
* */ 
}