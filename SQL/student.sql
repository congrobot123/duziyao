drop database if exists student;
create database student;
use student;

create table student_table
(
	name varchar(16) not null,
	id int auto_increment primary key,
	tel varchar(16) not null,
	sex varchar(16) not null,
	remark varchar(16)
	unique(id);
	unique(tel);
);

insert into student_table value ('DuZiyao', 001, '1234567890', 'male', null);
insert into student_table value ('ZhouJunjie', null, '1234567891', 'male', null);
insert into student_table value ('XuXiaoxiong', null, '1234567892', 'male', null);
insert into student_table value ('XuChong', null, '1234567893', 'male', null);
insert into student_table value ('GengRui', null, '1234567894', 'woman', null);
insert into student_table value ('LiZhuxiang', null, '1234567895', 'male', null);
insert into student_table value ('XuXiaolei', null, '1234567896', 'male', null);
insert into student_table value ('LvChangxi', null, '1234567897', 'male', null);
insert into student_table value ('XueJie', null, '1234567898', 'woman', null);