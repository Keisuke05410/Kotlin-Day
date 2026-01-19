/**
 * Day3: テスト
 *
 * 基本データ型の使用をテストします
 */

fun main() {
    var passed = 0
    var failed = 0

    // テスト1: String型の確認
    try {
        val studentName: String = "田中太郎"
        assert(studentName == "田中太郎") { "学生名が正しくありません" }
        println("✓ テスト1: String型（学生名）が正しく宣言されている")
        passed++
    } catch (e: Exception) {
        println("✗ テスト1: String型（学生名）の宣言に問題があります")
        failed++
    }

    // テスト2: Int型の確認
    try {
        val studentId: Int = 12345
        assert(studentId == 12345) { "学生番号が正しくありません" }
        println("✓ テスト2: Int型（学生番号）が正しく宣言されている")
        passed++
    } catch (e: Exception) {
        println("✗ テスト2: Int型（学生番号）の宣言に問題があります")
        failed++
    }

    // テスト3: Double型の確認
    try {
        val mathScore: Double = 85.5
        val englishScore: Double = 92.0
        assert(mathScore == 85.5) { "数学の点数が正しくありません" }
        assert(englishScore == 92.0) { "英語の点数が正しくありません" }
        println("✓ テスト3: Double型（点数）が正しく宣言されている")
        passed++
    } catch (e: Exception) {
        println("✗ テスト3: Double型（点数）の宣言に問題があります")
        failed++
    }

    // テスト4: 平均点の計算
    try {
        val mathScore = 85.5
        val englishScore = 92.0
        val average = (mathScore + englishScore) / 2
        assert(average == 88.75) { "平均点の計算が正しくありません: $average" }
        println("✓ テスト4: 平均点が正しく計算されている (88.75)")
        passed++
    } catch (e: Exception) {
        println("✗ テスト4: 平均点の計算に問題があります")
        failed++
    }

    // テスト5: Boolean型（合格判定）の確認
    try {
        val average = 88.75
        val isPassed: Boolean = average >= 60
        assert(isPassed == true) { "合格判定が正しくありません" }
        println("✓ テスト5: Boolean型（合格判定）が正しく宣言されている")
        passed++
    } catch (e: Exception) {
        println("✗ テスト5: Boolean型（合格判定）の宣言に問題があります")
        failed++
    }

    // テスト6: 不合格のケース
    try {
        val lowAverage = 55.0
        val shouldFail: Boolean = lowAverage >= 60
        assert(shouldFail == false) { "不合格判定が正しくありません" }
        println("✓ テスト6: 不合格判定が正しく動作している")
        passed++
    } catch (e: Exception) {
        println("✗ テスト6: 不合格判定に問題があります")
        failed++
    }

    println()
    println("結果: $passed 成功, $failed 失敗")

    if (failed > 0) {
        throw RuntimeException("テストが失敗しました")
    }
}
