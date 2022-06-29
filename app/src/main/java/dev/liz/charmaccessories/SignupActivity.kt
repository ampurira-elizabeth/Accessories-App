package dev.liz.charmaccessories

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.liz.charmaccessories.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    lateinit var binding:ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignup.setOnClickListener {
        validate()
        }
    }
        fun validate(){
            var name=binding.etName.text.toString()
            var email=binding.etEmail.text.toString()
            var password=binding.etPassword.text.toString()
            var error=false
            if (name.isBlank()){
                binding.tilName.error="Enter your name please"
                error=true
            }
            if (email.isBlank()){
                binding.tilEmail.error="Enter your Email please"
                error=true
            }
            if (password.isBlank()){
                binding.tilPassword.error="Enter your Password please"
                error=true
            }
            else{
                startActivity(Intent(this,MainActivity::class.java))
                finish()
            }
        }


}