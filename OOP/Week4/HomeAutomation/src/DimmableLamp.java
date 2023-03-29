public class DimmableLamp extends Lamp {
    protected int brightness = 100;

    @Override
    public boolean isOn() {
        return super.isOn();
    }
    public int getBrightness() {
        return brightness;
    }
    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }


}
