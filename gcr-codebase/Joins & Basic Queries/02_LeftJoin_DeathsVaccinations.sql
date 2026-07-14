-- Subtopic: Joins & Queries - Join COVID Deaths and Vaccination Data
USE covid_db;

SELECT cd.Country, cd.Date, cd.Total_Deaths, cv.Total_Vaccinated
FROM covid_deaths cd
LEFT JOIN covid_vaccines cv ON cd.Country = cv.Country AND cd.Date = cv.Date;
