package com.example.formvalidationapplication.domain.use_case

import android.util.Patterns

class ValidateEmail {
    fun execute(email: String): ValidationResult {
        //空白を観測
        if (email.isBlank()) {
            return ValidationResult(
                successful = false,
                errorMessage = "何も入力されていません。"
            )
        }
        //Emailの型になっているか
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return ValidationResult(
                successful = false,
                errorMessage = "正しいemailを入力してください",
            )
        }
        //正しい場合
        return ValidationResult(
            successful = true,
        )
    }
}