# Use-Diagram
소프트웨어공학 과제 - 배달 앱 시퀀스 다이어그램

    User->>App: 앱 실행
    App->>Server: 사용자 정보 요청
    Server-->>App: 사용자 정보 응답

    User->>App: 음식 검색 및 선택
    App->>Server: 음식 데이터 요청
    Server-->>App: 음식 데이터 응답

    User->>App: 주문 요청
    App->>Server: 주문 정보 전송
    Server->>Restaurant: 주문 전달
    Restaurant-->>Server: 주문 확인

    Server->>App: 주문 접수 결과 응답
    App-->>User: 주문 접수 완료 표시

    Server->>Delivery: 배달 요청
    Delivery-->>Server: 배달 수락

    Delivery->>Restaurant: 음식 수령
    Delivery->>User: 음식 배달 완료

최근에 많은 사람들이 이용하는 <배달 앱> 주제를 선정했습니다.
사용자가 배달 앱을 실행해서 음식을 골라 선택하고 주문된 정보는 가게에 전달,
음식 접수를 통해 배달 진행 및 배달 완료까지 보여주는 시퀀스 다이어그램을 모델링해봤습니다.

각각의 클래스는 주문 요청, 처리, 전달, 배달 일련의 과정으로 하나의 역할에 집중되어 있습니다.
-> 단일 책임 원칙(SRP)에 충실하며 응집도가 높다고 볼 수 있습니다.

각 클래스는 명확한 메서드 호출로 연결되고, 내부 구현에 직접 접근하지 않습니다.
-> 유연한 구조로 테스트와 확장이 쉽다는 점에서 결합도가 낮다고 볼 수 있습니다.
