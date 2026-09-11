public class Guardian {
    private String name;
    private int defenseRating;

    //setter for defense rating
    public void setDefenseRating(int defenseRating) {
        if (defenseRating > 0) {
            this.defenseRating = defenseRating;
        } else {
            System.out.println("Warning: Unable to update defense rating. Rating must be greater than 0. ");
        }
    }

    //getter for defense rating
    public int getDefenseRating() {
        return this.defenseRating;
    }

    //getter method - calculated dynamically
    public boolean isLegendary() {
        return this.defenseRating > 100;
    }


    //setter & getter for name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //interaction between objects
    public void clash(Guardian opponent) {
        if (this.defenseRating > opponent.defenseRating) {
            System.out.println(this.getName() + " withstands the attack from " + opponent.getName() + "and is declared the Winner!");
        } else if (opponent.defenseRating > this.defenseRating) {
            System.out.println(opponent.getName() + " is putting up a serious fight " + this.getName());
        } else {
            System.out.println(this.getName() + " " + opponent.getName() + " are evenly matched. Its a tie.");
        }
    }
}

