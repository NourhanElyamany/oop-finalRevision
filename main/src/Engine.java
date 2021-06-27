public class Engine {
    private int CC;
    private int hp;

    public float calcTorq(int CC,int hp){
        return (CC * hp)* (5/3);
    }
}
