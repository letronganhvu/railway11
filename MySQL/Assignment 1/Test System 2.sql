USE Testing_System_Assignment_1;

INSERT INTO Department 			(DepartmentName)
VALUES							('Marketing'),
								('Sale'),
								('Bảo vệ'),
								('Nhân sự'),
								('Kỹ thuật');
SELECT * FROM Department;
    
INSERT INTO `Position` 			(PositionName)
VALUES							('DEV'),
								('Test'),
								('Scrum Master'),
								('PM');
SELECT * FROM `Position`;

INSERT INTO `Account`			(Email, UserName, FullName, DepartmentID, PositionID)
VALUES							('thuong@gmail.com', 'thuong', 'nguyen thuong', 1, 1),
								('toan@gmail.com', 'toan', 'bui toan', 2, 2),
								('oanh@gmail.com', 'oanh', 'le oanh', 4, 1),
								('nam@gmail.com', 'nam', 'chu nam', 4, 3),
								('vule@gmail.com', 'vu', 'le vu',1, 4);
SELECT * FROM `Account`;

INSERT INTO `Group`				(GroupName, CreatorID)
VALUES							('thuongtoan', 1),
								('oanhnam', 2),
								('vuthuong', 5),
								('thuongoanh',3),
								('namtoan', 4);
SELECT * FROM `Group`;

INSERT INTO GroupAccount		(GroupID, AccountID)
VALUES							(1,1),
								(2,2),
								(3,3),
								(4,4),
								(5,5);
SELECT * FROM GroupAccount;

INSERT INTO TypeQuestion		(TypeName)
VALUES							('Essay'),
								('Multiple-Choice');
SELECT * FROM TypeQuestion;

INSERT INTO CategoryQuestion	(CategoryName)
VALUES							('chude1'),
								('chude2'),
                                ('chude3'),
                                ('chude4'),
                                ('chude5');
SELECT * FROM CategoryQuestion;

INSERT INTO Question			(Content, CategoryID, TypeID, CreatorID)
VALUES							('cauhoi1', 1, 1, 1),
								('cauhoi2', 1, 2, 3),
								('cauhoi3', 4, 1, 2),
								('cauhoi4', 4, 2, 5),
								('cauhoi5', 5, 1, 4);
SELECT * FROM Question;


INSERT INTO Answer				(Content, QuestionID, isCorrect)
VALUES							('traloi1',1, True),
								('traloi2',3, True),
								('traloi3',3, False),
								('traloi4',3, False),
								('traloi5',4, False);
SELECT * FROM Answer;

INSERT INTO Exam				(`Code`, Tilte, CategoryID, Duration, CreatorID)
VALUES							('A151', 'A', 1, 120, 1),
								('A152', 'B', 2, 90, 2),
								('A153', 'C', 3, 60, 3),
								('A154', 'D', 4, 120, 4),
								('A155', 'E', 5, 90, 5);
SELECT * FROM Exam;

INSERT INTO ExamQuestion		(ExamID, QuestionID)
VALUES							(1,2),
								(2,3),
								(3,3),
								(4,3),
								(5,1);
SELECT * FROM ExamQuestion;



