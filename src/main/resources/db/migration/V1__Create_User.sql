create table user (
id bigint primary key auto_increment,
username varchar(50),
encrypted_password varchar(200),
avatar varchar(100),
created_at datetime,
updated_at datetime);
