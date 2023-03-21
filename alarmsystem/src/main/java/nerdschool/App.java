package nerdschool;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    ArrayList<Sensor> sensors = new ArrayList<>();
    sensors.add(new FireSensor("DataLab","FireSensor"));
    sensors.add(new SmokeSensor("Hall1", "SmokeSensor"));

    ConsoleSensorViewer csv = new ConsoleSensorViewer();
    FakseSensorPoller fsp = new FakseSensorPoller(sensors);

    ControlUnit controlUnit = new ControlUnit(csv,fsp);
    SecurityControlUnit scu = new SecurityControlUnit(csv, fsp);

    Scanner scanner = new Scanner(System.in);
    String input = "";
    while (!input.equals("exit")) {
      System.out.println("Type \"poll\" to poll all sensors once or \"exit\" to exit");
      input = scanner.nextLine();
      if (input.equals("poll")) {
        controlUnit.pollSensors();
      }
    }
  }
}
