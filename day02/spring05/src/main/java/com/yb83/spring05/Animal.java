package com.yb83.spring05;

// 부모클래스 동물

public class Animal { //public은 어디서든지 불러서 사용 가능함(접근제한 없음)
    // String name; // 앞에 아무것도 없으면 default임. 같은 패키지에서만 사용 가능
    // public String name; // public
    private String name; // private는 외부에서 접근 불가
    // protected String name;  // protected는 같은 패키지에서만 사용 가능(잘 안씀)
    private int age; // 동물의 나이

    public int getAge() {
        return age;
    }

    // 정확한 캡슐화를 위해서 필터링
    public void setAge(int age) {
        // 음수나 너무 큰 수가 들어가지 않도록 막아줌
        if (age <= 0) {
            this.age = 1; // 음수막기
        } else if (age > 20) {
            this.age = 20; // 너무 큰 수 막기
        } else {
            this.age = age;
        }
    }

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }

    void cry() {
        System.out.println(this.name + "이 웁니다.");
    }
}