package lab2_q1;
public class HotelRoomQ1
{
    private int roomNumber;
    private String roomType;

    public HotelRoomQ1()
    {
        setRoomNumber(0);
        setRoomType("");
    }

    public int getRoomNumber()
    {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber)
    {
        this.roomNumber = roomNumber;
    }
    public String getRoomType()
    {
        return roomType;
    }
    public void setRoomType(String roomType)
    {
        this.roomType = roomType;
    }
}