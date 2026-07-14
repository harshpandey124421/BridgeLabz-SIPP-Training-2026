-- Subtopic: Keys & Constraints - Set Default Values
USE covid_db;

-- Set default value of 0 for Recoveries
ALTER TABLE covid_cases
MODIFY Recoveries INT DEFAULT 0;

-- Add Last_Updated column and set its default to the current timestamp
ALTER TABLE covid_cases
ADD Last_Updated TIMESTAMP DEFAULT CURRENT_TIMESTAMP;
