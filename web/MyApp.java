import 'package:flutter/material.dart';
import 'package:firebase_core/firebase_core.dart'; // Import Firebase Core
import 'package:firebase/firebase.dart' as firebase;

void main() async {
  WidgetsFlutterBinding.ensureInitialized();
  await Firebase.initializeApp(); // Initialize Firebase

  // Initialize Firebase with your configuration
  firebase.initializeApp(
        apiKey: "AIzaSyDceQH0x0RV-fIYG0BqB_X7IMeTNAl1V14",
        authDomain: "newmeter-ab045.firebaseapp.com",
        databaseURL: "https://newmeter-ab045-default-rtdb.asia-southeast1.firebasedatabase.app",
        projectId: "newmeter-ab045",
        storageBucket: "newmeter-ab045.appspot.com",
        messagingSenderId: "755759288428",
        appId: "1:755759288428:web:e7eb9daf1ca5d80bca0849"
  );

  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key); // Fix the constructor

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Firebase Web Demo',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: const MyHomePage(),
    );
  }
}

class MyHomePage extends StatelessWidget {
  const MyHomePage({Key? key}) : super(key: key); // Add super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Flutter Firebase Web Demo'),
      ),
      body: Center(
        child: Text(
          'Firebase Initialized Successfully!',
          style: TextStyle(fontSize: 24),
        ),
      ),
    );
  }
}
