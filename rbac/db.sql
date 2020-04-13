use rbac;

create table role(
id int(10) primary key auto_increment,
username varchar(20)
);
insert into role values(default,'管理员');
insert into role values(default,'销售经理');

create table users(
id int(10) primary key auto_increment,
username varchar(20),
password varchar(20),
rid int(10)
);

insert into users values(default,'张三','zs',1);
insert into users values(default,'李四','ls',2);

create table menu(
id int(10) primary key auto_increment,
name varchar(20),
pid int(10)
);

insert into menu values(default,'系统设置',0);
insert into menu values(default,'销售管理',0);
insert into menu values(default,'部门管理',1);
insert into menu values(default,'角色管理',1);
insert into menu values(default,'权限管理',1);
insert into menu values(default,'订单管理',2);
insert into menu values(default,'客户管理',2);

create table role_menu(
id int(10) primary key auto_increment,
rid int(10),
mid int(10)
);

insert into role_menu values(default,1,1);
insert into role_menu values(default,1,2);
insert into role_menu values(default,1,3);
insert into role_menu values(default,1,4);
insert into role_menu values(default,1,5);
insert into role_menu values(default,1,6);
insert into role_menu values(default,1,7);
insert into role_menu values(default,2,2);
insert into role_menu values(default,2,6);
insert into role_menu values(default,2,7);

create table element(
id int(10) primary key auto_increment,
eleno varchar(50)
);

insert into element values(default,'grant');

create table role_element(
id int(10) primary key auto_increment,
rid int(10),
eid int(10)
);
insert into role_element values(default,1,1);

create table url(
id int(10) primary key auto_increment,
name varchar(100)
);
insert into url values(default,'/rbac/main.jsp');
insert into url values(default,'/rbac/demo');

create table role_url(
id int(10) primary key auto_increment,
rid int(10),
uid int(10)
);
insert into role_url values(default,1,1);
insert into role_url values(default,2,2);
insert into role_url values(default,2,1);