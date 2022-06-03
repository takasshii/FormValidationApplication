package com.example.formvalidationapplication.domain.use_case

import android.util.Patterns

class ValidateRepeatedPassword {
    fun execute(password: String, repeatedPassword: String): ValidationResult {
        //空白を観測
        if (password != repeatedPassword) {
            return ValidationResult(
                successful = false,
                errorMessage = "パスワードが一致しません"
            )
        }
        //正しい場合
        return ValidationResult(
            successful = true,
        )
    }
}