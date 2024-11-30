package com.example.data.firebase

import com.google.firebase.auth.FirebaseAuth
import javax.inject.Inject

class FirebaseWrapper @Inject constructor() {
//    val firestore: FirebaseFirestore = FirebaseFirestore.getInstance()
    val authUser: FirebaseAuth = FirebaseAuth.getInstance()
}