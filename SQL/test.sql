drop database if exists test;
create database test;
use test;

create table people_table
(
	name varchar(16) not null,
	id int not null,
	sex varchar(16) not null
);

create table fruit_table
(
	name varchar(16) not null,
	color varchar(16) not null,
	price float
);

insert into people_table values('DuZiyao', 152210109, 'man');

insert into fruit_table values('Apple', 'Red', 15.2);