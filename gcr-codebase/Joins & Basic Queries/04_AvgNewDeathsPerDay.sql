-- Subtopic: Joins & Queries - Calculate Average New Deaths Per Day
USE covid_db;

SELECT Date, AVG(Deaths) AS Avg_Daily_Deaths
FROM covid_cases
GROUP BY Date
ORDER BY Date;
