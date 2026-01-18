# Day2: 変数宣言（val/var）

## 概要
Kotlinでは変数を宣言するために`val`と`var`の2つのキーワードを使用します。これらは変数の再代入可能性を明確に示し、コードの安全性と可読性を高めます。

## 構文

### val（イミュータブル変数）
```kotlin
val 変数名: 型 = 値
val 変数名 = 値  // 型推論
```
- 一度値を代入すると**再代入できない**
- Javaの`final`変数に相当
- 基本的にはこちらを使用することが推奨される

### var（ミュータブル変数）
```kotlin
var 変数名: 型 = 値
var 変数名 = 値  // 型推論
```
- 後から**再代入可能**
- 値を変更する必要がある場合にのみ使用

## 例

```kotlin
fun main() {
    // val: 再代入不可
    val name = "Kotlin"
    // name = "Java"  // エラー！再代入できない

    // var: 再代入可能
    var count = 0
    count = 1  // OK
    count = 2  // OK

    // 型を明示的に指定
    val message: String = "Hello"
    var number: Int = 42

    println(name)     // Kotlin
    println(count)    // 2
    println(message)  // Hello
    println(number)   // 42
}
```

## ポイント

1. **valを優先して使う**: 変更が不要な変数は`val`で宣言する。これによりバグを防ぎ、コードの意図が明確になる。

2. **型推論**: Kotlinは賢い型推論を持っているため、初期値から型を推測できる場合は型の明示は不要。

3. **valは参照の不変性**: `val`で宣言したオブジェクトの参照は変更できないが、オブジェクトの中身は変更可能な場合がある（コレクション等）。

4. **命名規則**: 変数名はキャメルケース（camelCase）を使用する。
   ```kotlin
   val userName = "Alice"
   var itemCount = 10
   ```
