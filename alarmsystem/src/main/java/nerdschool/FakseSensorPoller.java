package nerdschool;

import java.util.ArrayList;

public class FakseSensorPoller implements SensorPoller{
private final ArrayList<Sensor> sensors;
public FakseSensorPoller(ArrayList<Sensor> sensors) {
  this.sensors = sensors;
}
  @Override
  public ArrayList<Sensor> pollSensors() {
  ArrayList<Sensor> triggeredSensors = new ArrayList<>();

    for (Sensor sensor : sensors) {
      if (sensor.isTriggered()) {
        triggeredSensors.add(sensor);
      }
    }
    return triggeredSensors;
  }
}
