package jp.techacademy.ryota.kishimoto.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("キシモト", 32, "サッカー");     // Humanのインスタンスを作る

        human.say();  // Humanクラスのsayメソッドを使う
        human.think(); //インターフェイスのthinkメソッドを使う
    }

}
