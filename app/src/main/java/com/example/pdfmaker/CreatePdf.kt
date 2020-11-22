package com.example.pdfmaker

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat

class CreatePdf : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_pdf)

        /** Request Permission to Read and Write to External Storage **/
        ActivityCompat.requestPermissions(
            this,
            arrayOf(
                Manifest.permission.READ_EXTERNAL_STORAGE,         // Request permission to read
                Manifest.permission.WRITE_EXTERNAL_STORAGE         // Request permission to write
            ), PackageManager.PERMISSION_GRANTED
        )
    }
}