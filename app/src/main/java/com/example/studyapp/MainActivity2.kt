package com.example.studyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    lateinit var rvkotlin:RecyclerView
    lateinit var intent1:Intent
    lateinit var intent2:Intent
    lateinit var subjects:ArrayList<ArrayList<String>>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        this.setTitle("Kotlin Review")

        intent1= Intent(this,MainActivity3::class.java)
        intent2= Intent(this,MainActivity::class.java)

        subjects= arrayListOf(arrayListOf("fun main(){}","execute starting point","write any thing you want to execute inside main function"),
                              arrayListOf("console","print()","print to console"),
                              arrayListOf("variable declaration","using val/var"," val:declare variable with immutable value.\n" +
                                      " var: declare variable with mutable value."),
                              arrayListOf("getting user input","readline()"," use readline()!! to assure Kotlin that the user would enter something when prompted."),
                              arrayListOf("string"," use $/+","string concatenation : +\n" +
                                      "  string Interpolation : +"),
                              arrayListOf("datatype","string/int/float/boolean","*val/var variablename:datatype.\n" +
                                      "*assign value to variable."),
                              arrayListOf("if statements","We use if statements to guide our program in the right direction"," if(condition){instructions}else{instructions}"),
                              arrayListOf("try-cach"," make sure that our program does not crash even if the user does not follow our directions."," try{instructions}cach(e: Exception){write the exception}"),
                              arrayListOf("for loop","used when you need something to happen multiple times","for (variable in star .. end ){instructions}"),
                              arrayListOf("while loop","when you need something to happen multiple times","while(condation) {instructions}")
        )

        rvkotlin=findViewById(R.id.rvkotlin)
        rvkotlin.adapter=myAdapter(subjects,this)
        rvkotlin.layoutManager=LinearLayoutManager(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }
    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        val item: MenuItem =menu!!.getItem(0)
        item.title="Android Review"
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