public class Tiger extends Animal implements Walk,Eat{
    public Tiger(){
        super("Tiger");
    }
    public Tiger(String name) {
        super(name);

    }

    private int numberOfStrips;
    private int speed;
    private int soundLevelOfRoar;

    public int getNumberOfStrips() {
        return numberOfStrips;
    }

    public void setNumberOfStrips(int numberOfStrips) {
        this.numberOfStrips = numberOfStrips;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSoundLevelOfRoar() {
        return soundLevelOfRoar;
    }

    public void setSoundLevelOfRoar(int soundLevelOfRoar) {
        this.soundLevelOfRoar = soundLevelOfRoar;
    }

    @Override
    public void eatingFood(){
        System.out.println("Tiger: i am eating meat");
    }

    @Override
    public void eatingCompleted(){
        System.out.println("Tiger: I have eaten meat");
    }

    @Override
    public void walking(){
        System.out.println("I am walking at the speed of " + speed + "mph");
    }


}
