package ua.lviv.lgs;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Faction f = new Faction();
		Deputy d = new Deputy();
		Rada r = new Rada();
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		List<Faction> faction = r.getRada();

		while (true) {
			menu();
			switch (sc.nextInt()) {
			case 1: {
				System.out.println("Введіть назву фракції");
				r.addFaction(sc.next());
				System.out.println("------------------------------------------\n");
				break;
			}
			case 2: {
				r.removeFaction();
				System.out.println("------------------------------------------\n");
				break;
			}
			case 3: {
				r.displayAllFaction();
				System.out.println("------------------------------------------\n");
				break;
			}
			case 4: {
				r.clearFaction();
				System.out.println("------------------------------------------\n");
				break;
			}
			case 5: {
				r.displayFaction();

				System.out.println("------------------------------------------\n");
				break;
			}
			case 6: {

				r.addDeputyToFaction();

				System.out.println("------------------------------------------\n");
				break;
			}
			case 7: {

				r.removeDeputy();

				System.out.println("------------------------------------------\n");
				break;
			}
			case 8: {

				r.displayAllDeputyFromFraction();

				System.out.println("------------------------------------------\n");
				break;
			}
			case 9: {

				r.displayMostOfGrafter();

				System.out.println("------------------------------------------\n");
				break;
			}

			default: {

			}
			}
		}
	}

	public static void menu() {
		System.out.println("Введіть 1 щоб додати фракцію");
		System.out.println("Введіть 2 щоб видалити конкретну фракцію");
		System.out.println("Введіть 3 щоб вивести усі  фракції");
		System.out.println("Введіть 4 щоб очистити конкретну фракцію");
		System.out.println("Введіть 5 щоб вивести конкретну фракцію");
		System.out.println("Введіть 6 щоб додати депутата в фракцію");
		System.out.println("Введіть 7 щоб видалити депутата з фракції");
		System.out.println("Введіть 8 щоб вивести список хабарників");
		System.out.println("Введіть 9 щоб вивести найбільшого хабарника");
	}

}
