package com.example.android.myapplication

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.util.Log

class ConfirDeleteDialogFragment : DialogFragment() {

    val TAG = ConfirDeleteDialogFragment::class.java.simpleName;

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity);
        builder.setMessage("Supprimer tout le contenu du téléphone ?")
            .setPositiveButton("oh oui !", object: DialogInterface.OnClickListener {
                override fun onClick(dialog: DialogInterface?, id: Int) {
                    Log.i(TAG, "Youpi !");
                }
            })
            .setNegativeButton("Euh... Non", DialogInterface.OnClickListener {dialog, id ->
                Log.i(TAG, "Ce sera pour la prochaine fois");
            })

        return builder.create();
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    