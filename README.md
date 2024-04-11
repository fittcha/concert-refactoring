# hhplus03_server

# [항해 플러스 백엔드 3주차] 서버 구축
### *시나리오 - 콘서트 예약 서비스*
---
## 1. 요구사항 분석
### 프로젝트 Milestone & 요구사항 명세서 & API 명세서
[구글닥스 문서 바로가기](https://docs.google.com/spreadsheets/d/1xUItBPr_C1zbzSHNcl8WOv9zL6cymvzz5DRU_7oKDZM/edit#gid=983380097)

[Swagger UI](http://localhost:8080/swagger-ui/index.html#/)

### UML 다이어그램
![uml.png](uml.png)
### ERD 명세
*※대기열 구현에 필요한 테이블은 대기열 구현 시 작성 예정*
![erd.png](erd.png)
---
### Dummy data - postman 호출
- API: http://localhost:8080/concerts/
  ![postman_getConcerts.PNG](postman_getConcerts.PNG)
- API: http://localhost:8080/reservations/
  ![postman_reserve.PNG](postman_reserve.PNG)

---
## 2. 작업 내용
- ~2024.04.02
  - 요구사항 분석
  - 프로젝트 명세 문서 작성
  - ERD 설계
  - 프로젝트 세팅
- 2024.04.03
  - 아키텍처 구조 설계
  - Mock API 작성 중
- 2024.04.04
  - ERD 재설계
  - Mock API 작성
  - Dummy Data 반환 및 http 테스트
  - SecurityConfiguration 작성 (postman 테스트용)




---
## 3주차 인사이트
- 요구사항을 api 명세로 녹여내고, 기능 구현 흐름을 작성해보는 것
- DB를 적절한 정규화 방식으로 설계하는 것
- 테이블도 결국 캡슐화? 의존성을 줄여..

---
## 기술 스택 결정
- Spring boot
- Jpa
- Mysql

## 테스트 시나리오
- 테스트 코드 주석 참고

