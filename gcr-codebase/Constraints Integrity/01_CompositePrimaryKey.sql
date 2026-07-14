-- Subtopic: Keys & Constraints - Define Primary Keys in COVID Tables
USE covid_db;

-- Assuming the table exists from Session 1, we add the composite primary key
ALTER TABLE covid_cases
ADD PRIMARY KEY (Country, Date);
