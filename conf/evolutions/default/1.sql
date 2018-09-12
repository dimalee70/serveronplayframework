# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table test (
  text                          varchar2(255) not null,
  constraint pk_test primary key (text)
);


# --- !Downs

drop table test cascade constraints purge;

