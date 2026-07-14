-- Subtopic: Joins & Queries - Find Highest Confirmed Cases using INNER JOIN
USE covid_db;

SELECT c.Country_Name, cc.Date, cc.Confirmed_Cases
FROM covid_cases cc
INNER JOIN countries c ON cc.Country = c.Country_Name
ORDER BY cc.Confirmed_Cases DESC
LIMIT 1;
