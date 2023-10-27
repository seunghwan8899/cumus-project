# 개요
간단한 이커머스 프로젝트입니다.

사용기술 : Java, Spring, Jpa, Mysql, Docker, Redis, IntelliJ

목표 : 구매자와 셀러 사이를 중계해주는 이커머스 서버를 구축합니다.

## 회원
### 공통
- [x] 이메일을 통해서 인증번호를 통한 회원가입

## 고객
- [x] 회원 가입
- [x] 인증(이메일)
- [x] 로그인 토큰 발행
- [x] 로그인 토큰을 통한 제어 확인 (JWT, Filter를 사용해서 간략하게)
- [x] 예치금 관리

### 셀러
- [x] 회원가입

## 주문 서버

### 구매자
- [ ] 장바구니를 위한 Redis 연동
- [ ] 상품 검색 & 상세 페이지
- [ ] 장바구니에 물건 추가
- [ ] 장바구니 확인
- [ ] 주문하기
- [ ] 주문내역 이메일로 발송하기

### 셀러
- [ ] 상품 등록, 수정
- [ ] 상품 삭제

## ERD
<p align="center">
  <img src="https://github.com/seunghwan8899/cumus-project/assets/130161496/73ae85bc-7a17-464e-a8b8-f838400ba1d0">
</p>
