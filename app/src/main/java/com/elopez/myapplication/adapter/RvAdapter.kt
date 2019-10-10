package com.elopez.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.elopez.myapplication.R
import com.elopez.myapplication.models.Reservation

class RvAdapter(val resevationList: ArrayList<Reservation>) :
    RecyclerView.Adapter<RvAdapter.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val v = LayoutInflater.from(p0?.context).inflate(R.layout.adapter_item_layout, p0, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return resevationList.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.reservationName?.text = resevationList[p1].name
        p0.reservationAddress?.text = resevationList[p1].address
        p0.reservationDatetime?.text = resevationList[p1].datetime
        p0.reservationPrice?.text = resevationList[p1].price
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val reservationName = itemView.findViewById<TextView>(R.id.reservationName)
        val reservationAddress = itemView.findViewById<TextView>(R.id.reservationAddress)
        val reservationDatetime = itemView.findViewById<TextView>(R.id.reservationDatetime)
        val reservationPrice = itemView.findViewById<TextView>(R.id.reservationPrice)
    }
}