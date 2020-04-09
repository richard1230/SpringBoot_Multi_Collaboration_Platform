create table blog (
id bigint primary key auto_increment,
user_id varchar(50),
title varchar(200),
description varchar(100),
content TEXT,
-- avatar  varchar(100),
created_at datetime,
updated_at datetime
);
