package km.project.kotlinproject.Battery

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class PowerConnectionReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent!!.action.equals(Intent.ACTION_POWER_CONNECTED)) { // 충전기 연결 action을 받은경우
            Log.d("TAG", "OnReceive action" + intent.action)
            print("충전기 연결")
        } else if (intent!!.action.equals(Intent.ACTION_POWER_DISCONNECTED)) {
            Log.d("TAG", "OnReceive action" + intent.action)
            print("충전기 해제")
        }
    }
}