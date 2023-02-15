class CalculateG{
    public static void main(String[]args){
        double gravity=-9.81;//Earths gravity in m/s^2
        double fallingTime=30;
        double initialVelocity=0.0;
        double finalVelocity;
        double initialPosition=0.0;
        double finalPosition;

        //calculate finalPosition

        finalPosition=0.5*gravity*Math.pow(fallingTime,2)+initialVelocity*fallingTime+initialPosition;

        //calculate finalVelocity
        finalVelocity=gravity*fallingTime+initialVelocity;

        //print out results
        outline("The object's position after"+fallingTime+"seconds is"+finalVelocity +"m.");
        outline("The object's velocity after"+fallingTime+"second is"+finalVelocity+"m/s.");
    }
    public static double multi(double num1,double num2){
        //Method for multiplication
        return num1*num2;
    }

        public static double square(double num){
            //method for powering to square
        return Math.pow(num,2);
    }
            public static double sum(double num1,double num2){
                //method for summation
            return num1+num2;
        }
        public static void outline(String message){
                //method for printing out a result
            System.out.println(message);
        }
}