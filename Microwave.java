import java.util.Scanner;
/**
* This program will
* simply displays "Hello World!" to the standard output.
*
* @author  Gillian Gonzales
* @version 1.0
* @since   2020-02-18 
*/

public class Microwave {
  /**
  * The class that holds all of the variables and methods.
  * @para args arguments that can return
  */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int time = 600;
    double timeForSub = 1;
    double timeForPizza = .45;
    double timeForSoup = 1.45;
    System.out.println("Heating Lunch items in a microwave");
    System.out.println("Input either Sub, Pizza or Soup");
    String lunchItem = input.nextLine();
    System.out.println("How many are you putting in");
    System.out.println("Input either 1 , 2 or 3");
    int amountOfItem = input.nextInt();
    if (lunchItem.equals("Sub") && amountOfItem == 1) {
      String timeToHeat = String.valueOf(timeForSub);
      System.out.println("It will take " + timeToHeat + " min");
    } else if (lunchItem.equals("Sub") && amountOfItem == 2) {
      timeForSub = timeForSub * 1.5;
      String timeToHeat = String.valueOf(timeForSub);
      System.out.println("It will take " + timeToHeat + " mins");
    } else if (lunchItem.equals("Sub") && amountOfItem == 3) {
      timeForSub = timeForSub * 2;
      String timeToHeat = String.valueOf(timeForSub);
      System.out.println("It will take " + timeToHeat + " mins");
    } else if (lunchItem.equals("Pizza") && amountOfItem == 1) {
      String timeToHeat = String.valueOf(timeForPizza);
      System.out.println("It will take " + timeToHeat + " mins");
    } else if (lunchItem.equals("Pizza") && amountOfItem == 2) {
      timeForSub = timeForPizza * 1.5;
      String timeToHeat = String.valueOf(timeForPizza);
      System.out.println("It will take " + timeToHeat + " mins");
    } else if (lunchItem.equals("Pizza") && amountOfItem == 3) {
      timeForSub = timeForPizza * 2;
      String timeToHeat = String.valueOf(timeForPizza);
      System.out.println("It will take " + timeToHeat + " mins"); 
    } else if (lunchItem.equals("Soup") && amountOfItem == 1) {
      String timeToHeat = String.valueOf(timeForSoup);
      System.out.println("It will take " + timeToHeat + " mins");
    } else if (lunchItem.equals("Soup") && amountOfItem == 2) {
      timeForSoup = timeForSoup * 1.5;
      String timeToHeat = String.valueOf(timeForSoup);
      System.out.println("It will take " + timeToHeat + " mins");
    } else if (lunchItem.equals("Soup") && amountOfItem == 3) {
      timeForSoup = timeForSoup * 2;
      String timeToHeat = String.valueOf(timeForSoup);
      System.out.println("It will take " + timeToHeat + " mins");
    } else if (amountOfItem == 0) {
      System.out.println("It will take 0 mins");
    } else {
      System.out.println("Invaild Answer");
    }
  }
}