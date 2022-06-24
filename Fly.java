public class Fly {
    
    private double mass;
    private double speed;
    
    //Constructor 1
    public Fly(double initMass, double initSpeed) {
        
        mass = initMass;
        speed = initSpeed;
        
    }
    
    //Constructor 2
    public Fly(double initMass) {
        
        mass = initMass;
        speed = 10;
        
    }
    
    //Constructor 3
    public Fly() {
        
        mass = 5;
        speed = 10;
        
    }
    //Getters
    public double getMass() {
        return mass;
    }
    public double getSpeed() {
        return speed;
    }
    //Setters
    public void setMass(double setMass) {
        mass = setMass;
       
    }
    public void setSpeed(double setSpeed) {
        speed = setSpeed;
       
    }
    //Make the fly speak!
    public String toString() {
        
        speed = Math.round(speed);
        mass = Math.round(mass);
        if (mass == 0.0) {
            String talk = "I'm dead, but I used to be a fly with a speed of " + speed + ".";
            return talk;
        }
        else {
            String talk = "I'm a speedy fly with " + speed + " speed and " + mass + " mass.";
            return talk;
        }
    }
    
    public void grow(int massPlus) {
        int count = 0;
        while(count < massPlus) {
            
            if(mass < 20) {
            speed += 1;
            count += 1;
            mass += 1;
            continue;
            }else {
            speed = speed - 0.5;
            count += 1;
            mass += 1;
            }
            
        }
    }
    
    // Original prototype for grow method
       /* mass = getMass();
        double delta = 20 - mass;
        //mass += massPlus;
        double growth = 20 - massPlus;
        if (mass < 20) {
            speed += delta;
            
        }else {
            double slowFactor = delta * 0.5;
            speed += slowFactor;
        }
        
    } */

    public boolean isDead() {
        
        if (mass == 0) {
            return true;
        }else {
            return false;
        }
        
    }
    public static void main(String[] args) {
        
// This is test code for the Fly class. 
// The Pond.java class is the driver and where the story is.

	/*Fly fly1  = new Fly(10,10);
        Fly fly2 = new Fly(15.0);
        Fly fly3 = new Fly();
        //System.out.println(fly1.getMass());
        //System.out.println(fly1.getSpeed());
        System.out.println(fly1.isDead());
        fly1.setMass(0);
        System.out.println(fly1.isDead());
        //System.out.println(fly1.setSpeed(11.543));
        //System.out.println(fly1.toString());
        fly1.grow(9);
        System.out.println(fly1.isDead());
        //System.out.println(fly1.getMass());
        //System.out.println(fly1.getSpeed());
        //System.out.println(fly1.toString()); */
    }
    
    

}