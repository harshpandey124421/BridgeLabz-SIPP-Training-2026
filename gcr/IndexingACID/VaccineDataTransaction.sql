START TRANSACTION;
INSERT INTO vaccine_data (country, date, doses_administered) VALUES ('Brazil', '2023-10-01', 10000);
UPDATE vaccine_inventory SET doses_available = doses_available - 10000 WHERE country = 'Brazil';
COMMIT;