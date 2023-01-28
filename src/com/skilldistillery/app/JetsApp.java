package com.skilldistillery.app;

import java.io.BufferedReader;
import java.io.FileReader;

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

		populateAirField();

	}

	private void populateAirField() {
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
			for (int i = 0; i < this.airField.getJets().size(); i++) {
				System.out.println(this.airField.getJets().get(i));
			}
			input.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

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

}
