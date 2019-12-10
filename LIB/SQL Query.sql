create table airline_table(

airline_id int auto_increment,
airline_name varchar(150),

primary key(airline_id)

);
insert into airline_table(airline_name)values('Cebu Pacific');
insert into airline_table(airline_name)values('Philippine Airlines');
insert into airline_table(airline_name)values('Tigerair');
insert into airline_table(airline_name)values('Emirates');
insert into airline_table(airline_name)values('SkyJet Airlines');
insert into airline_table(airline_name)values('American Airlines');
insert into airline_table(airline_name)values('Singapore Airlines');
insert into airline_table(airline_name)values('Air Asia Philippines');
insert into airline_table(airline_name)values('Jetstar Asia Airways');
insert into airline_table(airline_name)values('All Nippon Airways');


create table merchant_table(

merchant_id int auto_increment,
firstname varchar(100),
lastname varchar(100),
userstatus_id int,
airline_id int,
primary key(merchant_id),
foreign key(userstatus_id)references userstatus_table(userstatus_id),
foreign key(airline_id)references airline_table(airline_id)
);

insert into merchant_table(firstname, lastname, userstatus_id, airline_id)values('Jeffery', 'Sumner', 1, 1);
insert into merchant_table(firstname, lastname, userstatus_id, airline_id)values('Carly', 'River', 1, 2);
insert into merchant_table(firstname, lastname, userstatus_id, airline_id)values('Lincoln', 'Manchester', 1, 3);
insert into merchant_table(firstname, lastname, userstatus_id, airline_id)values('Timmy', 'Turner', 1, 4);
insert into merchant_table(firstname, lastname, userstatus_id, airline_id)values('Danny', 'Phantom', 1, 5);
insert into merchant_table(firstname, lastname, userstatus_id, airline_id)values('Jimmy', 'Neutron', 1, 6);
insert into merchant_table(firstname, lastname, userstatus_id, airline_id)values('Barry', 'Barnes', 1, 7);
insert into merchant_table(firstname, lastname, userstatus_id, airline_id)values('Bruce', 'Wayne', 1, 8);
insert into merchant_table(firstname, lastname, userstatus_id, airline_id)values('Mario', 'Espinoza', 1, 9);
insert into merchant_table(firstname, lastname, userstatus_id, airline_id)values('Anthony', 'Williams', 1, 10);


create table airplane_table(

airplane_id int auto_increment,
airplane_name varchar(100),
seat_amount int,
seat_price double,
airline_id int,

terminal varchar(50),
flight_status_id int,
depart_time time,
arrival_time time,
departure_date date,
gate varchar(50), 

destination_id int,
location_id int,

primary key(airplane_id),
foreign key(airline_id)references airline_table(airline_id),
foreign key(flight_status_id) references flight_status_table(flight_status_id),
foreign key(location_id)references all_location_table(location_id),
foreign key(destination_id)references all_location_table(location_id)

);

insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Airbus A330-300', 150,'1000.00', 1, 'M', 2, '12:30:00', '6:30:00','2019-12-20',5, 4, 19);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Airbus A320 JOON', 200,'1200.00', 1, 'M', 1, '02:30:00', '8:45:00','2019-12-31',22, 22, 10);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Airbus A330-300 Rwanda', 650,'845.00', 1, 'A', 3, '22:00:00', '6:30:00','2019-12-20',9, 17, 9);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Airbus A380', 382, '820.00', 1, 'F', 2, '16:30:00', '23:30:00','2019-12-20',10, 9, 25);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Airbus A320 S7', 457,'987.00', 1, 'H', 1, '13:00:00', '20:30:00','2019-12-20',19, 33, 35);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Airbus A330-200 Thomas Cook', 620,'1087.50', 1, 'B', 4, '06:45:00', '20:30','2019-12-20',19, 29, 22);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Airbus A330 S4', 900,'401.00', 1, 'L', 5, '11:00:00', '18:40:00','2019-12-20', 11, 30, 5);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Airbus A340 S8', 770,'642.00', 1, 'P', 6, '02:20:00', '11:30:00','2019-12-20',7, 27, 16);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Airbus A3580-360', 200,'1346.20', 1, 'V', 1, '09:00:00', '16:45:00','2019-12-20',1, 13, 32);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Pacific B737-900ER', 567,'600.00', 2, 'A', 3, '07:15:00', '18:30:00','2019-12-20',3, 10, 22);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Pacific FV753', 460,'780.00', 2, 'D', 2, '12:10:00', '19:20:00','2019-12-20',7, 7, 15);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Pacific F27-400M', 616,'767.00', 2, 'F', 3, '11:00:00', '21:30:00','2019-12-20',3, 2, 26);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Pacific B757-200', 392,'1187.00', 2, 'G', 2, '07:10:00', '13:20:00','2019-12-20', 9, 8, 21);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Pacific DR-533', 672, '879.40', 2, 'E', 2, '16:30:00', '23:10:00','2019-12-20', 10, 28, 11);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Pacific ERJ195', 515,'1027.00', 2, 'J', 2, '04:00:00', '14:30:00','2019-12-20', 1, 1, 7);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Pacific Fly', 610,'927.00', 2, 'B', 3, '12:00:00', '18:40:00','2019-12-20', 13, 29, 14);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Pacific 28-1111', 330,'1332.00', 2, 'E', 6, '09:20:00', '17:40:00','2019-12-20', 22, 23, 3);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Pacific F27-400M', 760,'1027.00', 2, 'A', 1, '02:45:00', '13:15:00','2019-12-20', 6, 28, 10);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Pacific B390', 235,'1286.00', 2, 'D', 2, '15:15:00', '22:20:00','2019-12-20', 9, 8, 18);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Convair AV440', 336,'989.10', 3, 'C', 1, '04:00:00', '14:30:00','2019-12-20', 1, 1, 7);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Pacific ERJ195', 515,'1027.00', 2, 'J', 2, '04:00:00', '14:30:00','2019-12-20', 1, 1, 7);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Pacific ERJ195', 515,'1027.00', 2, 'J', 2, '04:00:00', '14:30:00','2019-12-20', 1, 1, 7);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Pacific ERJ195', 515,'1027.00', 2, 'J', 2, '04:00:00', '14:30:00','2019-12-20', 1, 1, 7);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Pacific ERJ195', 515,'1027.00', 2, 'J', 2, '04:00:00', '14:30:00','2019-12-20', 1, 1, 7);




create table all_location_table(
location_id int auto_increment,
location_name varchar(100),
city_name varchar(150),
acronym varchar(100),

primary key(location_id)
);

drop table all_location_table;

