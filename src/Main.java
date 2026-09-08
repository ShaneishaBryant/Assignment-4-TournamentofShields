public class Main {
    public static void main(String[] args){

        //instantiating multiple guardians
        Guardian guardian1 = new Guardian();
        guardian1.setName("Pegasus");
        guardian1.setDefenseRating(85);

        Guardian guardian2 = new Guardian();
        guardian2.setName("Orion");
        guardian2.setDefenseRating(95);

        Guardian guardian3 = new Guardian();
        guardian3.setName("Mordecai");
        guardian3.setDefenseRating(50);

        Guardian guardian4 = new Guardian();
        guardian4.setName("Rigby");
        guardian4.setDefenseRating(25);

        System.out.println("Guardian 1: " + guardian1.getName() + " | Defense Rating: " + guardian1.getDefenseRating());
        System.out.println("Guardian 2: " + guardian2.getName() + " | Defense Rating: " + guardian2.getDefenseRating());
        System.out.println("Guardian 3: " + guardian3.getName() + " | Defense Rating: " + guardian3.getDefenseRating());
        System.out.println("Guardian 4: " + guardian4.getName() + " | Defense Rating: " + guardian4.getDefenseRating());

        System.out.println();

        //directly modify fields
        guardian4.setDefenseRating(guardian4.getDefenseRating() + 10);
        System.out.println("Guardian 4 --> New Defense Rating: " + guardian4.getDefenseRating());

        //test new changes and methods
        guardian4.setDefenseRating(-25);
        System.out.println("Current Defense Rating: " + guardian4.getDefenseRating());





    }
}
