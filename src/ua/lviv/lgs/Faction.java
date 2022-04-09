package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Faction {
	private String nameOfFaction;

	Deputy d = new Deputy();
	List<Deputy> faction = new ArrayList<Deputy>();
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();

	public Faction() {
		super();
	}

	public Faction(String nameOfFaction, List<Deputy> faction) {
		super();
		this.nameOfFaction = nameOfFaction;
		this.faction = faction;
	}

	public void addDeputy() {
		System.out.print("¬вед≥ть пр≥звище депутата:");
		String surName = sc.next();
		System.out.print("¬вед≥ть ≥'м€ депутата:");
		String name = sc.next();
		int weight = rand.nextInt(50, 100);
		int height = rand.nextInt(130, 200);
		boolean grafter = rand.nextBoolean();
		d.setWeight(weight);
		d.setHeight(height);
		d.setName(name);
		d.setSurName(surName);
		faction.add(new Deputy(weight, height, surName, name, grafter));

	}

	public void removeDeputy() {
		System.out.println("¬вед≥ть пр≥звище депутата €кого хочете видалити");
		Iterator<Deputy> iterator = faction.iterator();
		String enterSN = sc.next();
		while (iterator.hasNext()) {

			d = iterator.next();
			if (d.getSurName().equals(enterSN)) {
				iterator.remove();
			}
		}
	}

	public void displayAllGrafters() {
		List<Deputy> allGrafters = new ArrayList();
		Iterator<Deputy> iterator = faction.iterator();
		while (iterator.hasNext()) {

			d = iterator.next();
			if (d.isGrafter()) {
				allGrafters.add(new Deputy(d.weight, d.height, d.getSurName(), d.getName(), d.isGrafter()));
				System.out.println(allGrafters);
			}
		}
		
	}

	public void displayMostOfGrafter() {
		Iterator<Deputy> iterator = faction.iterator();

		int bribe = 0;
		while (iterator.hasNext()) {
			d = iterator.next();
			if (d.getAmountBribe() > bribe) {
				bribe = d.getAmountBribe();

			}

		}

		for (int i = 0; i < faction.size(); i++) {
			if (bribe == faction.get(i).getAmountBribe()) {
				System.out.println(faction.get(i));
			}
		}
	}

	public void displayAllDeputy() {
		System.out.println(faction);
	}

	public void clearFaction() {
		faction.clear();
	}

	public String getNameOfFaction() {
		return nameOfFaction;
	}

	public void setNameOfFaction(String nameOfFaction) {
		this.nameOfFaction = nameOfFaction;
	}

	@Override
	public String toString() {
		return "Factions [" + nameOfFaction + "= " + faction + "]\n";
	}


}
