# Day1: Hello World

## 概要

Kotlinプログラミングの第一歩として、最も基本的な「Hello World」プログラムを作成します。Kotlinのmain関数と標準出力について学びます。

## 構文

### main関数

Kotlinプログラムのエントリーポイントは`main`関数です。

```kotlin
fun main() {
    // ここにコードを書く
}
```

### 標準出力

`println()`関数を使って文字列を出力します。

ln: line

```kotlin
println("出力したい文字列")
```

- `println()` - 改行付きで出力
- `print()` - 改行なしで出力

## 例

```kotlin
fun main() {
    println("Hello, World!")
    print("これは")
    print("改行なし")
    println("です")
}
```

出力:
```
Hello, World!
これは改行なしです
```

## ポイント

1. **fun** - 関数を定義するキーワード
2. **main** - プログラムの開始点となる特別な関数名
3. **println()** - 括弧内の内容を出力し、最後に改行
4. **文字列** - ダブルクォート(`"`)で囲む
5. Kotlinでは文末のセミコロン(`;`)は省略可能
