import java.util.Random;

public class Police
{

    Detective inspectorMwala;
    public Police()
    {

        Item shotgun = new Item("Pump Shotgun", 11);
        Item handcuffs = new Item("cuffs",38);


        Item [] mwalasTools = new Item[2];
        mwalasTools[0]=shotgun;
        mwalasTools[1]=handcuffs;

        inspectorMwala= new Detective("Inspector Mwala", "Short Yute", 1979,"Interrogation",mwalasTools);

    }

    public boolean areCriminalsCaught()
    {
        Random randomGenerator = new Random();

        int randomNum= randomGenerator.nextInt(100)+1;

        if(randomNum>= Detective.getSuccessPercentage())
        {
            return false;
        }


            return true;


    }


    public boolean catchCriminals(Gang gang)
    {
        if(areCriminalsCaught())
        {
            System.out.println(inspectorMwala.getName()+" managed to catch the dusty gang.");


            if(gang.getSumRobbedValue()>0)
            {
                System.out.println("The stolen items of value $"+gang.getSumRobbedValue()+" are recovered!");

            }

            else
            {
                System.out.println("Gangdem failed to steal anything!!");

            }

            return true;

        }

        else
        {

            System.out.println(inspectorMwala.getName()+" failed to catch the dusty gang.");


            if(gang.getSumRobbedValue()>0)
            {
                System.out.println("The stolen items of value $"+gang.getSumRobbedValue()+" are not recovered!");

            }

            else
            {
                System.out.println("Gangdem failed to steal anything!!");

            }

            return false;
        }
    }


    public Detective getInspectorMwala()
    {
        return inspectorMwala;
    }
}
