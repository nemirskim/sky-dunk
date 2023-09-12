package com.example.skydunk.UI.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import com.example.skydunk.UI.extensions.getResource
import com.example.skydunk.UI.extensions.toSimpleDate
import com.example.skydunk.databinding.FragmentLastGameBinding

class LastGameFragment : Fragment() {
    private var _binding: FragmentLastGameBinding? = null
    private val binding get() = _binding!!
    private val viewModel: LastGameVM by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLastGameBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.score.observe(activity as LifecycleOwner) {
            gameScoreTextView.text = it
        }
        viewModel.date.observe(activity as LifecycleOwner) {
            gameDateTextView.text = it.toSimpleDate()
        }
        viewModel.homeTeamLogo.observe(activity as LifecycleOwner) {
            homeTeamLogoImageView.setImageDrawable(context?.getResource(it))
        }
        viewModel.visitorTeamLogo.observe(activity as LifecycleOwner) {
            visitorTeamLogoImageView.setImageDrawable(context?.getResource(it))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        @JvmStatic
        fun newInstance() = LastGameFragment()
    }
}
