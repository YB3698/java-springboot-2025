package com.yb83.spring01;

// interface는 implements 키워드를 사용해야함
public class Dog implements Animal {
    private String name;
    private int age;

    // 생성자
    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

<<<<<<< HEAD
    @Override // 이제부터 오버라이딩할거야 라는 뜻
    public void cry() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'cry'");
        System.out.println(this.age + "살" + this.name + "이(가) 웁니다. 멍멍!")
    }
    public void introduce() {
        System.out.println("저는 강아지에요");
=======
    @Override // 이제부터 오버라이딩할거야
    public void cry() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'cry'");
        System.out.println(this.age + "살 " + this.name + "이(가) 웁니다. 멍멍!");
    }

    @Override
    public void introduce() {
        System.out.println("저는 강아지에요.");
>>>>>>> 27b10b2f32332609b71b7614cc3868c08a5ae472
    }
}
