package nerdschool;

import java.time.LocalTime;

public class SecurityControlUnit extends ControlUnit {
LocalTime time;

  public SecurityControlUnit(ConsoleSensorViewer consoleSensorViewer,
      FakseSensorPoller fakseSensorPoller) {
    super(consoleSensorViewer, fakseSensorPoller);
    time = LocalTime.now();
    }
    public void PollSensors() {

    LocalTime start = LocalTime.of(22,0);
    LocalTime end = LocalTime.of(6,0);

    if (time.isAfter(start) || time.isBefore(end)) {
    super.pollSensors();
    }
  }

}
