create database if not exists lovegraph default character set utf8 collate utf8_general_ci;
create table if not exists lovegraph_user(
t_id int unsigned not null primary key auto_increment,
t_username varchar(30) not null,
t_password varchar(20) not null,
t_numberphone varchar(11) not null
)auto_increment = 100000 engine = innodb charset = utf8;