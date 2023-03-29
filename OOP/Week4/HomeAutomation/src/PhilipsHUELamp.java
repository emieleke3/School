import java.awt.*;

public class PhilipsHUELamp extends DimmableLamp {

    private Color color = Color.white;

    @Override
    public boolean isOn() {
        return super.isOn();
    }

    @Override
    public int getBrightness() {
        return super.getBrightness();
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
