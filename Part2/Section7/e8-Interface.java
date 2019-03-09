import java.util.Scanner;

public class Interface {
  private Scanner reader;
  private Airport airport;

  public Interface(Scanner reader, Airport airport) {
    this.reader = reader;
    this.airport = airport;
  }

  public void chooseAirportOperation() {
    System.out.println("Choose operation:");
    System.out.println("[1] Add airplane");
    System.out.println("[2] Add flight");
    System.out.println("[x] Exit");
  }

  public void addPlane() {
    System.out.print("Give plane ID: ");
    String planeId = reader.nextLine();

    System.out.print("Give plane capacity: ");
    int capacity = Integer.parseInt(reader.nextLine());

    airport.addPlane(planeId, capacity);
  }

  public void addFlight() {
    System.out.print("Give plane ID: ");
    String planeId = reader.nextLine();

    System.out.print("Give departure airport code: ");
    String departureAirport = reader.nextLine();

    System.out.print("Give destination airport code: ");
    String arrivalAirport = reader.nextLine();

    airport.addFlight(planeId, new Flight(departureAirport, arrivalAirport));
  }

  public void airport() {
    System.out.println("Airport panel");
    System.out.println("--------------------\n");

    while (true) {
      chooseAirportOperation();
      System.out.print("> ");
      String command = reader.nextLine();

      if (command.equals("1")) {
        addPlane();
      } else if (command.equals("2")) {
        addFlight();
      } else if (command.equals("x")) {
        break;
      }
    }
  }

  public void chooseFlightOperation() {
    System.out.println("Choose operation:");
    System.out.println("[1] Print planes");
    System.out.println("[2] Print flights");
    System.out.println("[3] Print plane info");
    System.out.println("[x] Quit");
  }

  public void flightService() {
    System.out.println("Flight service");
    System.out.println("--------------------\n");

    while (true) {
      chooseFlightOperation();
      System.out.print("> ");
      String command = reader.nextLine();

      if (command.equals("1")) {
        airport.printPlanes();
      } else if (command.equals("2")) {
        airport.printFlights();
      } else if (command.equals("3")) {
        System.out.print("Give plane ID: ");
        String planeId = reader.nextLine();
        airport.printPlaneInfo(planeId);
      } else if (command.equals("x")) {
        break;
      }
    }
  }

  public void start() {
    airport();
    flightService();
  }
}
