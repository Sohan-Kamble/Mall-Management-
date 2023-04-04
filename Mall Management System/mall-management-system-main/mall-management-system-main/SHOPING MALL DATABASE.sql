
 drop database if exists store;

 create database store;
 
 use store;

 create table user( name varchar(40),
                    pass varchar(40),
		    icon integer(10));

 Insert into user Values ("netbeans","mysql",1);

 create table orders (orderno int(10) primary key auto_increment,
                    cname varchar(40),
                    products varchar(255),
                    amount int(10),
                    date date);

 create table shop (name varchar(500),
                   man varchar(50),
                   descp varchar(255),
                   price int(7),
                   qty int(2));
