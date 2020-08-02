package com.jham.monopoly.backend;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class PlayerTest extends TestCase
{

    Player player;
    private static final int initialMoney = 500;

    protected void setUp() throws Exception
    {
        super.setUp();
        player = new Player(initialMoney, new Piece());
    }

    protected void tearDown() throws Exception
    {
        super.tearDown();
    }

    public void testThrowDice()
    {
        for (int i = 0; i < 50; i++)
        {
            player.throwDice();
            assertTrue(
                    "Dice roll outside expected range: "
                            + player.getMyCurDiceRoll(),
                    player.getMyCurDiceRoll() >= 2 && player
                            .getMyCurDiceRoll() <= 12);
        }
    }

    public void testDecrementMoney()
    {
        player.decrementMoney(50);
        assertTrue(
                player.getMyMoney() == (initialMoney - 50));
    }

    public void testIncrementMoney()
    {
        player.incrementMoney(50);
        assertTrue(
                player.getMyMoney() == (initialMoney + 50));
    }

    public void testGetPropertiesOfGroup()
    {
          
    }

    public void testGiveCard()
    {
        Card card = new GetOutOfJailCard(Card.Deck.CHANCE);
        player.giveCard(card);
        assertTrue(player.getMyCards() != null);
        assertTrue(player.getMyCards().size() == 1);
        assertTrue(player.getMyCards()
                .get(0) instanceof GetOutOfJailCard);
    }

    public void testUseCard()
    {
        Card card = new GetOutOfJailCard(Card.Deck.CHANCE);
        player.giveCard(card);
        int prevSize = player.getMyCards().size();
        player.useCard(card);
        assertTrue(player.getMyCards()
                .size() == (prevSize - 1));

    }

    
    public void testGetPropertiesOfColor() {
    	List<Property> brownProperties = new BrownPropertyGroupFactory().makePropertyGroup();
    	List<Property> allProps = new SkyBluePropertyGroupFactory().makePropertyGroup();
    	allProps.addAll(brownProperties);
    	
    	Player player = new Player(0, null);
    	for (Property prop: allProps) {
    		player.addProperty(prop);
    	}
    	
    	
    	assertEquals(brownProperties, player.getPropertiesOfColor(Color.Brown));
    	
    	
    	
    }
}
