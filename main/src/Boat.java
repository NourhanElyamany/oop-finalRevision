import java.util.ArrayList;
import java.util.List;

public class Boat {
    public final int maxSpeed = 60;
    private int numCrew;
    public List<Engine> engine = new ArrayList<>();

    public Boat() {
    }
    public void printCrewNum(){
        System.out.println(numCrew);
    }
}
