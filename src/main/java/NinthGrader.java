public class NinthGrader extends Student {

    //Instance variables already inherited 

    //Constructors 
    public NinthGrader(String a, String b){
        super(a, b, 2024); 
    }

    public NinthGrader(){ //defualt no argument constructor 
        super("John", "Smith", 2024); 
        //can also do this: super();
    }

    //doSomething() method
    @Override
    public void doSomething() {
        System.out.println("I'm doing my homework.");
    }

    //toString() method 
    @Override
    public String toString() {
        String str = this.getFirstName() + " " + this.getLastName() + ", " + this.getClassYear() + " (Ninth Grader)";
        return str;
    }
    
}