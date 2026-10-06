class Driver{
    String name;
    int id;
    
    public Driver (String name, int id){
        this.name  = name;
        this.id = id;
    }
    public Driver (Driver other){
        this.name = other.name;
        this.id = other.id;
    }
    public String toString(){
        return "Name = " + this.name + ", ID = " + this.id;  
    }
}
class Car implements Cloneable{
    String model;
    Driver driver;
    int[] speedHistory;

    public Car (String model, String drivername, int driverId){
        this.model = model;
        this.driver = new Driver(drivername, driverId);
        this.speedHistory = new int[2];
    }
    public void drive(){
        System.out.println(this.model + "is driving.");
    }
    public void drive(int speed){
        System.out.println(this.model + "is driving at speet" + speed);
    }
    public void setSpeed(int index, int speed){
        this.speedHistory[index] = speed;
    }
    public int getSpeed(int index){
        return this.speedHistory[index];
    }
    // 1. clone() - Shallow Copy (Sirf bahar ka structure copy hota hai, andar ki cheezein share hoti hain)
    public Car clone() throws CloneNotSupportedException {
        return (Car) super.clone(); // Java ka apna basic clone method use kiya
    }

    // 2. deepCopy() - Deep Copy (Har cheez bilkul nai aur alag banti hai)
    public Car deepCopy() {
        // Step A: Ek bilkul nai Car banai purani car ke data ko use kar ke
        Car copyCar = new Car(this.model, this.driver.name, this.driver.id);
        
        // Step B: Array ko naye siray se copy kiya taake purani aur nai car ka array aapas mein mix na ho
        copyCar.speedHistory[0] = this.speedHistory[0];
        copyCar.speedHistory[1] = this.speedHistory[1];
        
        return copyCar; // Nayi aur mukammal alag car return kar di
    }

    // 3. toString() - Object ka data print karne ke liye
    public String toString() {
        return "Car Model: " + this.model + " | " + this.driver.toString();
    }
}




public class race {
    public static void main(String[] args) throws CloneNotSupportedException { 
        Car c1 = new Car("Civic", "Sara", 101); 
        c1.drive(); 
        c1.drive(80);                
        Car c2 = c1.clone();        // shallow copy 
        Car c3 = c1.deepCopy();     // deep copy 
        c2.setSpeed(0, 90); 
        System.out.println("After shallow copy: " + c1.getSpeed(0)); 
        c3.setSpeed(1, 100); 
        System.out.println("After deep copy   : " + c1.getSpeed(1)); 
    } 
    
}
