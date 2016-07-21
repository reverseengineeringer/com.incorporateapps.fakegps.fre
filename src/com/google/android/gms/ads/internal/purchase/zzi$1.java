package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzih;

class zzi$1
  implements ServiceConnection
{
  zzi$1(zzi paramzzi, Context paramContext) {}
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    boolean bool = false;
    paramComponentName = new zzb(zzxh.getApplicationContext(), false);
    paramComponentName.zzN(paramIBinder);
    int i = paramComponentName.zzb(3, zzxh.getPackageName(), "inapp");
    paramIBinder = zzr.zzbF();
    if (i == 0) {
      bool = true;
    }
    paramIBinder.zzC(bool);
    zzxh.unbindService(this);
    paramComponentName.destroy();
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName) {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.zzi.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */