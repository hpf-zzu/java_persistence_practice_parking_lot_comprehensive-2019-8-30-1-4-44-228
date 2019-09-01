package tws.entity;

public class ParkingBoy {
    private int parkingBoyId;
    private String parkingBoyname;
    private int ParkingBoyAge;

    public ParkingBoy(int parkingBoyId, String parkingBoyname, int ParkingBoyAge) {
        this.parkingBoyId = parkingBoyId;
        this.parkingBoyname = parkingBoyname;
        this.ParkingBoyAge = ParkingBoyAge;
    }
    public ParkingBoy(){
    }

    public int getParkingBoyId() {
        return parkingBoyId;
    }

    public void setParkingBoyId(int parkingBoyId) {
        this.parkingBoyId = parkingBoyId;
    }

    public String getParkingBoyname() {
        return parkingBoyname;
    }

    public void setParkingBoyname(String parkingBoyname) {
        this.parkingBoyname = parkingBoyname;
    }

    public int getParkingBoyAge() {
        return ParkingBoyAge;
    }

    public void setParkingBoyAge(int parkingBoyAge) {
        ParkingBoyAge = parkingBoyAge;
    }

    @Override
    public String toString() {
        return "ParkingBoy{" +
                "parkingBoyId=" + parkingBoyId +
                ", parkingBoyname='" + parkingBoyname + '\'' +
                ", ParkingBoyAge=" + ParkingBoyAge +
                '}';
    }
}




