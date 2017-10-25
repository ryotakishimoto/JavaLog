package jp.techacademy.ryota.kishimoto.javalog;

import android.util.Log;

/**
 * Created by ryotakishimoto on 2017/10/25.
 */

public class Human extends Animal implements Thinkable {

    // コンストラクタ
    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    // メンバ関数
    public void say() {
        Log.d("javatest", "私の名前は" + this.name + "です。");
        Log.d("javatest", "私の年齢は" + this.age + "歳です。");
    }

    @Override
    public void think() {
        Log.d("javatest", "私は"+hobby+"について考える。");
    }
}