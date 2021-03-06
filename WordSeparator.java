package com.learn.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordSeparator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the sentence with no spaces " + "between the words and each " + "word is capitalized.");

		System.out.println("An example is: StopAndSmellTheRoses");

		System.out.print("> ");

		// get user input
		String userInput = scan.nextLine();

		scan.close();

		List<String> sentenceElement = Arrays.stream(userInput.split("(?=[A-Z])")).collect(Collectors.toList());

		List<String> sentence = new ArrayList<String>();

		for(int i=0; i<sentenceElement.size(); i++){

			if(i==0){
				sentence.add(sentenceElement.get(i));
			}else {
				sentence.add(sentenceElement.get(i).toLowerCase());
			}
		}

		System.out.println(String.join(" ", sentence));
	}
}
