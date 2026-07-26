CREATE PROCEDURE UpdateCovidStats(IN p_country VARCHAR(100), IN p_date DATE, IN p_new_cases INT)
BEGIN
    START TRANSACTION;
    UPDATE covid_cases
    SET confirmed_cases = confirmed_cases + p_new_cases
    WHERE country = p_country AND date = p_date;
    COMMIT;
END;