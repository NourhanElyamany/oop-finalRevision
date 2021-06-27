public class Engine {
    private int CC;
    private int hp;

    public float calcTorq(Engine engine){
        return (this.CC * this.hp)* (5/3);
    }
}
