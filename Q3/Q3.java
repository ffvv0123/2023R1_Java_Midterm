import java.io.*;
import java.util.Vector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * Q3: This program is used car management program
 * 
 * @author Suhyeon Jo
 * @since 2023-04-28
 * @version v0.2
 *
 */

public class Q3 {

	private static List<String> usedNames = new ArrayList<>();
	public static Scanner scanner = new Scanner(System.in);

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {

		/** Import Q3.data file. This file contains automobile's data */
		File inFile = new File("/Users/jjos/Desktop/Java/2023_Midterm_OOP/Q3.data");
		FileInputStream inStream = new FileInputStream(inFile);
		DataInputStream inDataStream = new DataInputStream(inStream);

		Vector<Automobile> carVector = new Vector<>();
		String line = inDataStream.readLine();

		/** Converting file data to object data */
		while ((line = inDataStream.readLine()) != null) {

			line += "\t";

			Automobile tmp = new Automobile();

			String model = line.substring(0, line.indexOf("\t"));
			line = line.substring(line.indexOf("\t") + 1, line.length());
			tmp.setModel(model);

			String milesPerGallon = line.substring(0, line.indexOf("\t"));
			line = line.substring(line.indexOf("\t") + 1, line.length());
			tmp.setMilesPerGallon(milesPerGallon);

			String numberOfCylinders = line.substring(0, line.indexOf("\t"));
			line = line.substring(line.indexOf("\t") + 1, line.length());
			tmp.setNumberOfCylinders(numberOfCylinders);

			String displacement = line.substring(0, line.indexOf("\t"));
			line = line.substring(line.indexOf("\t") + 1, line.length());
			tmp.setDisplacement(displacement);

			String grossHorsePower = line.substring(0, line.indexOf("\t"));
			line = line.substring(line.indexOf("\t") + 1, line.length());
			tmp.setGrossHorsePower(grossHorsePower);

			String rearAxleRatio = line.substring(0, line.indexOf("\t"));
			line = line.substring(line.indexOf("\t") + 1, line.length());
			tmp.setRearAxleRatio(rearAxleRatio);

			String weight = line.substring(0, line.indexOf("\t"));
			line = line.substring(line.indexOf("\t") + 1, line.length());
			tmp.setWeight(weight);

			String quaterMileTime = line.substring(0, line.indexOf("\t"));
			line = line.substring(line.indexOf("\t") + 1, line.length());
			tmp.setQuaterMileTime(quaterMileTime);

			String engine = line.substring(0, line.indexOf("\t"));
			line = line.substring(line.indexOf("\t") + 1, line.length());
			tmp.setEngine(engine);

			String transmission = line.substring(0, line.indexOf("\t"));
			line = line.substring(line.indexOf("\t") + 1, line.length());
			tmp.setTransmission(transmission);

			String numberOfForwardGears = line.substring(0, line.indexOf("\t"));
			line = line.substring(line.indexOf("\t") + 1, line.length());
			tmp.setNumberOfForwardGears(numberOfForwardGears);

			String numberOfCarburetors = line.substring(0, line.indexOf("\t"));
			line = line.substring(line.indexOf("\t") + 1, line.length());
			tmp.setNumberOfCarburetors(numberOfCarburetors);

			carVector.add(tmp);

		}

		/** Generate 100 random objects */
		Automobile[] myCars = new Automobile[100];
		for (int i = 0; i < 100; i++) {
			myCars[i] = genAutomobile();

			/* Output part */
			// myCars[i].printStatus();
			// System.out.println((i+1) + "th car");
			// System.out.println();
		}


		CUI(carVector);
		
		inDataStream.close();

	}

