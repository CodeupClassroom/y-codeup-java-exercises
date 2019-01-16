package vehicles;


public final class Convertible extends Coup {

    private boolean topIsUp;

    public Convertible(String make, String model) {
        super(make, model);
        topIsUp = true;
    }

    @Override // Communicating that we're over
    public void goFast() {
        System.out.println("VROOM VROOM VROOOOM!");
        System.out.println("RAWWWWWWWWWWRRRR!!!!!!");
        System.out.println("VROOM VROOM VROOOOM!");
        System.out.println("Wheeee!");
        System.out.println("PULL OVER THE VEHICLE!");
    }

    public void dropTop() {
        topIsUp = false;
    }

    public void topUp() {
        topIsUp = true;
    }
}
