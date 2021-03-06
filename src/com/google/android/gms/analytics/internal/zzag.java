package com.google.android.gms.analytics.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import com.google.android.gms.common.internal.zzx;

class zzag
  extends BroadcastReceiver
{
  static final String zzSZ = zzag.class.getName();
  private final zzf zzQj;
  private boolean zzTa;
  private boolean zzTb;
  
  zzag(zzf paramzzf)
  {
    zzx.zzz(paramzzf);
    zzQj = paramzzf;
  }
  
  private Context getContext()
  {
    return zzQj.getContext();
  }
  
  private zzb zziH()
  {
    return zzQj.zziH();
  }
  
  private zzaf zzjm()
  {
    return zzQj.zzjm();
  }
  
  private void zzlz()
  {
    zzjm();
    zziH();
  }
  
  public boolean isConnected()
  {
    if (!zzTa) {
      zzQj.zzjm().zzbg("Connectivity unknown. Receiver not registered");
    }
    return zzTb;
  }
  
  public boolean isRegistered()
  {
    return zzTa;
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    zzlz();
    paramContext = paramIntent.getAction();
    zzQj.zzjm().zza("NetworkBroadcastReceiver received action", paramContext);
    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(paramContext))
    {
      boolean bool = zzlB();
      if (zzTb != bool)
      {
        zzTb = bool;
        zziH().zzJ(bool);
      }
    }
    do
    {
      return;
      if (!"com.google.analytics.RADIO_POWERED".equals(paramContext)) {
        break;
      }
    } while (paramIntent.hasExtra(zzSZ));
    zziH().zzjg();
    return;
    zzQj.zzjm().zzd("NetworkBroadcastReceiver received unknown action", paramContext);
  }
  
  public void unregister()
  {
    if (!isRegistered()) {
      return;
    }
    zzQj.zzjm().zzbd("Unregistering connectivity change receiver");
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
      zzjm().zze("Failed to unregister the network broadcast receiver", localIllegalArgumentException);
    }
  }
  
  public void zzlA()
  {
    if (Build.VERSION.SDK_INT <= 10) {
      return;
    }
    Context localContext = getContext();
    Intent localIntent = new Intent("com.google.analytics.RADIO_POWERED");
    localIntent.addCategory(localContext.getPackageName());
    localIntent.putExtra(zzSZ, true);
    localContext.sendOrderedBroadcast(localIntent, null);
  }
  
  protected boolean zzlB()
  {
    Object localObject = (ConnectivityManager)getContext().getSystemService("connectivity");
    try
    {
      localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
      if (localObject != null)
      {
        boolean bool = ((NetworkInfo)localObject).isConnected();
        if (bool) {
          return true;
        }
      }
      return false;
    }
    catch (SecurityException localSecurityException) {}
    return false;
  }
  
  public void zzly()
  {
    zzlz();
    if (zzTa) {
      return;
    }
    Context localContext = getContext();
    localContext.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    IntentFilter localIntentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
    localIntentFilter.addCategory(localContext.getPackageName());
    localContext.registerReceiver(this, localIntentFilter);
    zzTb = zzlB();
    zzQj.zzjm().zza("Registering connectivity change receiver. Network connected", Boolean.valueOf(zzTb));
    zzTa = true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.internal.zzag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */