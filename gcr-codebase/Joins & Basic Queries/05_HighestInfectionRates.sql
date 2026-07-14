-- Subtopic: Joins & Queries - Find Countries with Highest Infection Rates
USE covid_db;

SELECT Country, (Confirmed_Cases / Population) * 100 AS Infection_Rate
FROM covid_cases
ORDER BY Infection_Rate DESC;
