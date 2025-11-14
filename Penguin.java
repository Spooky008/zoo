public class Penguin extends Animal implements Eat, Swim, Walk{

    public Penguin(){
        super("Penguin");
    }
    public Penguin(String name){
        super(name);
    }

    private boolean isSwimming;
    private int walkSpeed;
    private int swimSpeed;

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void eatingFood(){
        System.out.println("I am eating fish");
    }

    @Override
    public void eatingCompleted(){
        System.out.println("I have eaten fish");
    }

    @Override
    public void swimming(){
        System.out.println("Dolphin: I am swimming at the speed of "
                + swimSpeed + " nautical miles per hour");
    }

    @Override
    public void walking(){
        System.out.println("Penguin is walking");
    }
}
