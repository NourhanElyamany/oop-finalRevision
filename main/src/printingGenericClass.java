public class printingGenericClass {

    public static void vehiclePrinter(Vehicle v){
        if(v instanceof Boat){
            ((Boat) v).printCrewNum();
        }
        else if(v instanceof Car){
            ((Car) v).FuelRemain();
        }
        else{
            System.out.println("Unsupported type of vehicle");
        }
    }

}
