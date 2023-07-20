create table contact (
    id bigserial,
    first_name varchar(255) not null,
    last_name varchar(255) not null,
    email varchar(255) not null,
    mobile varchar(10) not null,
    city varchar(255) not null,
    deleted boolean default false,
    primary key (id)
);


insert into contact(first_name,last_name,email,mobile,city)
values('Raj','Kumar','raj.k@gmail.com','9876543220','Bangalore'),
('Manoj','pvn','manoj.pvn@gmail.com','9876543221','Bangalore'),
('Rajesh','Kumar','rajesh.k@gmail.com','9876543222','Bangalore'),
('Manish','P','manish.p@gmail.com','9876543223','Bangalore');
