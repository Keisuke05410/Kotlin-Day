/**
 * Day2: 変数宣言（val/var）
 *
 * 模範解答
 */

fun main() {
    // valを使って名前を宣言（再代入不可）
    val name = "太郎"

    // valを使って生まれた年を宣言
    val birthYear = 2000

    // varを使って趣味を宣言（再代入可能）
    var hobby = "プログラミング"

    // hobbyの値を変更
    hobby = "Kotlin学習"

    // 年齢を計算
    val age = 2024 - birthYear

    // 結果を出力
    println("名前: $name")
    println("年齢: ${age}歳")
    println("趣味: $hobby")
}
