package com.ismailmesutmujde.kotlintoolbaraddingmenu

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlintoolbaraddingmenu.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var bindingMain : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        val view = bindingMain.root
        setContentView(view)

        bindingMain.toolbar.title = "Toolbar Menu"
        setSupportActionBar(bindingMain.toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId) {
            R.id.action_info -> {
                Toast.makeText(applicationContext, "Info was clicked", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_add -> {
                Toast.makeText(applicationContext, "Add was clicked", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_update -> {
                Toast.makeText(applicationContext, "Update was clicked", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_delete -> {
                Toast.makeText(applicationContext, "Delete was clicked", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_settings -> {
                Toast.makeText(applicationContext, "Settings was clicked", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_logout -> {
                Toast.makeText(applicationContext, "Log Out was clicked", Toast.LENGTH_SHORT).show()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}