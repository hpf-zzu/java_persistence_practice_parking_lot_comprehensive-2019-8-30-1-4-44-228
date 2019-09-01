package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tws.DTO.ParkingBoyDTO;
import tws.entity.ParkingBoy;
import tws.service.ParkingBoyService;

import java.net.URI;
import java.util.List;

@RestController

@RequestMapping("/parkingBoys")
public class ParkingBoyController {

    @Autowired
    ParkingBoyService parkingBoyService;

    @PostMapping
    public ResponseEntity<ParkingBoy> addParkingBoy(@RequestBody ParkingBoy parkingBoy){
        parkingBoyService.addParkingBoy(parkingBoy);
        return ResponseEntity.created(URI.create("/parkingBoys/"+parkingBoy.getParkingBoyId())).build();
    }

    @GetMapping
    public ResponseEntity<List<ParkingBoy>> selectAllParkingBoy(){
        List<ParkingBoy> parkingBoys =  parkingBoyService.selectAllParkingBoy();
        return ResponseEntity.ok(parkingBoys);

    }

    @GetMapping("/parkingBoysDTO")
    public ResponseEntity<List<ParkingBoyDTO>> getAllParkingBoyDTO(){
        return ResponseEntity.ok(parkingBoyService.getAllParkingBoyDTO());
    }
}
