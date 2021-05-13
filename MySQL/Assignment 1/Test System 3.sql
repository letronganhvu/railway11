-- Question 2
SELECT * 
FROM Department;

-- Question 3
SELECT	*
FROM	Department
WHERE	DepartmentName = 'Sale';

-- Question 4
SELECT	MAX(FullName)
FROM	`account`;

-- Question 5
SELECT	MAX(FullName)
FROM	`account`
WHERE	DepartmentID = 3;

-- Question 6
SELECT	GroupName
FROM	`Group`
WHERE	CreateDate < 2019/12/20;

-- Question 7
SELECT		QuestionID
FROM		Answer
GROUP BY	QuestionID
HAVING		Count(QuestionID) >= 4;

-- Question 8
SELECT	`Code`
FROM	Exam
WHERE	Duration >= 60	AND	CreateDate < 2019/12/20;

-- Question 9
SELECT		GroupName
FROM		`Group`
ORDER BY	CreateDate DESC LIMIT 5;

-- Question 10
SELECT Count(*)
FROM	Department
GROUP BY	DepartmentID
HAVING	DepartmentID = 2;

-- Question 11
SELECT	*
FROM	`account`
WHERE	UserName LIKE 'd%o';

-- Question 12
DELETE
FROM	Exam
WHERE	CreateDate < 2019/12/20; 

-- Question 13
SET FOREIGN_KEY_CHECKS=0;
DELETE
FROM	Question
WHERE	Content LIKE 'cauhoi%';

-- Question 14
UPDATE	`account`
SET		FullName = 'nguyen ba loc',
		Email = 'loc.nguyenba@vti.com.vn'
WHERE	AccountID = 5;

-- Question 15
UPDATE	GroupAccount
SET		GroupID = 4
WHERE	AccountID = 5;




