package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Rada {
	private String factionName;
	List<Faction> rada = new ArrayList<Faction>();
	Scanner sc = new Scanner(System.in);
	Faction f = new Faction();
	Deputy d = new Deputy();

	public void addFaction(String factionName) {

		rada.add(new Faction(factionName, new ArrayList<Deputy>()));
	}

	public void removeFaction() {
		System.out.println("Введіть фракцію яку хочете видалити: ");
		factionName = sc.next();

		for (int i = 0; i < rada.size(); i++) {
			if (rada.get(i).getNameOfFaction().equals(factionName)) {
				rada.remove(i);
			}
		}
	}

	public void displayAllFaction() {
		System.out.println(rada);
	}

	public void clearFaction() {
		System.out.println("Введіть фракцію яку хочете очистити: ");
		factionName = sc.next();

		for (int i = 0; i < rada.size(); i++) {
			if (rada.get(i).getNameOfFaction().equals(factionName)) {
				rada.get(i).clearFaction();
			}

		}
	}

	public void displayFaction() {
		System.out.println("Введіть фракцію яку хочете вивести: ");
		factionName = sc.next();

		for (int i = 0; i < rada.size(); i++) {
			if (rada.get(i).getNameOfFaction().equals(factionName)) {
				System.out.println(rada.get(i));
			}
		}
	}

	public void addDeputyToFaction() {
		System.out.println("Введіть фракцію до якої хочете додати депутата: ");
		factionName = sc.next();

		for (int i = 0; i < rada.size(); i++) {
			if (rada.get(i).getNameOfFaction().equals(factionName)) {
				rada.get(i).addDeputy();
			}
		}
	}

	public void removeDeputy() {
		System.out.println("Введіть фракцію до з якої хочете видалити депутата: ");
		factionName = sc.next();

		for (int i = 0; i < rada.size(); i++) {
			if (rada.get(i).getNameOfFaction().equals(factionName)) {
				rada.get(i).removeDeputy();
			}
		}
	}

	public void displayMostOfGrafter() {
		System.out.println("Введіть фракцію до з якої хочете вивести найбільшого хабарника: ");
		factionName = sc.next();
		int bribe = 0;
		for (int i = 0; i < rada.size(); i++) {

			for (int j = 0; j < rada.get(i).faction.size(); j++) {
				if (rada.get(i).getNameOfFaction().equals(factionName)) {
					if (rada.get(i).faction.get(j).isGrafter() == true) {
						if (rada.get(i).faction.get(j).getAmountBribe() > bribe) {
							bribe = rada.get(i).faction.get(j).getAmountBribe();
						}
					}

				}

			}

			for (int k = 0; k < rada.get(i).faction.size(); k++) {
				if (rada.get(i).faction.get(k).getAmountBribe() == bribe) {
					System.out.println(rada.get(i).faction.get(k));
				}
			}
		}
	}

	public void displayAllDeputyFromFraction() {
		System.out.println("Введіть фракцію до з якої хочете вивести усіх хабарників: ");
		factionName = sc.next();

		for (int i = 0; i < rada.size(); i++) {

			for (int j = 0; j < rada.get(i).faction.size(); j++) {
				if (rada.get(i).getNameOfFaction().equals(factionName)) {
					if (rada.get(i).faction.get(j).isGrafter() == true) {
						System.out.println(rada.get(i).faction.get(j));
					}
				}
			}
		}
	}

	public List<Faction> getRada() {
		return rada;
	}

	public void setRada(List<Faction> rada) {
		this.rada = rada;
	}

	@Override
	public String toString() {
		return "Rada [rada=" + rada + "]";
	}

}
