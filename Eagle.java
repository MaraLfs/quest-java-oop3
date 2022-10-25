public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        System.out.println("Et c'est partiiiiiii");
    }

    @Override
    public int ascend(int meters) {
        this.altitude = this.altitude + meters;
            System.out.println(this.getName() + " swims upward, altitude : " + this.altitude);
        return this.altitude;
    }

    @Override
    public int descend(int meters) {
        this.altitude = this.altitude - meters;
            System.out.printf(this.getName() + " swims descend, altitude : " + this.altitude);
        return this.altitude;
    }

    @Override
    public void land() {
        System.out.println("pnc aux portes, armement des toboggans");

    }
}
