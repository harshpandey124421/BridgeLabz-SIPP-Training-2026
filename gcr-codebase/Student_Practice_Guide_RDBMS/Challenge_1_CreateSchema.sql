-- Subtopic: DDL - Create COVID Database Schema (Mapped to CSV)
CREATE DATABASE covid_db;
USE covid_db;

CREATE TABLE covid_cases (
    id INT AUTO_INCREMENT PRIMARY KEY,
    date DATE,
    time VARCHAR(20),
    state VARCHAR(100),
    confirmed_indian_national INT,
    confirmed_foreign_national INT,
    recoveries INT,
    deaths INT,
    confirmed_cases INT
);
