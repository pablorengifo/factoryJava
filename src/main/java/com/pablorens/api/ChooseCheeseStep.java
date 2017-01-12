package com.pablorens.api;

/**
 * Created by prengifo on 12/01/2017.
 */
public interface ChooseCheeseStep {
    public AddVeggiesStep addVeggie(final String vegetable);

    public CloseStep noVeggies();
}
