
public class HotelDriver
{
    public static void main(String[] args) 
    {
        HotelRoom roomA = new  HotelRoom();

        roomA.setRoomNumber(200);
        roomA.setRoomType("Single");
        roomA.setRate(100);
        roomA.setRoomStatus(true);

        HotelRoom roomB = new HotelRoom();

        roomB.setRoomNumber(201);
        roomB.setRoomType("Double");
        roomB.setRate(80);
        roomB.setRoomStatus(false);

        HotelRoom roomC = new HotelRoom(202,"Single",false,90);

        System.out.println(roomA);
        System.out.println(roomB);
        System.out.println(roomC);

        if (!roomB.isOccupied()) {
            roomB.setRoomStatus(true); 
            System.out.println("Room B successfully booked.");
        } else {
            System.out.println("Room B is already occupied. Booking denied.");
        }

         if (!roomB.isOccupied()) {
            roomB.setRoomStatus(true); 
            System.out.println("Room B successfully booked.");
        } else {
            System.out.println("Room B is already occupied. Booking denied.");
        }
    }
}
    

