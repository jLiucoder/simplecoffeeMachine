
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean repeat = true;

        int waterInput = 400;
        int milkInput = 540;
        int beanInput = 120;
        int cups = 9;
        int moreWater = 0;
        int moreMilk = 0;
        int moreBean = 0;
        int moreCup = 0;
        int money = 550;
        System.out.println();

        while (repeat) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String action = scan.nextLine();
            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 -cappuccino, back - to main menu:");
                    String coffeeChoice = scan.nextLine();
                    switch (coffeeChoice) {
                        case "1":
                            if (waterInput < 250) {
                                System.out.println("Sorry, not enough water");
                            } else if (beanInput < 16) {
                                System.out.println("Sorry, not enough coffee beans");
                            } else if (cups <= 0) {
                                System.out.println("Sorry, not enough cups");
                            } else {
                                System.out.println("I have enough resources, making you a coffee!\n");

                                waterInput -= 250;
                                beanInput -= 16;
                                cups -= 1;
                                money += 4;
                            }
                            break;
                        case "2":
                            if (waterInput < 350) {
                                System.out.println("Sorry, not enough water");
                            } else if (milkInput < 75) {
                                System.out.println("Sorry, not enough milk");
                            } else if (beanInput < 20) {
                                System.out.println("Sorry, not enough coffee beans");
                            } else if (cups <= 0) {
                                System.out.println("Sorry, not enough cups");
                            } else {
                                System.out.println("I have enough resources, making you a coffee!\n");
                                waterInput -= 350;
                                milkInput -= 75;
                                beanInput -= 20;
                                cups -= 1;
                                money += 7;
                            }
                            break;
                        case "3":
                            if (waterInput < 200) {
                                System.out.println("Sorry, not enough water");
                            } else if (milkInput < 100) {
                                System.out.println("Sorry, not enough milk");
                            } else if (beanInput < 12) {
                                System.out.println("Sorry, not enough coffee beans");
                            } else if (cups <= 0) {
                                System.out.println("Sorry, not enough cups");
                            } else {
                                System.out.println("I have enough resources, making you a coffee!\n");
                                waterInput -= 200;
                                milkInput -= 100;
                                beanInput -= 12;
                                cups -= 1;
                                money += 6;
                            }
                            break;
                        case "back":
                            break;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add: ");
                    moreWater = scan.nextInt();
                    waterInput += moreWater;
                    System.out.println("Write how many ml of milk you want to add: ");
                    moreMilk = scan.nextInt();
                    milkInput += moreMilk;
                    System.out.println("Write how many grams of coffee beans you want to add: ");
                    moreBean = scan.nextInt();
                    beanInput += moreBean;
                    System.out.println("Write how many disposable cups of coffee you want to add:");
                    moreCup = scan.nextInt();
                    cups += moreCup;
                    break;
                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    System.out.println();

                    break;
                case "remaining":
                    System.out.println();
                    resultOutput(waterInput, milkInput, beanInput, cups, money);
                    break;

                case "exit":
                    repeat = false;
                    break;
            }
        }
    }

    private static void resultOutput(int waterInput, int milkInput, int beanInput, int cups, int money) {
        System.out.println("The coffee machine has:");
        System.out.println(waterInput + " ml of water");
        System.out.println(milkInput + " ml of milk");
        System.out.println(beanInput + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money");
    }
}