public class Detective extends Person
{

    private static final int SUCCESS_PERCENTAGE=50;


    public Detective(String name, String nickName, int yearOfBorn, String expertIn, Item[] items)
    {

        super(name, nickName, yearOfBorn, expertIn, items);
    }

    @Override
    public void printBioData()
    {
        System.out.println("This is a Detective:");
        super.printBioData();
    }


    public static int getSuccessPercentage()
    {
        return SUCCESS_PERCENTAGE;
    }

}
