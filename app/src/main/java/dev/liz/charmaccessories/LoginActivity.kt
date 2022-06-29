package dev.liz.charmaccessories

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.liz.charmaccessories.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.tvSign.setOnClickListener {
           startActivity(Intent(this,SignupActivity::class.java))
       }
        binding.btnLogin.setOnClickListener {
//            startActivity(Intent(this,SignupActivity::class.java))
            validate()
        }
    }
    fun validate(){
        var email=binding.etEmail2.text.toString()
        var password=binding.etPassword2.text.toString()
        var error=false
        if (email.isBlank()){
            binding.tilEmail2.error="Email required please"
            error=true
        }
        if (password.isBlank()){
            binding.tilPassword2.error="Password required please"
            error=true
        }
        else{
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}