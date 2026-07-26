CREATE TRIGGER BeforeUpdateCovidCases
BEFORE UPDATE ON covid_cases
FOR EACH ROW
BEGIN
    INSERT INTO audit_table (country, old_cases, new_cases, change_timestamp)
    VALUES (OLD.country, OLD.confirmed_cases, NEW.confirmed_cases, NOW());
END;