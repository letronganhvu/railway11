-- Question 1: Tạo trigger không cho phép người dùng nhập vào Group có ngày tạo 
-- trước 1 năm trước

DROP TRIGGER IF EXISTS Question1;
DELIMITER $$
CREATE TRIGGER Question1
BEFORE INSERT ON `group`
FOR EACH ROW
BEGIN
	IF NEW.CreateDate < date_sub(now(), INTERVAL 1 YEAR) THEN
		SIGNAL SQLSTATE '12356'
        SET MESSAGE_TEXT = 'loi CreateDate';
	END IF;
	END $$
DELIMITER ;
INSERT INTO `Group`	(  GroupName			, CreatorID		, CreateDate)
VALUES 				(N'Testing System2'		,   5			,'2018-03-05');
    
-- Question 2: Tạo trigger Không cho phép người dùng thêm bất kỳ user nào vào 
-- department "Sale" nữa, khi thêm thì hiện ra thông báo "Department
-- "Sale" cannot add more user"
DROP TRIGGER IF EXISTS Question2;
DELIMITER $$
CREATE TRIGGER Question2
BEFORE INSERT ON `account`
FOR EACH ROW
BEGIN
	DECLARE Department_ID INT;
    SELECT DepartmentID INTO Department_ID
    FROM Department
    WHERE DepartmentName = 'Sale';
	IF NEW.departmentID = Department_ID THEN
		SIGNAL SQLSTATE '12347'
        SET MESSAGE_TEXT = 'Department Sale cannot add more user';
	END IF;
    END $$
DELIMITER ;
INSERT INTO `Account`	(Email				, Username	, FullName, DepartmentID,	PositionID)
VALUES					('acbkjk@gmail.com'	,'anhvu'	,'leanhvu',	2			,	1		);

-- Question 3: Cấu hình 1 group có nhiều nhất là 5 user
DROP TRIGGER IF EXISTS question3;
DELIMITER $$
CREATE TRIGGER question3
BEFORE INSERT ON groupaccount
FOR EACH ROW
BEGIN
-- đếm số lượng account của group mới insert
DECLARE count_user_of_group INT;
Set count_user_of_group = 0;
SELECT COUNT(1) INTO count_user_of_group
FROM groupaccount
WHERE GroupID = NEW.GroupID
GROUP BY GroupID;
IF count_user_of_group >= 5 THEN
SIGNAL SQLSTATE '12345'
SET MESSAGE_TEXT = "bạn không thể thêm account vào group này!";
END IF;
END $$
DELIMITER ;
INSERT INTO `GroupAccount` ( GroupID , AccountID , JoinDate )
VALUES ( 1 , 4 ,'2019-03-05');

-- Question 4: Cấu hình 1 bài thi có nhiều nhất là 10 Question

DROP TRIGGER IF EXISTS question4;
DELIMITER $$
CREATE TRIGGER question4
BEFORE INSERT ON examquestion
FOR EACH ROW
BEGIN
	DECLARE countQuestion INT;
    SET	countQuestion = 0;
    SELECT count(1) INTO countQuestion
    FROM examquestion
    WHERE ExamID = NEW.ExamID
    GROUP BY ExamID;
    IF countQuestion >= 10 THEN
    SIGNAL SQLSTATE '12349'
    SET MESSAGE_TEXT = ' khong the them cau hoi cho bai thi nay';
    END IF;
    END $$
DELIMITER ;

-- Question 5: Tạo trigger không cho phép người dùng xóa tài khoản có email là 
-- admin@gmail.com (đây là tài khoản admin, không cho phép user xóa), 
-- còn lại các tài khoản khác thì sẽ cho phép xóa và sẽ xóa tất cả các thông 
-- tin liên quan tới user đó
DROP TRIGGER IF EXISTS question5;
DELIMITER $$
CREATE TRIGGER question5
BEFORE DELETE ON `account`
FOR EACH ROW
BEGIN
	DECLARE v_account_ID INT;
    SELECT AccountID INTO v_account_ID
	FROM `account`
    WHERE Email = OLD.Email;
    
    IF OLD.Email = 'admin@gmail.com' THEN
		SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'đây là tài khoản admin, không cho phép user xóa';
    ELSE
		DELETE FROM Exam WHERE CreatorID = v_account_ID;
        DELETE FROM `group` WHERE CreatorID = v_account_ID;
        DELETE FROM groupaccount WHERE AccountID = v_account_ID;
        DELETE FROM question WHERE CreatorID = v_account_ID;
    END IF;
    END $$
DELIMITER ;
SELECT *
FROM `account`;

-- Question 6: Không sử dụng cấu hình default cho field DepartmentID của table 
-- Account, hãy tạo trigger cho phép người dùng khi tạo account không điền 
-- vào departmentID thì sẽ được phân vào phòng ban "waiting Department"

DROP TRIGGER IF EXISTS Question6;
DELIMITER $$
CREATE TRIGGER Question6
BEFORE INSERT ON `account`
FOR EACH ROW
BEGIN
	DECLARE Department_ID INT;
    SELECT DepartmentID INTO Department_ID 
    FROM department
	WHERE DepartmentName = 'waiting Department';
    
    IF NEW.DepartmentID IS NULL THEN
		SET NEW.DepartmentID = Department_ID;
    END IF;
END $$
DELIMITER ;
    
        
    



    