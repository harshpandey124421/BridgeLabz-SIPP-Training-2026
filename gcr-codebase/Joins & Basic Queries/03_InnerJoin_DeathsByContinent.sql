-- Subtopic: Joins & Queries - Analyze Deaths by Continent
USE covid_db;

SELECT c.Continent, SUM(cc.Deaths) AS Total_Deaths
FROM covid_cases cc
INNER JOIN countries c ON cc.Country = c.Country_Name
GROUP BY c.Continent;
