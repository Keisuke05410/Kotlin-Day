# 新しいDayを作成

次のDay番号とトピックを決定し、以下のファイルを作成してください。

## 手順

1. `topics_list.md`を確認し、次のDay番号を特定
2. `Claude.md`の学習カテゴリを参照し、次に学ぶべきトピックを決定
3. 以下のファイルを作成:

### 作成するファイル

```
DayN/
├── README.md        # トピックの説明
├── problem.md       # 問題文
├── starter/
│   └── Main.kt      # 解答用ファイル（TODOコメント付き）
├── solution/
│   └── Main.kt      # 模範解答
└── test/
    └── Test.kt      # 検証テスト
```

### README.md のテンプレート

```markdown
# DayN: [トピック名]

## 概要
[トピックの簡単な説明]

## 構文
[基本的な構文や使い方]

## 例
[コード例]

## ポイント
[重要なポイントや注意点]
```

### problem.md のテンプレート

```markdown
# DayN: [トピック名]

## 問題
[問題の説明]

## 要件
- [要件1]
- [要件2]

## 期待される出力
[期待される出力例]
```

### starter/Main.kt のテンプレート

```kotlin
/**
 * DayN: [トピック名]
 *
 * TODO: [やるべきことの説明]
 */

fun main() {
    // TODO: ここにコードを書いてください

}
```

### test/Test.kt のテンプレート

```kotlin
/**
 * DayN: テスト
 */

fun main() {
    var passed = 0
    var failed = 0

    // テスト1
    try {
        // テストコード
        println("✓ テスト1: [説明]")
        passed++
    } catch (e: Exception) {
        println("✗ テスト1: [説明]")
        failed++
    }

    println()
    println("結果: $passed 成功, $failed 失敗")

    if (failed > 0) {
        throw RuntimeException("テストが失敗しました")
    }
}
```

## 更新するファイル

1. `topics_list.md` に新しいトピックを追加
2. `problems.md` に問題の概要を追加

## Git操作（必須）

ファイル作成後、以下のgit操作を実行してください：

1. 作成したDayNディレクトリと更新したファイルをステージング
2. コミットメッセージ: `Add DayN: [トピック名]`
3. リモートにプッシュ

```bash
git add DayN/ topics_list.md problems.md
git commit -m "Add DayN: [トピック名]"
git push
```

**重要**: ユーザーが解答用ファイル（starter/Main.kt）を編集する前に、クリーンな状態でリモートに上げることで、編集済みファイルがリモートにプッシュされるのを防ぎます。

## 注意事項

- 前のDayで学んだ内容を活用する問題を作成
- 難易度は段階的に上げる
- テストは必ずパスできる問題を作成
- 日本語でコメントを書く
- **必ずcommit & pushまで完了させる**
