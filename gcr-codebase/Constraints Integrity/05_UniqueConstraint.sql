-- Subtopic: Keys & Constraints - Prevent Duplicate Country-Date Entries
USE covid_db;

-- Enforce uniqueness on the combination of Country and Date
-- Note: If Primary Key (Country, Date) was already set in Use Case 1, 
-- this serves as an alternative approach using the UNIQUE constraint.
ALTER TABLE covid_cases
ADD CONSTRAINT unique_country_date 
UNIQUE (Country, Date);
