# ProdService
New repository for product service
Build the services with maven  from DOS Prompt

   The maven commands for building the projects are as follows

 mvn clean
 mvn dependency:copy-dependencies
 mvn install -Dmaven.test.skip=true

  Database Design 

   Database name - goodsservice
  table name - product
  
  mysql> DESC product;
+----------+-------------+------+-----+---------+-------+
| Field    | Type        | Null | Key | Default | Extra |
+----------+-------------+------+-----+---------+-------+
| prodNo   | varchar(20) | YES  |     | NULL    |       |
| catNo    | varchar(20) | YES  |     | NULL    |       |
| prodName | varchar(20) | YES  |     | NULL    |       |
+----------+-------------+------+-----+---------+-------+
3 rows in set (0.02 sec)

mysql> select * from product;
+--------+-------+--------------+
| prodNo | catNo | prodName     |
+--------+-------+--------------+
| P201   | C101  | TeaSet       |
| P202   | C102  | Ponds Powder |
+--------+-------+--------------+
2 rows in set (0.00 sec)
mysql>
