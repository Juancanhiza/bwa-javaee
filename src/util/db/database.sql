create database hr;
use hr;

drop table employees;
drop table jobs;


create table jobs
(
    id varchar(5) primary key,
    title varchar(30),
    minsal int
);
