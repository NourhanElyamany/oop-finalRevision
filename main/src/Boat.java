import java.util.ArrayList;
import java.util.List;

public class Boat extends Vehicle {
    public final int maxSpeed = 60;
    private int numCrew;
    public List<Engine> engine = new ArrayList<>(3);

    public Boat() {
    }
    public void printCrewNum(){
        System.out.println(numCrew);
    }

    public Boat(int numCrew, List<Engine> engine) {
        this.numCrew = numCrew;
        this.engine = engine;
    }

    Boat(Boat original){
        this.engine.addAll(original.engine);
        this.numCrew = original.numCrew;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "maxSpeed=" + maxSpeed +
                ", numCrew=" + numCrew +
                ", engine=" + engine +
                ", color='" + color + '\'' +
                '}';
    }
}
