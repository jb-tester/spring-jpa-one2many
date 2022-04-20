create table customers(
   customer_id INT PRIMARY KEY,
   first_name VARCHAR(100),
   last_name VARCHAR(100)

);
create table addresses(
    address_id INT PRIMARY KEY,
    city VARCHAR(100),
    street_name VARCHAR(100),
    building VARCHAR(10),
    zip_code VARCHAR(10),
    person_id INT,
    FOREIGN KEY(person_id) REFERENCES customers(customer_id)

);
insert into customers values (101, 'ivan','ivanov');
insert into customers values (102, 'maria','petrova');
insert into customers values (103, 'andrey','smirnov');
insert into customers values (104, 'daria','kuznetzova');
insert into customers values (105, 'pavel','ivanov');

insert into addresses values (1,'Sankt-Petersburg','Gavanskaya', '10/100', '197197',101);
insert into addresses values (2,'Sankt-Petersburg','Bogatyrsky', '100/22', '194194',101);
insert into addresses values (3,'Sankt-Petersburg','Nevsky', '25/25', '193193',101);
insert into addresses values (4,'Sankt-Petersburg','Moskovsky', '25/200', '192192',102);
insert into addresses values (5,'Sankt-Petersburg','Nevsky', '2/33', '193193',103);
insert into addresses values (6,'Moscow','Arbat', '2/44', '200200',103);
insert into addresses values (7,'Prague','Nad Lysinami', '22/1', '14700',104);
insert into addresses values (8,'Prague','Plzenska', '33/55', '15000',102);
insert into addresses values (9,'Prague','Holeckova', '3/550', '15000',101);
insert into addresses values (10,'Prague','Vavrenova', '12/2', '14700',105);
insert into addresses values (11,'Sankt-Petersburg','Kamyshovaya', '9/200', '194194',102);
