drop table if exists users cascade;

create table users (
 id serial primary key
 , name varchar(100) not null
 , email varchar(100) not null unique
 , password text not null
) ;


--ユーザー登録(pass:morimori)
insert into users(name, email, password) values('テストユーザ', 'test@example.com', 'password');
