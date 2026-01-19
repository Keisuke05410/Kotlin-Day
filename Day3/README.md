# Day3: 基本データ型（Int, Double, String, Boolean）

## 概要
Kotlinには様々な基本データ型があります。今回は最もよく使う4つのデータ型を学びます。

## 基本データ型

### 数値型
| 型 | サイズ | 範囲 |
|----|-------|------|
| Int | 32ビット | -2,147,483,648 〜 2,147,483,647 |
| Long | 64ビット | より大きな整数 |
| Double | 64ビット | 小数点を含む数値 |
| Float | 32ビット | 小数点を含む数値（精度低） |

### その他の型
| 型 | 説明 | 例 |
|----|------|-----|
| String | 文字列 | "Hello" |
| Boolean | 真偽値 | true, false |
| Char | 1文字 | 'A' |

## 構文

```kotlin
// 整数
val age: Int = 25
val year = 2024  // 型推論でIntになる

// 小数
val price: Double = 19.99
val pi = 3.14159  // 型推論でDoubleになる

// 文字列
val name: String = "Kotlin"
val greeting = "Hello"  // 型推論でStringになる

// 真偽値
val isActive: Boolean = true
val hasError = false  // 型推論でBooleanになる
```

## 型変換

Kotlinでは暗黙の型変換は行われません。明示的に変換する必要があります。

```kotlin
val intValue: Int = 42
val doubleValue: Double = intValue.toDouble()  // 42.0
val stringValue: String = intValue.toString()  // "42"

val text = "123"
val number: Int = text.toInt()  // 123
```

## 例

```kotlin
fun main() {
    // 商品情報を表現する
    val productName: String = "Kotlinの本"
    val price: Double = 2980.0
    val stock: Int = 15
    val isAvailable: Boolean = stock > 0

    println("商品名: $productName")
    println("価格: ${price}円")
    println("在庫: ${stock}個")
    println("購入可能: $isAvailable")
}
```

## ポイント

1. **型推論**: 値から型を推論できるため、型宣言は省略可能
2. **明示的な型変換**: 異なる型間の変換は明示的に行う
3. **型安全**: 型の不一致はコンパイルエラーになる
4. **デフォルト型**: 整数リテラルは`Int`、小数リテラルは`Double`になる
