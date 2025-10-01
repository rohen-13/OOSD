package lab2_q3;
public class HotelDriverQ3
{
    public static void main(String[] args) 
    {
        HotelRoomQ3 roomA = new  HotelRoomQ3();

        roomA.setRoomNumber(200);
        roomA.setRoomType("Single");
        roomA.setRate(100);
        roomA.setRoomStatus(1);

        HotelRoomQ3 roomB = new HotelRoomQ3();

        roomB.setRoomNumber(201);
        roomB.setRoomType("Double");
        roomB.setRate(80);
        roomB.setRoomStatus(0);

        HotelRoomQ3 roomC = new HotelRoomQ3(202,"Single",0,90);

        System.out.println(roomA);
        System.out.println(roomB);
        System.out.println(roomC);
    }
}
    

