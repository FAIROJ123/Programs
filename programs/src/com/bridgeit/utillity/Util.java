
package com.bridgeit.utillity;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.StandardSocketOptions;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

import javax.swing.text.html.parser.Parser;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;

import com.bridgeit.datastructures.OrderedNode;
import com.bridgeit.datastructures.StackImpl;
import com.bridgeit.functional.Flipcoin;
import com.bridgeit.functional.Replacestring;

 public class Util {
	private Scanner sc;
	public static final String BinarySearchString = null;
	private boolean running;
	private static long startTime;
	private long stopTime;
	private static int numDays = 0;
	private static int h = 0;
	static BufferedReader br;
	BufferedReader rf = null;

	// Utility constructor for creating object for BufferedReader
	public Util() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public static FileReader fileRead(String string)
    {
        FileReader f = null;
        try {
            f = new FileReader(string);
        } catch (FileNotFoundException e) {
       
            e.printStackTrace();
        }
        return f;   
    }

//To write into file
    public static FileWriter fileWrite(String string)
    {
        FileWriter f = null;
        try
        {
            f = new FileWriter(string);
        }
        catch (IOException e)
        {
            //
            e.printStackTrace();
        }
        return f;   
}

	// input string
	public String inputString() {
		try {
			return br.readLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	// input Integer
	public int inputInteger() {
		try {
			return Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	// input double
	public double inputDouble() {
		try {
			return Double.parseDouble(br.readLine());
		} catch (Exception e) {
			System.out.println(e);
		}
		new BufferedReader(new InputStreamReader(System.in));
		return 0.0;
	}

	// input boolean
	public static boolean inputBoolean() {
		try {
			return Boolean.parseBoolean(br.readLine());
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	public long inputLong() {
		try {
			return sc.nextLong();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;

	}

	// taking integer array input
	public Integer[] inputIntArray(int size) {
		Integer array[] = new Integer[size];
		for (int i = 0; i < size; i++) {
			System.out.print("Please enter Element at " + (i + 1) + " position: ");
			array[i] = this.inputInteger();
		}
		return array;
	}

	
	public String[] inputStringArray(int size) {
		String array[] = new String[size];
		for (int i = 0; i < size; i++) {
			System.out.print("Please enter String at " + (i + 1) + " position: ");
			array[i] = this.inputString();
		}
		return array;
	}

	// Array Printing(one dimentional) Generic type
	public <T> void printArray(T[] inputArray) {
		for (T i : inputArray)
			System.out.print(i + " ");

		System.out.println();
	}

	// Array printing(two dimentional) Generic type
	public <T> void printArray(T[][] inputArray, int row, int column) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(inputArray[i][j] + " ");
			}
			System.out.println();
		}
	}

	// reading file
	public String readFile(File file) {

		try {
			BufferedReader rf = new BufferedReader(new FileReader(file));
			return rf.readLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		return " ";
	}

	// Writing into file into Data
	public void writeFile(File file, int data) {
		try {
			String str = this.readFile(file);
			str = str.trim();
			BufferedWriter wr = new BufferedWriter(new FileWriter(file));
			wr.write(str + data + " ");
			wr.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// writing into file String data
	public void writeFile(File file, String data) {
		try {
			String string = this.readFile(file);
			string = string.trim();
			BufferedWriter wr = new BufferedWriter(new FileWriter(file));
			wr.write(string + " " + data);
			wr.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// Clear the Data inside the file
	public void clearFile(File f) {
		try {
			String s = this.readFile(f);
			BufferedWriter wr = new BufferedWriter(new FileWriter(f));
			wr.write(" ");
			wr.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// Determine percentage of tails and heads.
	public void flip(int n) {

		int i = 1;
		double result;
		double heads = 0.0;

		while (i <= n) {

			result = Math.random();
			if (result < 0.5) {
				System.out.println("result is heads:");
				heads++;
			} else
				System.out.println("result is tails:");
			i++;

		}

		double percentHeads = heads / n * 100;
		double percentTails = (n - heads) / n * 100;
		System.out.println("percentage of head is:" + percentHeads);
		System.out.println("percentage tail is:" + percentTails);

	}

	// find the given year is leap year or not.

	public static boolean isLeapYear(int n) {
		boolean leap = false;

		if (n % 4 == 0) {
			if (n % 100 == 0) {

				if (n % 400 == 0)
					leap = true;
				else
					leap = false;
			} else
				leap = true;
		} else
			leap = false;

		if (leap)
			System.out.println(n + " is a leap year.");
		else
			System.out.println(n + " is not a leap year.");
		return leap;
	}

	// determine the power of 2
	public int power(int n) {
		int power = 1;
		int i = 0;
		System.out.println("Powers of 2 that are less than 2^" + n);

		while (i <= n) {
			System.out.println("2^" + i + " = " + power);
			power = power * 2;
			i++;
		}

		return power;

	}

	// print the nth hormonic number.
	public void hormonic(int n) {
		double sum = 0.0;
		for (int i = 1; i <= n; i++) {
			sum = sum + 1.0 / i;
		}

		System.out.println(sum);

	}

	// Computes the prime factorization of N using brute force.

	public void prime(int n) {
		int i = 2;
		while (n >= i)// instead of i<=n
		{
			if (n % i == 0) {
				System.out.print(i + " ");
				n = n / i;
			} else
				i++;
		}
	}

// Cross Game.
	public void game(int a, int goal, int n) {

		int bets = 0;
		int wins = 0;
		int trials = n;
		int stake = a;

		for (int t = 0; t < trials; t++) {

			int cash = stake;

			while (cash > 0 && cash < goal) {
				bets++;
				if (Math.random() < 0.5) {
					cash++;

				} else {
					cash--;
				}
				if (cash == goal)
					wins++;
			}

			System.out.println(wins + " wins of " + trials);
			System.out.println("Percent of games won = " + 100.0 * wins / trials);
			System.out.println("Avg of bets           = " + 100.0 * bets / trials);
		}
	}

	// coupon number

	public static int getCoupon(int n) {
		return (int) (Math.random() * n);
	}

	public static int collect(int n) {
		boolean[] isCollected = new boolean[n];
		int count = 0;
		int distinct = 0;

		while (distinct < n) {
			int value = getCoupon(n);
			count++;
			if (!isCollected[value]) {
				distinct++;
				isCollected[value] = true;
			}
		}
		return count;
	}

	// Two Diamentional array creation.
	static public void numberMatrix()
	{

	Util utility = new Util();
	System.out.println("Enter the number of rows");
	int rows = utility.inputInteger();
	System.out.println("Enter the number of columns");
	int columns = utility.inputInteger();
	int a[][] = new int[rows][columns];
	System.out.println("Entered the values of matrix");
	for (int i = 0; i < rows; i++)

	{
		for (int j = 0; j < columns; j++)

		{
			a[i][j] = utility.inputInteger();
		}
	}
	System.out.println("The entered numbered matrix values are");
	for (int i = 0; i < rows; i++)

	{
		for (int j = 0; j < columns; j++)

		{
			System.out.print(a[i][j] + " ");
		}
		System.out.println();
	}

}

static public void floatMatrix()

{
	Util utility = new Util();
	float a[][] = new float[3][3];
	System.out.println("Enter the number of rows");
	int rows = utility.inputInteger();
	System.out.println("Enter the number of columns");
	int columns = utility.inputInteger();
	System.out.println("Enter the values of matrix");
	for (int i = 0; i < rows; i++)

	{
		for (int j = 0; j < columns; j++)

		{
			a[i][j] = utility.inputFloat();

		}
	}
	for (int i = 0; i < rows; i++)

	{
		for (int j = 0; j < columns; j++)

		{
			System.out.print(a[i][j] + " ");
		}
		System.out.println();
	}

}

private float inputFloat() {
	try {
		return sc.nextLong();
	} catch (Exception e) {
		System.out.println(e);
	}
	return 0;
}

/**
 * 
 */
static public void booleanMatrix() {

	Util utility = new Util();
	boolean a[][] = new boolean[3][3];
	System.out.println("Enter the number of rows");
	int rows = utility.inputInteger();
	System.out.println("Enter the number of columns");
	int columns = utility.inputInteger();
	System.out.println("Enter the values of matrix");
	for (int i = 0; i < rows; i++)

	{
		for (int j = 0; j < columns; j++)

		{
			a[i][j] = utility.inputBoolean();

		}
	}
	System.out.println("The entered booleanmatrix vaues is");
	for (int i = 0; i < rows; i++)

	{
		for (int j = 0; j < columns; j++)

		{
			System.out.print(a[i][j] + " ");
		}
		System.out.println();
	}

}


	// Sum of three Integer adds to ZERO

	public static void findTriplets(int[] arr, int n) {
		boolean temp = false;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.print(arr[i]);
						System.out.print(" ");
						System.out.print(arr[j]);
						System.out.print(" ");
						System.out.print(arr[k]);
						System.out.print("\n");
						temp = true;
					}
				}
			}
		}

		if (temp == false) {
			System.out.println("irt is not a tripplet");
		}

	}

	// Write a program Distance.java that takes two integer command-line arguments x
	// and y and prints the Euclidean distance from the point (x, y) to the origin
	// (0, 0). The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power
	// function

	public static void distance(int x, int y) {
		double dist = Math.sqrt(x * x + y * y);

		System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
	}

	// Write static functions to return all permutation of a String using iterative
	// method and Recursion method. Check if the arrays returned by two string
	// functions are equal.

	// 1. by using recursion

	public static String swap(String st, int i, int j) {
		char[] ch = st.toCharArray();
		char temp;
		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return String.valueOf(ch);

	}

	public void permute(String str, int l, int r) {
		if (l == r)
			System.out.println(str);
		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	// Stopwatch program.

	public long getElapsedTime() {
		return stopTime - startTime;
	}

	public double getElapsedTimeSecs() {
		double elapsed;
		elapsed = ((double) (stopTime - startTime)) / 1000;
		return elapsed;
	}

	public double start() {
		return startTime = System.currentTimeMillis();
	}

	public double stop() {
		return stopTime = System.currentTimeMillis();

	}

	public void stop1() {
		stopTime = System.currentTimeMillis();
		System.out.println(" StopWatch elapsed time in millisec: " + getElapsedTime() + " milliseconds.");
		System.out.println(" StopWatch elapsed time in seconds: " + getElapsedTimeSecs() + " seconds.");

	}

	// Cross game.

	public static String checkWinner(String[] board, String turn) {
		for (int a = 0; a < 8; a++) {
			String line = null;
			switch (a) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			if (line.equals("XXX")) {
				return "X";
			} else if (line.equals("OOO")) {
				return "O";
			}
		}

		for (int a = 0; a < 9; a++) {
			if (Arrays.asList(board).contains(String.valueOf(a + 1))) {
				break;
			} else if (a == 8)
				return "draw";
		}

		System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
		return null;
	}

	public static void printBoard(String[] board) {
		System.out.println("/---|---|---\\");
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("/---|---|---\\");
	}

	public static void populateEmptyBoard(String[] board) {
		for (int a = 0; a < 9; a++) {
			board[a] = String.valueOf(a + 1);
		}
	}

	// Quadratic.java

	public void getQuadratic(int a, int b, int c) {
		System.out.println("Given quadratic equation:" + a + "x^2 + " + b + "x + " + c);

		int d = b * b - 4 * a * c;

		if (d > 0)

		{

			System.out.println("Roots are real and unequal");

			int root1 = (int) ((-b + Math.sqrt(d)) / (2 * a));

			int root2 = (int) ((-b - Math.sqrt(d)) / (2 * a));

			System.out.println("First root is:" + root1);

			System.out.println("Second root is:" + root2);

		}

		else if (d == 0)

		{

			System.out.println("Roots are real and equal");

			int root1 = (int) ((-b + Math.sqrt(d)) / (2 * a));

			System.out.println("Root:" + root1);

		}

		else

		{

			System.out.println("Roots are imaginary");

		}

	}

	// WildChill.java

	public double getWild(double t, double v) {

		double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
		System.out.println("Temperature = " + t);
		System.out.println("Wind speed  = " + v);
		System.out.println("Wind chill  = " + w);
		return w;

	}

	// Anagram or not.

	public void isAnagram(String s1, String s2) {
		// Removing white spaces from
		String str1 = s1.replaceAll("\\s", "");
		String str2 = s2.replaceAll("\\s", "");
		boolean status = true;

		if (str1.length() != str2.length()) {
			status = false;
		} else {
			char[] s1Array = str1.toLowerCase().toCharArray();
			char[] s2Array = str2.toLowerCase().toCharArray();
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			status = Arrays.equals(s1Array, s2Array);
		}
		if (status) {
			System.out.println(s1 + " and " + s2 + " are anagrams");
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams");
		}
	}

	// prime numbers between the range 1-1000.

	public void primeNumbers() {
		int i = 0;
		int num = 0;
		String primeNumbers = "";

		for (i = 1; i <= 1000; i++) {
			int count = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					count = count + 1;
				}
			}
			if (count == 2) {

				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to 1000 are :");
		System.out.println(primeNumbers);

	}

	// find the number is Palindrome or not

	public boolean isPalindrome(int n) {
		int temp = n;
		int sum = 0;
		int r;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			return true;
		else
			return false;

	}

	// prime palindrome

	public static void primepalindrome()

	{
		boolean isPrime;
		int rem, temp, reversed;
		for (int number = 1; number <= 1000; number++) {
			isPrime = true;
			if (number >= 2) {
				for (int i = 2; i <= (number / 2); i++) {
					if ((number % i) == 0)
						isPrime = false;
				}
				if (isPrime) {
					temp = number;
					reversed = 0;
					while (temp != 0) {
						rem = temp % 10;
						reversed = (reversed * 10) + rem;
						temp /= 10;
					}
					if (reversed == number) {
						System.out.print(number + " ");
					}
				}
			}
		}
		System.out.println();
	}

	// Binarsearch for searchiong a word..

	public static int searchWord(String[] arr, String key) {
		int first = 0;
		int last = arr.length;

		while (first < last) {
			int mid = (first + last) / 2;
			if (key.compareTo(arr[mid]) < 0) {
				last = mid;
			} else if (key.compareTo(arr[mid]) > 0) {
				first = mid + 1;
			} else {
				return mid;
			}
		}
		return -(first + 1);
	}

	// Bubblesort using generics.

	public <E> void bubbleSort(E[] arr) {
		for (int iter = 1; iter < arr.length; iter++) {
			for (int i = 0; i < (arr.length - iter); i++) {
				if ((((Comparable) (arr[i])).compareTo(arr[i + 1])) > 0) {
					E tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
				}
			}
		}
	}

	public static <E> void display(E[] arr) {
		for (E i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// insertionsort by using generics.

	public static <E extends Comparable<? super E>> void insertionSortGenerics(E[] arr) {
		for (int i = 1; i < arr.length; i++) {
			E key = arr[i];
			int position = i;
			while (position > 0 && arr[position - 1].compareTo(key) > 0) {
				arr[position] = arr[position - 1];
				position--;
			}

			arr[position] = key;
		}
	}

	// Binarysearch by using generics

	public <T extends Comparable<T>> int binarySearch(T[] array, T a, int lo, int hi) {
		if (lo > hi)
			return -1;
		if (a == null)
			return -1;

		int mid = (lo / 2) + (hi / 2);
		int cmp = array[mid].compareTo(a);
		if (cmp < 0)
			return binarySearch(array, a, lo, mid - 1);
		else if (cmp > 0)

			return binarySearch(array, a, mid + 1, hi);
		else

			return mid;

	}

	// Binary search for integers.

	public int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

			return binarySearch(arr, mid + 1, r, x);
		}

		return -1;
	}

	// Insertion sort for string.

	public static void insertionSort(String[] arr) {
		for (int i = 1; i < arr.length; i++) {
			String key = arr[i];
			int position = i;
			while (position > 0 && arr[position - 1].compareTo(key) > 0) {
				arr[position] = arr[position - 1];
				position--;
			}

			arr[position] = key;
		}
	}

	// BubbleSort integers.

	public void bubbleSorting(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {

					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}

	}

	// Merge Sort of Strings.

	void merge(int arr[], int l, int m, int r) {

		int n1 = m - l + 1;
		int n2 = r - m;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		int i = 0, j = 0;

		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	public void sort(int arr[], int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;

			sort(arr, l, m);
			sort(arr, m + 1, r);

			merge(arr, l, m, r);
		}
	}

	public void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void merge(String[] names, String[] left, String[] right) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < names.length; i++) {
			if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
				names[i] = left[a];
				a++;
			} else {
				names[i] = right[b];
				b++;
			}
		}
	}

	// Find a number.
	public static int questionNumber(int low, int power) {
		if (low > power) {
			return -1;

		}
		if (power == low) {
			return low;
		}

		int middle = (low + power) / 2;
		System.out.println("your number in between " + low + " to " + middle);
		System.out.println("if yes then type true if no then type false ");
		boolean flag = true;

		if (flag != inputBoolean()) {
			low = middle + 1;
		} else {
			power = middle;
		}
		return questionNumber(low, power);
	}

	// Vending Machine.
	static int total = 0;

	public static void function(int value) {

		if (value >= 1000) {
			value = value - 1000;
			System.out.println("1000");
			total++;
			function(value);
		} else if (value >= 500) {
			value = value - 500;
			System.out.println("500 ");
			total++;
			function(value);
		} else if (value >= 100) {
			value = value - 100;
			System.out.println("100 ");
			total++;
			function(value);
		} else if (value >= 50) {
			value = value - 50;
			System.out.println("50 ");
			total++;
			function(value);
		} else if (value >= 10) {
			value = value - 10;
			System.out.println("10 ");
			total++;
			function(value);
		} else if (value >= 5) {
			value = value - 5;
			System.out.println("5 ");
			total++;
			function(value);
		} else if (value >= 2) {
			value = value - 2;
			System.out.println("2 ");
			total++;
			function(value);
		} else if (value >= 1) {
			value = value - 1;
			System.out.println("1 ");
			total++;
			function(value);
		}

		System.out.println("Total No. of notes: " + total);
	}

	// calender program

	public void dayOfWeek(int month, int day, int year) {

		int m = month + 12 * ((14 - month) / 12) - 2;

		if (month <= 2) {
			year--;
		}
		int y0 = year - (14 - month) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

		int d = (day + x + 31 * m / 12) % 7;
		System.out.println("day of the week is(sun=0,mon=1,tues=2,wed=3,thur=4.friday=5,sat=6):" + d);

	}

	// Temparature convertion.

	public void convertionintoCelsius(double t) {
		double temperatue = ((t - 32) * 5) / 9;
		System.out.println("Temperatue in Celsius = " + temperatue);
	}

	public void covertionintoFahrenheit(double t) {
		double temparature = 9 * t / 5 + 32;
		System.out.println("Temperatue in Fahrenheit = " + temparature);
	}

	// Monthly payment.
	public void payment(int loan, int years, double rate) {
		double n = 12 * years;

		double c = rate / (12.0 * 100.0);

		double payment = loan * c / (Math.pow(1 + c, n) - 1);
		System.out.println("payment = $" + payment);
	}

	// Square root.
	public void squareroot(double c) {
		double epsilon = 1e-15; // relative error tolerance
		double t = c;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;
		}

		System.out.println(t);
	}

	// Decimal to binary convertion.(32bits)

	public void convertBinary(int num) {
		String s = " ";
		for (int i = 0; i < 32; i++) {
			if (num % 2 == 1) {
				s = '1' + s;
			}
			if (num % 2 == 0) {
				s = '0' + s;
			}
			num = num / 2;
		}
		System.out.println("Binary equivalent is:" + s);

	}

	// integer converting in to Binary(8bits)

	public void integerBinary(int num) {
		String s = " ";
		for (int i = 0; i < 8; i++) {
			if (num % 2 == 1) {
				s = '1' + s;
			}
			if (num % 2 == 0) {
				s = '0' + s;
			}
			num = num / 2;
		}
		System.out.println("Binary equivalent is:" + s);

	}

	// Swap nibbles.

	public int swapNibbles(int num) {
		return ((num & 0x0F) << 4 | (num & 0xF0) >> 4);

	}

	// checking power of 2 or not
	public static boolean isPowerOfTwo(int n) {
		if (n == 0)
			return false;

		while (n != 1) {
			if (n % 2 != 0)
				return false;
			n = n / 2;
		}
		return true;
	}

	// calender.java.

	public static int day(int month, int day, int year) {
		int y = year - (14 - month) / 12;
		int x = y + y / 4 - y / 100 + y / 400;
		int m = month + 12 * ((14 - month) / 12) - 2;
		int d = (day + x + (31 * m) / 12) % 7;
		return d;
	}

	public static boolean leapYear(int year) {
		if ((year % 4 == 0) && (year % 100 != 0))
			return true;
		if (year % 400 == 0)
			return true;
		return false;
	}

	// weekdays

	public static int dayCode(int year, int months) {
		int m, x, d, y;
		int day = 1;
		y = year - (14 - months) / 12;
		x = y + y / 4 - y / 100 + y / 400;
		m = months + 12 * ((14 - months) / 12) - 2;
		d = (day + x + (31 * m) / 12) % 7;

		return d;
	}

	public static void store(int daycode, int months) {
		LinkList list = new LinkList();
		char week[] = { ' ', 'S', 'M', 'T', 'W', 'T', 'F', 'S' };
		int day[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int k = 1;
		for (int i = 1; i <= day[months]; i++) {
			list.insert(i, week[k]);
			k++;
			if ((i + daycode) % 7 == 0 || i == day[months]) {
				k = 1;
			}
		}
		list.display();
	}

	public static void print(int year, int d, int months) {
		int day[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String month[] = { " ", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		System.out.println("     " + month[months] + " " + year);
		System.out.println("su mo tu we th fr sat");
		for (int i = 0; i < d; i++) {
			System.out.print("   ");
		}
		for (int i = 1; i <= day[months]; i++) {
			System.out.printf("%2d ", i);

			if (((i + d) % 7 == 0) || (i == day[months])) {
				System.out.println();
			}
		}
	}

	static LinkList list = new LinkList();
	static String month[] = { " ", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
	static int day[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static char week[] = { ' ', 'S', 'M', 'T', 'W', 'T', 'F', 'S' };
	static int months;

	//
	public boolean primeNum(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}

		}
		return true;
	}

	public boolean anagramNum(int num, int num1) {
		String str1 = "";
		String str2 = "";
		str1 = String.valueOf(num);
		str2 = String.valueOf(num1);
		char[] charFromWord = str1.toCharArray();
		char[] charFromAnagram = str2.toCharArray();
		Arrays.sort(charFromWord);
		Arrays.sort(charFromAnagram);
		return Arrays.equals(charFromWord, charFromAnagram);

	}

	public LinkedList<Integer> primeNumber(int start, int end) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int a = start; a < end; a++) {
			int number = a;
			int count = 0;
			for (int i = 1; i <= number; i++) {
				count = 0;
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						count++;
						break;
					}
				}
			}
			if (count == 0) {
				list.add(a);
			}
		}

		return list;

	}

	public boolean anagram(int number, int number2) {
		String string = Integer.toString(number);
		char[] charArray = string.toCharArray();
		String string2 = Integer.toString(number2);
		char[] charArray2 = string2.toCharArray();
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		string = new String(charArray);
		string = new String(charArray2);
		if (string.length() == string2.length()) {
			if (string.equals(string2)) {
				return true;
			}
		}

		return false;

	}

	// PrimeAnagram2D

	public static void dispPrimeAngram(int n) {
		int num = n;
		Util file = new Util();
		boolean status2, status, status1;
		int k = 1;
		for (int i = 2; i < n; i++) {
			for (int j = i + 1; j < num - 1; j++) {
				status2 = file.anagramNum(i, j);
				status1 = file.primeNum(i);
				status = file.primeNum(j);
				if (status2 && status && status1) {

					while (i > 100 && j > 100 && k == 1) {
						System.out.println();
						k = 0;
					}
					while (i > 200 && j > 200 && k == 0) {
						System.out.println();
						k = 2;
					}
					while (i > 300 && j > 300 && k == 2) {
						System.out.println();
						k = 3;
					}
					while (i > 400 && j > 400 && k == 3) {
						System.out.println();
						k = 4;
					}
					while (i > 500 && j > 500 && k == 4) {
						System.out.println();
						k = 5;
					}
					while (i > 600 && j > 600 && k == 5) {
						System.out.println();
						k = 6;
					}
					while (i > 700 && j > 700 && k == 6) {
						System.out.println();
						k = 7;
					}
					while (i > 800 && j > 800 && k == 7) {
						System.out.println();
						k = 8;
					}
					while (i > 900 && j > 900 && k == 8) {
						System.out.println();
						k = 9;
					}
					System.out.print(" " + i + " ");
					System.out.print(" " + j + " ");
				}

			}
		}
		System.out.println();
	}

	// RegularExpression

	public static String replaceNameFullname(String Sentence) {
		Util utility = new Util();
		System.out.println("Enter new name");
		String newname = utility.inputString();
		System.out.println("Enter full name");
		String fullname = utility.inputString();
		String replacename = Sentence.replaceAll("<<name>>", newname);
		String replacenamefullname = replacename.replaceAll("<<full name>>", fullname);

		return replacenamefullname;
	}

	public static String replaceMobilenumber(String Sentence1) {
		Util utility = new Util();
		System.out.println("Enter Mobilenumber");
		String Mobilenumber = utility.inputString();
		String replacemobilenumber = Sentence1.replaceAll("91-xxxxxxxxxx", Mobilenumber);

		return replacemobilenumber;
	}

	public static String replaceDate(String Sentence2) {
		Util utility = new Util();
		System.out.println("Enter new date");
		String newdate = utility.inputString();
		String replacedate = Sentence2.replaceAll("01/01/2016", newdate);

		return replacedate;

	}

	// StockReport

	public static void stockReport() {
		JSONArray jsonArray = new JSONArray();
		Util utility = new Util();
		System.out.println("Enter the number of company");
		int number = utility.inputInteger();
		//utility.inputString();
		//tility.inputString();
		String[] array = new String[number];
		int share[] = new int[number];
		int amount[] = new int[number];
		int total[] = new int[number];
		System.out.println("Enter Company Names: ");
		int totalStock = 0;
		for (int i = 0; i < number; i++) {

			array[i] = utility.inputString();
		}

		for (int k = 0; k < number; k++) {
			System.out.println(" number of shares for company and share amount");
			share[k] = utility.inputInteger();
			amount[k] = utility.inputInteger();
			total[k] = share[k] * amount[k];
		}

		System.out.println("*******************Stock Report**************************");
		System.out.println();
		System.out.println("  Company Name   Shares   Price   total of each");
		System.out.println();
		PrintWriter printWriter = null;
		try {
			printWriter = new PrintWriter("/home/bridgeit/Desktop/StockReport.json");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		for (int l = 0; l < number; l++) {
			System.out.println(
					"  " + array[l] + "        " + share[l] + "       " + amount[l] + "     " + total[l] + "/-");
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("Company Name", array[l]);
			jsonObject.put("Shares", share[l]);
			jsonObject.put("Price", amount[l]);
			jsonObject.put("total", total[l]);
			jsonArray.add(jsonObject);

		}

		printWriter.write(jsonArray.toJSONString());
		printWriter.flush();
		printWriter.close();
		System.out.println();
		for (int m = 0; m < number; m++) {

			totalStock = totalStock + share[m] * amount[m];
		}
		System.out.println("Total stock is: " + totalStock);

	}

	// ComertialData Management

	public static JSONObject readFromFile(String filename)
			throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {
		Object obj = new JSONParser().parse(new FileReader("/home/bridgeit/Desktop/Stockaccount.json"));
		JSONObject jo = (JSONObject) obj;
		return jo;

	}

	public static void addtoFile(String filename)
			throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {
		Util utility = new Util();
		JSONObject jsonObject = utility.readFromFile("/home/bridgeit/Desktop/Stockaccount.json");
		JSONArray jsonArray = (JSONArray) jsonObject.get("stock");
		JSONObject jsonObject2 = new JSONObject();
		System.out.println("Enter the name of the share");
		String name = utility.inputString();
		System.out.println("Enter the number of share");
		int noofshare = utility.inputInteger();
		utility.inputString();
		System.out.println("Enter the shareprice");
		int shareprice = utility.inputInteger();
		utility.inputString();
		String time = Util.getCurrentTime();
		String date = Util.getCurrentDate();
		jsonObject2.put("Name", name);
		jsonObject2.put("noofshare", noofshare);
		jsonObject2.put("Shareprice", shareprice);
		jsonObject2.put("time", time);
		jsonObject2.put("date", date);
		jsonArray.add(jsonObject2);
		jsonObject.put("stock", jsonArray);

		PrintWriter pw = new PrintWriter("/home/bridgeit/Desktop/Stockaccount.json");
		pw.write(jsonObject.toJSONString());
		pw.flush();
		pw.close();

	}

	public static void deletetoFile(String filename)
			throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {
		Util utility = new Util();
		JSONObject jsonObject = utility.readFromFile("/home/bridgeit/Desktop/Stockaccount.json");
		JSONArray jsonArray = (JSONArray) jsonObject.get("stock");
		JSONObject jsonObject3 = new JSONObject();

		System.out.println("Enter the name from user");
		String name1 = utility.inputString();

		for (int i = 0; i < jsonArray.size(); i++) {

			jsonObject3 = (JSONObject) jsonArray.get(i);
			String name = (String) jsonObject3.get("Name");
			if (name.equalsIgnoreCase(name1)) {
				jsonArray.remove(i);
				jsonObject.put("stock", jsonArray);
				PrintWriter pw = new PrintWriter("/home/bridgeit/Desktop/Stockaccount.json");
				pw.write(jsonObject.toJSONString());
				pw.flush();
				pw.close();
				break;
			}
		}

	}

	public static void sell(long shareToSell)
			throws IOException, ParseException, org.json.simple.parser.ParseException {

		Util utility = new Util();
		JSONObject jsonObject2 = utility.readFromFile("/home/bridgeit/Desktop/Stockaccount.json");
		JSONArray jsonArray = (JSONArray) jsonObject2.get("stock");
		JSONObject jsonObject3 = new JSONObject();
		System.out.println("Enter the name from user");
		String name1 = utility.inputString();

		for (int i = 0; i < jsonArray.size(); i++) {
			jsonObject3 = (JSONObject) jsonArray.get(i);
			String name2 = (String) jsonObject3.get("Name");
			if (name1.equalsIgnoreCase(name2)) {
				System.out.println("Success");
				long totalshare = (long) jsonObject3.get("noofshare");
				String time = (String) jsonObject3.get("time");
				String date = (String) jsonObject3.get("date");
				long remainingshare = totalshare - shareToSell;
				jsonObject3.put("noofshare", remainingshare);
				jsonObject3.put("time", time);
				jsonObject3.put("date", date);
				jsonArray.set(i, jsonObject3);
				jsonObject2.put("stock", jsonArray);
				PrintWriter pw = new PrintWriter("/home/bridgeit/Desktop/Stockaccount.json");
				pw.write(jsonObject2.toJSONString());
				pw.flush();
				pw.close();
				break;

			}

		}
	}

	public static void buy(long sharetoBuy)
			throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {
		Util utility = new Util();
		JSONObject jsonObject2 = utility.readFromFile("/home/bridgeit/Desktop/Stockaccount.json");
		JSONArray jsonArray = (JSONArray) jsonObject2.get("stock");
		JSONObject jsonObject3 = new JSONObject();
		System.out.println("Enter the name from user");
		String name1 = utility.inputString();

		for (int i = 0; i < jsonArray.size(); i++) {
			jsonObject3 = (JSONObject) jsonArray.get(i);
			String name2 = (String) jsonObject3.get("Name");
			if (name1.equalsIgnoreCase(name2)) {
				System.out.println("hi");
				long totalshare = (long) jsonObject3.get("noofshare");
				String time = (String) jsonObject3.get("time");
				String date = (String) jsonObject3.get("date");
				long finalshare = totalshare + sharetoBuy;

				jsonObject3.put("noofshare", finalshare);
				jsonObject3.put("time", time);
				jsonObject3.put("date", date);
				jsonArray.set(i, jsonObject3);
				jsonObject2.put("stock", jsonArray);
				PrintWriter pw = new PrintWriter("/home/bridgeit/Desktop/Stockaccount.json");
				pw.write(jsonObject2.toJSONString());
				pw.flush();
				pw.close();
				break;

			}

		}

	}

	public static void displaynoshare(String filePath)
			throws IOException, ParseException, org.json.simple.parser.ParseException {
		Util utility = new Util();
		JSONObject jsonObject2 = utility.readFromFile("/home/bridgeit/Desktop/Stockaccount.json");
		JSONArray jsonArray = (JSONArray) jsonObject2.get("stock");
		Iterator<?> iterator = jsonArray.iterator();
		JSONObject jsonObject = new JSONObject();
		while (iterator.hasNext()) {
			jsonObject = (JSONObject) iterator.next();
			long share = (long) jsonObject.get("noofshare");
			long amount = (long) jsonObject.get("Shareprice");
			String name = (String) jsonObject.get("Name");
			String date = (String) jsonObject.get("date");
			String time = (String) jsonObject.get("time");
			System.out.println("Account Holder name- " + name);
			System.out.println("Total Share -" + share);
			System.out.println("Available amount -" + amount);
			System.out.println("Date- " + date);
			System.out.println("Time - " + time);
		}
	}

	public static String getCurrentTime() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String time = sdf.format(cal.getTime());
		return time;
	}

	public static String getCurrentDate() {
		Date dNow = new Date(startTime);
		SimpleDateFormat ft1 = new SimpleDateFormat("dd/MM/yyyy");
		String date = ft1.format(dNow);
		return date;
	}

	public static int numberofrecordofpersons(String filePath)
			throws IOException, ParseException, org.json.simple.parser.ParseException {

		Util utility = new Util();
		int count = 0;
		JSONObject jsonObject = utility.readFromFile("/home/bridgeit/Desktop/Stockaccount.json");
		JSONArray jsonArray = (JSONArray) jsonObject.get("stock");
		JSONObject jsonObject3 = new JSONObject();
		Iterator<?> iterator = jsonArray.iterator();

		while (iterator.hasNext()) {
			jsonObject3 = (JSONObject) iterator.next();
			count++;
		}
		return count;

	}

	// DeckOfCards

	public String[] Deck(String[] suits, String[] cards) {
		String[] deck = new String[suits.length * cards.length];

		for (int i = 0; i < cards.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				deck[suits.length * i + j] = cards[i] + "=>" + suits[j];
			}
		}

		// shuffle
		for (int i = 0; i < deck.length; i++) {
			int r = i + (int) (Math.random() * (deck.length - i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}
		return deck;
	}

	public void distribute(String[] deck) {
		int indexOfDeck = 0;
		String[][] deckOfcard = new String[4][9];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 9; j++) {
				deckOfcard[i][j] = deck[indexOfDeck];
				indexOfDeck++;
			}
		}
		for (int i = 0; i < 4; i++) {
			System.out.print("\nPlayer " + (i + 1) + " : ");
			for (int j = 0; j < 9; j++) {
				System.out.print(deckOfcard[i][j] + ", ");
			}
			System.out.print("\n----------------------------------------------------------------------------------------------------------------------");
		}
	}

	
	
	
	// Clinical Management.
	
	
		

   

	
	
	

	

	
//CompanyShares
    
    
    
    
    public static void jsonFileWriter(String filePath, JSONArray jsonArray) {
		FileWriter fileWriter=null;
		try {
			fileWriter=new FileWriter(filePath);
			fileWriter.write(JSONValue.toJSONString(jsonArray));
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
}
    }
	
	
	public  static  JSONArray jsonFileReader(String filePath)  {
		File file=new File("CompanyShares.json");
		JSONArray jSonArray=null;
		try {
			FileReader fileReader=new FileReader(file);
			JSONParser jSonParser=new JSONParser();
			jSonArray=new JSONArray();
			jSonArray=(JSONArray) jSonParser.parse("CompanyShares.json");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jSonArray;
}
	public <T> void displayShares(String filePath) throws FileNotFoundException
	{
		Util utility=new Util();
		JSONArray jsonArray=new JSONArray();
		jsonArray=utility.jsonFileReader("CompanyShares.json");
		Iterator<?> iterator=jsonArray.iterator();
		JSONObject jsonObject=new JSONObject();
		LinkedList linkedList=new LinkedList();
		while(iterator.hasNext())
		{
			jsonObject=(JSONObject) iterator.next();
			String companyName=(String) jsonObject.get("company");
			linkedList.add (companyName);
			T share= (T) jsonObject.get("share");
			linkedList.add(share);
		}
		System.out.print("Companies shares => ");
		for(int i=0; i<linkedList.size(); i++)
		{
			System.out.print(linkedList.get(i)+" : "+linkedList.get(i+1)+", ");
			i++;
		}
		System.out.println("\n---------------------------------------------------------------------------");
	}
	
	public void addShares(String filePath) throws FileNotFoundException
	{
		Util utility=new Util();
		JSONArray jsonArray=new JSONArray();
		jsonArray=utility.jsonFileReader("CompanyShares.json");
		Iterator<?> iterator=jsonArray.iterator();
		JSONObject jsonObject=new JSONObject();
		boolean check=true;
		System.out.println("Enter the company name : ");
		String companyName=utility.inputString();
		System.out.println("Enter the number of shares to add : ");
		int numberOfShare=utility.inputInteger();
		
		while(iterator.hasNext())
		{
			jsonObject=(JSONObject) iterator.next();
			if(companyName.equals(jsonObject.get("company")))
			{
				long finalShares=(numberOfShare+(long) jsonObject.get("share"));
				jsonObject.put("share", finalShares);
				System.out.println(numberOfShare+" shares added.");
				check=false;
			}
		}
		if(!check)
		{
			utility.jsonFileWriter(filePath, jsonArray);
		}
		else if(check)
		{
			System.out.println(companyName+" Company not found.");
		}
		System.out.println("\n---------------------------------------------------------------------------");
	}
	
	
	public void removeShare(String filePath) throws FileNotFoundException
	{
		Util utility=new Util();
		JSONArray jsonArray=new JSONArray();
		jsonArray=utility.jsonFileReader(filePath);
		Iterator iterator=jsonArray.iterator();
		JSONObject jsonObject=new JSONObject();
		boolean check=true;
		System.out.println("Enter the company name : ");
		String companyName=utility.inputString();
		System.out.println("Enter the number of shares to remove : ");
		int  numberOfShare=utility.inputInteger();
		
		while(iterator.hasNext())
		{
			jsonObject=(JSONObject) iterator.next();
			if(companyName.equals(jsonObject.get("company")))
			{
				long finalShares=((long) jsonObject.get("share")-numberOfShare);
				jsonObject.put("share", finalShares);
				System.out.println(numberOfShare+" shares removed.");
				check=false;
			}
		}
		if(!check)
		{
			utility.jsonFileWriter(filePath, jsonArray);
		}
		else if(check)
		{
			System.out.println(companyName+" Company not found.");
		}
		System.out.println("\n---------------------------------------------------------------------------");
}
	
//Stock Symbol using Stack
	
	public static java.util.Stack<JSONObject> shareTransactionusingStack()
			throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {
		Util utility=new Util();
		Stack<JSONObject> stack = new Stack ();
		JSONObject jsonObject = utility.readFromFilestockaccount("/home/bridgeit/Desktop/Stockaccount.json");
		JSONArray stock = (JSONArray) jsonObject.get("stock");
		for (int i = 0; i < stock.size(); i++) {
			JSONObject transaction = (JSONObject) stock.get(i);
			stack.add(transaction);
		}
		return  stack;
}
	
	public static JSONObject readFromFilestockaccount(String filename) throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {
		Object obj = new JSONParser().parse(new FileReader("/home/bridgeit/Desktop/Stockaccount.json"));
		JSONObject jo = (JSONObject) obj;
		return jo;

	}
	
	
//Stock Queue.
	
	
	
	public static java.util.Queue<JSONObject> shareTransaction()
			throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {
		
		Util utility=new Util();
		Queue<JSONObject> queue = new java.util.LinkedList();
		JSONObject jsonObject = utility.readFromFilestockaccount("Stockaccount.json");
		JSONArray stock = (JSONArray) jsonObject.get("stock");
		for (int i = 0; i < stock.size(); i++) {
			JSONObject transaction = (JSONObject) stock.get(i);
			queue.add(transaction);
		}
		return queue;
}

	

	

}
