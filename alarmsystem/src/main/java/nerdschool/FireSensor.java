package nerdschool;

public class FireSensor implements Sensor, BatteryDrivenSensor {

  private int battery;
  private int counter;
  private final String location;
  private final String type;

  public FireSensor(String location, String type) {
    this.location = location;
    this.type = type;
    this.battery = 100;
    this.counter = 0;
  }

  public boolean isTriggered() {
    if (battery == 0) {
      return false;
    }
    counter++;

    return counter % 3 == 0;
  }

  public String getLocation() {
    return location;
  }

  public String getSensorType() {
    return type;
  }

  public double getBatteryPercentage() {
    if (counter > 0 && battery >= 10) {
      battery *= 0.10;
    }
    return battery;
  }
}

