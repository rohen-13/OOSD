public class HotelRoom 
{
    private int roomNumber;
    private String roomType;

    public HotelRoom()
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