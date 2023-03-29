

import java.awt.*;

public class TestApplication {

    public static void main(String[] args) {
        new TestApplication().run();
    }

    private void run() {
        /*
        All lamps are default off
        */
        s1TestNewLampIsOff();
        s2TestNewDimmableLampIsOff();
        s3TestNewPhilipsHUELampIsOff();

        /*
        All lamps can be turned on and off
         */
        s4TestLampCanBeTurnedOn();
        s5TestDimmableLampCanBeTurnedOn();
        s6TestPhilipsHUELampCanBeTurnedOn();

        /*
        Dimmable lamps have a default brightness of 100% but can be dimmed
         */

        s7TestDimmableLampDefaultBrightnessIs100();
        s8TestPhilipsHUELampDefaultBrightnessIs100();
        s9TestDimmableLampCanBeDimmed();
        s10TestPhilipsHUELampCanBeDimmed();

        /*
        Philips HUE lamp has default a white color, but that can be changed
         */
        s11TestPhilipsHUELampIsDefaultWhite();
        s12TestPhilipsHUELampCanSetColor();
    }

    private void s1TestNewLampIsOff() {
        Lamp lamp = new Lamp();
        if (!lamp.isOn()) {
            System.out.println("s1TestNewLampIsOff ok");
        } else {
            System.err.println("s1TestNewLampIsOff fail");
        }
    }

    private void s2TestNewDimmableLampIsOff() {
        DimmableLamp lamp = new DimmableLamp();
        if (!lamp.isOn()) {
            System.out.println("s2TestNewDimmableLampIsOff ok");
        } else {
            System.err.println("s2TestNewDimmableLampIsOff fail");
        }
    }

    private void s3TestNewPhilipsHUELampIsOff() {
        DimmableLamp lamp = new DimmableLamp();
        if (!lamp.isOn()) {
            System.out.println("s3TestNewPhilipsHUELampIsOff ok");
        } else {
            System.err.println("s3TestNewPhilipsHUELampIsOff fail");
        }
    }

    private void s4TestLampCanBeTurnedOn() {
        Lamp lamp = new Lamp();
        lamp.turnOn();
        if (lamp.isOn()) {
            System.out.println("s4TestLampCanBeTurnedOn ok");
        } else {
            System.err.println("s4TestLampCanBeTurnedOn fail");
        }
    }

    private void s5TestDimmableLampCanBeTurnedOn() {
        DimmableLamp lamp = new DimmableLamp();
        lamp.turnOn();
        if (lamp.isOn()) {
            System.out.println("s5TestDimmableLampCanBeTurnedOn ok");
        } else {
            System.err.println("s5TestDimmableLampCanBeTurnedOn fail");
        }
    }

    private void s6TestPhilipsHUELampCanBeTurnedOn() {
        DimmableLamp lamp = new DimmableLamp();
        lamp.turnOn();
        if (lamp.isOn()) {
            System.out.println("s6TestPhilipsHUELampCanBeTurnedOn ok");
        } else {
            System.err.println("s6TestPhilipsHUELampCanBeTurnedOn fail");
        }
    }

    private void s7TestDimmableLampDefaultBrightnessIs100() {
        DimmableLamp lamp = new DimmableLamp();
        if (lamp.getBrightness() == 100) {
            System.out.println("s7TestDimmableLampDefaultBrightnessIs100 ok");
        } else {
            System.err.println("s7TestDimmableLampDefaultBrightnessIs100 fail");
        }
    }

    private void s8TestPhilipsHUELampDefaultBrightnessIs100() {
        PhilipsHUELamp lamp = new PhilipsHUELamp();
        if (lamp.getBrightness() == 100) {
            System.out.println("s8TestPhilipsHUELampDefaultBrightnessIs100 ok");
        } else {
            System.err.println("s8TestPhilipsHUELampDefaultBrightnessIs100 fail");
        }
    }

    private void s9TestDimmableLampCanBeDimmed() {
        DimmableLamp lamp = new DimmableLamp();
        lamp.setBrightness(45);
        if (lamp.getBrightness() == 45) {
            System.out.println("s9TestDimmableLampCanBeDimmed ok");
        } else {
            System.err.println("s9TestDimmableLampCanBeDimmed fail");
        }
    }

    private void s10TestPhilipsHUELampCanBeDimmed() {
        PhilipsHUELamp lamp = new PhilipsHUELamp();
        lamp.setBrightness(45);
        if (lamp.getBrightness() == 45) {
            System.out.println("s10TestPhilipsHUELampCanBeDimmed ok");
        } else {
            System.err.println("s10TestPhilipsHUELampCanBeDimmed fail");
        }
    }

    private void s11TestPhilipsHUELampIsDefaultWhite() {
        PhilipsHUELamp lamp = new PhilipsHUELamp();
        if (lamp.getColor().equals(new Color(255, 255, 255))) {
            System.out.println("s11TestPhilipsHUELampIsDefaultWhite ok");
        } else {
            System.err.println("s11TestPhilipsHUELampIsDefaultWhite fail");
        }
    }

    private void s12TestPhilipsHUELampCanSetColor() {
        PhilipsHUELamp lamp = new PhilipsHUELamp();
        Color color = new Color(40, 40, 40);
        lamp.setColor(color);
        if (lamp.getColor().equals(color)) {
            System.out.println("s12TestPhilipsHUELampCanSetColor ok");
        } else {
            System.err.println("s12TestPhilipsHUELampCanSetColor fail");
        }
    }


}