CREATE TABLE employee (
  id INTEGER PRIMARY KEY,
  name VARCHAR(64) NOT NULL,
  age   int(4) NOT NULL
);
CREATE TABLE expressPackage(
  id VARCHAR (64) PRIMARY KEY,
  weight INTEGER (4),
  name VARCHAR (64),
  status VARCHAR (4),
  date DATE default current_time ,
  phone varchar (13)
)
