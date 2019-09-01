package tws.DTO;

import tws.entity.ParkingLot;

import java.util.List;

public class ParkingBoyDTO {
    private int parkingBoyId;
    private String parkingBoyName;
    private int parkingBoyAge;
    private List<ParkingLot> parkingLotList;

    public ParkingBoyDTO() {
    }

    public ParkingBoyDTO(int parkingBoyId, String parkingBoyName, int parkingBoyAge, List<ParkingLot> parkingLotList) {
        this.parkingBoyId = parkingBoyId;
        this.parkingBoyName = parkingBoyName;
        this.parkingBoyAge = parkingBoyAge;
        this.parkingLotList = parkingLotList;
    }

    public int getParkingBoyId() {
        return parkingBoyId;
    }

    public void setParkingBoyId(int parkingBoyId) {
        this.parkingBoyId = parkingBoyId;
    }

    public String getParkingBoyName() {
        return parkingBoyName;
    }

    public void setParkingBoyName(String parkingBoyName) {
        this.parkingBoyName = parkingBoyName;
    }

    public int getParkingBoyAge() {
        return parkingBoyAge;
    }

    public void setParkingBoyAge(int parkingBoyAge) {
        this.parkingBoyAge = parkingBoyAge;
    }

    public List<ParkingLot> getParkingLotList() {
        return parkingLotList;
    }

    public void setParkingLotList(List<ParkingLot> parkingLotList) {
        this.parkingLotList = parkingLotList;
    }

    @Override
    public String toString() {
        return "ParkingBoyDTO{" +
                "parkingBoyId=" + parkingBoyId +
                ", parkingBoyName='" + parkingBoyName + '\'' +
                ", parkingBoyAge=" + parkingBoyAge +
                ", parkingLotList=" + parkingLotList +
                '}';
    }
}
