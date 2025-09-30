public class HotelRoom 
{
    private int roomNumber;
    private String roomType;
    private int roomStatus;
    private double rate;

    public HotelRoom()
    {
        setRoomNumber(0);
        setRoomType("");
    }
    public HotelRoom(int roomNumber, String roomType, int roomStatus, double rate)
    {
        setRoomNumber(roomNumber);
        setRoomType(roomType);
        setRoomStatus(roomStatus);
        setRate(rate);
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
    public int getRoomStatus()
    {
        return roomStatus;
    }
    public void setRoomStatus(int roomStatus)
    {
        this.roomStatus = roomStatus;
    }
    public double getRate()
    {
        return rate;
    }
    public void setRate(double rate)
    {
        this.rate = rate;
    }
    public String toString()
    {
        return "RoomNo. : " + roomNumber + "\tRoom Type: " + roomType + "\tRoom Status: " + roomStatus + "\tRoom Rate: " + rate;
    }
}