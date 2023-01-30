/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payroll;

import java.util.Scanner;

/**
 *
 * @author Arun kumar
 */
public class PartTimeEmployee extends Employee{
   private double bonus;//the amount of bonus they should receive
	
        
        public PartTimeEmployee(String name, double hours, double wage)
        {
            super(name);
            this.setHourlyWage(wage);
            this.setHours(hours);
            System.out.println("Please enter a bonus for the PartTimeEmployee");
            Scanner sc = new Scanner(System.in);
            double givenBonus = sc.nextDouble();
            bonus = givenBonus;
        }
	/**
	 * A constructor that sets the bonus to zero
	 * @param newName
	 */
	public PartTimeEmployee(String newName) {
		super(newName);
		bonus =0;
	}
	
	/**
	 * Accessors and mutators for bonus
	 */
	public void setBonus (double bonusAmount)
	{
		bonus = bonusAmount;
	}
	
	public double getBonus()
	{
		return bonus;
	}
	
	/**
	 * A method that calculates the pay for a manager,
	 * Note that this is override from the base class.
	 */
	public double calculatePay()
	{
		return getWage() * getHours() + bonus;
	}
	
	/**
	 * A method that calculates the pay based on 
	 * a percentage given for the bonus
	 * @param bonusPercent
	 * @return
	 */
	public double calculatePay(double bonusPercent)
	{
		bonusPercent = bonusPercent/100;
		double pay = getWage() * getHours();
		return ((bonusPercent*pay) + pay);
	}
        
        /**
         * A method to print the PartTimeEmployee's statement to the console
         */
        public void printStatement()
        {
        System.out.println(" PartTimeEmployee:" + getName() + " is owed: ");
        System.out.printf("%s%.2f\n", " $", calculatePay() );
        System.out.println("**************************************************************");
        }
	
}
