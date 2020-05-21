package com.company;

public class Main {

    private static final String FILE_PATH = "C:/Users/Lakshan Madushanka/IdeaProjects/Covid-19/src/covid-19-data.json";

    public static void main(String[] args) {
	// write your code here
        DataReader reader = new DataReader();
        reader.readData(FILE_PATH);
    }
}
