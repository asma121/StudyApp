package com.example.studyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity3 : AppCompatActivity() {
    lateinit var rvandroid:RecyclerView
    lateinit var intent1: Intent
    lateinit var intent2: Intent
    lateinit var subjects:ArrayList<ArrayList<String>>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        this.setTitle("Android Review")

        intent1= Intent(this,MainActivity2::class.java)
        intent2= Intent(this,MainActivity::class.java)

        subjects= arrayListOf(arrayListOf("Using the Console","Log.d(tag:activity name,message/variable)",""),
            arrayListOf("project app","each android studio project has app folder","it contains : manifests file/java file/res file"),
            arrayListOf("manifests file","manifest.xml","to get functionality from user's phone" ),
            arrayListOf("java file","filename.kt","for code it has oncreate method --> starting point of the project "),
            arrayListOf("res file","filename.xml","for desgin"),
            arrayListOf("Design View and XML","Android Studio allows us to design our application with its intuitive drag and drop features ."," or by making change to the xml code"),
            arrayListOf("UI Elements","every element in layout it is a UI element","has many attributes,and a unique id"),
            arrayListOf("Initializing UI Elements","var elementname=findviewbyid<elementtype>(R.id.elementid) ","elementname.anyatrribute")
        )


        rvandroid=findViewById(R.id.rvandroid)
        rvandroid.adapter=myAdapter(subjects,this)
        rvandroid.layoutManager= LinearLayoutManager(this)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }
    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        val item: MenuItem =menu!!.getItem(0)
        item.title="Kotlin Review"
        val item1: MenuItem =menu!!.getItem(1)
        item1.title="Main Page"
        return super.onPrepareOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item1 -> {
                startActivity(intent1)
                return true
            }
            R.id.item2 -> {
                startActivity(intent2)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}