public class Guardian {
    private String name;
    private int defenseRating;

    //setter for defense rating
    public void setDefenseRating(int defenseRating){
        if(defenseRating > 0) {
            this.defenseRating = defenseRating;
        }else{
            System.out.println("Warning: Unable to update defense rating. Rating must be greater than 0. ");
        }
    }

    //getter for defense rating
    public int getDefenseRating(){
        return this.defenseRating;
    }

    //getter method - calculated dynamically
    public boolean isLegendary(){
        return this.defenseRating > 100;
    }


   //setter & getter for name
   public String getName(){
        return this.name;
   }
   public void setName(String name){
        this.name = name;
   }
}
