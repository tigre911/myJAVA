## **Math 클래스**

기본적인 수학 계산에 유용한 메서드로 구성되어 있다.

Math클래스의 생성자는 접근 제어자가 private 이기 때문에 다른 클래스에서 Math인스턴스를 생성할 수 없도록 되어있다. 그 이유는 클래스 내에 인스턴스변수가 하나도 없어서 인스턴스를 생성할 필요가 없기 때문이다. Math클래스의 메서드는 모두 static이며, 2개의 상수만 정의되어 있다.

```
public static final double E = 2.7182818284590452354;	//자연로그의 밑
public static final double PI = 3.14159265358979353846;	//자연로그의 밑
```

**올림, 버림, 반올림**

소수점 n번째 자리에서 반올림한 값을 얻기 위해서는 **round()**를 사용해야하는데 , 이 메서드는 항상 소수점 첫째자리에서 반올림을 해서 정수값(long)을 결과로 돌려준다.

**rint()**도 round()처럼 소수점 첫 째 자리에서 반올림하지만, 반환값이 double 이다.

**ceil() - 올림**

**floor() - 버림**

**예외를 발생시키는 메서드**

메서드 이름에 'Exact'가 포함된 메서드들이 JDK 1.8 부터 새로 추가되었다. 이들은 정수형간의 연산에서 발생할 수 있는 오버플로우(overflow)를 감지하기 위한 것이다.

**대표적인 Math 메소드**

Math 클래스의 메소드는 매우 다양하며, 그중에서 많이 사용되는 메소드는 다음과 같습니다.

메소드설명

| static double random() | 0.0 이상 1.0 미만의 범위에서 임의의 double형 값을 하나 생성하여 반환함. |
| --- | --- |
| static double abs(double a)   static double abs(float a)   static double abs(int a)   static double abs(long a) | 전달된 값이 음수이면 그 값의 절댓값을 반환하며, 전달된 값이 양수이면 인수를 그대로 반환함. |
| static double ceil(double a) | 전달된 double형 값의 소수 부분이 존재하면 소수 부분을 무조건 올리고 반환함. |
| static double floor(double a) | 전달된 double형 값의 소수 부분이 존재하면 소수 부분을 무조건 버리고 반환함. |
| static long round(double a)   static int round(float a) | 전달된 값을 소수점 첫째 자리에서 반올림한 정수를 반환함. |
| static double rint(double a) | 전달된 double형 값과 가장 가까운 정수값을 double형으로 반환함. |
| static double max(double a, double b)   static float max(float a, float b)   static long max(long a, long b)   static int max(int a, int b) | 전달된 두 값을 비교하여 큰 값을 반환함. |
| static double min(double a, double b)   static float min(float a, float b)   static long min(long a, long b)   static int min(int a, int b) | 전달된 두 값을 비교하여 작은 값을 반환함. |
| static double pow(double a, double b) | 전달된 두 개의 double형 값을 가지고 제곱 연산을 수행하여, ab을 반환함. |
| static double sqrt(double a) | 전달된 double형 값의 제곱근 값을 반환함. |
| static double sin(double a)   static double cos(double a)   static double tan(double a) | 전달된 double형 값에 해당하는 각각의 삼각 함숫값을 반환함. |
| static double toDegrees(double angrad) | 호도법의 라디안 값을 대략적인 육십분법의 각도 값으로 변환함. |
| static double toRaidans(double angdeg) | 육십분법의 각도 값을 대략적인 호도법의 라디안 값으로 변환함. |

**래퍼(wrapper)클래스**

때로는 기본형 변수도 어쩔 수 없이 객체로 다뤄야 하는 경우가 있다. 예를 들면, 매개변수로 객체를 요구할 때, 기본형 값이 아닌 객체로 저장해야할 때, 객체간의 비교가 필요할 때 등등의 경우에는 기본형 값들을 객체로 변환하여 작업을 수행해야 한다. 이때 사용되는 것이 래퍼(wrapper)클래스 이다.

이렇게 8개의 기본 타입에 해당하는 데이터를 객체로 포장해 주는 클래스를 래퍼 클래스(Wrapper class)라고 합니다.

래퍼 클래스는 각각의 타입에 해당하는 데이터를 인수로 전달받아, 해당 값을 가지는 객체로 만들어 줍니다.

이러한 래퍼 클래스는 모두 java.lang 패키지에 포함되어 제공됩니다.

자바의 기본 타입에 대응하여 제공하고 있는 래퍼 클래스는 다음과 같습니다.

기본 타입래퍼 클래스

| byte | Byte |
| --- | --- |
| short | Short |
| int | **Integer** |
| long | Long |
| float | Float |
| double | Double |
| char | **Character** |
| boolean | Boolean |

래퍼 클래스 중에서 Integer 클래스와 Character 클래스만이 자신의 기본 타입과 이름이 다름을 주의해야 한다.

**Number 클래스**

추상클래스로 내부적으로 숫자를 멤버변수로 갖는 래퍼 클래스들의 조상이다

