create database QLSDV

create table users
(
	username nvarchar(20) primary key not null,
	password nvarchar(20) not null,
	role nvarchar(10)
)

delete from saff

select * from saff

create table saff
(
	idSaff nvarchar(10) primary key not null,
	nameSaff nvarchar(30),
	dateOfBirth date,
	genther nvarchar(10),
	address nvarchar(40),
	email nvarchar(40),
	role nvarchar(20),
	image image
)

create table detailSaff
(
	idSaff nvarchar(10) primary key not null,
	beginTime time,
	finishTime time,
	dayOfWeef int,
	salaryOfHour float,
	bonus float,
	total real
)


delete from pet

create table pet
(
	idPet int identity not null primary key,
	namePet nvarchar(40),
	age int ,
	weight float,
	type nvarchar(40),
	genther nvarchar(10),
	color nvarchar(10),
	price float,
	image image,
)

select * from pet

delete from pet
where namePet = 'Name'

alter table detailSaff add constraint fk_saff foreign key (idSaff) references saff (idSaff)

select * from detailSaff

insert into users
values('khangpn', '12345', 'Admin'),
('khanguser', '12345', 'Manager')

select * from detailSaff