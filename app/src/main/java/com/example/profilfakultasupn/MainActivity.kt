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
        startActivity(showDetailActivityIntent)
    }
    private fun createFac(): List<Users> {
        val rvList = ArrayList<Users>()
        rvList.add(
            Users(
                R.drawable.logo,
                "Fakultas Ilmu Komputer",
                "Fakultas Ilmu Komputer adalah satu dari dari 7 fakultas di UPN Veteran Jawa Timur. Yang terdiri dari program studi :",
                "1. Teknik Informatika\n2. Sistem Informasi"
            )
        )
        rvList.add(
            Users(
                R.drawable.logo,
                "Fakultas Teknik",
                "Fakultas Teknik adalah satu dari dari 7 fakultas di UPN Veteran Jawa Timur. Yang terdiri dari program studi :",
                "1. Teknik Kimia\n2. Teknik Industri\n3. Teknik Sipil\n4. Teknik Lingkungan\n5. Teknologi Pangan"
            )
        )
        rvList.add(
            Users(
                R.drawable.logo,
                "Fakultas Ekonomi dan Bisnis",
                "Fakultas Teknik adalah satu dari dari 7 fakultas di UPN Veteran Jawa Timur. Yang terdiri dari program studi :",
                "1. Ekonomi Pembangunan\n2. Akuntasi\n3. Manajemen"
            )
        )
        rvList.add(
            Users(
                R.drawable.logo,
                "Fakultas Pertanian",
                "Fakultas Pertanian adalah satu dari dari 7 fakultas di UPN Veteran Jawa Timur. Yang terdiri dari program studi :",
                "1. Agroteknologi\n2. Agribisnis"
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
                        "\nPenghargaan:\n1. Duta Sanitasi Provinsi Jatim 2014\n2. Ranking 1 Pararel IPA"
            )
        )
        return rvList
    }
}