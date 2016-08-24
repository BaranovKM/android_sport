package com.konstantin.sport;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by Константин on 23.08.2016.
 */


//TODO при создании новой тренировки показывать пользователю  тост для подтверждения
        //Toast.makeText(getApplicationContext(), "Заглушка", Toast.LENGTH_SHORT).show();
    /*
    Расписание тренировок, контроль выполненых упражнение и ведение статистики
     */
public class TrainDiary extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.train_activity_layout);

    }

    public void showDiary() {

    }
    //TODO придумать как составлять и чекать тренировки
    //сохранять в бд записи о тренировках
}
