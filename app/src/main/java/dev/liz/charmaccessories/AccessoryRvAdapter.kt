package dev.liz.charmaccessories

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.NetworkPolicy
import com.squareup.picasso.Picasso
import dev.liz.charmaccessories.databinding.AccessoryItemBinding
import dev.liz.charmaccessories.databinding.FragmentShopBinding

class AccessoryRvAdapter(var accessoryList:List<Accessory>):RecyclerView.Adapter<AccessoryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AccessoryViewHolder {
        var binding=AccessoryItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return AccessoryViewHolder(binding)
    }
    override fun onBindViewHolder(holder: AccessoryViewHolder, position: Int) {
       var currentAccessory=accessoryList.get(position)
        holder.binding.tvName.text=currentAccessory.name
         Picasso.get().load(currentAccessory.image)
            .placeholder(R.drawable.ic_baseline_person_24)
            .networkPolicy(NetworkPolicy.OFFLINE)
            .resize(300,300).centerCrop()
            .into(holder.binding.igAccessory)

//        var context=holder.itemView.context
//        holder.binding.igAccessory.setOnClickListener {
//            Toast.makeText(context,"you have clicked on ${currentAccessory.name}'s image",Toast.LENGTH_SHORT).show()
        }
//    holder.binding.cvAccessory.setOnClickListener {
//            var intent=Intent(context,ViewContactActivity::class.java)
//            intent.putExtra("NAME",currentAccessory.name)
////            intent.putExtra("EMAIL",currentcontact.email)
////            intent.putExtra("ADDRESS",currentcontact.address)
////            intent.putExtra("NUMBER",currentcontact.phoneNumber)
//            intent.putExtra("IMAGE",currentAccessory.image)
//            context.startActivity(intent)
//        }


    override fun getItemCount(): Int {
        return accessoryList.size
    }
}
class AccessoryViewHolder(var binding:AccessoryItemBinding):RecyclerView.ViewHolder(binding.root)

