package com.example_iron.sunweather.ui.place

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example_iron.sunweather.R

class PlaceFragment : Fragment() {
    val viewModel by lazy { ViewModelProviders.of(this).get(PlaceViewModel::class.java) }

    private lateinit var adapter:PlaceAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_place, container, false)
    }

//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        val layoutManager = LinearLayoutManager(activity)
//        recycleView.layoutManager = layoutManager
//        adapter = PlaceAdapter(this, viewModel.placeList)
//        recyclerView.adapter = adapter
//        searchPlaceEdit.addTextChangeListener{
//            editable -> val content = editable.toString()
//            if(content.isNotEmpty()){
//                viewModel.searchPlaces(content)
//            }else{
//                recyclerView.visiblity = View.GONE
//                bgImageView.visibility = View.VISIBLE
//                viewModel.placeList.clear()
//                adapter.notifyDataSetChanged()
//            }
//        }
//
//        viewModel.placeLiveData.observe(this, Observer{
//            result -> val place = result.getOrNull()
//            if(place != null){
//                recyclerView.visibility = View.GONE
//                bgImageView.visibility.clear()
//                viewModel.placeList.clear()
//                viewModel.placeList.addAll(places)
//                adapter.notifyDataSetChanged()
//            }else{
//                Toast.makeText(activity,"",Toast.LENGTH_LONG).show()
//                result.exceptionOrNull()?printStackTrace()
//            }
//        })
//    }
}

