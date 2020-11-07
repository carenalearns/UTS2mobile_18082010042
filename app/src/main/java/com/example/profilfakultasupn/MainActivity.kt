package com.example.profilfakultasupn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createFac()
        listFakultas.layoutManager = LinearLayoutManager(this)
        listFakultas.setHasFixedSize(true)
        listFakultas.adapter = Adapter (data,{onItem: Users -> onItemClicked(onItem)})
    }
    private fun onItemClicked(onItem: Users) {
        val showDetailActivityIntent = Intent(this, IntFakultas::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.imgf)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.namaf)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.desf)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, onItem.prof)
        showDetailActivityIntent.putExtra(Intent.ACTION_PICK, onItem.webf)
        showDetailActivityIntent.putExtra(Intent.ACTION_CALL, onItem.emailf)
        startActivity(showDetailActivityIntent)
    }
    private fun createFac(): List<Users> {
        val rvList = ArrayList<Users>()
        rvList.add(
            Users(
                R.drawable.fik,
                "Fakultas Ilmu Komputer",
                "Fakultas Ilmu Komputer adalah satu dari dari 7 fakultas di UPN Veteran Jawa Timur. Yang terdiri dari program studi :",
                "1. Teknik Informatika\n2. Sistem Informasi\n3. Data Sains\n\nDAFTAR WEBSITE :",
                "https://fik.upnjatim.ac.id/",
                "tu.fik@upnjatim.ac.id"
            )
        )
        rvList.add(
            Users(
                R.drawable.ft,
                "Fakultas Teknik",
                "Fakultas Teknik adalah satu dari dari 7 fakultas di UPN Veteran Jawa Timur. Yang terdiri dari program studi :",
                "1. Teknik Kimia\n2. Teknik Industri\n3. Teknik Sipil\n4. Teknik Lingkungan\n5. Teknologi Pangan\n" +
                        "\nDAFTAR WEBSITE :",
                "http://ft.upnjatim.ac.id/",
                "ft@upnjatim.ac.id"
            )
        )
        rvList.add(
            Users(
                R.drawable.feb,
                "Fakultas Ekonomi dan Bisnis",
                "Fakultas Teknik adalah satu dari dari 7 fakultas di UPN Veteran Jawa Timur. Yang terdiri dari program studi :",
                "1. Ekonomi Pembangunan\n2. Akuntasi\n3. Manajemen\n\nDAFTAR WEBSITE :",
                "http://febis.upnjatim.ac.id/",
                "feb@upnjatim.ac.id"
            )
        )
        rvList.add(
            Users(
                R.drawable.fp,
                "Fakultas Pertanian",
                "Fakultas Pertanian adalah satu dari dari 7 fakultas di UPN Veteran Jawa Timur. Yang terdiri dari program studi :",
                "1. Agroteknologi\n2. Agribisnis\n\nDAFTAR WEBSITE :",
                "http://faperta.upnjatim.ac.id/",
                "faperta@upnjatim.ac.id"
            )
        )
        rvList.add(
            Users(
                R.drawable.fisip,
                "Fakultas Ilmu Sosial dan Politik",
                "Fakultas Fakultas Ilmu Sosial dan Politik adalah satu dari dari 7 fakultas di UPN Veteran Jawa Timur. Yang terdiri dari program studi :",
                "1. Ilmu Komunikasi\n2. Ilmu Administrasi Bisnis\n3. Ilmu Administrasi Negara\n4. Hubungan Internasional\n\nDAFTAR WEBSITE :",
                "http://fisip.upnjatim.ac.id/",
                "fisip@upnjatim.ac.id"
            )
        )
        rvList.add(
            Users(
                R.drawable.fad,
                "Fakultas Arsitektur dan Desain",
                "Fakultas Arsitektur dan Desain adalah satu dari dari 7 fakultas di UPN Veteran Jawa Timur. Yang terdiri dari program studi :",
                "1. Teknik Arsitektur\n2.Desain Komunikasi Visual\n\nDAFTAR WEBSITE :",
                "http://fad.upnjatim.ac.id/",
                "fad@upnjatim.ac.id"
            )
        )
        rvList.add(
            Users(
                R.drawable.hukum,
                "Fakultas Hukum",
                "Fakultas Hukum adalah satu dari dari 7 fakultas di UPN Veteran Jawa Timur. Yang terdiri dari program studi :",
                "1. Ilmu Hukum",
                "http://fhukum.upnjatim.ac.id/",
                "fhukum@upnjatim.ac.id"
            )
        )
        rvList.add(
            Users(
                R.drawable.fotodiri,
                "Profil Carena",
                "Nama\t: Carena Learns Prasetyo\n"+
                        "TTL\t\t\t: Surabaya, 00 Feb \n"+
                        "Alamat\t: Surabaya\n"+
                        "No. HP\t: 08123456789\n"+
                        "Email\t\t\t: carenalearns24@gmail.com\n"+
                        "URL Github : https://github.com/carenalearns",
                "Riwayat Pendidikan :\n1. SDN Surabaya\n2. SMPN Surabaya\n3. SMAN Surabaya\n4. S1 UPN\n"+
                        "\nPenghargaan:\n1. Duta Sanitasi Provinsi Jatim 2014\n2. Ranking 1 Pararel IPA",
                "https://github.com/carenalearns",
                "18082010042@student.upnjatim.ac.id"
            )
        )
        return rvList
    }
}