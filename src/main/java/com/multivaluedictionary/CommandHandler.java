package com.multivaluedictionary;

import java.io.IOException;

public class CommandHandler {
	public static void callHandleCommand(String commandLine) throws IOException{
		
	
		String[] args = commandLine.split(" "); //parse command 
		
		String command = args[0].toUpperCase(); //convert command to uppercase
		String key, val;
		
		switch(command) {
		case("ADD"):
			 try {
		            // try to execute code that may cause an error
				 	key = args[1];
					val = args[2];

		        } catch (Exception e) {
		            // if the error occurs execute this code
		        	System.out.println(") Missing Arguments - Expected Format is ADD <key> <value>");
		        	break;
		        }
			key = args[1];
			val = args[2];
			Functionalities.Add(key, val); //FUNCTION CALL
			break;
			
		case("KEYS"):
			Functionalities.Keys();
			break;
			
		case("MEMBERS"):
			 try {
		            // try to execute code that may cause an error
				 	key = args[1];

		        } catch (Exception e) {
		            // if the error occurs execute this code
		        	System.out.println(") Missing Arguments - Expected Format is MEMBERS <key>");
		        	break;
		        }
			key = args[1];
			Functionalities.Members(key); //FUNCTION CALL
			break;
			
		case("REMOVE"):
			 try {
		            // try to execute code that may cause an error
				 	key = args[1];
					val = args[2];

		        } catch (Exception e) {

		            // if the error occurs execute this code
		        	System.out.println(") Missing Arguments - Expected Format is REMOVE <key> <value>");
					break;
				}
			key = args[1];
			val = args[2];
			Functionalities.Remove(key, val); //FUNCTION CALL
			break;
			
		case("REMOVEALL"):
			 try {
		            // try to execute code that may cause an error
				 	key = args[1];

		        } catch (Exception e) {
		            // if the error occurs execute this code
		        	System.out.println(") Missing Arguments - Expected Format is REMOVEALL <key>");
					break;
				}
		 	key = args[1];
			Functionalities.RemoveAll(key); //FUNCTION CALL
			break;
			
		case("CLEAR"):
			Functionalities.Clear(); //FUNCTION CALL
			break;
			
		case("KEYEXISTS"):
			 try {
		            // try to execute code that may cause an error
				 	key = args[1];

		        } catch (Exception e) {
					System.out.println(") Missing Arguments - Expected Format is KEYEXISTS <key>");
					break;
				}
			key = args[1];
			Functionalities.KeyExists(key); //FUNCTION CALL
			break;
			
		case("MEMBEREXISTS"):
			 try {
				 	key = args[1];
					val = args[2];

		        } catch (Exception e) {
		        	System.out.println(") Missing Arguments - Expected Format is MEMBEREXISTS <key> <value>");
					break;
				}
			key = args[1];
			val = args[2];
			Functionalities.MemberExists(key, val); //FUNCTION CALL
			break;
			
		case("ALLMEMBERS"):
			Functionalities.AllMembers(); //FUNCTION CALL
			break;
		
		case("ITEMS"):
			Functionalities.Items(); //FUNCTION CALL
			break;
			
		case("EXIT"):
			System.out.println("Exiting the Application.."); //FUNCTION CALL
			System.exit(0);
			break;
			
		default:
			System.out.println("Command not available!");
			break;
		}
	}
}
