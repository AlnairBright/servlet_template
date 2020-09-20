CREATE DATABASE demo_db DEFAULT CHARSET utf8mb4;
CREATE USER demo identified by 'demopass';
GRANT ALL ON demo_db.* TO demo;
