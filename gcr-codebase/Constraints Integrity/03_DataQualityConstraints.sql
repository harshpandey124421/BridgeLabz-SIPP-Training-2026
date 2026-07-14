-- Subtopic: Keys & Constraints - Add Constraints to Ensure Data Quality
USE covid_db;

-- Apply NOT NULL constraints
ALTER TABLE covid_cases
MODIFY Country VARCHAR(100) NOT NULL,
MODIFY Date DATE NOT NULL,
MODIFY Confirmed_Cases INT NOT NULL;

-- Apply CHECK constraint to ensure deaths do not exceed confirmed cases
ALTER TABLE covid_cases
ADD CONSTRAINT chk_deaths_cases 
CHECK (Deaths <= Confirmed_Cases);