insert into all_location_table(location_name, acronym, city_name)values('Australia', 'AU', 'CANBERRA');
insert into all_location_table(location_name, acronym, city_name)values('Brazil', 'BR', 'BRASILIA');
insert into all_location_table(location_name, acronym, city_name)values('Canada', 'CA', 'OTTAWA');
insert into all_location_table(location_name, acronym, city_name)values('Cambodia', 'KH', '	PHNOM PENH');
insert into all_location_table(location_name, acronym, city_name)values('Colombia', 'CO', 'BOGOTÁ');
insert into all_location_table(location_name, acronym, city_name)values('Dominican Republic', 'DO', 'SANTO DOMINGO');
insert into all_location_table(location_name, acronym, city_name)values('Egypt', 'EG', 'CAIRO');
insert into all_location_table(location_name, acronym, city_name)values('Ethiopia', 'ET', 'ADDIS ABABA');
insert into all_location_table(location_name, acronym, city_name)values('Finland', 'FI', 'HELSINKI');
insert into all_location_table(location_name, acronym, city_name)values('France', 'FR', 'PARIS');
insert into all_location_table(location_name, acronym, city_name)values('Germany', 'DE', 'BERLIN');
insert into all_location_table(location_name, acronym, city_name)values('Greece', 'GR', 'ATHENS');
insert into all_location_table(location_name, acronym, city_name)values('Haiti', 'HI', 'PORT-AU-PRINCE');
insert into all_location_table(location_name, acronym, city_name)values('India', 'IN', 'NEW DELHI');
insert into all_location_table(location_name, acronym, city_name)values('Indonesia', 'ID', 'JAKARTA');
insert into all_location_table(location_name, acronym, city_name)values('Isreal', 'IL', 'JERUSALEM');
insert into all_location_table(location_name, acronym, city_name)values('Italy', 'IT', 'ROME');
insert into all_location_table(location_name, acronym, city_name)values('Jamaica', 'JM', 'KINGSTON');
insert into all_location_table(location_name, acronym, city_name)values('Japan', 'JP', 'TOKYO');
insert into all_location_table(location_name, acronym, city_name)values('Korea', 'KP', 'SEOUL');
insert into all_location_table(location_name, acronym, city_name)values('Malaysia', 'MY', 'KUALA LUMPUR');
insert into all_location_table(location_name, acronym, city_name)values('Mexico', 'MX', 'MEXICO CITY');
insert into all_location_table(location_name, acronym, city_name)values('Nepal', 'NP', 'KATHMANDU');
insert into all_location_table(location_name, acronym, city_name)values('New Zealand', 'NZ', 'WELLINGTON');
insert into all_location_table(location_name, acronym, city_name)values('Nigeria', 'NG', 'ABUJA');
insert into all_location_table(location_name, acronym, city_name)values('Philippines', 'PH', 'MANILA');
insert into all_location_table(location_name, acronym, city_name)values('Poland', 'PL', 'WARSAW');
insert into all_location_table(location_name, acronym, city_name)values('Russia', 'RU', 'MOSCOW');
insert into all_location_table(location_name, acronym, city_name)values('Romania', 'RO', 'BUCHAREST');
insert into all_location_table(location_name, acronym, city_name)values('Sweden', 'SE', 'STOCKHOLM');
insert into all_location_table(location_name, acronym, city_name)values('Taiwan', 'TW', 'TAIPEI');
insert into all_location_table(location_name, acronym, city_name)values('Thailand', 'TH', 'BANGKOK');
insert into all_location_table(location_name, acronym, city_name)values('United Kingdom', 'UK', 'LONDON');
insert into all_location_table(location_name, acronym, city_name)values('United States', 'US', 'WASHINGTON, D.C.');
insert into all_location_table(location_name, acronym, city_name)values('Viet Nam', 'VN', 'HANOI');

select * from all_location_table;

create table flight_status_table(
flight_status_id int auto_increment,
flight_status varchar(100),

primary key(flight_status_id)
);

insert into flight_status_table(flight_status)values('Boarding');
insert into flight_status_table(flight_status)values('Departed');
insert into flight_status_table(flight_status)values('Arrived');
insert into flight_status_table(flight_status)values('Delayed');
insert into flight_status_table(flight_status)values('Landed');
insert into flight_status_table(flight_status)values('Redirected');
insert into flight_status_table(flight_status)values('Scheduled');

create table client_table(

client_id int auto_increment,
lastname varchar(100),
firstname varchar(100),
middlename varchar(100),
birthdate date,
contact_number varchar(20),
address varchar(200),
email varchar(255),
airplane_id int,
gender_id int,
primary key(client_id),
foreign key(airplane_id)references airplane_table(airplane_id),
foreign key(gender_id)references gender_table(gender_id)

);

insert into client_table(lastname, firstname, middlename, gender_id, birthdate, contact_number, address, email, airplane_id)values('Maye', 'James', 'Allen', 1, '1994-08-08', '09368796010', 'Makati City', 'Jamesmaye6094@gmail.com', 1);

create table gender_table(
gender_id int auto_increment,
gender varchar(50),

primary key(gender_id)
);

insert into gender_table(gender)values('Male');
insert into gender_table(gender)values('Female');

