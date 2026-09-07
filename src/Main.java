public class Main {
    static void main(String[] args){

        //instantiating multiple guardians
        Guardian guardian1 = new Guardian();
        guardian1.name = "Pegasus";
        guardian1.defenseRating = 85;

        Guardian guardian2 = new Guardian();
        guardian2.name = "Orion";
        guardian2.defenseRating = 95;

        Guardian guardian3 = new Guardian();
        guardian3.name = "Mordecai";
        guardian3.defenseRating = 50;

        Guardian guardian4 = new Guardian();
        guardian4.name = "Rigby";
        guardian4.defenseRating = 25;

        System.out.println("Guardian 1: " + guardian1.name + " | Defense Rating: " + guardian1.defenseRating);
        System.out.println("Guardian 2: " + guardian2.name + " | Defense Rating: " + guardian2.defenseRating);
        System.out.println("Guardian 3: " + guardian3.name + " | Defense Rating: " + guardian3.defenseRating);
        System.out.println("Guardian 4: " + guardian4.name + " | Defense Rating: " + guardian4.defenseRating);

        System.out.println();

        //directly modify fields
        guardian4.defenseRating += 10;
        System.out.println("Guardian 4 --> New Defense Rating: " + guardian4.defenseRating);




    }
}
