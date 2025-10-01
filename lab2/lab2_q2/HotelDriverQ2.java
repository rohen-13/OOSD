package lab2_q2;
public class HotelDriverQ2
{
    public static void main(String[] args) 
    {
        HotelRoomQ2 roomA = new  HotelRoomQ2();

        roomA.setRoomNumber(200);
        roomA.setRoomType("Single");
        roomA.setRate(100);
        roomA.setRoomStatus(1);

        HotelRoomQ2 roomB = new HotelRoomQ2();

        roomB.setRoomNumber(201);
        roomB.setRoomType("Double");
        roomB.setRate(80);
        roomB.setRoomStatus(0);

        System.out.println(roomA);
        System.out.println(roomB);
    }
}
    

