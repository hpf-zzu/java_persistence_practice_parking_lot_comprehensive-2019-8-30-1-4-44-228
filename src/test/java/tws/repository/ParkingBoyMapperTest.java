package tws.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.jdbc.JdbcTestUtils;
import tws.DTO.ParkingBoyDTO;
import tws.entity.ParkingBoy;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParkingBoyMapperTest {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    ParkingBoyMapper parkingBoyMapper;
    @Test
    public void insertParkingBoy() {
        //given
        ParkingBoy parkingBoy = new ParkingBoy(1,"xiaoming",18);
        //when
        parkingBoyMapper.insertParkingBoy(parkingBoy);
        //then
        assertEquals(1, JdbcTestUtils.countRowsInTable(jdbcTemplate,"parking_boy"));

    }

    @Test
    public void selectAllParkingBoy() {
        //given
        jdbcTemplate.execute("  insert  into `parking_boy` (`parkingBoyId`,`parkingBoyName`,`parkingBoyAge`) values(1,'xiaoming',18)");
        //when
        List<ParkingBoy> parkingBoyList = parkingBoyMapper.selectAllParkingBoy();
        //then
        assertEquals(1,parkingBoyList.size());
    }

    @Test
    public void selectAllParkingDTO(){
        //given
        jdbcTemplate.execute("insert  into `parking_boy` (`parkingBoyId`,`parkingBoyName`,`parkingBoyAge`) values(1,'xiaoming',18)");
        jdbcTemplate.execute("insert into `parking_lot` (`parkingLotId`,`capacity`,`availablePosition`,`parkingBoyId`) values(5,5,5,1)");
        //when
        List<ParkingBoyDTO> parkingBoyDTO = parkingBoyMapper.selectAllParkingDTO();
        //then
        assertEquals(1,parkingBoyDTO.size());
    }
}