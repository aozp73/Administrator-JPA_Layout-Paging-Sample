INSERT INTO user_tb(id, nickname, password, email, role, status, created_at, updated_at) 
-- 1)정보수정 진행한 상태, 2) 회원가입 직전으로 나뉨
-- 공백이나 default 지정시 nickname unique 제약조건에 걸림
VALUES (1, 'king', '1234', 'king@nate.com', 'ADMIN', '관리자', now(), now()),
       (2, 'ssar', '1234', 'ssar@nate.com', 'PLAYER', '일반회원', now(), now()),
       (3, 'ssar1', '1234', 'ssar1@nate.com', 'PLAYER', '일반회원', now(), now()),
       (4, 'ssar2', '1234', 'ssar2@nate.com', 'PLAYER', '일반회원', now(), now()),
       (5, 'ssar3', '1234', 'ssar3@nate.com', 'PLAYER', '일반회원', now(), now()),
       (6, 'ssar4', '1234', 'ssar4@nate.com', 'PLAYER', '일반회원', now(), now()),
       (7, 'ssar5', '1234', 'ssar5@nate.com', 'PLAYER', '일반회원', now(), now()),
       (8, 'ssar6', '1234', 'ssar6@nate.com', 'PLAYER', '일반회원', now(), now()),
       (9, 'ssar7', '1234', 'ssar7@nate.com', 'PLAYER', '일반회원', now(), now()),
       (10, 'ssar8', '1234', 'ssar8@nate.com', 'PLAYER', '일반회원', now(), now()),
       (11, 'ssar9', '1234', 'ssar9@nate.com', 'PLAYER', '일반회원', now(), now()),
       (12, 'cos', '1234', 'cos@nate.com', 'PLAYER', '일반회원', now(), now()),
       (13, 'cos1', '1234', 'cos1@nate.com', 'PLAYER', '일반회원', now(), now()),
       (14, 'cos2', '1234', 'cos2@nate.com', 'PLAYER', '일반회원', now(), now()),
       (15, 'cos3', '1234', 'cos3@nate.com', 'PLAYER', '일반회원', now(), now()),
       (16, 'cos4', '1234', 'cos4@nate.com', 'PLAYER', '일반회원', now(), now()),
       (17, 'cos5', '1234', 'cos5@nate.com', 'PLAYER', '일반회원', now(), now()),
       (18, 'cos6', '1234', 'cos6@nate.com', 'PLAYER', '일반회원', now(), now()),
       (19, 'cos7', '1234', 'cos7@nate.com', 'PLAYER', '일반회원', now(), now()),
       (20, 'cos8', '1234', 'cos8@nate.com', 'PLAYER', '일반회원', now(), now()),
       (21, 'cos9', '1234', 'cos9@nate.com', 'PLAYER', '일반회원', now(), now());
