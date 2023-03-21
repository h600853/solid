package nerdschool;


public class SmokeSensor implements Sensor, BatteryDrivenSensor {

  private int battery;
  private int counter;
  private final String location;
  private final String type;

  public SmokeSensor(String location, String type) {
    this.location = location;
    this.type = type;
    battery = 100;
    counter = 0;
  }

  public boolean isTriggered() {
    if (battery == 0) return false;
    counter++;
    return counter%2 == 0;
  }

  public String getLocation() {
    return location;
  }

  public String getSensorType() {
    return type;
  }

  public double getBatteryPercentage() {
    if (counter > 0 && battery >= 20) {
      battery *= 0.20;
    }

    return battery;

  }
}
