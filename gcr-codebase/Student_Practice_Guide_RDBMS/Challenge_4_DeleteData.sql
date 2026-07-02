-- Subtopic: DML - Delete Incorrect Records
USE covid_db;

DELETE FROM covid_cases 
WHERE state = 'IN';
