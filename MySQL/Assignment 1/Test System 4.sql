-- Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ
SELECT		*
FROM		`account`
LEFT JOIN	department USING(DepartmentID);

-- Question 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010
SELECT		*
FROM		`account`
WHERE		CreateDate > 2010/12/20;

-- Question 3: Viết lệnh để lấy ra tất cả các developer 
SELECT		*
FROM		`account` 
JOIN		`position` USING (PositionID)
WHERE		PositionName = 'DEV';

-- Question 4:  Viết lệnh để lấy ra danh sách các phòng ban có >= 2 nhân viên
SELECT		*, count(AccountID)
FROM		department dep
JOIN		`account` acc ON dep.DepartmentID = acc.DepartmentID
GROUP BY 	dep.DepartmentID
HAVING		count(AccountID) >=2;

-- Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất

-- câu hỏi được sử dụng nhiều nhất trong đề thi là 3
SELECT  	COUNT(QuestionID)
FROM   		ExamQuestion
GROUP BY  	QuestionID 
ORDER BY 	COUNT(QuestionID) DESC
LIMIT  		1;
-- lấy ra danh sách câu hỏi được sử dụng trong đề thi 3 lần
SELECT 		*, COUNT(eq.QuestionID)
FROM   		ExamQuestion eq
JOIN   		Question q ON   q.QuestionID =eq.QuestionID
GROUP BY  	eq.QuestionID
HAVING  	COUNT(eq.QuestionID) = 3;
-- ghép câu lẹnh truy vấn con ( tìm ra số câu hỏi  được sử dụng trong đề thi nhiều nhất là 3)
SELECT 		*, COUNT(eq.QuestionID)
FROM   		ExamQuestion eq
JOIN   		Question q ON   q.QuestionID =eq.QuestionID
GROUP BY  	eq.QuestionID
HAVING  	COUNT(eq.QuestionID) = ( SELECT  	COUNT(QuestionID)
									 FROM   	ExamQuestion
									 GROUP BY  	QuestionID 
									 ORDER BY 	COUNT(QuestionID) DESC
									 LIMIT  	1);


-- Question 6: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question
SELECT		cq.CategoryName, COUNT(QuestionID)
FROM		categoryquestion cq
LEFT JOIN	question q ON cq.CategoryID = q.CategoryID
GROUP BY	cq.CategoryID;

-- Question 7: Thông kê mỗi Question được sử dụng trong bao nhiêu Exam
SELECT		q.Content, count(ExamID)
FROM		question q
LEFT JOIN	examquestion exq ON q.QuestionID = exq.QuestionID
GROUP BY	q.QuestionID;
-- Question 8: Lấy ra Question có nhiều câu trả lời nhất
SELECT		*,count(q.QuestionID)
FROM		question q
LEFT JOIN 	answer an ON q.QuestionID = an.QuestionID
GROUP BY 	q.QuestionID
HAVING		count(q.QuestionID) = ( SELECT 		count(questionID)
									FROM		answer
									GROUP BY	QuestionID
									ORDER BY	count(QuestionID) DESC
									LIMIT		1);

-- Question 9: Thống kê số lượng account trong mỗi group
SELECT		g.GroupID, count(AccountID)
FROM		groupaccount ga
RIGHT JOIN	`group` g ON ga.groupID = g.groupID
GROUP BY	g.GroupID;

-- Question 10: Tìm chức vụ có ít người nhất
SELECT		PositionName,count(PositionID)
FROM		`account`
JOIN		`position` USING(PositionID)
GROUP BY	PositionID
HAVING 		count(PositionID) = (SELECT 	count(PositionID)
								 FROM		`account`
								 GROUP BY	PositionID
								 ORDER BY 	count(PositionID)
								 LIMIT		1);




-- Question 11: Thống kê mỗi phòng ban có bao nhiêu nhân viên
-- Có chức vụ thuộc dev, test, scrum master, PM
SELECT		PositionID, AccountID, DepartmentID, GROUP_CONCAT(PositionName), count(DepartmentID) AS ' So Luong Nhan Vien'
FROM		`account`
JOIN		`position` USING (PositionID)
WHERE 		PositionName IN ('Dev', 'Test', 'Scrum Master', 'PM')			
GROUP BY	DepartmentID;

-- Question 12: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của  question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, …
SELECT		q.Content AS 'Cau hoi', tq.TypeName AS 'Loai cau hoi', acc.UserName AS 'Nguoi tao cau hoi', an.Content AS 'Cau tra loi'
FROM		question q
LEFT JOIN	answer an ON an.QuestionID = q.QuestionID
JOIN		typequestion tq ON tq.TypeID = q.TypeID
JOIN		`account` acc ON acc.AccountID = q.CreatorID
ORDER BY 	q.Content ASC;

-- Question 13: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm
SELECT		*, count(TypeID)
FROM		question
JOIN		typequestion USING (TypeID)
GROUP BY 	TypeID;

-- Question 14, 15:Lấy ra group không có account nào
SELECT		*
FROM		`group` g
LEFT JOIN	groupaccount ga ON ga.GroupID = g.GroupID
WHERE		ga.AccountID IS NULL;

-- Question 16: Lấy ra question không có answer nào
SELECT		*
FROM		question q
LEFT JOIN	answer an ON an.QuestionID = q.QuestionID
WHERE		an.QuestionID IS NULL;