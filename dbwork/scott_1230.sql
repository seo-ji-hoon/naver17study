-- emp 테이블로 연습
--job 컬럼의 데이타중 중복되는 데이타는 한번만 출력해보자
select DISTINCT job from emp;
select DISTINCT job,ename from emp; --다른 컬럼하고 같이 쓸경우 적용이 안되거나 오류가 날수도 있다.
select * from emp; --전체 컬럼데이타 조회
select ename,job from emp; -- 일부 컬럼만 조회
select ename,job from emp order by ename; -- ename 의 오름차순 조회 (asc 인 경우는 생략)
select ename,job from emp order by ename desc; -- ename 의 내림차순 조회 (desc 인 경우는 생략안됨)

-- job 의 오름차순, 같은 job 일경우는 ename 의 내림차순 조회
select job,ename from emp order by job,ename desc; 
-- job 의 오름차순, 같은 job 일경우는 ename 도 오름차순 조회
select job,ename from emp order by job,ename;

--순서를 정할때 컬럼명 대신 컬럼번호로 해도 된다 (첫번째 컬럼은 1)
select job,ename from emp order by 1,2; -- job(1),ename(2)

-- sal 의 오름차순 정렬
select * from emp order by 6;
select * from emp order by sal;

--empno 의 오름차순 조회 
select ename,sal,comm,job,empno from emp order by 5;
select ename,sal,comm,job,empno from emp order by empno;

-- ename 의 내림차순
select ename,sal,comm,job,empno from emp order by 1 desc;
select ename,sal,comm,job,empno from emp order by ename desc;

--where 조건문
select ename,job,sal,comm from emp where sal>=1500;
select ename,job,sal,comm from emp where ename='ALLEN'; --데이타는 대소문자 정확히 써야한다.

-- ename 이 A로 시작하는 데이타 조회
select ename,job,sal,comm from emp where ename LIKE 'A%'; -- % 는 와일드카드
-- ename 에 A가 포함되는 데이타 조회
select ename,job,sal,comm from emp where ename LIKE '%A%';

--ename 에 A로 시작하거나 S로 시작하는 데이타를 조회 (컬럼명까지 정확하게 써야됨)
select ename,job,sal,comm from emp where ename LIKE 'A%' OR ename LIKE 'S%';
--ename 에 A와S를 모두 포함하는 데이타만 출력
select ename,job,sal,comm from emp where ename LIKE '%A%' AND ename LIKE '%S%';

--ename 의 두번째 글자가 A 인 사람만 조회
select ename,job,sal,comm from emp where ename LIKE '_A%';

--ename 의 두번째 글자가 A 이거나 세번째가 A인 사람만 조회
select ename,job,sal,comm from emp where ename LIKE '_A%' OR ename LIKE '__A%';

--ename 이 N이나 K로 끝나는 사람만 조회
select ename,job,sal,comm from emp where ename LIKE '%N' OR ENAME LIKE '%K'; 

--JOB 이 analyst 이면서 sal 이 1500 이상인 사람 조회
select ename,job,sal,comm from emp where job='ANALYST' AND SAL>=1500;

-- SAL 1200~2000 사이값 조회
select ename,job,sal,comm from emp where SAL>1200 AND SAL<=2000; --방법1
select ename,job,sal,comm from emp where SAL BETWEEN 1200 AND 2000; --방법2

--JOB이 MANAGER,SALESMAN,ANALYST 이 3가지 직업의 사람을 조회
select ename,job,sal,comm from emp where JOB='MANAGER' OR JOB='SALESMAN' OR JOB='ANALYST'; --방법1
select ename,job,sal,comm from emp where JOB IN ('MANAGER','SALESMAN','ANALYST'); --방법2

--EMPNO 가 7654,7788,7844,7902 인 사람을 조회
select EMPNO,ename,job,sal,comm from emp where EMPNO IN (7654,7788,7844,7902);

