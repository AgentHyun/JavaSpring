create table feb12_student(
 s_no number(3) primary key,
 s_name varchar2(10 char) not null,
 s_nickname varchar2(10 char)not null


);

create table feb122_score(

s_name varchar2(10 char) not null,
s_year number(5) not null,
s_month number(3) not null,
s_date number(3) not null


);


create table feb12_test(
 t_title varchar2(20 char) not null,
 t_when date not null


);





drop table feb122_score cascade constraint;
select * from feb122_score;
create sequence feb12_student_seq;
select * from FEB12_STUDENT;
------------------------------------------

insert into feb122_score values('과목', 2024, 1, 2);