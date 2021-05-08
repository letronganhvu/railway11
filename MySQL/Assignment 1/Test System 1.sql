CREATE DATABASE Testing_System_Assignment_1;
USE Testing_System_Assignment_1;

CREATE TABLE Department (
	DepartmentID	INT,
    DepartmentName	VARCHAR(100)
    );
    
CREATE TABLE Position (
	PositionID		INT,
	PositionName	VARCHAR(100)
	);

CREATE TABLE `Account` (
	AccountID		INT,
    Email			VARCHAR(100),
    UserName		VARCHAR(100),
	FullName		VARCHAR(100),
    DepartmentID	INT,
    PositionID		INT,
    CreateDate		DATE
    );
    
CREATE TABLE `Group` (
	GroupID			INT,
    GroupName		VARCHAR(100),
    CreatorID		INT,
    CreateDate		DATE
);

CREATE TABLE GroupAccount (
	GroupID			INT,
    AccountID		INT,
    JoinDate		DATE
);

CREATE TABLE TypeQuestion (
	TypeID			INT,
    TypeName		VARCHAR(100)
);

CREATE TABLE CategoryQuestion (
	CategoryID		INT,
    CategoryName	VARCHAR(100)
);

CREATE TABLE Question (
	QuestionID		INT,
    Content			VARCHAR(100),
    CategoryID		INT,
    TypeID			INT,
    CreatorID		INT,
    CreateDate		DATE
);

CREATE TABLE Answer (
	AnswerID		INT,
    Content			VARCHAR(100),
    QuestionID		INT,
    isCorrect		VARCHAR(100)
);

CREATE TABLE Exam (
	ExamID			INT,
    `Code`			INT,
    Tilte			VARCHAR(100),
    CategoryID		INT,
    Duration		VARCHAR(100),
    CreatorID		INT,
    CreateDate		DATE
);

CREATE TABLE ExamQuestion (
	ExamID			INT,
    QuestionID		INT
);