DROP DATABASE Fresher;
CREATE DATABASE Fresher;
USE Fresher;

CREATE TABLE Trainee (
	TraineeID			SMALLINT AUTO_INCREMENT PRIMARY KEY,
    FullName			NVARCHAR(50) NOT NULL,
    BirthDate			DATE,
    Gender				ENUM('Male','Female','unknown'),
    ET_IQ				TINYINT CHECK(ET_IQ>=0 && ET_IQ<=20),
    ET_Gmath			TINYINT CHECK(ET_Gmath>=0 && ET_Gmath<=20),
    ET_English			TINYINT CHECK(ET_English>=0 && ET_English<=50),
    Training_Class		VARCHAR(50) NOT NULL,
    Evaluation_Notes	TEXT
);
ALTER TABLE Trainee
ADD VTI_Account 		VARCHAR(50) NOT NULL UNIQUE KEY;
    
    