-- COMM 이 NULL 인 데이타만 조회
select ename,job,sal,comm from emp where COMM IS NULL; -- NULL 인 데이터만 조회
select ename,job,sal,comm from emp where COMM IS NOT NULL; --NULL이 아닌경우 데이타만 조회

--MGR 이 NULL이 아닌경우만 조회
select * from emp where mgr is not null;

--comm 이 null 인 경우는 0으로 출력,MGR은 NULL인 경우 100으로 출력 < NVL(이름명,0) >
select ename,job,sal,NVL(mgr,100),NVL(comm,0) from emp;

select sal,comm,sal+comm from emp; -- comm 이 null 일 경우 sal+comm 도 null
-- 위의 경우 sal+comm 인경우 comm이 null이면 0으로 계산
select sal,comm,sal+NVL(comm,0) from emp;

--컬럼제목에 별칭 주기 (alias)
select ename as "사원명",sal as "월급여" from emp; --생략없이 alias 지정하는 방법
select ename  "사원명",sal  "월급여" from emp; -- as 생략하고 alias 지정하는 방법
select ename  사원명,sal 월급여 from emp; -- alias 에 공백이 없는 경우도 ""도 생략가능
select ename  "사원 이름",sal  "월 급여" from emp; -- 중간에 공백이 있는 경우 "" 반드시 넣어야함

-- 총 레코드 갯수(데이타 갯수)
select count(*) from emp; -- 컬럼명이 count(*)
select count(*) count from emp; -- 컬럼명이 count
select count(*) 총갯수 from emp; -- 컬럼명이 총갯수

--
select sal,comm,sal+NVL(comm,0) sum from emp; -- sal+NVL(comm,0) 열의 컬럼명은 sum 으로 변경
select sal 월급여,comm 커미션,sal+NVL(comm,0) 총금액 from emp; -- 컬럼명을 한글로

-- 문자열을 컬럼에 추가시 || 연사자 사용
select '내이름은' ||ename||'입니다.' 자기소개 from emp;

-- 내직업은 salesman 이고 내 월급여는 1600입니다. 라고 컬러명 "자기소개"에 나오도록 작성
select '내직업은' ||job|| '이고 내 월급여는' ||sal|| '입니다' 자기소개 from emp;

-- sal 이 1500~2000 사이가 아닌경우만 조회
select * from emp where sal  not BETWEEN 1500 and 2000;

--not in 을 사용하여 job 이 salesman,clerk 가 아닌경우 조회
select * from emp where job NOT in ('SALESMAN','CLERK');

-- GROUP 함수(COUNT, SUM, AVG, MAX, MIN)
select count(*) from emp; -- 전체 데이타 갯수
select sum(sal) from emp; -- sal 의 총 합계
select avg(sal) from emp; -- sal 의 평균, 소숫점이 많이 나온다.
select round(avg(sal),2) from emp; -- sal 의 평균을 구하는대 소숫점 이하 2자리로 구한다.
select max(sal) from emp; -- 최고 급여액수
select min(sal) from emp; -- 최소 급여액수

-- 평균 급여보다, sal 이 더 높은 사람을 조회하시오 (서브쿼리문)
select * from emp where sal>(select avg(sal) from emp);

-- scott 의 직업과 같은 직업을 가진 사람을 조회하시오.
select * from emp where job =(select job from emp where ename='SCOTT');

--scott 의 mgr과 같은 mgr을 가진사람
select * from emp where mgr =(select mgr from emp where ename='SCOTT');

--GROUP BY
select job from emp group by job; --job이 그룹별로 나열

-- job의 group 별로 인원수를 구해보자
select job,count(*) from emp group by job;

--제목에 별칭 부여
select job 직업 ,count(*) 인원수 from emp group by job;

-- job 의 group 별로 인원수를 구해보자 (인원이 3명이상인 경우에만 조회) having group 함수
select job 직업 ,count(*) 인원수 from emp group by job having count(job)>=3;

