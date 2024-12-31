-- EQUI JOIN 또는 INNER JOIN : 두 테이블의 결합

--방법 #1 -> 컬럼명앞에 테이블명이나 테이블 별칭을 붙인다.
select
    e.ename,e.job,e.sal,d.dname,d.loc
from emp e,dept d
where e.deptno=d.deptno;

--방법 #2 -> 조인할 테이블에 컬럼명이 겹치지 않은 경우는 테이블명이나 별칭을 붙이지 않아도 된다.
select
    E.DEPTNO,ename,job,sal,dname,loc
from emp e,dept d
where e.deptno=d.deptno;


--DECODE 함수 - 다중 IF문 과 같은 함수이다.
select ename,deptno,DECODE(deptno,10,'홍보부',20,'교육부',30,'인사부') 부서명 from emp;