insert into user_details(id,birthday,name)
values(10001, current_date(), 'Saul');
insert into user_details(id,birthday,name)
values(10002, current_date(), 'Oscar');
insert into user_details(id,birthday,name)
values(10003, current_date(), 'Daniel');

insert into post(id,description,user_id)
values(20001, 'I want to learn AWS', 10001);
insert into post(id,description,user_id)
values(20002, 'I want to learn DevOps', 10001);
insert into post(id,description,user_id)
values(20003, 'I want to learn AWS Certified', 10002);
insert into post(id,description,user_id)
values(20004, 'I want to learn Multicloud', 10002);