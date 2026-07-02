-- Subtopic: DML - Insert Initial COVID Data
USE covid_db;

INSERT INTO covid_cases (Country, Date, Confirmed_Cases, Deaths, Recoveries, Population)
VALUES 
('India', '2020-04-01', 5000, 150, 400, 1380000000),
('India', '2020-04-02', 6000, 180, 500, 1380000000),
('USA', '2020-04-01', 200000, 5000, 10000, 331000000),
('UK', '2020-04-01', 50000, 2000, 3000, 67000000);
