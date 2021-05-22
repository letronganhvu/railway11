USE testing_system_assignment_1;

-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các  account thuộc phòng ban đó " lấy ra tên phòng ban và account
-- thuộc phòng ban đó"

DROP PROCEDURE IF EXISTS get_DepartmentName;
DELIMITER $$
CREATE PROCEDURE 	get_DepartmentName(IN IN_DepartmentName NVARCHAR(30))-- ,OUT OUT_DepartmentName NVARCHAR(30))
	BEGIN
		SELECT		d.DepartmentID,d.DepartmentName,a.AccountID
		FROM		Department d
		JOIN 		`Account` a ON 	a.DepartmentID = d.DepartmentID
		WHERE   	d.DepartmentName=IN_DepartmentName;
	END $$
DELIMITER ;
CALL  get_DepartmentName('Marketing');

-- Question 2: Tạo store để in ra số lượng account trong mỗi group

SELECT		*
FROM	GroupAccount;
DROP PROCEDURE IF EXISTS get_In_Account_Group;
DELIMITER $$
CREATE PROCEDURE get_In_Account_Group() 
	BEGIN
		SELECT		GroupID,AccountID, COUNT(AccountID) AS so_luog
		FROM		GroupAccount
		GROUP BY 	GroupID;
	END $$
DELIMITER ;
CALL  get_In_Account_Group();

-- Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo trong tháng hiện tại

SELECT *
FROM Question;
DROP PROCEDURE IF EXISTS get_Type_question;
DELIMITER $$
CREATE PROCEDURE get_Type_question(IN IN_TypeID TINYINT UNSIGNED)
	BEGIN
		SELECT	 COUNT(QuestionID)
		FROM	 Question
		WHERE MONTH(CreateDate) = Month(NOW()) AND year(CreateDate)= year(NOW())
		group by 	QuestionID;
	END $$
DELIMITER $$;
CALL  get_Type_question(1);

-- Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất
SELECT *
FROM TypeQuestion;
SELECT *
FROM Question;
DROP PROCEDURE IF EXISTS get_typeID_question;
DELIMITER $$
CREATE PROCEDURE get_typeID_question( OUT out_typeID_of_question TINYINT UNSIGNED)
	BEGIN
		SELECT 	Q.TypeID INTO out_typeID_of_question
		FROM 	Question Q
		JOIN 	TypeQuestion TQ ON TQ.TypeID=Q.TypeID
		GROUP BY Q.TypeID
		HAVING 	COUNT(Q.QuestionID)=(SELECT COUNT(Q1.QuestionID)
									FROM 	Question Q1
									JOIN 	TypeQuestion TQ1 ON TQ1.TypeID=Q1.TypeID
									GROUP BY Q1.TypeID
									ORDER BY COUNT(Q1.QuestionID) DESC
									LIMIT	 1 )
		ORDER BY Q.TypeID DESC
		LIMIT 1;
	END $$
DELIMITER $$;
-- USE
SET @TypeID= 0;
CALL get_typeID_question(@TypeID);
SELECT @TypeID;
call testingsystem.get_typeName_question(@TypeID);

--  Question 5: Sử dụng store ở question 4 để tìm ra tên của type question
-- c1: tạo hàm thủ tục có input là IN TypeID TINYINT UNSIGNED
-- C2: tạo hàm thủ tục k cần input mà sử dụng lại hàm thủ tục của bài 4
 
DROP PROCEDURE IF EXISTS	getTypeQuestionMaxQuestion5;
DELIMITER $$
CREATE PROCEDURE	getTypeQuestionMaxQuestion5()
	BEGIN
		DECLARE	TypeID TINYINT;
        SET		TypeID = 0;
        CALL	get_typeID_question(TypeID);
        SELECT	*
        FROM	TypeQuestion t
        WHERE	t.TypeID = TypeID;
    END	$$
DELIMITER ;
CALL	getTypeQuestionMaxQuestion5();

-- Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên
-- chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa
-- chuỗi của người dùng nhập vào
DROP PROCEDURE IF EXISTS get_PERSION_String;
DELIMITER $$
CREATE PROCEDURE get_PERSION_String (IN IN_PERSION_String VARCHAR(50))
BEGIN
    SELECT GroupID, GroupName,'Group'
    FROM `Group`
     WHERE GroupName LIKE CONCAT('%',IN_PERSION_String,'%')
    UNION 
    SELECT AccountID,Username,'Account'
    FROM  `Account`
     WHERE Username LIKE CONCAT('%',IN_PERSION_String,'%');

END $$
DELIMITER ;
call get_PERSION_String ('vti');
-- Cách 2 
DROP PROCEDURE IF EXISTS get_PERSION_String2;
DELIMITER $$
CREATE PROCEDURE get_PERSION_String2 (IN IN_PERSION_String2 VARCHAR(50))
BEGIN
    SELECT *
    FROM `Account`
    WHERE Username LIKE CONCAT('%',IN_PERSION_String2,'%');

    SELECT *
    FROM `Group`
    WHERE Username LIKE CONCAT('%',IN_PERSION_String2,'%');

END$$
DELIMITER;
CALL get_PERSION_String2('vti');

-- Question 7: Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và
-- trong store sẽ tự động gán:
-- username sẽ giống email nhưng bỏ phần @..mail đi
-- positionID: sẽ có default là developer
-- departmentID: sẽ được cho vào 1 phòng chờ
-- Sau đó in ra kết quả tạo thành công
DROP PROCEDURE IF EXISTS get_PERSION_String_information;
DELIMITER $$
CREATE PROCEDURE get_PERSION_String_information (IN IN_PERSION_fullName VARCHAR(50),IN IN_PERSION_email VARCHAR(50))
BEGIN
DECLARE  Username VARCHAR(50) DEFAULT  SUBSTRING_INDEX(IN_PERSION_email, "@", 1);
DECLARE PositionID TINYINT UNSIGNED DEFAULT Dev ;
DECLARE DepartmentID TINYINT UNSIGNED DEFAULT 11;
DECLARE CreateDate DATETIME DEFAULT NOW();
INSERT INTO `Account`(Email				, Username		, FullName			    , DepartmentID	, PositionID, CreateDate)
VALUES 				(IN_PERSION_email	, Username		,IN_PERSION_fullName	,   '11'			,PositionID  ,CreateDate());

SELECT *
FROM `Account` A
WHERE Username = A.Username;
END $$
DELIMITER ;

-- Question 8: Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice
--  để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất 
-- 
DROP PROCEDURE IF EXISTS GetMaxLengthQuestionByTypeID;
DELIMITER $$
CREATE PROCEDURE GetMaxLengthQuestionByTypeID (IN inTypeName ENUM('Essay', 'Multiple-Choice'))
	BEGIN
		SELECT *
        FROM	question
        WHERE length(Content) = (	SELECT max(length(Content))
									FROM	Question
                                    JOIN	TypeQuestion USING(TypeID)
                                    WHERE	TypeName = inTypeName);
	END $$
DELIMITER ;

-- Question 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID
DROP PROCEDURE IF EXISTS DeleteExam;
DELIMITER $$
CREATE PROCEDURE DeleteExam ( IN inExamID INT )
	BEGIN
		DELETE
        FROM	exam
        WHERE ExamID = inExamID;
	END $$
DELIMITER ;
SET FOREIGN_KEY_CHECKS = 0;
-- Question 10: Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (sử 
-- dụng store ở câu 9 để xóa)
-- Sau đó in số lượng record đã remove từ các table liên quan trong khi removing

