package com.notes.ui.details

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.activity.OnBackPressedCallback
import com.notes.databinding.FragmentNoteDetailsBinding
import com.notes.ui._base.ViewBindingFragment

class NoteDetailsFragment : ViewBindingFragment<FragmentNoteDetailsBinding>(
    FragmentNoteDetailsBinding::inflate
) {

    override fun onViewBindingCreated(
        viewBinding: FragmentNoteDetailsBinding,
        savedInstanceState: Bundle?
    ) {
        super.onViewBindingCreated(viewBinding, savedInstanceState)

        viewBinding.toolbar.setNavigationOnClickListener {
            requireActivity().onBackPressed()
        }

        requireActivity().onBackPressedDispatcher.addCallback(this,
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    Log.v(TAG, "@@@ Fragment back pressed fun handleOnBackPressed() this OK")
                }
            })
    }
}