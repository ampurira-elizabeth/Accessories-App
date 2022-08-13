package dev.liz.charmaccessories

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import dev.liz.charmaccessories.databinding.FragmentHomeBinding
import dev.liz.charmaccessories.databinding.FragmentShopBinding

class ShopFragment : Fragment() {
    lateinit var binding: FragmentShopBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentShopBinding.inflate(inflater,container,false)
//        binding= FragmentShopBinding.inflate(layoutInflater)
//        (R.layout.activity_main)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        displayAccessory()
        diplayAll()
        displayAccessory2()

    }
    fun displayAccessory(){
        var accessory1=Accessory("Lizie","https://images.unsplash.com/photo-1589156280159-27698a70f29e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var accessory2=Accessory("Aggie","https://images.unsplash.com/photo-1519419691348-3b3433c4c20e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fGJsYWNrJTIwcGVvcGxlJTIwaW4lMjBsb3ZlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var accessory3=Accessory("Raxie","https://images.unsplash.com/photo-1583994009785-37ec30bf9342?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var accessory4=Accessory("Dathan","https://images.unsplash.com/photo-1523450001312-faa4e2e37f0f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTZ8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var accessory5=Accessory("Hillz","https://images.unsplash.com/photo-1531384441138-2736e62e0919?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTN8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var AccessoryList= listOf(accessory1,accessory2,accessory3,accessory4,accessory5)
        var contactsAdapter=AccessoryRvAdapter(AccessoryList )
        binding.rvAccessory.layoutManager= LinearLayoutManager(context)
        binding.rvAccessory.adapter=contactsAdapter
    }
    fun displayAccessory2(){
        var accessory1=Accessory("Liz","https://images.unsplash.com/photo-1589156280159-27698a70f29e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var accessory2=Accessory("Agg","https://images.unsplash.com/photo-1519419691348-3b3433c4c20e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fGJsYWNrJTIwcGVvcGxlJTIwaW4lMjBsb3ZlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var accessory3=Accessory("Rax","https://images.unsplash.com/photo-1583994009785-37ec30bf9342?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var accessory4=Accessory("Dath","https://images.unsplash.com/photo-1523450001312-faa4e2e37f0f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTZ8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var accessory5=Accessory("Hil","https://images.unsplash.com/photo-1531384441138-2736e62e0919?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTN8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var AccessoryList= listOf(accessory1,accessory2,accessory3,accessory4,accessory5)
        var contactsAdapter=AccessoryRvAdapter(AccessoryList )
        binding.rvAccessory.layoutManager= LinearLayoutManager(context)
        binding.rvAccessory.adapter=contactsAdapter
    }
    fun diplayAll(){
        binding.tvArmB.setOnClickListener {
            displayAccessory()
        }
        binding.tvNeckB.setOnClickListener {
            displayAccessory2()
        }
    }


}
