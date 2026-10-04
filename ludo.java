import java.util.Random; // Random ko use karne ke liye import karna zaroori hai

class Dice {
    int sides;
    int value; // Aapke mutabiq faceValue ki jagah 'value' rakh diya
    Random rng = new Random(); // Class ke attributes mein Random object bana liya

    // Constructor
    public Dice(int sides) {
        this.sides = sides;
        this.value = 1; // Shuru mein value 1 rakh di
    }

    public int roll() {
        // nextInt(lower_bound, upper_bound)
        // Upper bound exclude hota hai (shamil nahi hota), isliye sides + 1 kiya hai.
        // Agar sides 6 hain, toh yeh 1 se 6 tak random number dega.
        int result = rng.nextInt(1, sides + 1); 
        
        this.value = result; // Jo random number aaya usko value mein save kar diya
        
        return this.value; // Wahi number wapis return kar diya
    }

    public int getSides() {
        return sides;
    }
}
class Player {
    String name;
    Dice[] dice;
    int total;

    // Constructor
    public Player(String name, int count, int sides) {
        this.name = name;
        this.dice = new Dice[count]; // Dice ka array banaya
        this.total = 0;

        // Loop laga kar har array index par naya Dice object rakha
        for (int i = 0; i < count; i++) {
            this.dice[i] = new Dice(sides);
        }
    }

    public void roll() {
        this.total = 0; // Roll karne se pehle total zero kar diya

        for (int i = 0; i < this.dice.length; i++) {
            int result = this.dice[i].roll();
            this.total = this.total + result; // Total mein add kiya
            
            // Output bilkul question paper jaisa print karwanay ke liye
            System.out.print("Die " + (i + 1) + "=" + result + " ");
        }
        System.out.println(); // Line change karne ke liye
    }

    public int getTotal() {
        return this.total;
    }

    // Ek specific dice ko wapis roll karne ka method
    public void rollAgain(int index) {
        // Agar user ne '1' pass kiya hai, toh array mein wo '0' index par hoga
        int arrayIndex = index - 1; 

        // Puranay roll ka number total mein se minus kiya (yahan 'value' use kiya hai)
        this.total = this.total - this.dice[arrayIndex].value;
        
        // Sirf us ek dice ko dobara roll kiya
        int newResult = this.dice[arrayIndex].roll();
        
        // Naya number total mein wapis add kar diya
        this.total = this.total + newResult;
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. Sara naam ka player banaya, jiske paas 2 dice hain, aur har dice ki 6 sides hain
        Player player = new Player("Sara", 2, 6);
        
        // 2. Pehli dafa dono dice roll kiye
        player.roll();
        
        // 3. Shuru ka total print karwaya
        System.out.println("Initial total: " + player.getTotal());
        
        // 4. Pehle dice (index 1) ko dobara roll kiya
        player.rollAgain(1); 
        
        // 5. Naya total print karwaya
        System.out.println("New total :" + player.getTotal());
    }
}