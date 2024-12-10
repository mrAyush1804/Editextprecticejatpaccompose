package com.example.firstcomposeapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
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
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun custom_edittxt(
    lable: String,
    placeholder: String,
    value: String,
    onvaluechange: (String) -> Unit,
    inputType: KeyboardType = KeyboardType.Text,
    visualTransformation: PasswordVisualTransformation? = null,
    isPasswordField: Boolean = false,
    modifier: Modifier,

    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null
) {
    val isTextEmpty = value.isEmpty()
    val rainbowColors = listOf(Color.Red, Color.Yellow, Color.Green, Color.Blue)


    val brush = remember {
        Brush.linearGradient(
            colors = rainbowColors
        )
    }

    OutlinedTextField(
        label = { Text(lable) },
        placeholder = { Text(placeholder) },
        value = value,
        onValueChange = onvaluechange,
        maxLines = 1,
        textStyle = TextStyle(brush = brush),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp), keyboardOptions = KeyboardOptions(
            keyboardType = inputType,
            imeAction = ImeAction.Done
        ), leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        visualTransformation = if (isPasswordField) PasswordVisualTransformation() else VisualTransformation.None,
        colors = OutlinedTextFieldDefaults.colors(
            focusedTextColor = Color.Transparent,
            unfocusedTextColor = Color.Transparent,
            focusedContainerColor = Color.Transparent,
            unfocusedContainerColor = Color.Transparent,
        ),



    )
}

@Composable
@Preview
fun showedittext() {
    var fname by remember { mutableStateOf("") }
    var lname by remember { mutableStateOf("") }
    var phoneno by remember { mutableStateOf("") }
    var Email by remember { mutableStateOf("") }



    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                brush = Brush.horizontalGradient(listOf(Color.Yellow, Color.Gray)),
                shape = RectangleShape,
            )
            .padding(16.dp)
            .padding(horizontal = 16.dp)
    ) {
        custom_edittxt(
            lable = "Name",
            placeholder = "Enter your first name",
            value = fname,
            onvaluechange = { fname = it },
            modifier = Modifier.fillMaxWidth(),
            leadingIcon = { Icon(imageVector = Icons.Filled.Person, " hii") }

        )
        Spacer(modifier = Modifier.padding(10.dp))
        custom_edittxt(
            lable = "latname",
            placeholder = "Enter your last name",
            value = lname,
            onvaluechange = { lname = it },
            modifier = Modifier.fillMaxWidth(),
            leadingIcon = { Icon(imageVector = Icons.Filled.Person, " hii") }

        )
        Spacer(modifier = Modifier.padding(10.dp))
        custom_edittxt(
            lable = "Email",
            placeholder = "Enter your Email",
            value = Email,
            onvaluechange = { Email = it },
            modifier = Modifier.fillMaxWidth(),
            leadingIcon = { Icon(imageVector = Icons.Filled.Email, " hii") }

        )
        Spacer(modifier = Modifier.padding(10.dp))
        custom_edittxt(
            lable = "phone",
            placeholder = "Enter your phoneno",
            value = phoneno,
            onvaluechange = { phoneno = it },
            isPasswordField = true,
            modifier = Modifier.fillMaxWidth(),
            inputType = KeyboardType.Phone,
            leadingIcon = { Icon(imageVector = Icons.Filled.Phone, " hii") }


        )
    }


}