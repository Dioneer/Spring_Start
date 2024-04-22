Create database seminar_second;

create table if not exists users(
id serial primary key,
first_name varchar(120),
last_name varchar(120)
);