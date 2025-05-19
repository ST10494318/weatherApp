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
