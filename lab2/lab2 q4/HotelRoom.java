public class HotelRoom 
{
    private int roomNumber;
    private String roomType;
    private boolean roomStatus;
    private double rate;

    public HotelRoom()
    {
        setRoomNumber(0);
        setRoomType("");
        setRoomStatus(false);
        setRate(0);
    }
    public HotelRoom(int roomNumber, String roomType, boolean roomStatus, double rate)
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
    public boolean getRoomStatus()
    {
        return roomStatus;
    }
    public void setRoomStatus(boolean roomStatus)
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

    public boolean isOccupied()
    {   
        if (roomStatus)
        {
            return true;   
        }
        else
        {
            return false;
        }
    }

    public String toString()
    {
        return "RoomNo. : " + roomNumber + "\tRoom Type: " + roomType + "\tRoom Status: " + roomStatus + "\tRoom Rate: " + rate;
    }
}