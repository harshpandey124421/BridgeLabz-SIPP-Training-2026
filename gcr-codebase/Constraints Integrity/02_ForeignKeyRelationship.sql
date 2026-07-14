-- Subtopic: Keys & Constraints - Create Foreign Key Relationships
USE covid_db;

-- Create the reference table for countries
CREATE TABLE countries (
    Country_Name VARCHAR(100) PRIMARY KEY,
    Continent VARCHAR(50),
    Population BIGINT
);

-- Establish the foreign key relationship
ALTER TABLE covid_cases
ADD CONSTRAINT fk_covid_country
FOREIGN KEY (Country) REFERENCES countries(Country_Name);
