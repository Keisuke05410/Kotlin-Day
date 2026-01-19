/**
 * Day3: 基本データ型（Int, Double, String, Boolean）
 *
 * 模範解答: 学生の成績情報を管理するプログラム
 */

fun main() {
    // 学生の名前を宣言（String型）
    val studentName: String = "田中太郎"

    // 学生番号を宣言（Int型）
    val studentId: Int = 12345

    // 数学の点数を宣言（Double型）
    val mathScore: Double = 85.5

    // 英語の点数を宣言（Double型）
    val englishScore: Double = 92.0

    // 平均点を計算
    val average: Double = (mathScore + englishScore) / 2

    // 合格判定（平均点が60点以上ならtrue）
    val isPassed: Boolean = average >= 60

    // 結果を出力
    println("学生名: $studentName")
    println("学生番号: $studentId")
    println("数学: ${mathScore}点")
    println("英語: ${englishScore}点")
    println("平均: ${average}点")
    println("合格判定: $isPassed")
}
