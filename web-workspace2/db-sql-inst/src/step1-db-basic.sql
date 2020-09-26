select * from web_member;
/*
 		SQL ������ �ּ�  
 */
-- SQL ���� �ּ� 
/*   
 *   SQL ( Structured Query Language) : �����͸� �����ϰ�, ���� , �����ϴ� ��� 
 *   
 *   DDL , DML , DCL 
 *   1. DDL ( Data Definition Language : ������ ���Ǿ� )  
 *  	: CREATE ����  , DROP ���� , ALTER ���� 
 *   2. DML ( Data Manipulation Language : ������ ���۾�)  
 * 		: INSERT ���� , DELETE ���� , UPDATE ���� , SELECT �˻� 
 * 		  CRUD ( CREATE , READ ,  UPDATE, DELETE ) 
 * 					INSERT  SELECT  UPDATE   DELETE 
 * 
 *   3. DCL ( Data Control Language : ������ ����� ) 
 * 		: COMMIT ���� DB�� �ݿ�, ROLLBACK �۾�����ϰ� �ǵ����� 
 *        GRANT ���Ѻο� , REVOKE ������� 
 * 
 *   TABLE - �����͸� �����ϴ� ���� 
 *   COLUMN - �Ӽ� (attribute) 
 *   CONSTRAINT - ��������  ex) PRIMARY KEY - �ߺ� ��� X , NOT NULL 
 *   DataType - ���ڿ� varchar2(100) , ������ number 
 */

 -- MEMBER TABLE�� �����ϰ� ������ ������ �� ��ȸ�غ��� 
 -- ���� ����Ű ���� ���� �� alt + x 
 CREATE TABLE member(
 	id VARCHAR2(100) PRIMARY KEY,
 	password VARCHAR2(100) NOT NULL,
 	name VARCHAR2(100) NOT NULL,
 	address VARCHAR2(100)
 )
 DROP TABLE member; -- ���̺� ���� DDL 
 -- DML : INSERT  ���̺� MEMBER�� ������ �߰� 
 INSERT INTO member(id,password,name,address) VALUES('java','1234','������','�Ǳ�');
 -- DML : SELECT ���̺� MEMBER�� �ִ� ��� ������ ��ȸ 
 SELECT * FROM member;
 -- �ڱ� ������ INSERT �غ��� 
 INSERT INTO member(id,password,name,address) VALUES('king','ab','������','����');
 INSERT INTO member(id,password,name,address) VALUES('boy','girl','�����','����');
 -- �������� PRIMARY KEY �� �ߺ��� ���� ������� �����Ƿ� �Ʒ� SQL�� ERROR�� ���� 
 INSERT INTO member(id,password,name,address) VALUES('boy','test','test','test');
  -- ��ȸ������ ��ȸ�غ��� COUNT(*)
  SELECT COUNT(*) FROM member;

  -- DML : UPDATE ������ ���� 
  UPDATE member SET address='�Ͽ���' WHERE id='boy';
  -- DML : SELECT , WHERE ���� �̿��� boy��� ���̵� ���� ȸ�� ������ ��ȸ 
  SELECT * FROM member WHERE id='boy';
  
  -- DML : DELETE ������ ���� 
  DELETE FROM member WHERE address='�Ͽ���';
  -- ��ȸ���� ��ȸ 
  SELECT COUNT(*) FROM member;
  
  -- MEMBER TABLE�� ������ ��ȸ�� ȸ�� NAME,ADDRESS�� ��ȸ
  SELECT name,address FROM member; 
  -- SELECT �� WHERE  �÷�=�Ӹ� AND �÷�=�Ӹ� 
  -- NAME�� �������̰� ADDRESS �� �Ǳ��� ȸ���� ID�� ��ȸ�غ��� 
  SELECT id FROM member WHERE name='������' AND address='�Ǳ�'; 
 
   -- �������� �׽�Ʈ : PRIMARY KEY �� ������ �÷��� �����ؾ�(UNIQUE) �ϸ� NOT NULL
   --					  �̾�� �ϹǷ� �ݵ�� �ߺ����� ���� ������ �����ؾ� �Ѵ� 
   INSERT INTO member(password,name,address) VALUES('A','�˼���','�Ǳ�');
 	-- PASSWORD �÷��� NOT NULL ���������� �����Ƿ� �ݵ�� INSERT �ؾ� �ϹǷ� ERROR
    INSERT INTO member(id,name,address) VALUES('A','�˼���','�Ǳ�');
    -- ADDRESS �� ������ ���������� �����Ƿ� NULL�� ���ȴ� 
    INSERT INTO member(id,password,name) VALUES('A','a','�˼���');
 
    /*		1. ȸ�� ���� �� ���� �Է� ( INSERT ) 
     *  	ID   		PASSWORD   NAME   ADDRESS
     *      spring		aop				���� 	   ���� 
     *      mybatis	di				�缺��	   ���� 		
     * 
     *      2. INSERT ���� ���� ��  ���忡 ��� ȸ������ �̸��� ��� (SELECT) 
     * 		3. ADDRESS�� ������ ȸ������ ADDRESS�� ���������� ���� ( UPDATE )
     * 		4. ��ü ȸ�� ������ ��ȸ  
     */
	INSERT INTO member(id,password,name,address) VALUES('spring','aop','����','����');
	INSERT INTO member VALUES('mybatis','di','�缺��','����');
  
	SELECT name FROM member WHERE address='����';
	
  	UPDATE member SET address='������' WHERE address='����';
  	
  	SELECT * FROM member;
  
  	COMMIT -- ���� �����ͺ��̽��� �ݿ� ( �۾� ������ ���� ) 
  	ROLLBACK -- Ŀ�� ������ ��� �۾��� ����ϰ� �ǵ����� ��ɾ� 
  	
  	-- �⺻ SQL ���� 
  	
  	INSERT INTO member(id,password,name,address)
  	VALUES('ebs','abcd','���','����');
  	
  	-- member ���̺��� name�� ����̰� address�� ������ ȸ���� id�� ��ȸ 
  	SELECT id FROM member WHERE name='���' AND address='����';
  	
  	-- member ���̺��� ȸ�� �ּ� �� ������ ȸ���� �ּҸ� �Ǳ��� ������Ʈ 
  	UPDATE member SET address='�Ǳ�' WHERE address='����';
  	
  	SELECT * FROM MEMBER;
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
    
    
    
    
    
  
