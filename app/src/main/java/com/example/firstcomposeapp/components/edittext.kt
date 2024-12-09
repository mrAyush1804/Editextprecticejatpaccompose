import android.text.InputType
import android.widget.NumberPicker.OnValueChangeListener
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun dynamicedittext(
    value: String,
    label: String,
    placeholder: String,
    onValueChange: (String) -> Unit,
    inputType: KeyboardType = KeyboardType.Text,
    modifier: Modifier

) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(label) },
        placeholder = { Text(placeholder) },
        modifier = Modifier
            .border(
                BorderStroke(
                    width = 4.dp, brush = Brush.horizontalGradient(listOf(Color.Black, Color.Blue))
                ),
                shape = CutCornerShape(10)
            )
            .padding(horizontal = 6.dp), keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Text, // Set the desired keyboard type (e.g., Text, Email, Phone, etc.)
            imeAction = ImeAction.Done // Optional: Defines the action button on the keyboard (e.g., Done, Next)
        ),
        colors = TextFieldDefaults.colors().copy(
            focusedContainerColor = Color.Transparent,
            focusedTextColor = Color.Black,
            unfocusedTextColor = Color.Black,
            focusedIndicatorColor = Color.Transparent,
            unfocusedContainerColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
        )
    )


}

@Preview
@Composable
fun multipleedittext() {
    var firstname by remember { mutableStateOf("") }
    var lastname by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .padding(horizontal = 20.dp)
    ) {
        dynamicedittext(
            label = "Name",
            placeholder = "Enter your name",
            value = firstname,
            modifier = Modifier.fillMaxWidth(),
            onValueChange = { firstname = it }
        )
        Spacer(modifier = Modifier.height(8.dp))
        dynamicedittext(
            label = "Surname",
            placeholder = "Enter your Surname",
            value = lastname,
            onValueChange = { lastname = it },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        dynamicedittext(
            label = "Email",
            placeholder = "Enter your Email",
            value = email,
            onValueChange = { email = it },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        dynamicedittext(
            label = "Phone",
            placeholder = "Enter your Phone",
            value = phone,
            onValueChange = { phone = it },
            inputType = KeyboardType.Phone,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
    }
}


