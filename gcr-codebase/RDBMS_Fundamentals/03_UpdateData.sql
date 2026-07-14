-- Subtopic: DML - Update Case Information
USE covid_db;

UPDATE covid_cases 
SET Confirmed_Cases = 5500 
WHERE Country = 'India' AND Date = '2020-04-01';
