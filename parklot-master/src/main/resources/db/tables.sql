use park_lot;
DROP TABLE IF EXISTS `property_info`;
create table `property_info`(
`fee_id` int,
`ps_id` int,
`property_type` char(20),
`time_limit` double,
`property_start` Date,
`id` bigint
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


drop table if exists `property_rights`;
create table property_rights(
id  int,
property_type Character(20),
fex double,
is_muti Boolean
);


drop table if exists tariff_info;
create table tariff_info(
id bigint,
parking_id bigint,
rate double,
executive_level Character(30),
fee_id int
);


drop table if exists Parking_Space;
CREATE TABLE `parking_space` (
  `id` bigint(20) DEFAULT NULL,
  `unicode` varchar(255) DEFAULT NULL,
  `loc_id` bigint(20) DEFAULT NULL,
  `property_rights` int(11) DEFAULT NULL,
  `lot_id` bigint(20) DEFAULT NULL,
  `business_circle_pos` bigint(20) DEFAULT NULL,
  `property_type` char(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


drop table if exists location;
create table `location`(
`id` bigint,
sacle_level int,
latitude double,
longitude double
);


drop table if exists business_loc;
create table business_loc(
id bigint,
name char,
base_latitude double,
base_longitude double
);


drop table if exists Fee_base_info;
create table Fee_base_info(
fee_id int,
ps_id int,
fee_type char(20),
price double
);


drop table if exists Parking_Lot;
create table Parking_Lot(
id bigint primary key,
location char(30),
description char(30),
manage_attrib int,
business_circle_pos bigint,
fee_id int,
district_street bigint,
property_rights int,
attribute int,
has_charging_pile Boolean,
charging_pile_num int,
building_height double,
cover_area double,
import_path_num int,
export_path_num int
);