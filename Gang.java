import java.util.Random;
public class Gang
{
    private Criminal [] criminals= new Criminal[2];
    private Random randomGenerator = new Random();

    private double sumRobbedValue;



    public Gang()
    {
        Item sword = new Item("Sword",5);
        Item assaultRifle = new Item("AR", 8);
        Item shotgun = new Item("Pump Shotgun", 11);
        Item pistol = new Item("Bastola",3);


        Item [] robsTools = new Item[2];
        robsTools[0]=sword;
        robsTools[1]=pistol;
        Criminal rob = new Criminal("Rob","mchapi",1987,"Marksmanship",robsTools);



        Item [] bobbysTools = new Item[2];
        bobbysTools[0]=assaultRifle;
        bobbysTools[1]=shotgun;
        Criminal bobby = new Criminal("Bobby","shooter",2001,"CCQB",bobbysTools);
    }


    public double getSumRobbedValue()
    {
        return sumRobbedValue;
    }

    public void setSumRobbedValue(double sumRobbedValue)
    {
        this.sumRobbedValue = sumRobbedValue;
    }

    public void getGanginfo()
    {

        for(Criminal criminal:criminals)
        {
            if(criminal!=null)
            {
                criminal.printBioData();
            }

        }
    }


    public boolean isSuccessfulRobbery()
    {

        int randomNum = randomGenerator.nextInt(100)+1;


        if(randomNum< Criminal.getSuccessPercentage())
        {
            return true;
        }

        return false;

    }


    public Criminal[] getCriminals() {
        return criminals;
    }

    public void letsRob(Building[] buildings)
    {
        int randomNum = randomGenerator.nextInt(buildings.length)+1;


        for (Building building: buildings)
        {

            if(building!=null)
            {
                if(isSuccessfulRobbery())
                {
                    System.out.println("The gang robbed the following items from "+building.getBuildingName());

                    Item [] stolenGoods= building.getItems();

                    for(Item stolenGood: stolenGoods)
                    {
                        double itemValue = stolenGood.getValue();
                        sumRobbedValue+=itemValue;

                        System.out.println(stolenGood.getName());
                    }

                }

                else
                {



                    System.out.println("The gang tried to rob the "+building.getBuildingName()+
                            " but failed terribly!");


                }
            }



        }


    }

}
