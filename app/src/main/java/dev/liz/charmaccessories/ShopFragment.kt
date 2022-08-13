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
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        displayAccessory()
        diplayAll()
        NeckAccessory()
        AnkleAccessory()
    }
    fun displayAccessory(){
        var accessory1=Accessory("Bangles","https://www.istockphoto.com/photo/isolated-shot-of-unique-jewelry-collection-on-white-background-gm175232913-22493826?utm_source=unsplash&utm_medium=affiliate&utm_campaign=adp_photos_sponsored&utm_content=https%3A%2F%2Funsplash.com%2Fphotos%2Fuf_IDewI6iQ&utm_term=bracelet%3A%3A%3A")
        var accessory2=Accessory("Golden Rings","https://unsplash.com/photos/e46hyCWI73c")
        var accessory3=Accessory("Armless","https://unsplash.com/photos/hXhMzWysB8s")
        var accessory4=Accessory("Golden Bangles","https://unsplash.com/photos/esAis38NHT8")
        var accessory5=Accessory("Watches","https://unsplash.com/photos/qsJ5itg93WY")
        var accessory6=Accessory("Golden Watch","https://unsplash.com/photos/Wff2xBlOmS0")
        var AccessoryList= listOf(accessory1,accessory2,accessory3,accessory4,accessory5,accessory6)
        var contactsAdapter=AccessoryRvAdapter(AccessoryList )
        binding.rvAccessory.layoutManager= LinearLayoutManager(context)
        binding.rvAccessory.adapter=contactsAdapter
    }
    fun NeckAccessory(){
        var accessory1=Accessory("Neckless","https://www.istockphoto.com/search/search-by-image?mediatype=photography&imageurl=aHR0cHM6Ly9zMy51cy13ZXN0LTIuYW1hem9uYXdzLmNvbS9pbWFnZXMudW5zcGxhc2guY29tL3NtYWxsL3Bob3RvLTE2MDY3NjAyMjcwOTEtM2RkODcwZDk3ZjFk&assettype=image&utm_source=unsplash&utm_medium=affiliate&utm_campaign=adp_photos_sponsored&utm_content=https%3A%2F%2Funsplash.com%2Fphotos%2Fuf_IDewI6iQ&utm_term=bracelet%3A%3A%3A")
        var accessory2=Accessory("Silver neckless","https://unsplash.com/photos/G3Hrl6WzQYQ")
        var accessory3=Accessory("Golden Neckless","https://unsplash.com/photos/TxCbfMc854c")
        var accessory4=Accessory("Jewels","https://unsplash.com/collections/yxx-WBGUJj8/jewels")
        var accessory5=Accessory("Lullabies","https://unsplash.com/collections/93844218/lullabies")
        var AccessoryList= listOf(accessory1,accessory2,accessory3,accessory4,accessory5)
        var contactsAdapter=AccessoryRvAdapter(AccessoryList )
        binding.rvAccessory.layoutManager= LinearLayoutManager(context)
        binding.rvAccessory.adapter=contactsAdapter
    }
    fun AnkleAccessory(){
        var accessory1=Accessory("Neckless","https://unsplash.com/photos/w-QWfFDR8Jo")
        var accessory2=Accessory("Silver ","https://unsplash.com/photos/IhHFkFYlcPE")
        var accessory3=Accessory("Golden bangle","https://unsplash.com/photos/a4u_Npgwftk")
        var accessory4=Accessory("Ankle Jewels","https://unsplash.com/photos/dZ12644A154")
        var accessory5=Accessory("Lullabies","https://unsplash.com/photos/f8PAWazrRWI")
        var accessory6=Accessory("lullabies","https://www.istockphoto.com/photo/woman-wearing-silver-anklet-gm962478596-262868759?utm_source=unsplash&utm_medium=affiliate&utm_campaign=srp_photos_bottom&utm_content=https%3A%2F%2Funsplash.com%2Fs%2Fphotos%2Fanklet&utm_term=anklet%3A%3A%3A")
        var accessory7=Accessory("lullabies","https://www.istockphoto.com/photo/woman-wearing-silver-anklet-gm962478596-262868759?utm_source=unsplash&utm_medium=affiliate&utm_campaign=srp_photos_bottom&utm_content=https%3A%2F%2Funsplash.com%2Fs%2Fphotos%2Fanklet&utm_term=anklet%3A%3A%3A")
        var AccessoryList= listOf(accessory1,accessory2,accessory3,accessory4,accessory5,accessory6,accessory7)
        var contactsAdapter=AccessoryRvAdapter(AccessoryList )
        binding.rvAccessory.layoutManager= LinearLayoutManager(context)
        binding.rvAccessory.adapter=contactsAdapter
    }
    fun diplayAll(){
        binding.tvArmB.setOnClickListener {
            displayAccessory()
        }
        binding.tvNeckB.setOnClickListener {
            NeckAccessory()
        }
        binding.tvAnkleB.setOnClickListener {
            AnkleAccessory()
        }
    }
}
