## **컬렉션 프레임워크(Collection Framework)**

컬렉션 프레임 워크에는 여러 인터페이스와 클래스가 았다. 각 인터페이스와 클래스의 특징을 알아보자.

<img src = "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FcNpv83%2FbtrsaS1Yzvv%2F0lCaBmb40dIAKb8r12U021%2Fimg.png">

List, Set, Map 인터페이스가 중요하다.

각 인터페이스는 다음과 같은 특징을 가지고 있다.

| **인터페이스** | **특징** |
| --- | --- |
| **List** | **순서가 있는** 데이터 집합으로 **데이터 중복을 허용**한다. |
| 구현 클래스 : ArrayList, LinkedList, Stack, Vector 등 |
| **Set** | **순서가 없는** 데이터 집합으로 **데이터 중복을 허용하지 않는다**. |
| 구현 클래스 : HashSet, TreeSet 등 |
| **Map** | **<key, value>** 쌍으로 이루어진 데이터 집합으로 **순서가 없음**   **키는 중복될 수 없고 값은 중복 가능**하다. |
| 구현 클래스 : HashMap, TreeMap, Hashtable, Properties 등 |

위의 클래스에는 레퍼런스 타입의 데이터 객체만 저장할 수 있다. 기본 자료형을 저장하려면 wrapper클래스를 이용해야 한다.

List, Set, Map 인터페이스 모두 Collection 인터페이스를 상속받고 있다. 따라서 Collection 인터페이스에 어떤 메소드들이 있는지 잘 알아두어야 한다.

\[Collection 인터페이스의 주요 메소드\]

| **메소드** | **설명** |
| --- | --- |
| boolean add(E e)   boolean addAll(Collection<? extends E> c) | Collection에 객체를 추가함 |
| void clear() | Collection에 저장된 모든 객체를 삭제함. |
| boolean contains(Object o)   boolean containsAll(Collection<?> c) | Collection에 객체 또는 다른 Collection이 포함되어 있는지 판단함 |
| Iterator<E> iterator() | Collection을 순환할 반복자(iterator)를 반환함 |
| boolean remove(Object o)   boolean removeAll(Collection<?> c) | Collection에서 객체를 삭제함 |
| int size() | Collection에 포함된 원소의 개수를 반환함 |

## **List  인터페이스**

List 인터페이스는 객체가 저장되는 순서가 있고 중복된 데이터를 가질 수 있도록 허용한다.

List 인터페스를 구현한 주요 하위 클래스는 ArrayList, Vector, LinkedList 등이 있다.

**ArrayList**

어레이리스트는 컬렉션프레임웍에서 가장 많이 사용되는 컬랙션 클래스일 것이다.

ArrayList는 List인터페이스를 구현하기 때문에 데이터의 저장순서가 유지되고 중복을 허용한다는 특징을 갖는다.

ArrayList는 Object 배열을 이용해서 데이터를 순차적으로 저장한다. 배열과 같은 구조를 갖고 있지만 훨씬 융통성있게 활용이 가능하다. 배열은 생성할 때 배열의 크기를 분명히 주어야 하지만 그 단점을 보완 했다.

예를 들면, 첫번째로 저장한 객체는 Object배열에 0번째 위치에 저장되고 그다음 1번 이런식으로 배열에 순서대로 저장되며, 배열에 더 이상 저장할 공간이 없으면 보다 큰 새로운 배열을 생성해서 기존에 배열에 저장된 내용을 새로운 배열로 복사한 다음 저장된다.

ArrayList에는 객체만 넣을 수 있다.

즉, 변경 가능한 배열로 데이터를 얼마든지 저장할 수 있다.

```
import java.util.ArrayList;

public class Code233 {
    public static void main(String[] args) {

        ArrayList<String> number = new ArrayList<String>();
        number.add("one");
        number.add("two");
        number.add("three");
        number.add("four");

        for (int i = 0; i < number.size(); i++){
            System.out.println(number.get(i));
        }
    }
}
```

출력결과

```
one
two
three
four
```

코드에서 for 반복문을 for-each문으로 사용해도 된다.

```
for (String x : number)
      System.out.println(x);
```

그러나 배열처럼 루프를 수행할 수는 없다

```
//에러 
for (int i = 0; i < number.size(); i++){
      System.out.println(number[i]);
```

그럼 이번에는

ArrayList에 저장한 데이터를 변경하거나 삭제하는 예제를 보겠다.

<코드>

```
import java.util.ArrayList;

public class Code234 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("C");
        list.add("java");
        list.add("HTML5");
        list.add(1, "C++");
        list.set(0, "Fortran");
        list.remove(2);
        list.remove("C++");

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
```

출력 결과

```
Fortran
HTML5
```

<img src = "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbqSUUV%2Fbtrr7q6CgPL%2F1zXPBOMgCDG6y7P8070kbk%2Fimg.png">

이런식으로 연산이 수행 된다.

ArrayList에 루프를 수행하는 다른 방법이 있다. 다음과 같이 이터레이터를 이용하여 자동으로 반복이 수행되게 하는 방법이다.

<코드>

```
import java.util.ArrayList;
import java.util.Iterator;

public class Code235 {
    public static void main(String[] args) {
        ArrayList<Integer> list = list = new ArrayList<Integer>();
        list.add(100);
        list.add(200);  
        list.add(50);
        list.add(1,55);
        list.add(3,77);

        Iterator<Integer> iter = list.iterator(); //iterator(반복자) 생성
        while (iter.hasNext()){
            Integer t = iter.next();
            System.out.println(t);
        }
    }
}
```

아래의 연산처럼 수행되는 방식이다.

<img src = "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FIhRU6%2FbtrsaSn3e4q%2FfmQPa0Tt95S7MFBzIaXyJ1%2Fimg.png">

**LinkedList**

LinkedList 는 배열이나 ArrayList와는 약간 다르다. 데이터의 순서가 있고 중복된 데이터를 저장해야하는 점은 같지만 내부 구성이 약간다르다.

<링크드 리스트 구현 코드>

```
import java.util.Iterator;
import java.util.LinkedList;

public class Code236 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("red");
        list.add("blue");
        list.add("purple");
        list.add("yellow");
        list.add("green");

        for (String s : list)
            System.out.println(s);

        System.out.println("-------------------------");

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()){
            String t = iter.next();
            System.out.println(t);
        }
    }
}
```

코드 출력 결과

```
red
blue
purple
yellow
green
-------------------------
red
blue
purple
yellow
green
```