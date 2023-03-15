create table if not exists fighter (
  id identity,
  name varchar(50) not null,
  year_of_creation int not null,
  health int not null,
  price not null,
  brand varchar(50) not null,
 
);