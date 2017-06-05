package Module_2.HW_2_1;

import java.util.Scanner;

/**
 * Created by denis on 30.05.2017.
 */

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private ArrayHolder arrayHolder;
    private int option;
    private boolean exit = false;

    private int message(String query) {
        System.out.println(query);
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(query);
            }
        }
    }

    private int enterArraySize() {
        int size;
        while ((size = message("Enter array size: ")) < 1) {
        }
        return size;
    }

    private void createArray() {
        int[] array = new int[enterArraySize()];
        for (int i = 0; i < array.length; i++) {
            array[i] = message("array index [" + (i + 1) + "]");
        }
        arrayHolder = new ArrayHolder(array);
    }

    private void printMenu() {
        System.out.println("=======================");
        System.out.println("Make a choice!");
        System.out.println("1. Print array");
        System.out.println("2. Find index of array by value");
        System.out.println("3. Sort array A-Z");
        System.out.println("4. Sort array Z-A");
        System.out.println("5. Input array again");
        System.out.println("6. Exit");
        System.out.println("=======================");
    }

    private void runFindIndexOfArray() {
        int index = -1;
        int number = message("Enter a number: ");
        StringBuilder builder = new StringBuilder();
        while ((index = arrayHolder.findIndexOfArray(index + 1, number)) != -1) {
            builder.append(index);
            builder.append(", ");
        }
        if (builder.length() > 0) {
            builder.delete(builder.length() - 2, builder.length());
            System.out.println("\nIndex(es) of your number is(are): " + builder.toString());
        } else {
            System.out.println("\nYour number isn't in this array!");
        }
    }

    private void runSortMenuAZ() {
        arrayHolder.sortArrayAZ();
        System.out.println("Array was sorted by A to Z");
        arrayHolder.printArray();
    }

    private void runSortMenuZA() {
        arrayHolder.sortArrayZA();
        System.out.println("Array was sorted by A to Z");
        arrayHolder.printArray();
    }

    private void runPrintArray() {
        arrayHolder.printArray();
    }

    private void runExitMenu() {
        System.out.println("Good Bye!");
        scanner.close();
        exit = true;
    }

    private void makeOption() {
        do {
            option = message("Your option menu is ... ");
        } while (option < 1 || option > 6);
    }


    private void runMenu() {
        switch (option) {
            case 1:
                runPrintArray();
                break;
            case 2:
                runFindIndexOfArray();
                break;
            case 3:
                runSortMenuAZ();
                break;
            case 4:
                runSortMenuZA();
                break;
            case 5:
                createArray();
                break;
            default:
                runExitMenu();
        }
    }

    public void startApp() {
        createArray();
        while (true) {
            printMenu();
            makeOption();
            runMenu();
            if (exit) return;
        }
    }
}
