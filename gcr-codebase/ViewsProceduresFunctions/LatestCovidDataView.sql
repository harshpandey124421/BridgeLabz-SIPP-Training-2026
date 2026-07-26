CREATE VIEW LatestCovidData AS
SELECT country, confirmed_cases, deaths, recoveries
FROM covid_cases
WHERE date = (SELECT MAX(date) FROM covid_cases);