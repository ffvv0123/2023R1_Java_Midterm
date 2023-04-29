# 2023R1_Java_Midterm
Java 중간고사 문제 중 끝까지 못풀었던 문제들을 다시 풀어보았다


## Q1
1번 문제는 High-Level IO의 특성 중 하나인 데이터 타입의 순서가 정확해야만 복호화가 가능하디는 점을 이용한 문제이다.
이를 위해서는 암호를 해독하기 위한 키를 정확히 분석해야한다.

해독키는 Q1_CodeBook.data 파일로 여기에는 암호화된 파일의 데이터 타입이 한 줄로 구분되어 저장되어 있다.
시험을 치는 중에는 시간이 모자라서 데이터 타입의 갯수만 출력을 했지만 조금의 시간의 여유가 있었더라면 완벽하게 해결할 수 있었을 것 같다.

전체적인 File IO의 흐름은 다음과 같다.

Q1_CodeBook.data -> Q1.data -> [Q1_Integer.txt, Q1_Boolean.txt, Q1_Double.txt, Q1_Char.txt, Q1_Long.txt]

CodeBook의 데이터를 하나 읽는 동시에 Q1의 데이터를 복호화하여 각 타입에 맞는 파일에 저장하고, 타입의 갯수를 추가하고, 실수형이라면 값을 더하는 방식으로 문제를 풀어나가면 된다.


## Q3
3번 문제는 데이터의 크기가 커서 한 문제를 가지고 90분을 줘도 절대로 못 풀었다. 실제로 푸는데 4시간이 넘게 걸렸다.

1. 파일에서 클래스 데이터 맴버를 파악하여 클래스에 구현하고 조건에 맞는 생성자, 맴버 함수를 구현한다.
  데이터 멤버가 12개이다. 이는 멤버 함수가 최소 24개가 되므로 복붙을 해도 시간이 많이 걸린다.

2. 값을 랜덤으로 생성하는 메소드를 만든다
  여기에서도 시간이 많이 걸렸다. 주어진 파일에서 데이터의 범위를 파악하여 그 범위 내에서 값을 랜덤으로 생성해야 한다.
  데이터의 변수가 너무 많아서 하나하나 파악하는데 오랜 시간이 걸렸고, 각각 범위를 다르게 조정해야 했다는 점도 시간을 많이 잡아먹었다.
  랜덤으로 이름을 만드는 부분은 지난 과제를 참고하여 쉽게 해결했다.

3. 유저 CUI 개발하기
  개인적으로 공부가 많이 되었던 부분이다. 어떤 방법으로 구현하는 것이 사용자 입장에서 편리한가를 생각할 수 있었고, 시험지에서 제공된 방법 외에 다른 방법을 생각할 수 있었다.
  두 가지 방법을 생각했다.
  - 모든 데이터 멤버에 대한 선택을 적절하게 조합하여 사용자에게 제공하는 방법
  - 사용자가 명령어를 입력하면 이를 토대로 탐색을 하는 방법

  시간 상 2번 방법만 구현했지만, 이마저도 엄청나게 많은 시간이 소요되었다.
  명령어들은 다음과 같이 구현되었다. [옵션] [연산자] [변수] [연결어] [옵션] [연산자] [변수]
  총 2개의 조건을 넣을 수 있고 여유가 생긴다면 더 많은 연산자를 추가할 수 있다.
  새롭게 구현한 부분은 Model 옵션에 어떤 글자가 포함되어 있다면 선택하는 기능이다.

프로그램 실행결과는 다음과 같다.

<img width="796" alt="image" src="https://user-images.githubusercontent.com/63843822/235284021-51c3b869-a009-4525-b143-4dd0ce4f0047.png">








