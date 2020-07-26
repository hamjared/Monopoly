package com.jham.monopoly.backend;

import java.util.ArrayList;
import java.util.List;

public class StandardPropertyFactory
        implements IPropertyFactory
{

    private List<Property> properties;

    public StandardPropertyFactory()
    {
        properties = new ArrayList<Property>();
    }

    @Override
    public List<Property> makeProperties()
    {
        makeBrownProperties();
        makeSkyBlueProperties();
        makeRailroadProperties();
        makePurpleProperties();
        makeOrangeProperties();
        makeRedProperties();
        makeYellowProeprties();
        makeUtilityProperties();
        makeGreenProperties();
        makeBlueProperties();

        return properties;
    }

    private void makeUtilityProperties()
    {
        

    }

    private void makeBlueProperties()
    {
        // TODO Auto-generated method stub

    }

    private void makeGreenProperties()
    {
        // TODO Auto-generated method stub

    }

    private void makeRedProperties()
    {
        // TODO Auto-generated method stub

    }

    private void makeYellowProeprties()
    {
        // TODO Auto-generated method stub

    }

    private void makeOrangeProperties()
    {
        // TODO Auto-generated method stub

    }

    private void makePurpleProperties()
    {
        // TODO Auto-generated method stub

    }

    private void makeRailroadProperties()
    {
        // TODO Auto-generated method stub

    }

    private void makeSkyBlueProperties()
    {
        // TODO Auto-generated method stub

    }

    private void makeBrownProperties()
    {
        // TODO Auto-generated method stub

    }
    


}
