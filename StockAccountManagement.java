package com.bridgelab.Assignment_11_12;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author atik
 * Program to manage stock account and display total stock result
 */
public class StockAccountManagement {
	public static void main(String[] args) {
		StockPortfolio stockPortfolio = new StockPortfolio();
		stockPortfolio.stockPortFolio();
	}
}

// Taking all necessary data of stock from user
class Stock {
	int stocksNumber;
	int numOfShares;
	float sharePrice;
	ArrayList<String> stockNames;

	// constructor
	public Stock() {
		stockNames = new ArrayList<>();
	}

	//Adding stock names
	public void addStockName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the stock name  : ");
    	String stockName = sc.nextLine();
    	stockNames.add(stockName);
    	System.out.println("Stocks names are:"+stockNames);
        }
}

/*
  	Doing all operations adding stock name, share price, number of shares 
	then calculating the total values of stocks
 */
class StockPortfolio extends Stock {
	float totalStockValue;
	
	//  Taking values of shares and price from user
	public void stockPriceInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Shares:");
		numOfShares = sc.nextInt();
		System.out.println("Enter share price:");
		sharePrice = sc.nextFloat();
		
	}
	
	//  This method is used to calculate total value of stock using share price and number of shares
	public double stockCalculate() {
		this.totalStockValue = sharePrice * numOfShares;
		return totalStockValue;
	}
	
	// calculates the total value of the total stocks
	public void stockPortFolio() {
		int i = 0;
		float stockValue = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stocks number:");
		stocksNumber = sc.nextInt();
		
		// Iterating the adding and calculation method till stock number reached
		while (i < stocksNumber) {
				addStockName();
				stockPriceInput();
				stockCalculate();
				System.out.println("Total value of stock is: " + stockCalculate());
				stockValue += totalStockValue;
				i++;
		}
		System.out.println("Total Stock Portfolio Value is : " + stockValue);
	}
}