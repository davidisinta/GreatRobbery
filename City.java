public class City
{

    Building[] buildings= new Building[4];

    public City()
    {
        Item[] bankItems= new Item[2];
        bankItems[0]= new Item("Letter Opener", 1.5);
        bankItems[1]= new Item("stamp", 2.5);
        buildings[0]= new Building("Bankiko",bankItems);

        Item[] mansionItems= new Item[2];
        mansionItems[0]= new Item("Pair of Fancy Shoesdem", 221);
        mansionItems[1]= new Item("Gucci Flip Flops", 23.5);
        buildings[1]= new Building("Cribo",mansionItems);


    }

    public Building[] getBuildings()
    {
        return buildings;
    }
}
