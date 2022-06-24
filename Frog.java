public class Frog {
    
    private String name;
    //age in months  <-- Update 6/22/2022: Adding this line helped a month later to identify the variable as months instead of years
    private int age;
    private double tongueSpeed;
    private boolean isFroglet;
    private static String species = "Rare Pepe";
    public int pubTest;
    
    //Constructor 1
    public Frog(String initname, int initage, double inittongueSpeed) {
        
        name = initname;
        age = initage;
        tongueSpeed = inittongueSpeed;
    }
    //Constructor 2
    public Frog(String initname, double ageInYears,double inittongueSpeed) {
        
        name = initname;
        double ageMonths = ageInYears * 12.0;
        age = (int)ageMonths;
        tongueSpeed = inittongueSpeed;
        
    }
    // Constructor 3
    public Frog(String initname) {
        name = initname;
        age = 5;
        tongueSpeed = 5;
        pubTest = 12345;
    }
    
    //Methods 
    public int grow(int agingMonths){
        int count = 0;
        while (count < agingMonths) {
            if (age < 12) {
                /*age += 1;
                count += 1;*/
                tongueSpeed += 1;
                //continue;
            }else if (age >= 30) {
            
                if(tongueSpeed > 5) {
                tongueSpeed -= 1;
                }
            }
            //increments age and count
            age += 1;
            count += 1;
        } 
        //checks and updates frog-puppy status(tadpole) prior to returning age
        isFroglet();
        return age;
    }
    
    public int grow() {
        
        if (age < 12) {
            tongueSpeed += 1;
                //continue;
            }else if (age >= 30) {
            
                if(tongueSpeed > 5) {
                tongueSpeed -= 1;
                }
            }
        age += 1;
        isFroglet();
        return age;
    }
    /// 6/21/2022 replaced "Fly" with "buzz" because of the function argument
    ///  to make the static to non static method reference error go away
    public void eat(Fly buzz) {
        if (buzz.isDead() == true) {
            //System.exit(0);
            return;
        }
        if (tongueSpeed > buzz.getSpeed()) {
            if (buzz.getMass() >= (double)age * 0.5) {
                grow();
            }
            buzz.setMass(0);
        }else { //adds 1 mass to fly and updates speed using only one Fly.method function
            buzz.grow(1);
           //Fly.setMass(Fly.getMass() + 1);
        }
        
    }
    
    
    public String toString() {
    	double speedTongue = Math.round(tongueSpeed * 100) / 100.0;
        int monthsOld = age;
        isFroglet();
        //System.out.println(isFroglet);
    	if(isFroglet == true) {
    		String rValue =  "My name is " + name + " and I’m a rare froglet!" + " I’m " + monthsOld + " months old and my tongue has a speed of " + speedTongue + "."; 
    		return rValue;
    	}else {
    		String rValue = "My name is " + name + " and I’m a rare frog." + " I’m " + monthsOld + " months old and my tongue has a speed of " + speedTongue + ".";
    		return rValue;
    	}
    	
    	
    }
    //isFroglet() method here to update variable isfroglet and return the variable
    public boolean isFroglet() {
        if (age > 1 && age < 7) {
            isFroglet = true;
            //System.out.println(isFroglet);
            return isFroglet;
        }else {
            isFroglet = false;
            //System.out.println(isFroglet);
            return isFroglet;
        }
    }
    
    //Getter and Setter for static species variable. Used to test changing a variable for all instances (skill).
    
    public static String getSpecies() {
    	
    	return  species;
    }
    
    public static void setSpecies(String speciesName) {
    	
    	species = speciesName;
    }
    
    public static void main(String[] args) {
    	
// This is test code for the Frog class. 
// The Pond.java class is the driver and where the story is.
    	
       /* Frog mimi = new Frog("Gramma",(double)5/(double)12,10.44455);
        //System.out.println(mimi.name);
        //System.out.println(mimi.isFroglet());
        System.out.println(mimi.toString());
        System.out.println(mimi.age);
        //System.out.println(mimi.tongueSpeed);
        //mimi.isFroglet();
        //System.out.println("Below is the actual variable value. Above is the function return");
        //System.out.println(mimi.isFroglet());

        mimi.grow();
        System.out.println(mimi.age);
        System.out.println(mimi.tongueSpeed);
        System.out.println(mimi.species);
        System.out.println("Below is the actual variable value. Above is the function return");
        System.out.println(mimi.isFroglet);*/
    }   
    
}