|  byte | **[byteValue](http://cris.joongbu.ac.kr/course/java/api/java/lang/Number.html#byteValue())** () :지정된 수치를 byte 형으로서 리턴합니다. |
| --- | --- |
| abstract  double | **[doubleValue](http://cris.joongbu.ac.kr/course/java/api/java/lang/Number.html#doubleValue())** () : 지정된 값을 double 형으로서 리턴합니다. |
| abstract  float | **[floatValue](http://cris.joongbu.ac.kr/course/java/api/java/lang/Number.html#floatValue())** () : 지정된 수치를 float 형으로서 리턴합니다. |
| abstract  int | **[intValue](http://cris.joongbu.ac.kr/course/java/api/java/lang/Number.html#intValue())** () : 지정된 값을 int 형으로서 리턴합니다. |
| abstract  long | **[longValue](http://cris.joongbu.ac.kr/course/java/api/java/lang/Number.html#longValue())** () : 지정된 수치를 long 형으로서 리턴합니다. |
|  short | **[shortValue](http://cris.joongbu.ac.kr/course/java/api/java/lang/Number.html#shortValue())** () : 지정된 값을 short 형으로서 리턴합니다. |

**문자열을 숫자로 변환하기**

문자열을 숫자로 변환할때는 아래의 방법중 하나를 선택해서 사용하면 된다.

```
int i = new Integer("100").intValue():
int i2 = Integer.parseInt("100");
int i3 = Integer.valueOf("100");
```

jdk 1.5 부터 도입된 '오토박싱(autoboxing)'기능 때문에 반환값이 기본형일 때와 래퍼 클래스일 때의 차이가 없어졌다. 그래서 구별없이 valueOf()를 쓰는것도 괜찮은 방식이다.(성능은 valueOf()가 조금 더 느리다.)

**오토 박싱(AutoBoxing)과 오토 언박싱(AutoUnBoxing)**

JDK 1.5부터는 박싱과 언박싱이 필요한 상황에서 자바 컴파일러가 이를 자동으로 처리해 줍니다.

이렇게 자동화된 박싱과 언박싱을 오토 박싱(AutoBoxing)과 오토 언박싱(AutoUnBoxing)이라고 부릅니다.

다음 예제는 박싱과 언박싱, 오토 박싱과 오토 언박싱의 차이를 보여주는 예제입니다.

예제

```
Integer num = new Integer(17); // 박싱

int n = num.intValue();        // 언박싱

System.out.println(n);



Character ch = 'X'; // Character ch = new Character('X'); : 오토박싱

char c = ch;        // char c = ch.charValue();           : 오토언박싱

System.out.println(c);
```

실행 결과

```
17
X
```

위의 예제에서 볼 수 있듯이 래퍼 클래스인 Interger 클래스와 Character 클래스에는 각각 언박싱을 위한 intValue() 메소드와 charValue() 메소드가 포함되어 있습니다.

또한, 오토 박싱을 이용하면 new 키워드를 사용하지 않고도 자동으로 Character 인스턴스를 생성할 수 있습니다.

반대로 charValue() 메소드를 사용하지 않고도, 오토 언박싱을 이용하여 인스턴스에 저장된 값을 바로 참조할 수 있습니다.

따라서 다음 예제처럼 오토 박싱과 오토 언박싱을 통해 기본 타입과 래퍼 클래스 간의 다양한 연산도 가능해집니다.

예제

```
public class Wrapper02 {

    public static void main(String[] args) {

        Integer num1 = new Integer(7); // 박싱

        Integer num2 = new Integer(3); // 박싱



        int int1 = num1.intValue();    // 언박싱

        int int2 = num2.intValue();    // 언박싱



①      Integer result1 = num1 + num2; // 10 

②      Integer result2 = int1 - int2; // 4

③      int result3 = num1 * int2;     // 21

    }

}
```

실행 결과

```
10
4
21
```

위 예제의 ①번부터 ③번 라인까지의 연산은 내부적으로 래퍼 클래스인 피연산자를 오토언박싱하여 기본 타입끼리의 연산을 수행하고 있는 것입니다.

예제

```
public class Wrapper03 {

    public static void main(String[] args) {

        Integer num1 = new Integer(10);

        Integer num2 = new Integer(20);

        Integer num3 = new Integer(10);



        System.out.println(num1 < num2);       // true

①      System.out.println(num1 == num3);      // false

②      System.out.println(num1.equals(num3)); // true

    }

}
```

실행 결과

```
true
false
true
```

래퍼 클래스의 비교 연산도 오토언박싱을 통해 가능해지지만, 인스턴스에 저장된 값의 동등 여부 판단은 ①번 라인처럼 비교 연산자인 동등 연산자(==)를 사용해서는 안 되며, ②번 라인처럼 equals() 메소드를 사용해야만 합니다.

래퍼 클래스도 객체이므로 동등 연산자(==)를 사용하게 되면, 두 인스턴스의 값을 비교하는 것이 아니라 두 인스턴스의 주소값을 비교하게 됩니다.

따라서 서로 다른 두 인스턴스를 동등 연산자(==)로 비교하게 되면, 언제나 false 값을 반환되게 됩니다.

그러므로 인스턴스에 저장된 값의 동등 여부를 정확히 판단하려면 equals() 메소드를 사용해야만 합니다.