	/**
	 * This function generate random data and allocate to object Model will not be
	 * duplicated
	 * 
	 * @return Automobile object
	 */
	public static Automobile genAutomobile() {
		Automobile randomCar = new Automobile();

		/** Model generating... */
		String model;
		StringBuilder sb = new StringBuilder();
		int length = (int) (Math.random() * 8) + 3;
		while (true) {
			sb.setLength(0);
			for (int i = 0; i < length; i++) {
				int asciiValue = (int) (Math.random() * 26) + 97;
				sb.append((char) asciiValue);
			}
			String name = sb.toString();
			if (!usedNames.contains(name)) {
				usedNames.add(name);
				model = name;
				break;
			}
		}
		randomCar.setModel(model);

		/** Miles/(US) gallon: 10.4 ~ 33.9 */
		String milesPerGallon = Double.toString(Math.floor(Math.random() * 2351 + 1041) / 100.0);
		randomCar.setMilesPerGallon(milesPerGallon);

		/** Number of cylinders: 4 or 6 or 8 */
		String numberOfCylinders = Integer.toString((int) (Math.random() * 3) * 2 + 4);
		randomCar.setNumberOfCylinders(numberOfCylinders);

		/** Displacement (cu.in.): 71.1 ~ 472 */
		String displacement = Double.toString(Math.floor(Math.random() * 40091 + 7111) / 100.0);
		randomCar.setDisplacement(displacement);

		/** Gross horsepower: 52 ~ 335 */
		String grossHorsePower = Integer.toString((int) (Math.random() * 284) + 52);
		randomCar.setGrossHorsePower(grossHorsePower);

		/** Rear axle ratio: 2.76 ~ 4.93 */
		String rearAxleRatio = Double.toString(Math.floor(Math.random() * 218 + 276) / 100.0);
		randomCar.setRearAxleRatio(rearAxleRatio);

		/** Weight (1000 lbs): 1.513 ~ 5.424 */
		String weight = Double.toString(Math.floor(Math.random() * 3912 + 1513) / 1000.0);
		randomCar.setWeight(weight);

		/** 1/4 mile time: 14.5 ~ 22.9 */
		String quaterMileTime = Double.toString(Math.floor(Math.random() * 8401 + 14501) / 1000.0);
		randomCar.setQuaterMileTime(quaterMileTime);

		/** Engine (0 = V-shaped, 1 = straight) */
		String engine = Integer.toString((int) (Math.random() * 2));
		randomCar.setEngine(engine);

		/** Transmission (0 = automatic, 1 = manual) */
		String transmission = Integer.toString((int) (Math.random() * 2));
		randomCar.setTransmission(transmission);

		/** Number of forward gears: 3 ~ 5 */
		String numberOfForwardGears = Integer.toString((int) (Math.random() * 3) + 3);
		randomCar.setNumberOfForwardGears(numberOfForwardGears);

		/** Number of carburetors: 1, 2, 3, 4, 6, 8 */
		String numberOfCarburetors;
		int carburetors = 0;

		while (true) {
			carburetors = (int) (Math.random() * 8) + 1;
			if (carburetors != 5 && carburetors != 7)
				break;
		}

		numberOfCarburetors = Integer.toString(carburetors);
		randomCar.setNumberOfCarburetors(numberOfCarburetors);

		return randomCar;
	}

	/**
	 * * Design and implement a CUI 
	 * 1. General Selection - For each option, check all of them based on a set of conditions 
	 * 2. User custom command - Ex. [ Miles > 20 and Number of cylinders == 4 ] 
	 * 3. Model - specific model [Ex. Merc -> 240D, 230, 280, 280C, 450SE, 450SL, 450SLC]
	 * 
	 * An ideal UI needs a model that can handle as much natural language as
	 * possible.
	 * 
	 * @param Automobile Vector v
	 */
	public static void CUI(Vector<Automobile> v) {

		System.out.println("Select option (1 - General Option, 2 - User Custom Command)");
		int option = 0;
		try {
			option = scanner.nextInt();
		} catch (InputMismatchException e) {
			/**
			 * InputMismatchException: input value is not integer Return option: 1
			 */
			System.out.println("Invalid option input");
			System.out.println("Exit program...");
			System.exit(1);
		}
		if (option == 1) {
			System.out.println("Sorry. General Selection is being prepared");
		} else if (option == 2) {
			System.out
					.println("==================================User Custom Command==================================");
			System.out.println("The User Custom Command allows you to compare up to 2 variables.");
			System.out.println("A set of instructions is separated by \"and\" or \",\"");
			System.out.println("The list of options and operators is below.");
			System.out.println(
					"=========================================Option List================================================");
			System.out.println(
					"Option list: model, miles, cylinders, displacement, power, rar, weight, speed, gears, carburetors");
			System.out.println("engine: V, straight" + "\n" + "transmission: automatic, manual");
			System.out.println(
					"========================================Operator List===============================================");
			System.out.println("If you want to use compare operator, input =, <, >");
			System.out.println("If you want to find a specific word, input \"in\"");

			System.out.println(
					"============================================Command Line============================================");
			System.out.print("Input your command: ");

			String command = scanner.nextLine();
			command = scanner.nextLine() + " ";

			/**
			 * The command consists of the following Option_1 Operator_1 Variable_1 Next_1
			 * Option_2 Operator_2 Variable_2 Each variable will be allocated in commandList
			 * 
			 */

			String[] commandList = { "-1", "-1", "-1", "-1", "-1", "-1", "-1" };

			for (int i = 0; i < commandList.length; i++) {
				commandList[i] = command.substring(0, command.indexOf(" "));
				command = command.substring(command.indexOf(" ") + 1, command.length());
				if (command == "")
					break;
			}

			/** If two condition */
			if (commandList[3].equals("and") || commandList[3].equals(",")) {
				Vector<Automobile> compare1 = findCar(v, commandList[0], commandList[1], commandList[2]);
				Vector<Automobile> compare2 = findCar(v, commandList[4], commandList[5], commandList[6]);
				System.out.println("The list below shows listings that meet the criteria you set\n");
				Set<Automobile> set = new HashSet<>(compare2);
				for (int i = 0; i < compare1.size(); i++) {
					if (set.contains(compare1.get(i))) {
						compare1.get(i).printStatus();
						System.out.println();
					}
				}
			}

			/** Else if Single condition, print status */
			else if (commandList[3].equals("-1")) {
				Vector<Automobile> compare = findCar(v, commandList[0], commandList[1], commandList[2]);

				System.out.println("The list below shows listings that meet the criteria you set\n");
				Iterator<Automobile> it = compare.iterator();

				while (it.hasNext()) {
					Automobile car = it.next();
					car.printStatus();
					System.out.println();
				}

			}
			/**
			 * There are invalid input data Exit code: 2
			 */
			else {

				System.out.println("Invalid concatenation!");
				System.out.println("Program exit...");
				System.exit(2);
			}

		}

	}

