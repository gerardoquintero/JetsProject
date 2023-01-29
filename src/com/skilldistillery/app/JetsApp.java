package com.skilldistillery.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.entities.AirField;
import com.skilldistillery.entities.AnimalCargoJet;
import com.skilldistillery.entities.CargoPlane;
import com.skilldistillery.entities.FighterBomberJet;
import com.skilldistillery.entities.FighterJet;
import com.skilldistillery.entities.Jet;

public class JetsApp {

	private AirField airField;

	public static void main(String[] args) {

		JetsApp app = new JetsApp();
		app.run();

	}

	private void run() {
		Scanner sc = new Scanner(System.in);
		List<Jet> jets = populateAirField();
		boolean shouldQuitProgram = false;
		do {
			int userMenuSelection = displayMenuAndGetUserSelection(sc);
			shouldQuitProgram = executeUserMenuChoice(userMenuSelection, jets);
		} while (!shouldQuitProgram);

	}

	private List<Jet> populateAirField() {
		this.airField = new AirField();

		try {
			BufferedReader input = new BufferedReader(new FileReader("jets.txt"));
			String line;
			while ((line = input.readLine()) != null) {

				String[] jetInfo = line.split(",");
				Jet jet = jetCreator(jetInfo);
				if (jet != null) {

					this.airField.putJetInAirField(jet);

				}
			}

			input.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return airField.getJets();

	}

	private Jet jetCreator(String[] jetInfo) {

		String jetType = jetInfo[0];
		String jetModel = jetInfo[1];
		double jetRange = Double.parseDouble(jetInfo[2]);
		double jetPrice = Double.parseDouble(jetInfo[3]);
		double jetSpeed = Double.parseDouble(jetInfo[4]);

		if (jetType.equals("FighterJet")) {
			FighterJet jet = new FighterJet(jetModel, jetRange, jetPrice, jetSpeed);
			return jet;
		} else if (jetType.equals("CargoPlane")) {
			CargoPlane jet = new CargoPlane(jetModel, jetRange, jetPrice, jetSpeed);
			return jet;
		} else if (jetType.equals("FighterBomberJet")) {
			FighterBomberJet jet = new FighterBomberJet(jetModel, jetRange, jetPrice, jetSpeed);
			return jet;
		} else if (jetType.equals("AnimalCargoJet")) {
			AnimalCargoJet jet = new AnimalCargoJet(jetModel, jetRange, jetPrice, jetSpeed);
			return jet;
		} else {
			Jet jet = null;
			return jet;
		}

	}

	private int displayMenuAndGetUserSelection(Scanner sc) {

		System.out.println("     ____.       __          ");
		System.out.println("    |    | _____/  |_  ______");
		System.out.println("    |    |/ __ \\   __\\/  ___/");
		System.out.println("/\\__|    \\  ___/|  |  \\___ \\ ");
		System.out.println("\\________|\\___  >__| /____  >");
		System.out.println("              \\/          \\/ ");
		System.out.println("								");

		System.out.println(" --------------Menu--------------- ");
		System.out.println("| 1. List Fleet.                  |");
		System.out.println("| 2. Fly All Jets.                |");
		System.out.println("| 3. View Fastest Jet.            |");
		System.out.println("| 4. View Jet With Longest Range. |");
		System.out.println("| 5. Load All Cargo Jets.         |");
		System.out.println("| 6. Dogfight!                    |");
		System.out.println("| 7. Add a jet to a fleet.        |");
		System.out.println("| 8. Remove a jet from a fleet.   |");
		System.out.println("| 9. Quit.                        |");
		System.out.println("|_________________________________|");
		System.out.print("Enter a number: ");
		int userMenuSelection = sc.nextInt();
		return userMenuSelection;

	}

	private boolean executeUserMenuChoice(int userMenuSelection, List<Jet> jets) {
		switch (userMenuSelection) {
		case 1:
			listFleet(jets);
			break;
		case 2:
			flyAllJets(jets);
			break;
		case 3:
//			showHighestRatedTruck(myTrucks);
			break;
		case 4:
//			quitProgram();
			return true;
		default:
			System.out.println("Please select a valid number. ");
			break;
		}
		return false;
	}

	private void flyAllJets(List<Jet> jets) {
		for (int i = 0; i < jets.size(); i++) {
			System.out.println(jets.get(i));
			jets.get(i).fly();
			System.out.print("\n");
		}

	}

	private void listFleet(List<Jet> jets) {
		for (int i = 0; i < jets.size(); i++) {
			System.out.println(jets.get(i));
		}
	}

}
