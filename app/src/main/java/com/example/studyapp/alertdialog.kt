package com.example.studyapp

import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface

class alertdialog (activity: Activity,title:String,info:String){

    init {
        val builder=AlertDialog.Builder(activity)
        builder.setMessage(info)
            .setPositiveButton("OK", DialogInterface.OnClickListener {
                    dialog, id -> dialog.cancel()
            })
        val alert=builder.create()
        alert.setTitle(title)
        alert.show()
    }

}