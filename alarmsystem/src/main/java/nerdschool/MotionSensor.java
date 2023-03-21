package nerdschool;

public class MotionSensor implements Sensor{


  @Override
  public boolean isTriggered() {
    return false;
  }

  @Override
  public String getLocation() {
    return null;
  }

  @Override
  public String getSensorType() {
    return null;
  }
}
