public class Engine {
    private int CC;
    private int hp;

    public float calcTorq(int CC,int hp){
        return (CC * hp)* (5/3);
    }

    public int getCC() {
        return CC;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Engine(int CC, int hp) {
        this.CC = CC;
        this.hp = hp;
    }

    Engine(Engine original){
        this.setCC(original.CC);
        this.setHp(original.hp);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "CC=" + CC +
                ", hp=" + hp +
                '}';
    }
}
