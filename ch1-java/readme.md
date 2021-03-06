### JAVA란
자바는 프로그래밍 언어의 하나이며 가장 큰 특징으로는 운영체제 독립적이다는 것이다. 이러한 장점으로 다양한 기기와 운영체제가 공존하는 인터넷 환경에 적합하다.

### 자바의 역사
- **1991** 오크(Oak): 가전제품과 PDA 같은 소형기기를 위한 언어
- **1996** Hot Java: 인터넷에 적합한 형태로 변형하면서 탄생

### 자바언어의 특징
- 운영체제에 독립적이다  &rarr; 자바가상머신(JVM)
- 객체지향언어이다 &rarr; 상속, 캡슐화, 다형성
- 비교적 배우기 쉽다 (C++ 연산자와 기본구문, small talk 객체지향관련 구문)
- 자동 메모리 관리(Garbage collection)
- 네트워크와 분산처리를 지원한다.
- 멀티쓰레드를 지원한다.
- 동적 로딩을 지원한다. &rarr; 필요한 시점에 클래스를 로딩한다. &rarr; 유연한 어플리케이션 작성 가능하다.

### JVM(Java Virtual Machine)

Java App &harr; JVM &harr; OS &harr; hardware

JVM이 OS에 알맞게 byte code로 변환하여 java app을 실행한다. 따라서 운영체제에 독립적으로 코드를 동작시킬 수 있다.

하지만 JVM을 거쳐 부수적인 해석(interpret) 과정이 필요하기 때문에 느리다는 단점이 있다. JIT 컴파일러 성능 향상으로 이러한 단점을 보완하고 있다.

### JDK(java development kit)

JDK는 JVM과 Java API 외에 자바 개발에 필요한 프로그램을 가지고 있다.

- javac 자바컴파일러 자바소스코드 &rarr; 바이트코드 
- java 자바 인터프리터 바이트코드 해석 및 실행
- javap 역어셈블러 바이트코드 &rarr; 자바소스코드
- javadoc 자동문서생성기 주석을 모아서 API 문서 생성
- jar 압축프로그램

### Java 프로그램 실행과정
```java *.class ``` 명령어 입력시에 일어나는 일의 순서

1. 클래스 파일을 로드한다.
2.  클래스 파일을 검사한다.
3. 지정된 클래스에 main을 호출한다.