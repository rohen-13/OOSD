package lab2_q2;
public class HotelRoomQ2
{
    private int roomNumber;
    private String roomType;
    private int roomStatus;
    private double rate;

    public HotelRoomQ2()
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