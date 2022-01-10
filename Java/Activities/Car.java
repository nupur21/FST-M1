package Activities;

public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    /*public void Car(int tyres,int doors){
        this.tyres = 4;
        this.doors = 4;
    }*/
    Car(){
        tyres=4;
        doors =4;
    }

    public void displayCharacteristics(){
        System.out.println("color is: "+color);
        System.out.println("Transmission is: "+transmission);
        System.out.println("Make is: "+make);
        System.out.println("Tyres are: "+tyres);
        System.out.println("Doors are: "+doors);
    }
    public void accelarate(){
        System.out.println("Car is moving forward");
    }
    public void brake(){
        System.out.println("Car has stopped");
    }
}
