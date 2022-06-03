package com.example.formvalidationapplication.domain.use_case

import android.util.Patterns

class ValidatePassword {
    fun execute(password: String): ValidationResult {
        //空白を観測
        if (password.length < 8) {
            return ValidationResult(
                successful = false,
                errorMessage = "8文字以上で入力してください"
            )
        }
        //数字と文字が入っているかを判別
        //any: {数字かどうかを判別}
        val containLettersAndDigits = password.any { it.isDigit() } && password.any { it.isLetter() }
        //Emailの型になっているか
        if (!containLettersAndDigits) {
            return ValidationResult(
                successful = false,
                errorMessage = "数字と文字を両方含んでください",
            )
        }
        //正しい場合
        return ValidationResult(
            successful = true,
        )
    }
}