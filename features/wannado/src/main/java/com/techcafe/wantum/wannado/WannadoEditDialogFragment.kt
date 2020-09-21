package com.techcafe.wantum.wannado

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.shape.CornerFamily
import com.google.android.material.shape.MaterialShapeDrawable
import com.google.android.material.shape.ShapeAppearanceModel
import com.techcafe.wantum.wannado.databinding.FragmentWannadoEditDialogBinding

class WannadoEditDialogFragment : BottomSheetDialogFragment() {
    companion object {
        fun newInstance() = WannadoEditDialogFragment()
    }

    private lateinit var binding: FragmentWannadoEditDialogBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWannadoEditDialogBinding.inflate(inflater, container, false)
        initBottomSheetShapeAppearance()
        return binding.root
    }

    private fun initBottomSheetShapeAppearance() {
        val shapeAppearanceModel =
            ShapeAppearanceModel.Builder()
                .setTopLeftCorner(
                    CornerFamily.ROUNDED,
                    resources.getDimension(R.dimen.bottom_sheet_corner_radius)
                )
                .setTopRightCorner(
                    CornerFamily.ROUNDED,
                    resources.getDimension(R.dimen.bottom_sheet_corner_radius)
                )
                .build()

        val materialShapeDrawable = MaterialShapeDrawable.createWithElevationOverlay(
            requireActivity(),
            resources.getDimension(R.dimen.bottom_sheet_elevation)
        ).apply {
            setShapeAppearanceModel(shapeAppearanceModel)
        }
        binding.bottomSheet.background = materialShapeDrawable
    }
}
