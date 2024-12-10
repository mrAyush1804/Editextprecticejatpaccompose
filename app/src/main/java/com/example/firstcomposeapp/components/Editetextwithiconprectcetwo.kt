package com.example.firstcomposeapp.components

import android.text.InputType
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun custom_edittxt(
    lable: String,
    placeholder: String,
    value: String,
    onvaluechange: (String) -> Unit,
    inputType: KeyboardType= KeyboardType.Text,
    modifier: Modifier
) {
    val isTextEmpty = value.isEmpty()
    OutlinedTextField(
        label = { Text(lable) },
        placeholder = { Text(placeholder) },
        value = value,
        onValueChange = onvaluechange,
        modifier = modifier.border(
            BorderStroke(
                width = 3.dp,
                brush = Brush.sweepGradient(listOf(Color.Green,Color.Black))
            ),
            shape = CutCornerShape(6.dp)
        ).padding(horizontal = 6.dp), keyboardOptions = KeyboardOptions(
            keyboardType = inputType,
            imeAction = ImeAction.Done
        ),

        colors = OutlinedTextFieldDefaults.colors().copy(

            focusedContainerColor = Color.Transparent,
            focusedTextColor = Color.Black,
            focusedLabelColor = if (isTextEmpty) Color.Black else Color.Transparent,
            unfocusedLabelColor = if (isTextEmpty) Color.Black else Color.Transparent,
            unfocusedTextColor = Color.Black,
            unfocusedContainerColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,




        )


    )
}

@Composable
@Preview
fun showedittext() {
    var fname by remember { mutableStateOf("") }
    var lname by remember { mutableStateOf("") }
    var phoneno by remember { mutableStateOf("") }
    var Email by remember { mutableStateOf("") }


    Column(modifier = Modifier.fillMaxSize().padding(16.dp).padding(horizontal = 16.dp)
    ) {
        custom_edittxt(
            lable = "Name",
            placeholder = "Enter your first name",
            value = fname,
            onvaluechange ={fname=it},
            modifier = Modifier.fillMaxWidth()

        )
        Spacer(modifier = Modifier.padding(10.dp))
        custom_edittxt(
            lable = "latname",
            placeholder = "Enter your last name",
            value = lname,
            onvaluechange ={lname=it},
            modifier = Modifier.fillMaxWidth()

        )
        Spacer(modifier = Modifier.padding(10.dp))
        custom_edittxt(
            lable = "Email",
            placeholder = "Enter your Email",
            value = Email,
            onvaluechange ={Email=it},
            modifier = Modifier.fillMaxWidth()

        )
        Spacer(modifier = Modifier.padding(10.dp))
        custom_edittxt(
            lable = "phone",
            placeholder = "Enter your phoneno",
            value = phoneno,
            onvaluechange ={phoneno=it},
            modifier = Modifier.fillMaxWidth()

        )
    }



}