package com.example.project_2622

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class BookKidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_kid)

        //isntenace
        val btnFairy:Button=findViewById(R.id.buttonfairy)
        val btnFable:Button=findViewById(R.id.buttonfable)
        val btnScience:Button=findViewById(R.id.buttonScience)

        btnFairy.setOnClickListener{
            replaceFragment(FairyFragment())
        }
        btnFable.setOnClickListener{
            replaceFragment(FableFragment())
        }
        btnScience.setOnClickListener{
            replaceFragment(ScienceFragment())
        }
    }
    private fun replaceFragment (frg: Fragment) {
    val fragmentManager = supportFragmentManager
    val fragmentTrx = fragmentManager.beginTransaction()
    fragmentTrx.replace(R.id.fragmentKidBook, frg)
    fragmentTrx.commit()
}
}