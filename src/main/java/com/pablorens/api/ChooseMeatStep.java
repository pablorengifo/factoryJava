package com.pablorens.api;

/**
 * Created by prengifo on 12/01/2017.
 */
public interface ChooseMeatStep {
    public ChooseCheeseStep withCheese(final String cheese);

    public AddVeggiesStep noCheese();
}
