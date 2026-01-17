# Kotlin-Day プロジェクト

## 概要

毎日少しずつKotlinを学習するためのプロジェクトです。各Dayで1つのトピックを学び、問題を解いて理解を深めます。

## 学習カテゴリと進行順序

### 1. 基礎構文 (Day 1-5)
- Hello World、main関数
- 変数宣言（val/var）
- 基本データ型（Int, Double, String, Boolean）
- 文字列テンプレート
- 演算子

### 2. 制御構文 (Day 6-10)
- if式（式としての使用）
- when式（パターンマッチング）
- forループ（範囲、コレクション）
- whileループ
- break/continue

### 3. 関数 (Day 11-15)
- 関数定義
- 単一式関数
- デフォルト引数・名前付き引数
- ラムダ式
- 高階関数

### 4. null安全 (Day 16-20)
- Nullable型（?）
- 安全呼び出し（?.）
- エルビス演算子（?:）
- 非nullアサーション（!!）
- let関数

### 5. コレクション (Day 21-25)
- List（listOf, mutableListOf）
- Set（setOf, mutableSetOf）
- Map（mapOf, mutableMapOf）
- コレクション操作（filter, map, forEach）
- シーケンス

### 6. クラス (Day 26-32)
- クラス定義
- プロパティ
- コンストラクタ
- 継承
- インターフェース
- データクラス
- オブジェクト宣言

### 7. 拡張関数 (Day 33-35)
- 拡張関数の定義
- 拡張プロパティ
- スコープ関数（let, run, with, apply, also）

## Day構成

各Dayは以下のファイルで構成されます：

```
DayN/
├── README.md        # トピックの説明・構文・例
├── problem.md       # 問題文と要件
├── starter/
│   └── Main.kt      # 解答用ファイル（TODOコメント付き）
├── solution/
│   └── Main.kt      # 模範解答
└── test/
    └── Test.kt      # 検証テスト
```

## 実行コマンド

```bash
# 解答を実行
./run.sh DayN starter

# テストで検証
./run.sh DayN test

# 模範解答を確認
./run.sh DayN solution
```

## 新しいDayの作成

`/lesson` コマンドで次のDayを自動生成します。カテゴリと進行順序を参考に、適切なトピックを選択してください。

## ルール

1. 必ず`starter/Main.kt`を自分で編集してから解答を見る
2. テストをパスすることを目標にする
3. わからない場合は`README.md`を再読する
4. 1日1トピックを目安に進める

## Git運用ルール

**重要: ユーザーが編集した`starter/Main.kt`はコミットに含めない**

- `starter/`ディレクトリ内のファイルはユーザーの学習用であり、編集された状態でリモートにプッシュしない
- `/lesson`コマンドで新しいDayを作成した際は、クリーンな状態で即座にcommit & pushする
- これにより、リポジトリには常に未編集のテンプレート状態が保持される

### コミット対象
- 新規Day作成時: `DayN/`ディレクトリ全体（クリーンな状態）
- トピック管理: `topics_list.md`, `problems.md`

### コミット対象外
- ユーザーが編集した`starter/Main.kt`
