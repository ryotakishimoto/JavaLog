package jp.techacademy.ryota.kishimoto.javalog;

/**
 * Created by ryotakishimoto on 2017/10/25.
 */

abstract class Animal {
    // メンバ変数
    String name;  // 名前
    int age;    // 年齢
    String hobby; //趣味

    abstract public void say();
}