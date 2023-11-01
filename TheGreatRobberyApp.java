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
            if (robberyCount==0)
            {
                System.out.println("The newest gang in town has made a robbing debut!");

            }
            gangdem.letsRob(endzino.getBuildings());
            popo.catchCriminals(gangdem);

            System.out.println("________________________________________________________");


            robberyCount++;



        }while(!popo.areCriminalsCaught());





    }
}
