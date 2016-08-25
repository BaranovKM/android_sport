package com.konstantin.sport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //TODO нереализованые кнопки/поля и функции сделать серыми/задизайблеными. Сделать вью-заглушки
    //TODO прокоментировать все основные кнопки, методы, активности
//TODO сделать квадратные кнопки в 2 ряда
//TODO перенести план приложения из ОП в идею, отдельным файлом
    TrainDiary trainDiary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    Обработчик кнопок в главном меню
    Переходит на новые активности для силовых тренировок, кардио тренировок, таймер
    контроля питания и фармакологиеских препаратов
    Также бонусом можно слушать музыку и постить фотки в контакт.
    */
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonTraining:
//                Intent intent = new Intent(MainActivity.this, TrainDiary.class);
//                startActivity(intent);
                startActivity(new Intent(MainActivity.this, TrainDiary.class));

                break;
            case R.id.buttonRun:
                //TODO расписание кардио(посмотреть как прикрутить виджет с погодой)
                //о неподходящей погоде для бега можно уведомлять тостами с картинками http://developer.alexanderklimov.ru/android/toast.php
                startActivity(new Intent(MainActivity.this, CardioActivity.class));
                break;
            case R.id.buttonDiet:
                //TODO придумать как сделать расписание диеты(по возможности с календарем)
                //Toast.makeText(getApplicationContext(), "Заглушка для диеты", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, DietActivity.class));
                break;
            case R.id.buttonPharm:
                //TODO прием витаминок и т.д.
                break;
            //расписание кардио-тренировок
            case R.id.buttonTimer:
                //TODO посмотреть запуск таймера, по возможности фиксировать в тренировках/кардио
                break;
            case R.id.buttonPhoto:
                //TODO посмотреть как делать фото(в будущем, возможность постить их на стену в контакте/инстаграме)
                break;
            case R.id.buttonMusic:
                //TODO проигрывание музыки
                break;
            case R.id.buttonSettings:
                //TODO придумать какие можно сделать настройки(смена языка, темы оформленияб переключения вариантов верстки)
                break;
        }
    }
}
