package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.zzx;

class zzr
  extends BroadcastReceiver
{
  static final String zzSZ = zzr.class.getName();
  private boolean zzTa;
  private boolean zzTb;
  private final zzw zzaTV;
  
  zzr(zzw paramzzw)
  {
    zzx.zzz(paramzzw);
    zzaTV = paramzzw;
  }
  
  private Context getContext()
  {
    return zzaTV.getContext();
  }
  
  private zzp zzAo()
  {
    return zzaTV.zzAo();
  }
  
  public boolean isRegistered()
  {
    zzaTV.zzjk();
    return zzTa;
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    zzaTV.zzjv();
    paramContext = paramIntent.getAction();
    zzAo().zzCK().zzj("NetworkBroadcastReceiver received action", paramContext);
    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(paramContext))
    {
      boolean bool = zzaTV.zzCW().zzlB();
      if (zzTb != bool)
      {
        zzTb = bool;
        zzaTV.zzCn().zzg(new zzr.1(this, bool));
      }
      return;
    }
    zzAo().zzCF().zzj("NetworkBroadcastReceiver received unknown action", paramContext);
  }
  
  public void unregister()
  {
    zzaTV.zzjv();
    zzaTV.zzjk();
    if (!isRegistered()) {
      return;
    }
    zzAo().zzCK().zzfg("Unregistering connectivity change receiver");
    zzTa = false;
    zzTb = false;
    Context localContext = getContext();
    try
    {
      localContext.unregisterReceiver(this);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      zzAo().zzCE().zzj("Failed to unregister the network broadcast receiver", localIllegalArgumentException);
    }
  }
  
  public void zzly()
  {
    zzaTV.zzjv();
    zzaTV.zzjk();
    if (zzTa) {
      return;
    }
    getContext().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    zzTb = zzaTV.zzCW().zzlB();
    zzAo().zzCK().zzj("Registering connectivity change receiver. Network connected", Boolean.valueOf(zzTb));
    zzTa = true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */