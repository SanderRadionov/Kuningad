package com.example.opilane.kuningad;
//lihtne mudeli klass, kuhu saame oma andmed panna
public class King {

    //variables that will be used
    private String name;
    private int from, to;

    //Constructor
    public King(String name, int from, int to)
    {this.name=name;
    this.from=from;
    this.to=to;
    }

    //getterid
    public String getName()
    {return name;}

    public int getFrom()
    {return from;}

    public int getTo()
    {
        return to;
    }

//toString method that will return the value for each object in the ListView container
public String toString() {
    return name;
}
}
