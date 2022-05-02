package com.multivaluedictionary;

import java.io.BufferedReader;
import java.util.*;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

	public static void main(String[] args) throws IOException{
	//	System.out.println("Running program");
		Functionalities.AddDefaultMembers();

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.print("> ");
			String command = reader.readLine();
			
			CommandHandler handle = new CommandHandler();
			handle.callHandleCommand(command);

		}
	}

}

