package lab2_q1;
public class HotelDriverQ1
{
    public static void main(String[] args) 
    {
        HotelRoomQ1 roomA = new  HotelRoomQ1();

        roomA.setRoomNumber(200);
        roomA.setRoomType("Single");

        HotelRoomQ1 roomB = new HotelRoomQ1();

        roomB.setRoomNumber(201);
        roomB.setRoomType("Double");

        System.out.println("RoomNo. : " + roomA.getRoomNumber() + "\t" + "Room Type: " + roomA.getRoomType());
        System.out.println("RoomNo. : " + roomB.getRoomNumber() + "\t" + "Room Type: " + roomB.getRoomType());
    }
}
    

