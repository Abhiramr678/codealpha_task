import java.util.Scanner;

class Room {
    int roomNumber;
    String category;
    boolean booked;

    Room(int roomNumber, String category) {
        this.roomNumber = roomNumber;
        this.category = category;
        this.booked = false;
    }
}

public class HotelReservationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Room[] rooms = {
                new Room(101, "Standard"),
                new Room(102, "Deluxe"),
                new Room(103, "Suite")
        };

        while (true) {

            System.out.println("\n===== HOTEL RESERVATION SYSTEM =====");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    for (Room room : rooms) {
                        System.out.println("Room No: " + room.roomNumber +
                                " | Category: " + room.category +
                                " | Status: " + (room.booked ? "Booked" : "Available"));
                    }
                    break;

                case 2:
                    System.out.print("Enter Room Number: ");
                    int bookRoom = sc.nextInt();

                    for (Room room : rooms) {
                        if (room.roomNumber == bookRoom) {
                            if (!room.booked) {
                                room.booked = true;
                                System.out.println("Room Booked Successfully!");
                            } else {
                                System.out.println("Room Already Booked!");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Room Number: ");
                    int cancelRoom = sc.nextInt();

                    for (Room room : rooms) {
                        if (room.roomNumber == cancelRoom) {
                            if (room.booked) {
                                room.booked = false;
                                System.out.println("Booking Cancelled!");
                            } else {
                                System.out.println("Room is not booked.");
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}