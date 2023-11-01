public abstract class Person
{
    //recall for abstraction, it cannot be instantiated
    //abstract methods have to be defined by classes that use it

    private String name;
    private String nickName;
    private int yearOfBorn;
    private String expertIn;
    Item[] items;

    public Person(String name, String nickName, int yearOfBorn, String expertIn, Item[] items)
    {
        this.name = name;
        this.nickName = nickName;
        this.yearOfBorn = yearOfBorn;
        this.expertIn = expertIn;
        this.items = items;
    }


    public void printBioData()
    {

        System.out.println("Person's name is "+name);
        System.out.println(  name+  "'s nickname is "+nickName);
        System.out.println( name+"'s year of Birth is "+yearOfBorn);
        System.out.println( name+"'s expertise is "+expertIn);

        System.out.println( name+" has the following items in their repertoire:");

        for(Item item:items)
        {
            System.out.println(item.getName());

        }



    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getNickName()
    {
        return nickName;
    }


}
