package com.pablorens.beans;

import com.pablorens.api.ChooseBreadStep;
import com.pablorens.api.CloseStep;

import java.util.Collections;
import java.util.List;
import java.util.function.*;

/**
 * Created by prengifo on 12/01/2017.
 */
public class Sandwich {

    public Sandwich(Builder builder){
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.cheese = builder.cheese;
        this.vegetables = Collections.unmodifiableList(builder.vegetables);
    }

    public static Sandwich make(String bread, Function<ChooseBreadStep, CloseStep> configuration) {
        return configuration.andThen(CloseStep::create).apply(new Builder(bread));
    }

    private String bread;

    private String meat;

    private String cheese;

    private List<String> vegetables;

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public String getCheese() {
        return cheese;
    }

    public List<String> getVegetables() {
        return vegetables;
    }
    
    public String toString(){
    	System.out.println(this.bread + " with "+this.meat+" with "+this.cheese);
    	this.vegetables.stream().forEach(System.out::println);
    	System.out.println("\n");
    	return this.bread;
    			
    }
}
