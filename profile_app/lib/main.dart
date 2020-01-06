import 'package:flutter/material.dart';

void main() {
  runApp(
    MaterialApp(
      home: Scaffold(
        backgroundColor: Colors.purple[400],
        appBar: AppBar(
          title: Text('I Am Not Poor'),
          backgroundColor: Colors.purple[700],
        ),
        body: Center(
          child: Image(
            image: AssetImage('images/mightysemiu_1.jpg'),
          ),
        ),
      ),
    ),
  );
}
