package com.example.opet.firebaseestudos;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import javax.xml.transform.Result;

/**
 * Created by opet on 25/03/2019.
 */

public class StarWars {

    ArrayList<Results> results;

    public StarWars(ArrayList<Results> results){this.results = results;}

    public ArrayList<Results> getResults() {
        return results;
    }

    public void setResults(ArrayList<Results> results) {
        this.results = results;
    }



}
