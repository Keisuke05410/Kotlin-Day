/**
 * Day2: テスト
 *
 * 変数宣言（val/var）の理解を確認するテスト
 */

fun main() {
    var passed = 0
    var failed = 0

    println("=== Day2: 変数宣言（val/var） テスト ===")
    println()

    // テスト1: valの基本動作確認
    try {
        val testName = "テスト"
        assert(testName == "テスト") { "valで宣言した変数の値が正しくありません" }
        println("✓ テスト1: valで変数を宣言できる")
        passed++
    } catch (e: Exception) {
        println("✗ テスト1: valで変数を宣言できる - ${e.message}")
        failed++
    }

    // テスト2: varの再代入確認
    try {
        var testHobby = "プログラミング"
        testHobby = "Kotlin学習"
        assert(testHobby == "Kotlin学習") { "varで宣言した変数の再代入が正しくありません" }
        println("✓ テスト2: varで変数を宣言し再代入できる")
        passed++
    } catch (e: Exception) {
        println("✗ テスト2: varで変数を宣言し再代入できる - ${e.message}")
        failed++
    }

    // テスト3: 年齢計算の確認
    try {
        val birthYear = 2000
        val currentYear = 2024
        val age = currentYear - birthYear
        assert(age == 24) { "計算結果が正しくありません: expected 24, got $age" }
        println("✓ テスト3: 変数を使った年齢計算ができる")
        passed++
    } catch (e: Exception) {
        println("✗ テスト3: 変数を使った年齢計算ができる - ${e.message}")
        failed++
    }

    // テスト4: 文字列テンプレートの確認
    try {
        val name = "太郎"
        val message = "名前: $name"
        assert(message == "名前: 太郎") { "文字列テンプレートが正しくありません" }
        println("✓ テスト4: 文字列テンプレートが使える")
        passed++
    } catch (e: Exception) {
        println("✗ テスト4: 文字列テンプレートが使える - ${e.message}")
        failed++
    }

    println()
    println("結果: $passed 成功, $failed 失敗")
    println()
    println("=== あなたの実装を確認 ===")
    println("テスト方法: ./run.sh Day2 starter を実行して出力を確認してください")
    println()
    println("期待される出力形式:")
    println("  名前: [あなたの名前]")
    println("  年齢: [計算された年齢]歳")
    println("  趣味: Kotlin学習")
    println()
    println("確認ポイント:")
    println("  - 趣味が「Kotlin学習」になっているか（varで再代入）")
    println("  - 年齢が正しく計算されているか（2024 - 生まれた年）")

    if (failed > 0) {
        throw RuntimeException("テストが失敗しました")
    }
}
