create table t_comment (  
  id varchar(32) primary key, /*主键Id */
  customer_id varchar(32) not null, /*用户Id*/  
  parent_comment_id varchar(32) not null, /*父评论Id 0表示顶级评论*/  
  content_id varchar(32) not null, /*评论对象的Id*/  
  type int(11), /*评论对象的类型*/  
  content varchar(140) null, /*评论内容*/  
  comment_date varchar(10) null, /*评论日期*/  
  comment_time varchar(12) null, /*评论时间*/  
  state int(11) null /*评论的状态 0显示或者1不显示*/  
) default charset=utf8;

create table t_customer (
    id varchar(32) primary key, /*主键Id */
    nick_name varchar(50) not null /* 昵称 */
) default charset=utf8;
insert into t_customer (id, nick_name)
values ('1', '水门')
, ('2', '鼬神')
, ('3', '天天');

create table t_item (
    id varchar(32) primary key, /* 主键Id */
    name varchar(32) not null, /* 名称 */
    type int not null /* 类型 */
) default charset=utf8;

insert into t_item (id, name, type)
values ('1', '手里剑', 1);

insert into t_comment(id, customer_id, parent_comment_id, content_id, type, content, comment_date, comment_time, state)
values ('1', '1', 0, 1, 1, '这把手里剑还是很不错的哦。。。', '2014-12-18', '23:00:00.000', 0)
, ('2', '2', '1', 1, 1, '你用的感觉怎么样啊？？？', '2014-12-18', '23:01:00.000', 0)
, ('3', '3', '1', 1, 1, '飞雷神啊???', '2014-12-18', '23:02:00.000', 0)
, ('4', '1', '2', 1, 1, '用的很不错啊!!!','2014-12-18', '23:03:00.000', 0);