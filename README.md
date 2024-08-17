# 항해 플러스 백엔드 4기 - 콘서트 예매 서비스 리팩토링
### 🎤 시작하며
항해 플러스 백엔드 4기 코스를 수강하며 콘서트 예매 서비스를 약 5주 간 개발했다.</br>
매주 달라지는 주제와 주어지는 요구사항에 따라 과제를 진행하면서, 그 때의 나에게는 최선이었지만 지금 돌아보면 엉성하거나 디벨롭이 필요한 부분이 꽤나 많다는 생각이 들었다.</br>
항해 플러스 10주 간의 시간동안 열심히 이해하고 공부했지만 물리적인 시간의 압박으로 급급하게 구현만 한 부분이 많았다. </br>
이에, 이 부트캠프 프로젝트가 나한테 100% 남았을까? 각각의 주제에 대해 더 고심하고 공부하면서 나 자신의 타당한 이유로 개발을 해보면 어떨까.</br>
요구사항 정리, 나에게 적합한 아키텍처부터 하나씩 다시 적립해나가서 내가 만족할 수 있는 하나의 완성본을 만들어보고 싶은 마음이 들었다.</br>
그래서 다시 해봅니다! 콘서트 예매 서비스🎫
</br></br>
### 🕹️ 프로젝트 설명
- 콘서트를 예매할 수 있는 웹서비스입니다.</br>
- 회원가입을 통해 회원이 되어야만 예매 진행이 가능합니다.</br>
- 콘서트 정보, 콘서트 좌석을 조회하여 해당 좌석을 예매할 수 있으며, 예매 후 만료 시간 내에 결제를 완료하여 예약을 확정할 수 있습니다.</br>
- 동시 접속자가 많을 때는 대기열로 서비스 화면 진입 전 대기하게 될 수 있으며, 대기 시간과 순번이 표시됩니다.</br>
- 콘서트 예매 서비스를 진행하며 각각의 단계에서 알림을 받을 수 있습니다. </br>
</br>

## ⚙️ 기술 스택
<img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=Java&logoColor=white"> <img src="https://img.shields.io/badge/Spring Boot-6DB33F?style=for-the-badge&logo=Spring Boot&logoColor=white"> <img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=MySQL&logoColor=white"> <img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=Docker&logoColor=white">
</br></br>

## 📑 요구사항 정리
1️⃣ **회원 가입 및 로그인 API**
- 회원 가입하여 콘서트 예매 서비스를 이용할 수 있다.
- 비회원으로 조회는 가능하되, 예매를 시도할 경우 로그인 또는 회원 가입이 필요하다.
- 회원 별로 각자의 포인트를 충전 및 사용할 수 있다.
- 회원 별로 각자의 예매 내역을 확인할 수 있다.

2️⃣ **유저 대기열 토큰 기능**
- 서비스를 이용할 토큰을 발급받는 API
- 유저의 ID와 해당 유저의 대기열을 관리하는 정보(대기 순서, 대기 시간)을 포함하여 반환한다.
- 이후 모든 API는 위 토큰을 이용해 대기열 검증을 통과해야 이용 가능하다. (프론트에서 폴링으로 대기열을 확인한다고 가정한다.)

3️⃣ **예매 가능 날짜/좌석 API**
- 콘서트 별 정보와 예매 가능한 날짜 목록을 조회할 수 있다.
- 예매 가능한 날짜와 해당 날짜의 좌석을 조회할 수 있다.
- 날짜 당 예매 가능한 좌석 정보를 조회할 수 있다.

4️⃣ **좌석 예매 요청 API**
- 날짜와 좌석 정보를 입력받아 좌석을 예매 처리한다.
- 좌석 예매와 동시게 해당 좌석은 해당 유저에게 5분간 임시 배정된다.
- 배정 시간 내에 결제가 완료되지 않는다면 좌석에 대한 임시 배정은 해제되며 다른 사용자는 예약할 수 없다.
- 예매가 완료되면 예약 내역을 생성한다.

5️⃣ **잔액 충전/조회 API**
- 결제에 사용될 금액을 충전할 수 있다.
- 회원 ID를 통해 잔액을 조회할 수 있다.

6️⃣ **결제 API**
- 결제를 처리하고 결제 내역을 생성한다.
- 결제가 완료되면 해당 좌석의 소유권을 유저에게 배정하고 대기열 활성 토큰을 만료시킨다.
</br>

## 🏗️ 아키텍쳐
기본적으로 의존성 역전 원칙(DI), 캡슐화를 고려하여 클린-레이어드 아키텍처를 사용합니다.

</br>

## 프로젝트 일정

</br>

## API 명세

</br>

## 흐름도

</br>

## ㅇㅇ

</br>

