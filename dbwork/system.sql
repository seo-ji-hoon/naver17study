-- system에 등록된 table 들 확인하기
-- 커서가 있는곳의 sql 문 실행 단축키 : ctrl+enter
select * from tab;

--등록된 user(계정)들 확인
select username from dba_users; --dba_users 테이블에서 username 이라는 컬럼만 확인하기

--dba_users 라는 테이블에는 어떤 컬럼이 있을까?
desc dba_users; --기본 구조만 확인(데이타는 확인안됨)
select username,account_status from dba_users; --계정과 lock(락) 상태 알아보기