-- Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale
CREATE VIEW PhongSale AS
SELECT 		*
FROM 		`account`
JOIN 		department USING(departmentID)
WHERE 		DepartmentName = 'Sale';

DROP VIEW 	PhongSale;
-- Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất
CREATE VIEW NhanVienThamGIaGroup AS
SELECT 		AccountID,Email,UserName,FullName,GROUP_CONCAT(GroupName)
FROM		`account`
JOIN		groupaccount USING(AccountID)
JOIN		`group` USING(groupID)
GROUP BY	AccountID
HAVING 		count(AccountID) = (SELECT 	 count(AccountID)
								FROM	`account`
								JOIN	 groupaccount USING(AccountID)
								GROUP BY AccountID                           
								ORDER BY count(AccountID) DESC
								LIMIT 1);
DROP VIEW 	NhanVienThamGIaGroup;
-- Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ 
-- được coi là quá dài) và xóa nó đi
CREATE VIEW cauhoidai2 AS
SELECT		*
FROM		question
WHERE		length(Content) > 18;

DELETE
FROM 		question
WHERE 		questionID IN (	SELECT QuestionID
							FROM	cauhoidai2);
                    
-- Question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất
CREATE VIEW danhsach AS
SELECT	DepartmentName, count(DepartmentID)
FROM	`account`
JOIN	department USING(departmentID)
GROUP BY	DepartmentID
HAVING	count(DepartmentID) = (SELECT count(DepartmentID)
								FROM	`account`
								JOIN	department USING (departmentID)
								GROUP BY DepartmentID
								ORDER BY count(DepartmentID) DESC
								limit 	1);
DROP VIEW 	danhsach;

-- Question 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo
CREATE VIEW danhsachcauhoi AS
SELECT	acc.FullName, q.Content
FROM	`account` acc
JOIN	question q ON acc.AccountID = q.CreatorID
GROUP BY	acc.AccountID
HAVING	acc.FullName LIKE 'nguyen%'


