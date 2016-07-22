create database formaya;use formaya;
create table usere(
id varchar(20)primary key,
pass varchar(20)not null,
nama varchar(40)not null,
login boolean not null,
deleted boolean not null,
blocked boolean not null
);
insert into usere values('rifai','aku','Achmad Rifai',0,0,0);