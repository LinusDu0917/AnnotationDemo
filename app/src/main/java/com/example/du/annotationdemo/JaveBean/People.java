package com.example.du.annotationdemo.JaveBean;

import com.example.du.annotationdemo.Annotations.Age;
import com.example.du.annotationdemo.Annotations.CarInfo;
import com.example.du.annotationdemo.Annotations.Gender;
import com.example.du.annotationdemo.Annotations.Name;

/**
 * Created by linus.du on 12/20/16.
 */

public class People {

    @Age(30)
    public int age;
    @Name("Linus")
    public String name;
    @Gender(Gender.GenderType.MALE)
    public String gender;
    @CarInfo(id = 9527, brand = "bmw", name = "baoma")
    public String carInfo;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }
}
