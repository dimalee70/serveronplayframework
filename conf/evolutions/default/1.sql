# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table bish_users (
  id                            number(10) not null,
  name                          varchar2(255),
  surname                       varchar2(255),
  ps_id                         number(10) not null,
  obj_id                        number(10) not null,
  current_altitude              number(19,4) not null,
  current_floor                 number(10) not null,
  constraint pk_bish_users primary key (id)
);
create sequence bish_users_seq;

create table pressure_station (
  id                            number(10) not null,
  imei                          varchar2(255),
  constraint pk_pressure_station primary key (id)
);
create sequence pressure_station_seq;

create table test (
  id                            number(10) not null,
  imei                          varchar2(255),
  pressure                      varchar2(255),
  temperature                   varchar2(255),
  constraint pk_test primary key (id)
);
create sequence test_seq;

create table user_loc (
  id                            number(10) not null,
  user_id                       number(10) not null,
  object_id                     number(10) not null,
  dt                            timestamp,
  altitude                      number(19,4) not null,
  floor                         number(19,4) not null,
  constraint pk_user_loc primary key (id)
);
create sequence user_loc_seq;


# --- !Downs

drop table bish_users cascade constraints purge;
drop sequence bish_users_seq;

drop table pressure_station cascade constraints purge;
drop sequence pressure_station_seq;

drop table test cascade constraints purge;
drop sequence test_seq;

drop table user_loc cascade constraints purge;
drop sequence user_loc_seq;

