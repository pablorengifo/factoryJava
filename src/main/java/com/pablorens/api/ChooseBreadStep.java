package com.pablorens.api;

/**
 * Created by prengifo on 12/01/2017.
 */
public interface ChooseBreadStep {

    public ChooseMeatStep withMeat(final String meat);

    public AddVeggiesStep vegan();

}