-- job 의 group 별로 인원수를 구해보자 (인원이 3명이상인 경우에만 조회) -인원순으로 출력(오름차순)
select job 직업 ,count(*) 인원수 from emp group by job having count(job)>=3 order by 인원수; --방법 #1
select job 직업 ,count(*) 인원수 from emp group by job having count(job)>=3 order by 2; --방법 #2

--직업별 인원수,최저연봉,최고연봉,평균연봉(소숫점이하없이)을 구하시오
select job 직업 ,count(*) 인원수,  min(sal)최저연봉, max(sal) 최고연봉, round(avg(sal),0) 평균연봉 
from emp group by job order by 직업;

-- 48페이지 숫자함수
select abs(-5),abs(5) from dual;-- -5,5 절대값 출력

--round 반올림 , ceil 무조건 올림, floor 무조건 내림
select round(3.6,0),ceil(3.6),floor(3.6) from dual; -- 4 4 3
select round(3.4,0),ceil(3.4),floor(3.4) from dual; -- 3 4 3
select round(328947,-2) from dual; -- 328900 두번째까지 반올림
select round(328467,-2) from dual; -- 328500 두번째까지 반올림

select round(avg(sal),0),ceil(avg(sal)),floor(avg(sal)) from emp;

--power(m,n):m의n승 값을 구함 mod(m,n): m을 n으로 나눈 나머지
select POWER(3,3),mod(10,3) from dual; --27  1

--문자 함수 concat(두 문자 더하기),lower(소문자 변환),upper(대문자 변환),initcap(첫글자 대문자 변환)
select ename,concat(ename,'님'),lower(ename),upper(ename),initcap(ename) from emp;

--lpad , rpad 함수
select lpad (sal,10,'*') from emp; --총 10자리에 남는부분을 * 채움(왼쪽부터 채워짐)
select rpad (sal,10,'*') from emp; --총 10자리에 남는부분을 * 채움(오른쪽부터 채워짐)

-- substr 함수
select substr('happy day',7,3) from dual; --7번 글자부터 3글자 추출
select substr('happy day',-6,3) from dual; --뒤에서부터 6번째 글자부터 3글자 추출

--emp 테이블의 ename 에서 왼쪽에서 3글자를 추출후 총 7자리중 우측빈공간은 *로 채워서 출력
select rpad(substr(ename,1,3),7,'*'),sal from emp;

--length 문자 길이 구하기
select ename 이름, length(ename) 문자길이 from emp;

--replace -> happy를 good 으로 변경해서 출력
select replace('happy day','happy','good') from emp;

--trim -> 앞뒤 공백제거
select '*'||'  lee su ji  '||'*' from dual; 
select '*'||trim('  lee su ji  ')||'*' from dual; -- 앞뒤 공백이 제거됨

-- 현재 날짜를 나타내는 sysdate
select sysdate from dual; --현재날짜
select sysdate+7 from dual; --현재날짜 부터 7일뒤 날짜
select sysdate+1 from dual; --현재날짜부터 그다음날 날짜

-- to_char 함수를 이용해서 원하는 날짜 모양으로 출력해보자
select to_char(sysdate,'yyyy-mm-dd') from dual; -- 2024-12-30
-- mm->월 mi->분 hh-> 12시간표지 am또는pm -> 오전,오후 표시
select to_char(sysdate,'yyyy-mm-dd am hh:mi') from dual; -- 2024-12-30 오후 04:41
-- hh24 -> 24시간 표시
select to_char(sysdate,'yyyy-mm-dd hh24:mi') from dual; -- 2024-12-30 16:41

select to_char(sysdate,'month') from dual; -- 12월 (지역화에 따라 다르게 나오므로 사용빈도가 낮음)

-- 현재 년도 4자리만 추출
select to_char(sysdate,'yyyy') from dual; -- 2024 출력

-- 현재 월 추출
select to_char(sysdate,'mm') from dual; -- 현재월 12 출력
select to_char(to_date('2024-5-10'),'mm') from dual; -- 05 출력

--emp의 hiredate 는 날짜 타입이다.
select to_char(hiredate,'yyyy-mm-dd') 입사일 from emp;





