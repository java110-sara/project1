//name: Sara Russert
//date: 1/5/24
//file: Knapsack.java

import java.util.Scanner;

public class Knapsack {
   public static void main(String[] args) {
      // declare 3 types of treasure and their values as constant ints
      // Treasure A: size 8 cubic cm, and is worth $40
      // Treasure B: size 3 cubic cm, and is worth $10
      // Treasure C: size 1 cubic cm, and is worth $2
      int TREASURE_A_SIZE = 8, TREASURE_B_SIZE = 3, TREASURE_C_SIZE = 1;
      int TREASURE_A_VALUE = 40, TREASURE_B_VALUE = 10, TREASURE_C_VALUE = 2;
      
      // declare var int for user input knapsack size
      int knapsackSize;
      
      // declare int vars for num, total val of each treasure, and total treasure val
      int numOfA, numOfB, numOfC;
      int valOfA, valOfB, valOfC;
      int totalVal;
      
      // handy var for holding remaining sack value
      int remainder;
      
      // create Scanner object to read keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      // prompt user for knapsack size and store in knapsackSize
      System.out.print("Enter the size of the sack:  ");
      knapsackSize = keyboard.nextInt();
      
      // logic for max treasures
      // get divisor of each treasure from the remaining size value after each largest treasure is removed
      // store value of specific treasure based on qty and unit value
      // keep running total treasure value
      numOfA = knapsackSize / TREASURE_A_SIZE;
      valOfA = numOfA * TREASURE_A_VALUE;
      remainder = knapsackSize % TREASURE_A_SIZE;
      totalVal = valOfA;
      
      numOfB = remainder / TREASURE_B_SIZE;
      valOfB = numOfB * TREASURE_B_VALUE;
      remainder %= TREASURE_B_SIZE;
      totalVal += valOfB;
      
      numOfC = remainder / TREASURE_C_SIZE;
      valOfC = numOfC * TREASURE_C_VALUE;
      totalVal += valOfC;
      
      // print results to the user
      System.out.println("A knapsack of size " + knapsackSize + " cubic cm can contain the following:");
      System.out.println("A bricks:  " + numOfA + ", worth $" + valOfA);
      System.out.println("B bricks:  " + numOfB + ", worth $" + valOfB);
      System.out.println("C bricks:  " + numOfC + ", worth $" + valOfC); 
      System.out.println("Total value collected: $" + totalVal);
      
      // cute project!
   }
   
}