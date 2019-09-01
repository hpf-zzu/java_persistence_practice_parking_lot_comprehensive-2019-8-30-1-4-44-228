package tws.entity;

public class ParkingLot {
    private int parkingLotId;
    private int capacity;
    private int availablePosition;
    private int parkingBoyId;

    public ParkingLot(){}

    public ParkingLot(int parkingLotId, int capacity, int availablePosition, int parkingBoyId) {
        this.parkingLotId = parkingLotId;
        this.capacity = capacity;
        this.availablePosition = availablePosition;
        this.parkingBoyId = parkingBoyId;
    }

    public int getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(int parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAvailablePosition() {
        return availablePosition;
    }

    public void setAvailablePosition(int availablePosition) {
        this.availablePosition = availablePosition;
    }

    public int getParkingBoyId() {
        return parkingBoyId;
    }

    public void setParkingBoyId(int parkingBoyId) {
        this.parkingBoyId = parkingBoyId;
    }

    @Override
    public String toString() {
        return "ParkingLot{" +
                "parkingLotId=" + parkingLotId +
                ", capacity=" + capacity +
                ", availablePosition=" + availablePosition +
                ", parkingBoyId=" + parkingBoyId +
                '}';
    }
}
