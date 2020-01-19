drop table user if exists;
create table user (
    id bigint auto_increment,
    name varchar(32),
    user_name varchar(64),
    password varchar(128),
    primary key (id)
);

insert into user(name,user_name,password) values ( '张三','zhangsan','zs123456' );
insert into user(name,user_name,password) values ( '李四','lisi','ls123456' );
insert into user(name,user_name,password) values ( '王五','wangwu','ww123456' );
insert into user(name,user_name,password) values ( 'Alice','alice','alice123456' );
insert into user(name,user_name,password) values ( 'Mike','mike','mike123456' );
