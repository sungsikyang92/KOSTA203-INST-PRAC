--정규화를 통해 분리된 테이블을 필요시
--다수의 테이블의 데이터를 조회하기 위해 JOIN SQL을 사용
--Inner Join:	조건이 일치하는 여러 테이블의 정보를 조회
--Outer Join:	조건이 일치하지 않아도 필요시 지정한 테이블 모든 정보를 조회
--				부서와 사원 정보 조회시 부서에 사원이 없어도 그 부서 정보까지 조회할 때 Outer Join을 사용
--부서와 사원테이블을 분리
--사원테이블에서 부서테이블을 참조
--사원정보가 저장될 때 부서테이블에 있는 부서번호로만 저장될 수 있도록 제약조건을 추가(foreign key 외래키, 참조키)
--부모 테이블(참조대상 테이블):	부서테이블
--자식 테이블(참조하는 테이블):	사원테이블

CREATE TABLE mvc_department(
	deptno number primary key,
	dname varchar2(100) not null,
	loc varchar2(100) not null,
	tel varchar2(100) not null
)

CREATE TABLE mvc_employee(
	empno NUMBER PRIMARY KEY,
	ename VARCHAR2(100) NOT NULL,
	sal NUMBER NOT NULL,
	deptno NUMBER NOT NULL,
	CONSTRAINT fk_mvc_deptno FOREIGN KEY(deptno) REFERENCES mvc_department(deptno)
)--constraint(제약조건키워드) fk_mvc_deptno(제약조건명) foreign key(현테이블컬럼) references 부모테이블(컬럼)

--부모키가 존재하지 않으므로 error(FK 제약조건에 위배)
--10번 부서가 부서테이블에 존재하지 않으므로 에러
INSERT INTO mvc_employee VALUES(1,'아이유',400,10);
--부서테이블에 부서정보를 등록해야 사원테이블에 사원정보를 추가할 수 있다.
INSERT INTO mvc_department VALUES(10,'전략기획','판교','031');
INSERT INTO mvc_department VALUES(20,'공공사업','종로','022');
INSERT INTO mvc_department VALUES(30,'연구개발','강남','011');
--10번 부서가 있으므로 사원정보가 등록된다.
INSERT INTO mvc_employee VALUES(1,'아이유',400,10);
INSERT INTO mvc_employee VALUES(2,'박보검',600,20);
INSERT INTO mvc_employee VALUES(3,'수지',800,30);
INSERT INTO mvc_employee VALUES(4,'나문희',1000,30);

COMMIT

--사원 이름name이 나문희인 사원의 sal, name, deptno, dname, loc를 조회(join 이용)
SELECT e.sal, e.ename, d.deptno, d.dname, d.loc
FROM mvc_employee e, mvc_department d
WHERE e.deptno=d.deptno and e.ename='나문희'