package tws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tws.DTO.ParkingBoyDTO;
import tws.entity.ParkingBoy;
import tws.repository.ParkingBoyMapper;

import java.util.List;

@Service
public class ParkingBoyService {
    @Autowired
    ParkingBoyMapper parkingBoyMapper;
    public void addParkingBoy(ParkingBoy parkingBoy){
        parkingBoyMapper.insertParkingBoy(parkingBoy);
    }
    public List<ParkingBoy> selectAllParkingBoy(){
        return parkingBoyMapper.selectAllParkingBoy();
    }
    public List<ParkingBoyDTO> getAllParkingBoyDTO(){
        return parkingBoyMapper.selectAllParkingDTO();
    }

}
