LINK TO REPOSITORY : https://github.com/ST10494318/weatherApp.git

1st screen code:
package za.ac.iie.weather

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // button to go to WeatherActivity
        val proceedButton: Button = findViewById(R.id.proceedButton)
        proceedButton.setOnClickListener {
            val intent = Intent(this, WeatherActivity::class.java)
            startActivity(intent)
        }
    }
}



2nd screen code :
package za.ac.iie.weather

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WeatherActivity : AppCompatActivity() {
    // array data
    private val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    private val tempValues = arrayOf(55, 19, 72, 54, 44, 67, 61)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        // User interface components
        val weatherTextView: TextView = findViewById(R.id.weatherData)
        val averageTempTextView: TextView = findViewById(R.id.averageTemp)
        val backButton: Button = findViewById(R.id.backButton)

        // Displaying days and temperatures using a loop
        val weatherStringBuilder = StringBuilder()
        for (i in days.indices) {
            weatherStringBuilder.append("${days[i]}: ${tempValues[i]}°C\n")
        }
        weatherTextView.text = weatherStringBuilder.toString()

        // average temperature using a loop
        var sum = 0
        for (temperature in tempValues) {
            sum += temperature
        }
        val average = sum.toDouble() / tempValues.size
        averageTempTextView.text = "Average Max Temperature: %.1f°C".format(average)

        // Back button to return to MainActivity
        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}


SCREEN SHOTS
![THE2](https://github.com/user-attachments/assets/63aff054-37d3-435f-9c24-ad1e0a3e7e17)
![THE](https://github.com/user-attachments/assets/9a271cd4-1d5e-47b0-b195-e94a23aed1de)
![the3](https://github.com/user-attachments/assets/b1cd92b5-fa08-44d0-8675-f12ca03986c1)
![the4](https://github.com/user-attachments/assets/fd4de966-e65c-4dab-80ac-946f9e5abe08)
![the5](https://github.com/user-attachments/assets/8a67a3ac-104c-4b69-9da1-ed40d14bcf72)
