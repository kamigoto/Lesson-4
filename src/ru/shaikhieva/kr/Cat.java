package ru.shaikhieva.kr;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private String name;
    private String color;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        System.out.println("Set weight " + weight);
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

    }



    public Cat(String name)
    {
        this.name = name;
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }


    public double feed(Double food)
    {
        weight = weight + food;
        return food;
    }

    public double drink(Double drink)
    {
        weight = weight + drink;
        return drink;
    }

    public String getName() {return name;}

    //public void setName(String value) {name = value;}

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }


}