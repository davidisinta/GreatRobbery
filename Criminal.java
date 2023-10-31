public class Criminal extends Person
{

    private static final int SUCCESS_PERCENTAGE = 0;

    public Criminal(String name, String nickName, int yearOfBorn, String expertIn, Item[] items)
    {
        super(name, nickName, yearOfBorn, expertIn, items);
    }

    public int getSuccessPercentage()
    {
        return SUCCESS_PERCENTAGE;
    }

    @Override
    public void printBioData()
    {
        System.out.println("This is a Criminal!!");
        super.printBioData();
    }


}
