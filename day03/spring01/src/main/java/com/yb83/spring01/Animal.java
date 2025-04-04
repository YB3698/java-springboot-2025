package com.yb83.spring01;

<<<<<<< HEAD
public interface Animal{
    // public String name = "이름"
    // public int age = 1;

    void cry(); // 추상메서드. 내부 구현이 없음

    // 메서드 구현이 들어갈 수 있음. 예외적 사용
    public default
    
}
=======
public interface Animal {
    // public String name = "이름";
    // public int age = 1;

    void cry();  // 추상메서드. 내부구현이 없음

    // 메서드 구현이 들어갈 수 있음. 예외적 사용
    public default void introduce() {
        System.out.println("저는 동물이에요.");
    }
}
>>>>>>> 27b10b2f32332609b71b7614cc3868c08a5ae472
