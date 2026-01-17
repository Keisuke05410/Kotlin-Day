# Kotlin-Day

毎日少しずつKotlinを学習するためのプロジェクトです。

## セットアップ

### 必要な環境

- Kotlin compiler
- Java 17+

### macOSでのインストール

```bash
# Kotlinのインストール
brew install kotlin

# Java 17のインストール
brew install openjdk@17

# Javaのパスを設定（必要に応じて）
sudo ln -sfn $(brew --prefix)/opt/openjdk@17/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk-17.jdk
```

### 環境確認

```bash
# Kotlinバージョン確認
kotlinc -version

# Javaバージョン確認
java -version
```

## 使い方

### 学習の流れ

1. `DayN/README.md` でトピックを学ぶ
2. `DayN/problem.md` で問題を確認
3. `DayN/starter/Main.kt` を編集して解答
4. テストで検証
5. 必要に応じて `DayN/solution/Main.kt` を参照

### コマンド

```bash
# 解答コードを実行
./run.sh Day1 starter

# テストで検証
./run.sh Day1 test

# 模範解答を確認
./run.sh Day1 solution
```

## ディレクトリ構成

```
Kotlin-Day/
├── DayN/
│   ├── README.md        # トピックの説明
│   ├── problem.md       # 問題文
│   ├── starter/
│   │   └── Main.kt      # 解答用ファイル
│   ├── solution/
│   │   └── Main.kt      # 模範解答
│   └── test/
│       └── Test.kt      # 検証テスト
├── topics_list.md       # 学習済みトピック一覧
├── problems.md          # 問題一覧
└── run.sh               # 実行スクリプト
```

## 新しいDayの作成

Claude Codeで `/lesson` コマンドを使用すると、次のDayが自動生成されます。

## 学習カテゴリ

1. **基礎構文** - 変数、型、演算子
2. **制御構文** - if/when/for/while
3. **関数** - 関数定義、ラムダ
4. **null安全** - Nullable型、エルビス演算子
5. **コレクション** - List, Set, Map
6. **クラス** - クラス、継承、インターフェース
7. **拡張関数** - 既存クラスの拡張

## 注意事項

`starter/Main.kt`はローカルでの学習用です。編集した内容はコミット・プッシュしないでください。リポジトリには常にクリーンなテンプレート状態を保持します。
