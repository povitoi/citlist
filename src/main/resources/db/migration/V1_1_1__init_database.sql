create schema if not exists citlist;

create table citlist.t_citizen
(
    id             serial primary key,
    c_firstname    varchar(50) not null,
    c_lastname     varchar(50) not null,
    c_patronymic   varchar(50) not null,
    c_phone_number varchar(10),
    c_address      varchar(100)
);

create table if not exists citlist.t_transport
(
    id            serial primary key,
    c_brand       varchar(30) not null,
    c_model       varchar(30),
    c_tail_number varchar(6)  not null,
    c_color       varchar(30) not null,
    c_body        varchar(30) not null,
    c_description varchar(100)
);

create table if not exists citlist.t_citizen_transport
(
    id           serial primary key,
    id_citizen   int not null references citlist.t_citizen (id),
    id_transport int not null references citlist.t_transport (id),
    constraint uk_citizen_transport unique (id_citizen, id_transport)
);

create table if not exists citlist.t_shift_status
(
    id                   serial primary key,
    c_shift_opened       boolean   not null default false,
    c_shift_opening_time timestamp
);

create table if not exists citlist.t_current_shift
(
    id             serial primary key,
    c_firstname    varchar(50) not null,
    c_lastname     varchar(50) not null,
    c_patronymic   varchar(50) not null,
    c_phone_number varchar(10),
    c_address      varchar(100),
    c_brand        varchar(30) not null,
    c_model        varchar(30),
    c_tail_number  varchar(6)  not null,
    c_color        varchar(30) not null,
    c_body         varchar(30) not null,
    c_description  varchar(100)
)