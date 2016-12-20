package com.example.du.annotationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.du.annotationdemo.Annotations.Age;
import com.example.du.annotationdemo.Annotations.CarInfo;
import com.example.du.annotationdemo.Annotations.Gender;
import com.example.du.annotationdemo.Annotations.Name;
import com.example.du.annotationdemo.JaveBean.People;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;


public class MainActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.textView);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parseAnnotations(People.class);
            }
        });
    }

    private void parseAnnotations(Class<?> clazz) {
        StringBuffer buffer = new StringBuffer();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field: fields) {
            Annotation[] annotations = field.getAnnotations();
            buffer.append("Field name is ").append(field.getName()).append(" and annotation length is ").append(annotations.length);
            if (field.isAnnotationPresent(Name.class)) {
                Name name = field.getAnnotation(Name.class);
                buffer.append(" name is ").append(name.value());
            } else if (field.isAnnotationPresent(Age.class)) {
                Age age = field.getAnnotation(Age.class);
                buffer.append(" age is ").append(age.value());
            } else if (field.isAnnotationPresent(Gender.class)) {
                Gender gender = field.getAnnotation(Gender.class);
                buffer.append(" gender is ").append(gender.value());
            } else if (field.isAnnotationPresent(CarInfo.class)) {
                CarInfo carInfo = field.getAnnotation(CarInfo.class);
                buffer.append(" car number is ").append(carInfo.id())
                        .append(" car brand is ").append(carInfo.brand())
                        .append(" car name is ").append(carInfo.name());
            }
            buffer.append("\n");
        }
        mTextView.setText(buffer.toString());
    }
}
