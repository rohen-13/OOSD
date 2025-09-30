
public class HotelDriver
{
    public static void main(String[] args) 
    {
        HotelRoom roomA = new  HotelRoom();

        roomA.setRoomNumber(200);
        roomA.setRoomType("Single");
        roomA.setRate(100);
        roomA.setRoomStatus(1);

        HotelRoom roomB = new HotelRoom();

        roomB.setRoomNumber(201);
        roomB.setRoomType("Double");
        roomB.setRate(80);
        roomB.setRoomStatus(0);

        System.out.println(roomA);
        System.out.println(roomB);
    }
}
    

