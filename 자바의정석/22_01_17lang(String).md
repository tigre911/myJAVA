## **String 클래스**

기존의 다른 언어는 문자열을 char형의 배열로 다루었으나 자바에서는 문자열을 위한 String클래스를 제공한다.

**변경 불가능한(immutable) 클래스**

String크래스에는 문자열을 저장하기 위해서 문자형 배열 변수(char\[ \]) value를 인스턴스 변수로 정의해놓고 있다. 인스턴스 생성 시 생성자의 매개변수로 입력받는 문자열은 이 인스턴스변수에 문자형 배열로 저장되는 것이다.

```
public final class String implements java.io.Serializable, Comparable {
	private char[] value;
    	...
```

한번 생성된 String인스턴스가 갖고 있는 문자열은 읽어 올 수만 있고, 변경할 수는 없다.

**문자열의 비교**

문자열을 만들 때는 문자열 리터럴을 지정하는 방법과 String클래스의 생성자를 사용해서 만드는 방법이 있다.

```
String str1 = "abc";	//문자열 리터럴 "abc"
String str2 = "abc";	//문자열 리터럴 "abc"
String str3 = new String("abc");	// 새로운 String 인스턴스를 생성
String str4 = new String("abc");	// 새로운 String 인스턴스를 생성
```

String 클래스의 생성자를 이용한 경우에는 new연산자에 의해서 메모리 할당이 이루어지기 때문에 항상 새로운 String 인스턴스가 생성된다. 그러나 문자열 리터럴은 이미 존재하는것을 재사용 하는 것이다.

equals()를 사용했을 때는 두 문자열의 내용("abc")을 비교하기 때문에 두 경우 모두 true를 결과로 얻는다.

하지만, 각 String 인스턴스의 주소를 등가비교연산자(==)로 비교했을 때는 결과가 다르게 나온다.(저장된 메모리의 주소가 다르기 때문)

**문자열 리터럴**

자바 소스파일에 포함된 모든 문자열 리터럴은 컴파일 시에 클래스 파일에 저장된다. 이때 같은 내용의 문자열 리터럴은 한번만 저장된다. 문자열 리터럴도 String인스턴스이고, 한번생성하면 내용을 변경할 수 없으니 하나의 인스턴스를 공유하면 되기 때문이다.

**빈 문자열(empty string)**

길이가 0인 배열이 존재할 수 있다. char형 배열도 길이가 0인 배열을 생성할 수 있고, 이 배열을 내부적으로 가지고 있는 문자열이 바로 빈 문자열이다.

String s = ""; 과 같은 문장이 있을 때, 참조변수 s가 참조하고 있는 String인스턴스는 내부에 'new Char\[0\]'과 같이 길이가 0인 char형 배열을 저장하고 있는 것이다.

그러나 ' String s = ""; ' 과 같은 표현이 가능하다고 해서 ' char=""; '와 같은 표현도 가능하지는 않다. char형 변수에는 반드시 하나의 문자를 지정해야 하기 때문.

**join( )과 String.Joiner**

join( )은 여러 문자열 사이에 구분자를 넣어서 결합한다. 구분자로 문자열을 자를 split( ) 과 반대의 작업을 한다고 생각하면 쉽다.

```
String animals = "dog,cat,bear";
String arr[] = animals.split(",");	//문자열을 ',' 구분자로 나눠 배열에 저장
String str = String.join("-", arr);	//배열의 문자열을 '-'로 구분해서 결합
System.out.println(str);

//출력결과
dog-cat-bear
```

**String.format( )**

format()은 형식화된 문자열을 만들어내는 간단한 방법이다. printf( )하고 사용법이 완전히 같다.

```
String str = String.format("%d 더하기 %d는 %d입니다.", 3, 5, 3+5);
System.out.println(str);

//출력결과
3더하기 5는 8입니다.
```

**기본형 값을 String으로 변환**

숫자로 이루어진 문자열을 숫자로, 또는 그반대로 변환하는 경우가 만핟.

숫자에 빈 문자열 ""를 더해주거나 , valueOf( ) 를 사용하느 방법도 있다.

```
int i = 100;
String st1 = i + "";				//100을 "100"으로 만들기
String st2 = String.valueOf(i);		//100을 "100"으로 만들기
```

String을 기본형 값으로 변환

valueOf( )를 쓰거나 parseInt( )를 사용하면 된다.

```
int i = Integer.parseInt("100");
int i2 = Integer.valueOf("100");
```

예전엔 parseInt( )를 많이 썻지만, 최근에는 메서드의 이름을 통일하기 위해 valueOf( )가 추가되었다.

**StringBuffer 클래스와 StringBuilder 클래스**

String클래스는 인스턴스를 생성할 때 지정된 문자열을 변경할 수 없지만 StringBuffer클래스는 변경이 가능하다.

내부적으로 문자열 편집을 위핸 버퍼(buffer)를 가지고 있으며, StringBuffer 인스턴스를 생성 할 때 그 크기를 지정할 수 있다.

**StringBuffer의 생성자**

StringBuffer클래스의 인스턴스를 생성할 때, 적절한 길이의 char형 배열이 생성되고, 이 배열은 문자열을 저장하고 편집하기 위한 공간(buffer)로 사용된다.

StringBuffer인스턴스를 생성할 때는 생성자 StringBuffer(int length)를 사용해서 StringBuffer인스턴스에 저장될 문자열의 길이를 고려하여 여유있는 크기로 지정하는 것이 좋다. StringBuffer인스턴스를 생성할 때, 버퍼의 크기를 지정해주지 않으면 16개의 문자를 저장할 수 있는 크기의 버퍼를 생성한다.

**StringBuilder란?**

StringBuffer 는 멀티쓰레드에 안전하도록 동기화 되어 있다. 멀티쓰레드로 작성된 프로그램이 아닌 경우, StringBuffer의 동기화는 불필요하게 성능만 떨어뜨리게 된다.

그래서 StringBuffer에서느 쓰레드의 동기화만 뺀 StringBuilder가 새로 추가되었다. StringBuffer 와 StringBuilder 는 완전히 똑같은 기능으로 작성되어 있어서, 소스코드에서 바꾸기만 하면 된다.