package nerdschool;

import java.util.ArrayList;


public class ConsoleSensorViewer implements SensorViewer{

  @Override
  public void displayTriggeredSensors(ArrayList<Sensor> triggeredSensors) {

    if (triggeredSensors.isEmpty()) {
      System.out.println("No sensors were triggered");
    } else {
      for (Sensor sensor: triggeredSensors) {
        System.out.printf("A %s sensor was triggered at %s%n", sensor.getSensorType(), sensor.getLocation());
      }
    }
  }
  }


