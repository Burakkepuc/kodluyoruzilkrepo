package oop;

class Car {
    // Nitelikler
    String type = "Sedan";
    String model;
    String color;
    int speed;

    Car(String model, int speed,String color) {
        this.model = model;
        this.speed = speed;
        this.color = color;
        this.type = "Sedan";
    }

    Car(){
        System.out.println("Boş kurucu metodu oluştu.");
    }

    // Davranış
    void increaseSpeed(int increment) {
        if ((this.speed + increment) > 180) {
            this.speed = 180;
        } else {
            this.speed += increment;
        }
    }

    void decreaseSpeed(int decrease) {
        if (this.speed > 0) {
            this.speed -= decrease;
        }
    }

    void printSpeed() {
        System.out.println(this.model + " Hızınız: " + this.speed);
    }

    void printInfo(){
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Type: " + this.type);
    }

}
