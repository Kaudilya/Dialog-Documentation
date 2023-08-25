package com.example.dialogdocumentation

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var textElement:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        print("This is new stuff in 2nd commit.")
//        "5th commit reverting test"
        print("Currently in branch2 after merging - 2")
        print("In the branch2 after merging everything.")

        textElement = findViewById<TextView>(R.id.textElement)

        textElement.setOnClickListener{
            displayDialog()
        }

    }

    private fun displayDialog() {
        val contents = arrayOf("hello","hello2","hello3")
        val builder = AlertDialog.Builder(this)
        lateinit var value:String
        var selectedItems = ArrayList<String>()

//        getting view for layout
//        val inflater = layoutInflater
        val view = layoutInflater.inflate(R.layout.new_layout,null)
        builder.apply {
//            setTitle("Title")
            setTitle("LogIn")
            setView(view)
//            setMessage("Hello")
//Single Choice Items:
//            setItems(contents,DialogInterface.OnClickListener{ dialog,id ->
//                Toast.makeText(this@MainActivity,"User Clicked ${contents[id]}",Toast.LENGTH_SHORT).show()
////                Toast.makeText(this@MainActivity,"User Clicked $id",Toast.LENGTH_SHORT).show()
//            })
//Persistent Single Choice Items:
//            setSingleChoiceItems(contents,0,DialogInterface.OnClickListener{ dialog,id ->
//                value = contents[id]
//                Toast.makeText(this@MainActivity,"User Clicked ${contents[id]}",Toast.LENGTH_SHORT).show()
////                Toast.makeText(this@MainActivity,"User Clicked $id",Toast.LENGTH_SHORT).show()
//            })
//Persistent Multi Choice Items:
//            setMultiChoiceItems(contents,null,
//                DialogInterface.OnMultiChoiceClickListener{ dialog,id,isChecked ->
//                    if(isChecked){
//                        Toast.makeText(this@MainActivity,"User clicked $id - ${contents[id]}",Toast.LENGTH_SHORT).show()
//                        selectedItems.add("${contents[id]}")
//                    }else if(selectedItems.contains("${contents[id]}")){
//                        Toast.makeText(this@MainActivity,"User removed $id - ${contents[id]}",Toast.LENGTH_SHORT).show()
//                        selectedItems.remove("${contents[id]}")
//                    }
//            })
            setPositiveButton("ok") { dialog, id ->
//                Toast.makeText(this@MainActivity,"User okayed $selectedItems",Toast.LENGTH_SHORT).show()
                var usr = view.findViewById<EditText>(R.id.editUsername)
                var pwd = view.findViewById<EditText>(R.id.editPassword)
                Toast.makeText(this@MainActivity,"Username - ${usr.text} Password - ${pwd.text}",Toast.LENGTH_SHORT).show()
            }
            setNegativeButton("cancel") { _, _ ->
                Toast.makeText(this@MainActivity, "User clicked CANCEL", Toast.LENGTH_SHORT).show()
            }
            create()
        }

        builder.show()
    }
}