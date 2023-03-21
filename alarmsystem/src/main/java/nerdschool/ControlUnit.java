package nerdschool;

import java.util.ArrayList;
import java.util.List;

public class ControlUnit {

  private final ArrayList<Sensor> sensors;
  private ConsoleSensorViewer csv;

  public ControlUnit(ArrayList<Sensor> sensors) {
    this.sensors = sensors;
    csv = new ConsoleSensorViewer();
  }

  public void pollSensors() {
    csv.displayTriggeredSensors(sensors);
  }
}
