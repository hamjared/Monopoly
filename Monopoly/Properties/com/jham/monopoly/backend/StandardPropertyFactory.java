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
    	properties.addAll(new UtilityPropertyGroupFactory().makePropertyGroup());

    }

    private void makeBlueProperties()
    {
        properties.addAll(new BluePropertyGroupFactory().makePropertyGroup());

    }

    private void makeGreenProperties()
    {
    	properties.addAll(new GreenPropertyGroupFactory().makePropertyGroup());

    }

    private void makeRedProperties()
    {
    	properties.addAll(new RedPropertyGroupFactory().makePropertyGroup());

    }

    private void makeYellowProeprties()
    {
    	properties.addAll(new YellowPropertyGroupFactory().makePropertyGroup());

    }

    private void makeOrangeProperties()
    {
    	properties.addAll(new OrangePropertyGroupFactory().makePropertyGroup());

    }

    private void makePurpleProperties()
    {
    	properties.addAll(new PurplePropertyGroupFactory().makePropertyGroup());

    }

    private void makeRailroadProperties()
    {
    	properties.addAll(new RailRoadPropertyGroupFactory().makePropertyGroup());

    }

    private void makeSkyBlueProperties()
    {
    	properties.addAll(new SkyBluePropertyGroupFactory().makePropertyGroup());

    }

    private void makeBrownProperties()
    {
    	properties.addAll(new BrownPropertyGroupFactory().makePropertyGroup());

    }
    


}
