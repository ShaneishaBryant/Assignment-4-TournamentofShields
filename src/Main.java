public class Main {
    public static void main(String[] args){

        //instantiating multiple guardians
        Guardian guardian1 = new Guardian();
        guardian1.setName("Pegasus");
        guardian1.setDefenseRating(85);
        guardian1.isLegendary();

        Guardian guardian2 = new Guardian();
        guardian2.setName("Orion");
        guardian2.setDefenseRating(95);
        guardian2.isLegendary();

        Guardian guardian3 = new Guardian();
        guardian3.setName("Mordecai");
        guardian3.setDefenseRating(50);
        guardian3.isLegendary();

        Guardian guardian4 = new Guardian();
        guardian4.setName("Rigby");
        guardian4.setDefenseRating(25);
        guardian4.isLegendary();

        //guardian array
        Guardian[] roster = new Guardian[4];
        roster[0] = guardian1;
        roster[1] = guardian2;
        roster[2] = guardian3;
        roster[3] = guardian4;

        //increase defense rating with loop
        for(Guardian guardian : roster){
            guardian.setDefenseRating(guardian.getDefenseRating() + 25);
        }

        //loop through the array
        for(int i =0; i < roster.length; i++) {
            if (roster[i].isLegendary()) {
                System.out.println("Guardian " + (i + 1) + ": " + roster[i].getName()
                        + " | Defense Rating: " + roster[i].getDefenseRating() + " | "
                        + roster[i].getName() + " is legendary " + roster[i].isLegendary());
            } else {
                System.out.println("Guardian " + (i + 1) + ": " + roster[i].getName()
                        + " | Defense Rating: " + roster[i].getDefenseRating());
            }

            //commented out - code used for testing
            /*System.out.println("Guardian 1: " + guardian1.getName() + " | Defense Rating: " + guardian1.getDefenseRating());
            System.out.println("Guardian 2: " + guardian2.getName() + " | Defense Rating: " + guardian2.getDefenseRating());
            System.out.println("Guardian 3: " + guardian3.getName() + " | Defense Rating: " + guardian3.getDefenseRating());
            System.out.println("Guardian 4: " + guardian4.getName() + " | Defense Rating: " + guardian4.getDefenseRating());*/

            /*System.out.println();

            //directly modify fields
            guardian4.setDefenseRating(guardian4.getDefenseRating() + 10);
            System.out.println("Guardian 4 --> New Defense Rating: " + guardian4.getDefenseRating());
            //test new changes and methods
            guardian4.setDefenseRating(-25);
            System.out.println("Current Defense Rating: " + guardian4.getDefenseRating());*/


        }


    }
}
