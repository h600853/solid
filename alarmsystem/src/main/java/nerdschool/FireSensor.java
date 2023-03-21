package nerdschool;

public class FireSensor implements Sensor {

  private int battery;
  private int counter;
  private String location;
  private String type;

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

