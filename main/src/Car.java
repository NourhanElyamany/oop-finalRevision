public class Car extends Vehicle{
    private int fuelCapacity;
    Engine eng;

    public Car() {
    }
    public void FuelRemain(){
        System.out.println(fuelCapacity);
    }


    public Car(int speed, String color, int fuelCapacity, Engine eng) {
        super(speed, color);
        this.fuelCapacity = fuelCapacity;
        this.eng = eng;
    }
    Car(Car original){
        this.eng= original.eng;
        this.fuelCapacity= original.fuelCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuelCapacity=" + fuelCapacity +
                ", eng=" + eng +
                ", color='" + color + '\'' +
                '}';
    }
}
