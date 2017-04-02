package com.parse.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Core {

	public static void main(String ... args) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("src/com/parse/core/DataInputFile.txt"));
		scan.nextLine();scan.nextLine();
		int count = 0;
		County counties[] = new County[21*8];
		int index = 0;
		while(scan.hasNext()){
			counties[index] = new County(scan.next());
				for(int i = 0 ; i < 14; i++){
				String info = scan.next();
				if(info.contains("-")) info = "-1";
				System.out.println("~" + info + "~");
				counties[index].add(Integer.parseInt(info.replaceAll(",", "")));
			}
			
			System.out.println();
			System.out.println(counties[index++]);
				
			
		}
		
	}
	
}
