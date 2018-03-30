package com.learn.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WorldSeriesChampion {

	static String team = null;
	public static void main(String args[]) throws IOException {

		Path worldSeriesWinners = Paths
				.get("src/main/resources/WorldSeriesWinners.txt")
				.toAbsolutePath();

		// read all lines of file into arraylist
		List<String> winners = Files.lines(worldSeriesWinners).collect(
				Collectors.toList());

		// ask user to enter a team
		String []teamName = getTeamName();
		
		for(String team1 : teamName) {
			team = team1;
		}

		// use a stream to filter elements based on user input
		// count the number of elements left
		long numberOfWins = winners.stream()
				.filter(p -> p.equalsIgnoreCase(team)).count();

		// show output
		output(team, numberOfWins);

	}

	/**
	 * This method should return a string which represents a world series
	 * champion entered by a user.
	 * 
	 * @return string
	 */
	public static String[] getTeamName() {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the number how many times you want to iterate");
		System.out.println("World Series Champions");
		System.out.print("Enter the name of a team: ");
		String team = null;
		String[] inputs = new String[2];
		// Return the name input by the user.
		for(int i=0; i<inputs.length; i++){
			inputs[i] = keyboard.nextLine();
		}
		

		// close scanner
		keyboard.close();

		return inputs;
	}

	/**
	 * This method will format the output to the user
	 * 
	 * @param teamName
	 * @param numberOfWins
	 */
	public static void output(String teamName, long numberOfWins) {

		// Display the result
		System.out.println(teamName + " won the World Series a total of "
				+ numberOfWins + " times.");

	}

}