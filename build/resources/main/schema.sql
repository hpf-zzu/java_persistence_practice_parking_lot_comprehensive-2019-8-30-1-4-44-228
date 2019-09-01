CREATE TABLE employee (
  id INTEGER PRIMARY KEY,
  name VARCHAR(64) NOT NULL,
  age   int(4) NOT NULL
);
CREATE TABLE  parking_boy (
  parkingBoyId int PRIMARY KEY,
  parkingBoyName VARCHAR(64) NOT NULL,
  parkingBoyAge int(4) NOT NULL
);
CREATE TABLE parking_lot(
  parkingLotId int not null primary key ,
  capacity int not null,
  availablePosition int not null,
  parkingBoyId int not null
);