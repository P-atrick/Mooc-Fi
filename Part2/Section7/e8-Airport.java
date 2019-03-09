import java.util.HashMap;
import java.util.ArrayList;

public class Airport {
  private ArrayList<Plane> planes;
  private HashMap<Plane, Flight> flights;

  public Airport() {
    this.planes = new ArrayList<Plane>();
    this.flights = new HashMap<Plane, Flight>();
  }

  public void addPlane(String planeId, int capacity) {
    planes.add(new Plane(planeId, capacity));
  }

  public void addFlight(String planeId, Flight flight) {
    for (Plane item : planes) {
      if (item.getId().equals(planeId)) {
        Plane plane = new Plane(item.getId(), item.getCapacity());
        flights.put(plane, flight);
      }
    }
  }

  public void printPlanes() {
    for (Plane item : planes) {
      System.out.println(item);
    }
  }

  public void printFlights() {
    for (Plane item: flights.keySet()) {
      System.out.println(item + " " + flights.get(item));
    }
  }

  public void printPlaneInfo(String planeId) {
    for (Plane item : planes) {
      if (item.getId().equals(planeId)) {
        System.out.println(item);
      }
    }
  }

}
