public class HotelDriver
{
    public static void main(String[] args) 
    {
        HotelRoom roomA = new  HotelRoom();

        roomA.setRoomNumber(200);
        roomA.setRoomType("Single");

        HotelRoom roomB = new HotelRoom();

        roomB.setRoomNumber(201);
        roomB.setRoomType("Double");

        System.out.println("RoomNo. : " + roomA.getRoomNumber() + "\t" + "Room Type: " + roomA.getRoomType());
        System.out.println("RoomNo. : " + roomB.getRoomNumber() + "\t" + "Room Type: " + roomB.getRoomType());
    }
}
    

