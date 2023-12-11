package com.zettamine.day3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueWords {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the article: ");
		String[] article = scn.nextLine().split(" ");
		int numOfWords = article.length;
		Set<String> unqWrd = new HashSet<>();
		for(String str : article) {
			unqWrd.add(str);
		}
		int numofUnqWords = unqWrd.size();
		System.out.println("Number of Words			: " + numOfWords);
		System.out.println("Number of unique Words  : " + numofUnqWords);
		
	}

}
