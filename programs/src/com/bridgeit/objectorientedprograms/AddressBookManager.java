package com.bridgeit.objectorientedprograms;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.IIOException;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class AddressBookManager {
	ObjectMapper objectMapper = new ObjectMapper();
	AddressBook addressbook = new AddressBook();
	File file;
	static Scanner s = new Scanner(System.in);

	public void create() throws IOException {

		System.out.println("Give a name to your new address book:");
		file = new File("/home/bridgeit/Desktop/" + s.next() + ".Json");
		try {
			if (file.createNewFile()) {
				System.out.println("Address book is created!");
				FileWriter fw = new FileWriter(file);
				fw.write("{}");
				fw.flush();
				fw.close();
			} else {
				System.out.println("Address book is already exists.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		addressbook.operation();
	}

	public void open() throws IOException {

		File folder = new File("/home/bridgeit/Desktop");
		File[] arr = folder.listFiles();
		for (File file : arr) {
			System.out.println(file);
		}
		String folderpath = "/home/bridgeit/Desktop";
		System.out.println("enter the filename:");
		String filename = s.next();
		folderpath.concat("/").concat("filename");

		if (!Desktop.isDesktopSupported()) {
			System.out.println("desktop is not supported");
			return;
		}
		Desktop d = Desktop.getDesktop();

		if (file.exists()) {

			d.open(file);
		}
	}

	public void save() throws IOException {
		ArrayList<Person> arrayList = new ArrayList<Person>();
		arrayList = addressbook.list();
		try {

			objectMapper.writeValue(file, arrayList);
			System.out.println("Your file is Successfully saved");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void saveAs() {
		System.out.println("enter your new file name:");
		File filename =new File( "/home/bridgeit/Desktop/" + s.next() + ".json");

		ArrayList<Person> arrayList = new ArrayList<Person>();
		arrayList = addressbook.list();
		try {

			objectMapper.writeValue(filename, arrayList);
			System.out.println("Your file is Successfully saved");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void quit() {
		System.out.println("enter any key to exit:");

	}

	public static void main(String[] args) throws IOException {

		AddressBookManager manager = new AddressBookManager();
		System.out.println("Welcome to Address");
		do {
			System.out.println("Make a choice from below");
			System.out.println("1. Create\t 2. Open\t 3. Save\t4. Save As\t 5.Quit");
			File file = null;
			switch (s.nextInt()) {
			case 1:
				manager.create();
				break;
			case 2:
				manager.open();
				break;
			case 3:
				manager.save();
				break;
			case 4:
				manager.saveAs();
				break;

			case 5:
				System.exit(0);

			}
		} while (true);
	}
}
