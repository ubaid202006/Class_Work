class MobilePhone {
    private String brand; // Attributes
    private String color;
    private int price;
    private boolean isOn;
    private static int objectCount = 0; // Object Count

    public MobilePhone() { // Null / Default Constructor
        this.brand = "Unknown";
        this.color = "Unknown";
        this.price = 0;
        this.isOn = false;
        objectCount++;
    }

    public MobilePhone(String brand, String color, int price, boolean isOn) { // Parameterized Constructor
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.isOn = isOn;
        objectCount++;
    }

    public MobilePhone(MobilePhone phone) { // Copy Constructor
        this.brand = phone.brand;
        this.color = phone.color;
        this.price = phone.price;
        this.isOn = phone.isOn;
        objectCount++;
    }

    public String getBrand() { // Getters
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setBrand(String brand) { // Setters
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public void turnOn() { // Behaviours
        isOn = true;
        System.out.println("Mobile phone is ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Mobile phone is OFF.");
    }

    public void makeCall() {
        if (isOn) {
            System.out.println("Calling...");
        } else {
            System.out.println("Please turn on the phone first.");
        }
    }

    // Display
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Phone On: " + isOn);
    }

    // Object Count
    public static int getObjectCount() {
        return objectCount;
    }

    // toString()
    public String toString() {
        return "Brand: " + brand + ", Color: " + color + ", Price: " + price + ", Battery: " + ", Is On: " + isOn;
    }

    // Main Method
    public static void main(String[] args) {
        // Object using Null / Default Constructor
        MobilePhone phone1 = new MobilePhone();
        System.out.println("Phone 1:");
        phone1.display();
        System.out.println("\n-------------------------");
        // Object using Parameterized Constructor
        MobilePhone phone2 = new MobilePhone("Samsung", "Black", 150000, false);
        System.out.println("Phone 2:");
        phone2.display();
        System.out.println("\n-------------------------");
        // Using Setters
        phone2.setColor("Blue");
        System.out.println("After Setter:");
        phone2.display();
        System.out.println("\n-------------------------");
        // Using Getters
        System.out.println("Using Getters:");
        System.out.println("Price: " + phone2.getPrice());
        System.out.println("\n-------------------------");
        // Behaviours
        System.out.println("Phone Behaviours:");
        phone2.turnOn();
        phone2.makeCall();
        phone2.turnOff();
        System.out.println("\n-------------------------");
        // Copy Constructor
        MobilePhone phone3 = new MobilePhone(phone2);
        System.out.println("Phone 3 (Copy):");
        System.out.println(phone3);
        System.out.println("\n-------------------------");
        // toString()
        System.out.println("Using toString():");
        System.out.println(phone2.toString());
        System.out.println("\n-------------------------");
        // Object Count
        System.out.println("Total Mobile Phone Objects: "
                + MobilePhone.getObjectCount());
    }
}