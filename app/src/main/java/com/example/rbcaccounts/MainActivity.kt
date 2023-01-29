package com.example.rbcaccounts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rbcaccounts.Repository.RepositoryPopulateData
import com.rbc.rbcaccountlibrary.Account
import com.rbc.rbcaccountlibrary.AccountType

class MainActivity : AppCompatActivity() {
    lateinit var accountArrayList: ArrayList<Account>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val accountData = RepositoryPopulateData()
        accountArrayList = accountData.accountArrayList


    }
}