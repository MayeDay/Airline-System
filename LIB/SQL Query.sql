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
select * from airplane_table;
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

insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Airbus A330-300', 456,'735.00', 7, 'J', 1, '8:45:00', '16:45:00','2019-12-20', 10, 10, 7);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Airbus A320 JOON', 234,'756.00', 5, 'F', 4, '18:40:00', '09:00:00','2019-12-20', 4, 1, 23);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Airbus A330-300 Rwand', 111,'258.00', 3, 'G', 4, '23:30:00', '11:30:00','2019-12-20', 2, 5, 23);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Airbus A340-300',245 ,'645.00', 7, 'A', 3, '16:30:00', '09:00:00','2019-12-20', 4, 7, 12);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Airbus A380', 425,'654.00', 3, 'T', 6, '20:30:00', '19:20:00','2019-12-20', 3, 8, 24);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Airbus A320 S7', 743,'999.00', 8, 'Y', 4, '13:00:00', '09:00:00','2019-12-20', 7, 28, 13);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Airbus A330-200 ThomasCook', 322,'647.00', 10, 'P', 5, '06:45:00', '19:20:00','2019-12-20', 2, 18, 24);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Airbus A330 S4', 634,'858.00', 3, 'O', 3, '06:45:00', '16:45:00','2019-12-20', 10, 25, 40);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Airbus A340 S8', 346,'546.00', 6, 'A', 5, '18:40:00', '16:30:00','2019-12-20', 5, 14, 32);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Airbus A3580-360', 234,'456.00', 7, 'Q', 6, '11:00:00', '09:00:00','2019-12-20', 3, 16, 14);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Pacific B737-900ER', 213,'532.00', 9, 'L', 1, '11:30:00', '16:45:00','2019-12-20', 8, 22, 16);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Pacific FV753', 355,'636.00', 3, 'N', 2, '02:20:00', '02:45:00','2019-12-20', 3, 28, 34);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Pacific F27-400M', 242,'426.00', 4, 'L', 3, '16:45:00', '16:45:00','2019-12-20', 10, 20, 23);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Pacific B757-200', 235,'555.00', 4, 'K', 5, '09:00:00', '02:45:00','2019-12-20', 2, 30, 24);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Pacific DR-533', 235,'245.00', 2, 'S', 2, '18:30:00', '13:20:00','2019-12-20', 4, 11, 15);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Pacific ERJ195', 251,'444.00', 7, 'Z', 1, '07:15:00', '18:40:00','2019-12-20', 8, 24, 15);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Pacific Fly', 346,'363.00', 1, 'X', 5, '19:20:00', '09:20:00','2019-12-20', 5, 28, 17);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Pacific 28-1111', 123,'532.00', 6, 'C', 6, '12:10:00', '14:30:00','2019-12-20', 4, 7, 37);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Pacific F27-400M', 124,'411.00', 1, 'V', 1, '21:30:00', '23:30:00','2019-12-20', 8, 10, 12);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Pacific B390', 234,'235.00', 5, 'E', 3, '11:00:00', '23:30:00','2019-12-20', 3, 28, 15);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Convair AV440', 235,'355.00', 7, 'R', 4, '13:20:00', '16:45:00','2019-12-20', 3, 18, 24);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Convair BV540', 225,'444.00', 7, 'Q', 5, '07:10:00', '06:45:00','2019-12-20', 6, 12, 8);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Convair CV740', 245,'532.00', 2, 'W', 1, '07:10:00', '16:45:00','2019-12-20', 9, 5, 7);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Convair DV940', 256,'356.00', 4, 'E', 2, '16:30:00', '16:45:00','2019-12-20', 7, 9, 18);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Convair EV960', 362,'523.00', 3, 'T', 2, '23:10:00', '19:20:00','2019-12-20', 6, 11, 21);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Convair FV753', 235,'345.00', 9, 'D', 5, '14:30:00', '04:00:00','2019-12-20', 5, 18, 20);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Convair G364', 256,'523.00', 10, 'F', 5, '04:00:00', '19:20:00','2019-12-20', 2, 15, 10);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Convair HV256', 1556,'2222.00', 4, 'J', 6, '18:40:00', '11:30:00','2019-12-20', 1, 18, 23);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Convair IV198', 636,'777.00', 3, 'S', 2, '12:00:00', '16:45:00','2019-12-20', 1, 16, 11);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Convair JAV440', 237,'353.00', 6, 'V', 1, '09:20:00', '18:40:00','2019-12-20', 2, 13, 22);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('JetStar A3450-300', 346,'522.00', 4, 'N', 4, '17:40:00', '16:45:00','2019-12-20', 4, 13, 33);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('JetStar A340 S70', 235,'346.00', 7, 'V', 5, '13:15:00', '23:30:00','2019-12-20', 5, 31, 34);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('JetStar A340-300', 235,'633.00', 10, 'S', 6, '02:45:00', '16:45:00','2019-12-20', 2, 21, 39);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('JetStar A3580-360', 533,'663.00', 6, 'Z', 6, '22:20:00', '16:45:00','2019-12-20', 2, 11, 4);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('JetStar A340 S8', 252,'1664.00', 8, 'H', 3, '15:15:00', '11:30:00','2019-12-20', 3, 11, 7);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('JetStar A3660 S1', 432,'633.00', 8, 'D', 2, '15:15:00', '20:30','2019-12-20', 10, 1, 29);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('JetStar A340 S4', 235,'3636.00', 7, 'R', 4, '14:30:00', '22:00:00','2019-12-20', 9, 9, 31);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('JetStar A30 S6', 464,'555.00', 2, 'I', 1, '14:30:00', '6:30:00','2019-12-20', 2, 10, 9);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('JetStar A340 S10-2', 325,'2521.00', 5, 'U', 3, '04:00:00', '23:30:00','2019-12-20', 3, 12, 17);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('JetStar A380-360', 222,'333.00', 6, 'W', 2, '02:45:00', '16:30:00','2019-12-20', 4, 28, 10);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Cebgo TB10-VF189', 555,'777.00', 2, 'F', 3, '6:30:00', '13:00:00','2019-12-20', 5, 23, 12);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Cebgo PA28-VF135', 236,'522.00', 3, 'G', 3, '22:00:00', '20:30:00','2019-12-20', 2, 2, 33);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Cebgo PA28-181', 525,'2526.00', 9, 'S', 1, '8:45:00', '06:45:00','2019-12-20', 6, 22, 15);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Cebgo VF352', 325,'622.00', 10, 'O', 2, '02:30:00', '20:30','2019-12-20', 3, 25, 16);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Cebgo TB-20', 366,'2777.00', 1, 'W', 3, '6:30:00', '11:00:00','2019-12-20', 2, 7, 28);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Cebgo VF162-1', 222,'252.00', 2, 'T', 4, '12:30:00', '18:40:00','2019-12-20', 2, 22, 13);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Cebgo L410UVP-e20', 366,'664.00', 2, 'A', 4, '14:30:00', '02:20:00','2019-12-20', 2, 5, 22);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Cebgo B777-300E', 333,'555.00', 4, 'K', 5, '04:00:00', '11:30:00','2019-12-20', 10, 9, 16);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Cebgo 208B-VF398', 225,'522.00', 5, 'W', 6, '22:20:00', '09:00:00','2019-12-20', 8, 23, 15);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Cebgo AB-11252', 353,'666.00', 2, 'O', 2, '15:15:00', '16:45:00','2019-12-20', 6, 3, 17);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Swift G-BOAB', 256,'268.00', 2, 'I', 3, '13:15:00', '07:15:00','2019-12-20', 3, 11, 18);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Swift EC135', 464,'755.00', 7, 'Q', 3, '02:45:00', '18:30:00','2019-12-20', 4, 17, 34);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Swift Dornier 228', 363,'547.00', 8, 'Q', 2, '17:40:00', '19:20:00','2019-12-20', 10, 18, 17);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Swift Airbus A320 S', 343,'456.00', 3, 'P', 3, '09:20:00', '12:10:00','2019-12-20', 2, 27, 26);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Swift MMY0156', 442,'526.00', 7, 'J', 1, '18:40:00', '11:00:00','2019-12-20', 3, 7, 28);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Swift ERJ190', 213,'352.00', 2, 'L', 1, '12:00:00', '21:30:00','2019-12-20', 3, 17, 25);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Swift PA082', 235,'346.00', 3, 'K', 4, '14:30:00', '07:10:00','2019-12-20', 2, 1, 26);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Swift F-BVFB', 234,'343.00', 6, 'E', 2, '04:00:00', '13:20:00','2019-12-20', 1, 24, 19);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Swift PA106', 152,'235.00', 7, 'R', 4, '23:10:00', '16:30:00','2019-12-20', 3, 4, 21);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Swift PA889', 347,'3223.00', 2, 'W', 6, '16:30:00', '23:10:00','2019-12-20', 2, 9, 27);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Fokker F27-400M', 235,'263.00', 1, 'W', 6, '13:20:00', '04:00:00','2019-12-20', 8, 7, 17);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Fokker 28-1000', 3463,'6433.00', 7, 'E', 2, '07:10:00', '14:30:00','2019-12-20', 8, 22, 37);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Fokker DR1', 234,'543.00', 7, 'J', 1, '21:30:00', '12:00:00','2019-12-20', 4, 14, 24);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Fokker DR2', 236,'363.00', 2, 'E', 3, '11:00:00', '18:40:00','2019-12-20', 5, 15, 26);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Fokker DR', 347,'2355.00', 4, 'F', 4, '19:20:00', '09:20:00','2019-12-20', 9, 16, 17);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Fokker DC5', 236,'622.00', 5, 'G', 4, '12:10:00', '17:40:00','2019-12-20', 10, 17, 27);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Fokker G68', 236,'345.00', 5, 'H', 5, '18:30:00', '02:45:00','2019-12-20', 2, 18, 23);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Fokker F27-400M', 166,'236.00', 2, 'I', 1, '07:15:00', '13:15:00','2019-12-20', 3, 19, 6);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Fokker F84-460G', 277,'754.00', 5, 'K', 2, '16:45:00', '15:15:00','2019-12-20', 7, 11, 9);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Fokker DR-532', 234,'345.00',8 , 'R', 2, '09:00:00', '22:20:00','2019-12-20', 3, 12, 10);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Boeing B757-200', 235,'352.00', 5, 'D', 5, '11:30:00', '04:00:00','2019-12-20', 4, 13, 13);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Boeing B777-200', 124,'352.00', 5, 'T', 2, '02:20:00', '14:30:00','2019-12-20', 5, 14, 18);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Boeing B737-700', 235,'345.00', 3, 'J', 6, '18:40:00', '12:30:00','2019-12-20', 9, 15, 19);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Boeing B787-9', 345,'345.00', 4, 'Q', 4, '20:30', '6:30:00','2019-12-20', 2, 16, 28);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Boeing B757-200', 234,'355.00', 8, 'R', 5, '06:45:00', '02:30:00','2019-12-20', 3, 17, 20);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Boeing B737-900ER', 522,'636.00',1 , 'I', 1, '20:30:00', '8:45:00','2019-12-20', 2, 18, 30);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Boeing B737-800', 324,'533.00', 2, 'P', 4, '13:00:00', '22:00:00','2019-12-20', 7, 19, 15);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Boeing B787-10 KLM', 324,'3243.00', 3, 'S', 3, '23:30:00', '6:30:00','2019-12-20', 3, 26, 37);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Boeing B767-300ER', 346,'435.00', 4, 'T', 6, '16:30:00', '23:30:00','2019-12-20', 5, 21, 3);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Boeing B747SP', 243,'432.00', 5, 'R', 2, '22:00:00', '16:30:00','2019-12-20', 1, 15, 9);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Skyjet 40 House Colors N40LJ', 200,'1200.00', 1, 'M', 1, '02:30:00', '8:45:00','2019-12-31',22, 22, 10);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Skyjet 70 House Colors N70LJ', 650,'845.00', 1, 'A', 3, '22:00:00', '6:30:00','2019-12-20',9, 17, 9);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Skyjet 85 House Colors N85LJ', 382, '820.00', 1, 'F', 2, '16:30:00', '23:30:00','2019-12-20',10, 9, 25);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Skyjet 105 House Colors N55LJ', 457,'987.00', 1, 'H', 1, '13:00:00', '20:30:00','2019-12-20',19, 33, 35);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Skyjet 855 House Colors N95LJ', 620,'1087.50', 1, 'B', 4, '06:45:00', '20:30','2019-12-20',19, 29, 22);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Skyjet 78 House Colors N45LJ', 900,'401.00', 1, 'L', 5, '11:00:00', '18:40:00','2019-12-20', 11, 30, 5);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Skyjet 25 House Colors N75LJ', 770,'642.00', 1, 'P', 6, '02:20:00', '11:30:00','2019-12-20',7, 27, 16);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Skyjet 469 House Colors N15LJ', 200,'1346.20', 1, 'V', 1, '09:00:00', '16:45:00','2019-12-20',1, 13, 32);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Skyjet 325 House Colors N65LJ', 567,'600.00', 2, 'A', 3, '07:15:00', '18:30:00','2019-12-20',3, 10, 22);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Skyjet 185 House Colors N25LJ', 460,'780.00', 2, 'D', 2, '12:10:00', '19:20:00','2019-12-20',7, 7, 15);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Embraer ERJ145 Expressjet', 235,'533.00', 6, 'J', 2, '8:45:00', '23:30:00','2019-12-20', 2, 19, 13);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Embraer ERJ195 Air Dolomiti', 235,'636.00', 7, 'F', 4, '02:30:00', '13:00:00','2019-12-20', 8, 11, 26);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Embraer Legacy Flight Options', 616,'767.00', 2, 'F', 3, '11:00:00', '21:30:00','2019-12-20',3, 2, 26);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Embraer ERJ190 KLMCityhopper', 424,'525.00', 8, 'J', 5, '6:30:00', '20:30:00','2019-12-20', 6, 17, 17);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Embraer BRZ196 KLM', 2345,'3455.00', 9, 'S', 5, '12:30:00', '06:45:00','2019-12-20', 7, 17, 28);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Embraer Legacy 2.1', 345,'436.00', 10, 'A', 2, '06:45:00', '20:30','2019-12-20', 8, 13, 5);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Embraer CD2012', 392,'1187.00', 2, 'G', 2, '07:10:00', '13:20:00','2019-12-20', 9, 8, 21);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Embraer 02-01', 672, '879.40', 2, 'E', 2, '16:30:00', '23:10:00','2019-12-20', 10, 28, 11);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Embraer Mastery 214', 515,'1027.00', 2, 'J', 2, '04:00:00', '14:30:00','2019-12-20', 1, 1, 7);
insert into airplane_table(airplane_name, seat_amount, seat_price, airline_id, terminal, flight_status_id, depart_time, arrival_time, departure_date, gate, destination_id, location_id)values('Embraer Fly 556', 610,'927.00', 2, 'B', 3, '12:00:00', '18:40:00','2019-12-20', 13, 29, 14);

select * from airplane_table;



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

delimiter \\
create procedure getLocation()
begin 
select location_name, city_name, acronym
from all_location_table;
end \\
delimiter ;

call employeeList();
call getClients();
call getPlaneList();
call getMerchants();
call employeeLogin();
call getLocation();
select * from airplane_table;
select * from all_location_table;
select * from flight_status_table;
select * from userstatus_table;
select * from merchant_table;