package com.pablorens;

import com.pablorens.beans.Sandwich;

/**
 * Created by prengifo on 12/01/2017.
 */
public class PrepareSandwich {

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Sandwich sandwich = Sandwich.make("white", cfg -> cfg
                .withMeat("parma")
                .withCheese("cheedar")
                .addVeggie("salad")
                .close()
        );
        System.out.println( sandwich.toString() );
        sandwich = Sandwich.make("brown", cfg -> cfg
                .withMeat("salami")
                .noCheese()
                .close());
        System.out.println( sandwich.toString() );
        sandwich = Sandwich.make("spelt", cfg -> cfg
                .vegan()
                .addVeggie("salad")
                .addVeggie("gherkins")
                .addVeggie("tomatoes")
                .close()
        );
        sandwich.toString();
    }
}
