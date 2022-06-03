package com.example.formvalidationapplication.domain.use_case

import android.util.Patterns

class ValidateTerms {
    fun execute(acceptedTerms: Boolean): ValidationResult {
        //空白を観測
        if (!acceptedTerms) {
            return ValidationResult(
                successful = false,
                errorMessage = "同意が必要です"
            )
        }
        //正しい場合
        return ValidationResult(
            successful = true,
        )
    }
}