public class TheGreatRobberyApp
{
    public static void main(String[] args)
    {
        City endzino= new City();
        Gang gangdem= new Gang();
        Police popo = new Police();

        gangdem.getGanginfo();

        int robberyCount=0;

        do
        {

            System.out.println("________________________________________________________");
            if (robberyCount==0)
            {
                System.out.println("The newest gang in town has made a robbing debut!");
                System.out.println("The want to bring violence to the scene");
                System.out.println("________________________________________________________");
                System.out.println("________________________________________________________");

            }

            else if(robberyCount>0)
            {
                System.out.println("The newest gang in town are back again!");
            }
            gangdem.letsRob(endzino.getBuildings());


            System.out.println("________________________________________________________");


            robberyCount++;



        }while(!popo.catchCriminals(gangdem));





    }
}
