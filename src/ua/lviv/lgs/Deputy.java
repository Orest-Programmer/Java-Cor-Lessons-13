package ua.lviv.lgs;

import java.util.Random;
import java.util.Scanner;

public class Deputy extends Human {
	private String surName;
	private String name;
	private boolean grafter;
	private int amountBribe = 0;
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();

	public Deputy() {
		super();
	}

	public Deputy(int weight, int height) {
		super(weight, height);
	}

	public Deputy(int weight, int height, String surName, String name, boolean grafter) {
		super(weight, height);
		this.surName = surName;
		this.name = name;
		this.grafter = grafter;
		giveBribe();
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGrafter() {
		return grafter;
	}

	public void setGrafter(boolean grafter) {
		this.grafter = grafter;
	}

	public int getAmountBribe() {
		return amountBribe;
	}

	public void setAmountBribe(int amountBribe) {
		this.amountBribe = amountBribe;
	}

	public void giveBribe() {
		int sizeOfBribe = rand.nextInt(1000, 6000);

		if (isGrafter()) {
			if (sizeOfBribe > 5000) {
				System.out.println("Поліція увязнять депутата!");
			} else {
				setAmountBribe(sizeOfBribe);
				System.out.println("Ви дали " + getAmountBribe());
			}
		} else {
			System.out.println("Цей депутат не бере взятки!");
		}
	}

//	@Override
//	public String toString() {
//		return "Deputy [surName=" + surName + ", name=" + name + ", grafter=" + grafter + ", amountBribe="
//				+ getAmountBribe() + ", weight=" + weight + ", height=" + height + "]";
//	}

	@Override
	public String toString() {
		return "Deputy [surName=" + getSurName() + ", name=" + getName() + ", grafter=" + isGrafter() + ", amountBribe="
				+ getAmountBribe() + ", weight=" + getWeight() + ", height=" + getHeight() + "]";
	}
}
