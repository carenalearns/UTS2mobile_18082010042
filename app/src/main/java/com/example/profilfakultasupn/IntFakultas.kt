package com.example.profilfakultasupn

import android.content.Intent
import android.net.Uri
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
            var webf = intentThatStartedThisActivity.getStringExtra((Intent.ACTION_PICK))
            var emailf = intentThatStartedThisActivity.getStringExtra((Intent.ACTION_CALL))

            imgpf.setImageResource(imgf)
            namapf.text = namaf
            deskripsipf.text = desf
            prodipf.text = prof
            webpf.setOnClickListener { openwebsite(webf) }
            emailpf.setOnClickListener { sendemail(emailf) }
        }
    }
        private fun openwebsite(url:String?) {
            val showWebActivity = Intent(this, webfakultas::class.java)
            showWebActivity.putExtra(Intent.ACTION_VIEW, url)
            startActivity(showWebActivity)
        }
        private fun sendemail(emailf: String?) {
        val mailIntent = Intent(Intent.ACTION_SEND)
        mailIntent.data = Uri.parse("mail:")
        mailIntent.type = "text/plain"

        mailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf(emailf))
        startActivity(Intent.createChooser(mailIntent, "Select Client"))
    }



}