create table employee_table(

employee_id int auto_increment,
first_name varchar(100),
last_name varchar(100),
email varchar(100),
username varchar(100),
password varchar(100),
birthdate date,
address varchar(100),

usertype int,
userstatus int,

primary key(employee_id),
foreign key(usertype)references usertype_table(usertype_id),
foreign key(userstatus)references userstatus_table(userstatus_id)

);

insert into employee_table(first_name, last_name, email, username, password, birthdate, address, usertype, userstatus)values('Brent', 'Rivera', 'Brent@gmail.com', 'QWERTY', 'QWERTY', '2000-03-10', 'Makati City', 2, 1);



create table usertype_table(

usertype_id int auto_increment,
type varchar(100),

primary key(usertype_id)
);

insert into usertype_table(type)values('Employee');
insert into usertype_table(type)values('Admin');



create table userstatus_table(

userstatus_id int auto_increment,
stats varchar(100),

primary key(userstatus_id)
);

insert into userstatus_table(stats)values('Active');
insert into userstatus_table(stats)values('Inactive');

delimiter \\
create procedure employeeList()
begin
select employee_table.first_name, employee_table.last_name, employee_table.email, employee_table.username, employee_table.password, employee_table.birthdate, employee_table.address, usertype_table.type, userstatus_table.stats
from employee_table
join usertype_table
on employee_table.usertype = usertype_table.usertype_id
join userstatus_table
on employee_table.userstatus = userstatus_table.userstatus_id;
end \\
delimiter ;

delimiter \\
create procedure getClients()
begin
select client_table.lastname, client_table.firstname, client_table.middlename, gender_table.gender, client_table.birthdate, client_table.contact_number, client_table.address, client_table.email, airline_table.airline_name,airplane_table.airplane_id, airplane_table.airplane_name,  airplane_table.depart_time, airplane_table.arrival_time, airplane_table.departure_date, airplane_table.gate, airplane_table.terminal, loc.location_name as location, loc_city.city_name as location_city, des.location_name as destination, des_city.city_name as destination_city, client_table.client_id
from client_table
join gender_table
on client_table.gender_id = gender_table.gender_id
join airplane_table
on airplane_table.airplane_id = client_table.airplane_id
join airline_table
on airplane_table.airline_id = airline_table.airline_id
join all_location_table loc
on loc.location_id = airplane_table.location_id
left join all_location_table loc_city
on loc_city.location_id = airplane_table.location_id
left join all_location_table des
on des.location_id = airplane_table.destination_id
left join all_location_table des_city
on des_city.location_id = airplane_table.destination_id;
end \\
delimiter ;

delimiter \\
create procedure getPlaneList()
begin 
select airplane_name, seat_amount, seat_price, airline_table.airline_name, terminal, gate as gate_number, flight_status_table.flight_status, depart_time, arrival_time, loc.location_name as location, loc_city.city_name as location_city, A.location_name as destination, des_city.city_name as destination_city
from airplane_table
join airline_table
on airline_table.airline_id = airplane_table.airline_id
join flight_status_table
on flight_status_table.flight_status_id = airplane_table.flight_status_id
join all_location_table loc
on  loc.location_id = airplane_table.location_id
left join all_location_table as A
on  A.location_id = airplane_table.destination_id
left join all_location_table loc_city
on loc_city.location_id = airplane_table.location_id
join all_location_table des_city
on des_city.location_id = airplane_table.destination_id
;
end \\
delimiter ;

delimiter \\
create procedure getMerchants()
select merchant_table.merchant_id, merchant_table.firstname, merchant_table.lastname, userstatus_table.stats, airline_table.airline_name
from merchant_table
join userstatus_table
on merchant_table.userstatus_id = userstatus_table.userstatus_id
join airline_table
on merchant_table.airline_id = airline_table.airline_id;
end \\
delimiter ;

call employeeList();
call getClients();
call getPlaneList();
call getMerchants();
call employeeLogin();
select * from airplane_table;
select * from all_location_table;
select * from flight_status_table;
select * from userstatus_table;
select * from merchant_table;