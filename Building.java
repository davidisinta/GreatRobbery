public class Building
{

    private String buildingName;
    Item[] items;

    public Building(String buildingName, Item[] items)
    {
        this.buildingName = buildingName;
        this.items = items;
    }

    public String getBuildingName()
    {
        return buildingName;
    }

    public void setBuildingName(String buildingName)
    {
        this.buildingName = buildingName;
    }

    public Item[] getItems()
    {
        return items;
    }

    public void setItems(Item[] items)
    {
        this.items = items;
    }




}
