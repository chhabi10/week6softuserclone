package com.chhabi.week6assignment

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.chhabi.week6assignment.Fragments.AboutusFragment
import com.chhabi.week6assignment.Fragments.HomeFragment
import com.chhabi.week6assignment.Fragments.StudentFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class DashboardActivity : AppCompatActivity() {
    private lateinit var toolbar: ActionBar
    private lateinit var bottomNavigation: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

//        toolbar= supportActionBar!!
        bottomNavigation=findViewById(R.id.bottomNavigation)
        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        openFragment(HomeFragment())

    }
    private val mOnNavigationItemSelectedListener= BottomNavigationView.OnNavigationItemSelectedListener { item->
        when(item.itemId){
            R.id.navHome -> {
                val homeFragment = HomeFragment.newInstance()
                openFragment(homeFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navAddStudent -> {
                val studentFragment = StudentFragment.newInstance()
                openFragment(studentFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navAbout -> {

                val aboutFragment = AboutusFragment.newInstance()
                openFragment(aboutFragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun openFragment(fragment: Fragment) {
        val transaction=supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.commit()
    }
}