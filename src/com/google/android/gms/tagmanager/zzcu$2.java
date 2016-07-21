package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;

class zzcu$2
  implements Handler.Callback
{
  zzcu$2(zzcu paramzzcu) {}
  
  public boolean handleMessage(Message paramMessage)
  {
    if ((1 == what) && (zzcu.zzHs().equals(obj)))
    {
      zzblb.dispatch();
      if ((zzcu.zzb(zzblb) > 0) && (!zzcu.zzc(zzblb))) {
        zzcu.zzd(zzblb).sendMessageDelayed(zzcu.zzd(zzblb).obtainMessage(1, zzcu.zzHs()), zzcu.zzb(zzblb));
      }
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzcu.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */