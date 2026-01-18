/**
 * Day2: テスト
 *
 * 変数宣言（val/var）の理解を確認するテスト
 */

fun main() {
    var passed = 0
    var failed = 0

    // テスト1: valの動作確認
    try {
        val testName = "テスト"
        assert(testName == "テスト") { "valで宣言した変数の値が正しくありません" }
        println("✓ テスト1: valで変数を宣言できる")
        passed++
    } catch (e: Exception) {
        println("✗ テスト1: valで変数を宣言できる - ${e.message}")
        failed++
    }

    // テスト2: varの動作確認
    try {
        var testCount = 0
        testCount = 1
        assert(testCount == 1) { "varで宣言した変数の再代入が正しくありません" }
        println("✓ テスト2: varで変数を宣言し再代入できる")
        passed++
    } catch (e: Exception) {
        println("✗ テスト2: varで変数を宣言し再代入できる - ${e.message}")
        failed++
    }

    // テスト3: 型推論の確認
    try {
        val inferredString = "Hello"
        val inferredInt = 42
        val inferredDouble = 3.14
        assert(inferredString is String) { "文字列の型推論が正しくありません" }
        assert(inferredInt is Int) { "整数の型推論が正しくありません" }
        assert(inferredDouble is Double) { "小数の型推論が正しくありません" }
        println("✓ テスト3: 型推論が正しく動作する")
        passed++
    } catch (e: Exception) {
        println("✗ テスト3: 型推論が正しく動作する - ${e.message}")
        failed++
    }

    // テスト4: 計算と変数の組み合わせ
    try {
        val birthYear = 2000
        val currentYear = 2024
        val age = currentYear - birthYear
        assert(age == 24) { "計算結果が正しくありません: expected 24, got $age" }
        println("✓ テスト4: 変数を使った計算ができる")
        passed++
    } catch (e: Exception) {
        println("✗ テスト4: 変数を使った計算ができる - ${e.message}")
        failed++
    }

    // テスト5: 文字列テンプレートの確認
    try {
        val name = "Kotlin"
        val message = "Hello, $name!"
        assert(message == "Hello, Kotlin!") { "文字列テンプレートが正しくありません" }
        println("✓ テスト5: 文字列テンプレートが使える")
        passed++
    } catch (e: Exception) {
        println("✗ テスト5: 文字列テンプレートが使える - ${e.message}")
        failed++
    }

    println()
    println("結果: $passed 成功, $failed 失敗")

    if (failed > 0) {
        throw RuntimeException("テストが失敗しました")
    }
}
