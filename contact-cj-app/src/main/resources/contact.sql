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