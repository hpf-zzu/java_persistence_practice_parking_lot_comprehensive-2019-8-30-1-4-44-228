CREATE TABLE parkinglot (
    parkinglotID varchar(40) PRIMARY KEY,
    capacity INTEGER(100) not null ,
    availablePosition INTEGER(100) default NULL,
    employeeID varchar(40)
);