	/**
	 * This function found appropriate objects and return its array
	 * 
	 * @param v
	 * @param option
	 * @param operator
	 * @param variable
	 * @return
	 */
	public static Vector<Automobile> findCar(Vector<Automobile> v, String option, String operator, String variable) {
		Vector<Automobile> av = new Vector<>();
		boolean checker = false;
		/**
		 * Go through all the elements of the v and put any objects that meet the
		 * criteria into the av
		 */

		Iterator<Automobile> it = v.iterator();

		while (it.hasNext()) {
			Automobile tmp = it.next();

			/** option == model and operator == in and tmp.model has variable */
			if (option.equals("model") && operator.equals("in")) {

				if (tmp.getModel().indexOf(variable) != -1) {
					av.add(tmp);
					checker = true;
					continue;
				}
			}

			/** option == engine and operator == = */
			if (option.equals("engine") && operator.equals("=") && variable.equals("V")) {
				if (tmp.getEngine().equals("0")) {
					av.add(tmp);
					checker = true;
					continue;
				}
			}

			else if (option.equals("engine") && operator.equals("=") && variable.equals("straight")) {
				if (tmp.getEngine().equals("1")) {
					av.add(tmp);
					checker = true;
					continue;
				}
			}

			/** option == transmission and operator == = */
			if (option.equals("transmission") && operator.equals("=") && variable.equals("automatic")) {
				if (tmp.getTransmission().equals("0")) {
					av.add(tmp);
					checker = true;
					continue;
				}
			}

			else if (option.equals("transmission") && operator.equals("=") && variable.equals("manual")) {
				if (tmp.getTransmission().equals("1")) {
					av.add(tmp);
					checker = true;
					continue;
				}
			}

			if (checker == false) {
				switch (option) {
				case "miles":
					if (operator.equals("=")) {
						if (Double.parseDouble(tmp.getMilesPerGallon()) == Double.parseDouble(variable)) {
							av.add(tmp);
						}
					} else if (operator.equals(">")) {
						if (Double.parseDouble(tmp.getMilesPerGallon()) > Double.parseDouble(variable)) {
							av.add(tmp);
						}
					} else if (operator.equals("<")) {
						if (Double.parseDouble(tmp.getMilesPerGallon()) < Double.parseDouble(variable)) {
							av.add(tmp);
						}
					}
					break;

				case "cylinders":
					if (operator.equals("=")) {
						if (Integer.parseInt(tmp.getNumberOfCylinders()) == Integer.parseInt(variable)) {
							av.add(tmp);
						}
					} else if (operator.equals(">")) {
						if (Integer.parseInt(tmp.getNumberOfCylinders()) > Integer.parseInt(variable)) {
							av.add(tmp);
						}
					} else if (operator.equals("<")) {
						if (Integer.parseInt(tmp.getNumberOfCylinders()) < Integer.parseInt(variable)) {
							av.add(tmp);
						}
					}
					break;

				case "displacement":
					if (operator.equals("=")) {
						if (Double.parseDouble(tmp.getDisplacement()) == Double.parseDouble(variable)) {
							av.add(tmp);
						}
					} else if (operator.equals(">")) {
						if (Double.parseDouble(tmp.getDisplacement()) > Double.parseDouble(variable)) {
							av.add(tmp);
						}
					} else if (operator.equals("<")) {
						if (Double.parseDouble(tmp.getDisplacement()) < Double.parseDouble(variable)) {
							av.add(tmp);
						}
					}
					break;

				case "power":
					if (operator.equals("=")) {
						if (Integer.parseInt(tmp.getGrossHorsePower()) == Integer.parseInt(variable)) {
							av.add(tmp);
						}
					} else if (operator.equals(">")) {
						if (Integer.parseInt(tmp.getGrossHorsePower()) > Integer.parseInt(variable)) {
							av.add(tmp);
						}
					} else if (operator.equals("<")) {
						if (Integer.parseInt(tmp.getGrossHorsePower()) < Integer.parseInt(variable)) {
							av.add(tmp);
						}
					}
					break;

				case "rar":
					if (operator.equals("=")) {
						if (Double.parseDouble(tmp.getRearAxleRatio()) == Double.parseDouble(variable)) {
							av.add(tmp);
						}
					} else if (operator.equals(">")) {
						if (Double.parseDouble(tmp.getRearAxleRatio()) > Double.parseDouble(variable)) {
							av.add(tmp);
						}
					} else if (operator.equals("<")) {
						if (Double.parseDouble(tmp.getRearAxleRatio()) < Double.parseDouble(variable)) {
							av.add(tmp);
						}
					}
					break;

				case "weight":
					if (operator.equals("=")) {
						if (Double.parseDouble(tmp.getWeight()) == Double.parseDouble(variable)) {
							av.add(tmp);
						}
					} else if (operator.equals(">")) {
						if (Double.parseDouble(tmp.getWeight()) > Double.parseDouble(variable)) {
							av.add(tmp);
						}
					} else if (operator.equals("<")) {
						if (Double.parseDouble(tmp.getWeight()) < Double.parseDouble(variable)) {
							av.add(tmp);
						}
					}
					break;

				case "speed":
					if (operator.equals("=")) {
						if (Double.parseDouble(tmp.getQuaterMileTime()) == Double.parseDouble(variable)) {
							av.add(tmp);
						}
					} else if (operator.equals(">")) {
						if (Double.parseDouble(tmp.getQuaterMileTime()) > Double.parseDouble(variable)) {
							av.add(tmp);
						}
					} else if (operator.equals("<")) {
						if (Double.parseDouble(tmp.getQuaterMileTime()) < Double.parseDouble(variable)) {
							av.add(tmp);
						}
					}
					break;

				case "gears":
					if (operator.equals("=")) {
						if (Integer.parseInt(tmp.getNumberOfForwardGears()) == Integer.parseInt(variable)) {
							av.add(tmp);
						}
					} else if (operator.equals(">")) {
						if (Integer.parseInt(tmp.getNumberOfForwardGears()) > Integer.parseInt(variable)) {
							av.add(tmp);
						}
					} else if (operator.equals("<")) {
						if (Integer.parseInt(tmp.getNumberOfForwardGears()) < Integer.parseInt(variable)) {
							av.add(tmp);
						}
					}
					break;

				case "carburetors":
					if (operator.equals("=")) {
						if (Integer.parseInt(tmp.getNumberOfCarburetors()) == Integer.parseInt(variable)) {
							av.add(tmp);
						}
					} else if (operator.equals(">")) {
						if (Integer.parseInt(tmp.getNumberOfCarburetors()) > Integer.parseInt(variable)) {
							av.add(tmp);
						}
					} else if (operator.equals("<")) {
						if (Integer.parseInt(tmp.getNumberOfCarburetors()) < Integer.parseInt(variable)) {
							av.add(tmp);
						}
					}
					break;

				}

			}

		}

		return av;
	}
}
