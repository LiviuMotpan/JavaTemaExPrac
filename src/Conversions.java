public class Conversions {

    public static void main(String[] args) {



        short mblnKb = 20000;
        int facebookFriends = 150000;
        long starsInUniverse = 155555555555555L;
        double normalTemp = 36.6;

        byte mblnKbB = (byte)mblnKb;
        short facebookFriendsS = (short)facebookFriends;
        int starsInUniverseI = (int)starsInUniverse;
        long normalTempL = (long)normalTemp;


        System.out.println(mblnKb + "->" + mblnKbB);
        System.out.println(facebookFriends + "->" + facebookFriendsS);
        System.out.println(starsInUniverse + "->" + starsInUniverseI);
        System.out.println(normalTemp + "->" + normalTempL);


    }
}