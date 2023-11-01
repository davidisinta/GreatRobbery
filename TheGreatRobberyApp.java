public class TheGreatRobberyApp
{
    public static void main(String[] args)
    {
        City endzino= new City();
        Gang gangdem= new Gang();
        Police popo = new Police();

        gangdem.getGanginfo();

        do
        {
            gangdem.letsRob(endzino.getBuildings());


            popo.catchCriminals(gangdem);

        }while(!popo.areCriminalsCaught());





    }
}
