EXPLAIN SELECT country, confirmed_cases, date
FROM covid_cases
WHERE country = 'India' AND date > '2023-01-01';