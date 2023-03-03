import csc232.customersimulation.Customer;
import csc232.customersimulation.WaitingLine;

class Main {
  public static void main(String[] args) {
    System.out.println("Creating customers:");
    Customer c1 = new Customer("Brian Howard", 55, 47);
    System.out.println(c1); // and other customers

    WaitingLine line = new WaitingLine();
    line.add(c1); // and other customers

    System.out.println("Serving customers:");
    while (line.notEmpty()) {
      Customer c = line.remove();
      System.out.println(c);
    }
  }
}