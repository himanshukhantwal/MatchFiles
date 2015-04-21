package com.filematcher.main;

import java.awt.SecondaryLoop;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MatchTwoFile {
	public static void main(String[] args) throws FileNotFoundException {
		String firstFile="File1.txt";
		String secFile="File2.txt";
		List<String> firstFileList=load(firstFile);
		List<String> secFileList=load(secFile);
		Set<String> matchStrings=new LinkedHashSet<String>();
		System.out.println("size of first file :"+firstFileList.size()+"\nName in first File :"+firstFileList);
		System.out.println("size of Second file :"+secFileList.size()+"\nName in first File :"+secFileList);
		for(String str:firstFileList){
			if(secFileList.contains(str)){
				matchStrings.add(str);
			}
		}
		System.out.println("\n\nResult Size :"+matchStrings.size()+"\nResult element :"+matchStrings);
	}
	
	private static ArrayList<String> load(String f1) throws FileNotFoundException{
		Scanner reader = new Scanner(new File(f1));
		ArrayList<String> out = new ArrayList<String>();
		while (reader.hasNext()){
			String temp = reader.nextLine();
			out.add(temp.toLowerCase());
		}
		return out;
	}
}
