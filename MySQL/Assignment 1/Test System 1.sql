DROP DATABASE Testing_System_Assignment_1;
CREATE DATABASE Testing_System_Assignment_1;
USE Testing_System_Assignment_1;

CREATE TABLE Department (
	DepartmentID	TINYINT AUTO_INCREMENT PRIMARY KEY,
    DepartmentName	NVARCHAR(100) NOT NULL UNIQUE KEY
);
    
CREATE TABLE `Position` (
	PositionID		TINYINT AUTO_INCREMENT PRIMARY KEY,
	PositionName	ENUM('DEV','Test','Scrum Master','PM')
);

CREATE TABLE `Account` (
	AccountID		SMALLINT AUTO_INCREMENT PRIMARY KEY,
    Email			VARCHAR(100) NOT NULL UNIQUE KEY,
    UserName		VARCHAR(100) NOT NULL UNIQUE KEY,
	FullName		NVARCHAR(100) NOT NULL UNIQUE KEY,
    DepartmentID	TINYINT NOT NULL DEFAULT 1,
    PositionID		TINYINT NOT NULL DEFAULT 1,
    CreateDate		DATETIME DEFAULT NOW(),
    FOREIGN KEY (DepartmentID) 	REFERENCES Department (DepartmentID),
    FOREIGN KEY (PositionID) 	REFERENCES Position (PositionID)
);
    
CREATE TABLE `Group` (
	GroupID			TINYINT AUTO_INCREMENT PRIMARY KEY,
    GroupName		NVARCHAR(100) NOT NULL UNIQUE KEY,
    CreatorID		SMALLINT NOT NULL,
    CreateDate		DATE,
    FOREIGN KEY (CreatorID) 	REFERENCES `Account`(AccountID)
);

CREATE TABLE GroupAccount (
	GroupID			TINYINT NOT NULL,
    AccountID		SMALLINT NOT NULL,
    JoinDate		DATE,
    PRIMARY KEY(GroupID,AccountID),
    FOREIGN KEY (GroupID) 		REFERENCES `Group`(GroupID),
    FOREIGN KEY (AccountID) 	REFERENCES `Account`(AccountID)
);

CREATE TABLE TypeQuestion (
	TypeID			TINYINT AUTO_INCREMENT PRIMARY KEY,
    TypeName		ENUM('Essay','Multiple-Choice')
);

CREATE TABLE CategoryQuestion (
	CategoryID		TINYINT AUTO_INCREMENT PRIMARY KEY,
    CategoryName	NVARCHAR(100) NOT NULL
);

CREATE TABLE Question (
	QuestionID		SMALLINT AUTO_INCREMENT PRIMARY KEY,
    Content			TEXT NOT NULL,
    CategoryID		TINYINT,
    TypeID			TINYINT,
    CreatorID		SMALLINT,
    CreateDate		DATE,
    FOREIGN KEY (CategoryID) 	REFERENCES CategoryQuestion(CategoryID),
    FOREIGN KEY (TypeID) 		REFERENCES TypeQuestion(TypeID),
    FOREIGN KEY (CreatorID)		REFERENCES `Account`(AccountID)
);

CREATE TABLE Answer (
	AnswerID		SMALLINT AUTO_INCREMENT PRIMARY KEY,
    Content			TEXT NOT NULL,
    QuestionID		SMALLINT,
    isCorrect		BOOLEAN,
    -- bit,boolean, enum('true','false')
    FOREIGN KEY (QuestionID) 	REFERENCES Question(QuestionID)
);

CREATE TABLE Exam (
	ExamID			SMALLINT AUTO_INCREMENT PRIMARY KEY,
    `Code`			VARCHAR(20) NOT NULL,
    Tilte			NVARCHAR(100) NOT NULL,
    CategoryID		TINYINT  NOT NULL,
    Duration		TINYINT  NOT NULL,
    CreatorID		SMALLINT NOT NULL,
    CreateDate		DATE,
    FOREIGN KEY (CategoryID)	REFERENCES CategoryQuestion(CategoryID),
    FOREIGN KEY (CreatorID)		REFERENCES `Account`(AccountID)
);

CREATE TABLE ExamQuestion (
	ExamID			SMALLINT NOT NULL,
    QuestionID		SMALLINT NOT NULL,
    PRIMARY KEY		(ExamID,QuestionID),
    FOREIGN KEY (ExamID)		REFERENCES Exam(ExamID),
    FOREIGN KEY (QuestionID) 	REFERENCES Question(QuestionID)
);