package com.pablorens.beans;

import com.pablorens.api.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prengifo on 12/01/2017.
 */
public class Builder implements ChooseBreadStep, ChooseMeatStep, ChooseCheeseStep, AddVeggiesStep, CloseStep {
    String bread;
    String meat;
    String cheese;

    List<String> vegetables = new ArrayList<String>();

    Builder(String bread) {
        this.bread = bread;
    }

    public ChooseMeatStep withMeat(String meat) {
        this.meat = meat;
        return this;
    }

    public AddVeggiesStep vegan() {
        return this;
    }

    public ChooseCheeseStep withCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    public AddVeggiesStep noCheese() {
        return this;
    }

    public AddVeggiesStep addVeggie(String vegetable) {
        this.vegetables.add(vegetable);
        return this;
    }

    public CloseStep noVeggies() {
        return this;
    }

    public CloseStep close() {
        return this;
    }

    public Sandwich create() {
        return new Sandwich(this);
    }
}
