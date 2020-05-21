package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class DataReader {
    private static final String JSON_ARRAY = "records";
    private static final String COUNTRY = "countriesAndTerritories";
    private static final String DATE = "dateRep";
    private static final String CASES = "cases";
    private static final String DEATHS = "deaths";

    public void readData(String filepath){
        try{
            String fileContent = Files.readString(Paths.get(filepath));
            JSONObject obj = new JSONObject(fileContent);
            JSONArray arr = obj.getJSONArray(JSON_ARRAY);

            System.out.println("Date \t\t\t Reported cases \t\t\t Deaths");

            for(int i=0;i<arr.length();i++){
                if(arr.getJSONObject(i).getString(COUNTRY).equals("Sri_Lanka")){
                    System.out.println(arr.getJSONObject(i).getString(DATE)+"\t\t\t"+arr.getJSONObject(i).getString(CASES)+"\t\t\t\t\t\t\t"+arr.getJSONObject(i).getString(DEATHS));
                }else{
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
