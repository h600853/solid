package nerdschool;

import java.util.ArrayList;


public class ControlUnit {
  private final ConsoleSensorViewer csv;
private final FakseSensorPoller fsp;
  public ControlUnit(ConsoleSensorViewer consoleSensorViewer, FakseSensorPoller fakseSensorPoller) {

    csv = consoleSensorViewer;
    fsp = fakseSensorPoller;
  }

  public void pollSensors() {
    ArrayList<Sensor> triggeredSensors = fsp.pollSensors();
    csv.displayTriggeredSensors(triggeredSensors);
  }
}
