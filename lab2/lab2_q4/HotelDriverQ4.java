package lab2_q4;
public class HotelDriverQ4
{
    public static void main(String[] args) 
    {
        HotelRoomQ4 roomA = new  HotelRoomQ4();

        roomA.setRoomNumber(200);
        roomA.setRoomType("Single");
        roomA.setRate(100);
        roomA.setRoomStatus(true);

        HotelRoomQ4 roomB = new HotelRoomQ4();

        roomB.setRoomNumber(201);
        roomB.setRoomType("Double");
        roomB.setRate(80);
        roomB.setRoomStatus(false);

        HotelRoomQ4 roomC = new HotelRoomQ4(202,"Single",false,90);

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
    

