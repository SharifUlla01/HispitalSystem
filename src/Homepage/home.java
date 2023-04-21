/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homepage;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class home {
    public static void showBanner() {
		println("********************************************************************");
		println("***************** WIPRO SUPER SPECIALITY HOSPITAL ******************");
		println("********************************************************************\n");
	}

	public static void showApplicationEntryOptions() {
		println("\n[1] -> Administrator Login");
		println("[2] -> Doctor Login");
		println("[3] -> Patient Login / Registration");
		println("----------------------------------------");
	}
	
	public static void showAdminOptions() {
		println("----------------------------------------\n");
		println("**** ADMIN OPERATIONS ****");
		println("\n[1] -> Register a Doctor");
		println("[2] -> Delete Doctor Info");
		println("[3] -> List Registered Doctors");
                println("[3] -> Patient Information");
		println("[4] -> Logout");
		println("----------------------------------------");
	}

	public static Scanner scanner() {
		return new Scanner(in);
	}
	
	public static void println(String content) {
		out.println(content);
	}
	public static void print(String content) {
		out.print(content);
	}
	
	public static int learnOptionFromperson() {
		out.print("Please enter your choice : ");
		return scanner().nextInt();
	}
    
}
