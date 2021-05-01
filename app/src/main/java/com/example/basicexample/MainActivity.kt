package com.example.basicexample

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.tensorflow.lite.Interpreter
import java.io.FileInputStream
import java.io.IOException
import java.nio.MappedByteBuffer
import java.nio.channels.FileChannel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val result: TextView = findViewById(R.id.textView)
        val editText: EditText = findViewById(R.id.editText)
        val run: Button = findViewById(R.id.button)

        run.setOnClickListener {
        }
    }
    
//    @Throws(IOException::class)
//    private fun loadModelFile(): MappedByteBuffer? {
//        val assetFileDescriptor = this.assets.openFd("linear.tflite")
//        val fileInputStream =
//            FileInputStream(assetFileDescriptor.fileDescriptor)
//        val fileChannel = fileInputStream.channel
//        val startOffset = assetFileDescriptor.startOffset
//        val length = assetFileDescriptor.length
//        return fileChannel.map(FileChannel.MapMode.READ_ONLY, startOffset, length)
//    }

}