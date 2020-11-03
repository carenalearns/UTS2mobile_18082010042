package com.example.profilfakultasupn

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.profilfakultas.*

class IntFakultas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profilfakultas)
        var intentThatStartedThisActivity = getIntent()
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var imgf = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT, 0)
            var namaf = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            var desf = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            var prof = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SUBJECT)

            imgpf.setImageResource(imgf)
            namapf.text = namaf
            deskripsipf.text = desf
            prodipf.text = prof
        }
    }
}