#!/bin/bash

# Kotlin-Day 実行スクリプト
# 使い方: ./run.sh Day1 starter|solution|test

set -e

DAY=$1
MODE=$2

if [ -z "$DAY" ] || [ -z "$MODE" ]; then
    echo "使い方: ./run.sh <Day番号> <モード>"
    echo "  モード: starter  - 解答コードを実行"
    echo "          solution - 模範解答を実行"
    echo "          test     - テストを実行"
    echo ""
    echo "例: ./run.sh Day1 starter"
    exit 1
fi

if [ ! -d "$DAY" ]; then
    echo "エラー: $DAY ディレクトリが見つかりません"
    exit 1
fi

case $MODE in
    starter)
        echo "=== $DAY の解答コードを実行 ==="
        cd "$DAY/starter"
        kotlinc *.kt -include-runtime -d main.jar
        java -jar main.jar
        rm -f main.jar
        ;;
    solution)
        echo "=== $DAY の模範解答を実行 ==="
        cd "$DAY/solution"
        kotlinc *.kt -include-runtime -d main.jar
        java -jar main.jar
        rm -f main.jar
        ;;
    test)
        echo "=== $DAY のテストを実行 ==="
        cd "$DAY"

        # starterのコードをコンパイル
        echo "コンパイル中..."
        kotlinc starter/*.kt -include-runtime -d starter.jar

        # テストを実行
        echo "テスト実行中..."
        cd test
        kotlinc -cp ../starter.jar *.kt -include-runtime -d test.jar
        java -jar test.jar

        # クリーンアップ
        rm -f test.jar ../starter.jar
        echo ""
        ;;
    *)
        echo "エラー: 不明なモード '$MODE'"
        echo "使用可能なモード: starter, solution, test"
        exit 1
        ;;
esac
