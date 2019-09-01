create table user (
  ID varchar(100),
  username varchar(100),
  password varchar(100),
  password_expired varchar(100),
  role varchar(100),
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  employee_id varchar(100)
);