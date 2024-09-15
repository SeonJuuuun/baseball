-  ## ⚾️ 숫자 야구 게임️️ ⚾ ️
- [x] 컴퓨터가 정답 숫자를 생성한다.
  - [x] 정답은 서로 다른 3자리 수이다.
  - [x] 각 자리는 1 ~ 9 사이의 숫자이다.
  - [x] 동일한 숫자는 사용될 수 없다. 즉, 중복되지 않아야 한다.
- [ ] 정답을 맞추기 위해 숫자를 입력한다.
    - [x] 정답은 서로 다른 3자리 수이다.
        - [x] 3자리수가 아닌 자리수가 들어오면 예외가 발생한다.
    - [x] 각 자리는 1 ~ 9 사이의 숫자이다.
        - [x] 1 ~ 9 이외의 숫자가 입력되면 예외가 발생한다.
        - [x] 숫자가 아닌것이 들어오면 예외가 발생한다.
    - [x] _동일한 숫자는 사용될 수 없다. 즉, 중복되지 않아야 한다.
        - [x] 동일한 숫자가 들어올 경우 예외가 발생한다.
    - [x] 빈 칸이 입력되면 예외가 발생한다.
- [x] 결과 값을 출력한다.
  - [x]  스트라이크 : 입력값과 정답을 비교해 같은 자리에 같은 숫자가 있는 경우
  - [x]  볼 : 숫자는 같지만, 자리는 다른 경우
  - [x]  아웃 : 숫자도, 자리도 다른 경우
- [ ] 입력한 3자리 숫자가 정답과 같은 경우 게임이 종료된다.
  - [ ] 3스트라이크가 출력되면 정답에 해당된다.
  - [ ] 정답에 맞는 출력 메세지를 구현한다.
- [ ] 올바르지 않은 입력값에 대해 예외 처리를 한다.
- [ ] 정답을 맞출 때 까지 계속 시도할 수 있어야 한다.





- ### Player
  - 사용자가 입력한 숫자를 저장하는 클래스
  - 필드는 Integer List
  - 자리수가 3자리인지 판별하는 기능, 만약 아니면 예외처리
  - 각 자리의 숫자가 1 ~ 9 사이인지 판별하는 기능, 만약 아니면 예외처리
  - 각 자리 숫자가 동일한게 있는지 판별하는 기능, 만약 아니면 예외처리
  
- ### Computer
  - 컴퓨터의 숫자를 저장하는 클래스
  - 필드는 Integer List
  - 랜덤으로 숫자를 3개 뽑고 저장
  
- ### Referee
  - 오직 Computer의 숫자와 Player의 숫자를 판단해 스트라이크, 볼 개수 계산하는 클래스

- ### BaseballGame
  - 모든 클래스들과 상호작용하여 총괄하는 클래스
  - Computer의 숫자와 플레이어의 입력을 받으며 게임을 진행하는 클래스

- ### Input
  - Player의 입력을 담당하는 클래스

- ### Output
  - 모든 게임에 관련된 출력을 담당하는 클래스
  
- ### NumberGenerator
  - 숫자 생성 인터페이스

- ### RandomNumberGenerator
  - NumberGenerator 구현체

- ### Hint
  - Referee 클래스가 판단한 결과를 저장한 후 힌트를 주는 클래스
