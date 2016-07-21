package com.google.android.gms.internal;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.identity.intents.UserAddressRequest;

public class zzpn
  extends zzj
{
  private Activity mActivity;
  private final int mTheme;
  private final String zzVa;
  private zzpn.zza zzaMC;
  
  public zzpn(Activity paramActivity, Looper paramLooper, zzf paramzzf, int paramInt, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramActivity, paramLooper, 12, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
    zzVa = paramzzf.getAccountName();
    mActivity = paramActivity;
    mTheme = paramInt;
  }
  
  public void disconnect()
  {
    super.disconnect();
    if (zzaMC != null)
    {
      zzpn.zza.zza(zzaMC, null);
      zzaMC = null;
    }
  }
  
  public void zza(UserAddressRequest paramUserAddressRequest, int paramInt)
  {
    zzyx();
    zzaMC = new zzpn.zza(paramInt, mActivity);
    try
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("com.google.android.gms.identity.intents.EXTRA_CALLING_PACKAGE_NAME", getContext().getPackageName());
      if (!TextUtils.isEmpty(zzVa)) {
        localBundle.putParcelable("com.google.android.gms.identity.intents.EXTRA_ACCOUNT", new Account(zzVa, "com.google"));
      }
      localBundle.putInt("com.google.android.gms.identity.intents.EXTRA_THEME", mTheme);
      zzyw().zza(zzaMC, paramUserAddressRequest, localBundle);
      return;
    }
    catch (RemoteException paramUserAddressRequest)
    {
      Log.e("AddressClientImpl", "Exception requesting user address", paramUserAddressRequest);
      paramUserAddressRequest = new Bundle();
      paramUserAddressRequest.putInt("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", 555);
      zzaMC.zzh(1, paramUserAddressRequest);
    }
  }
  
  protected zzpp zzca(IBinder paramIBinder)
  {
    return zzpp.zza.zzcc(paramIBinder);
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.identity.service.BIND";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.identity.intents.internal.IAddressService";
  }
  
  public boolean zzqK()
  {
    return true;
  }
  
  protected zzpp zzyw()
  {
    return (zzpp)super.zzqJ();
  }
  
  protected void zzyx()
  {
    super.zzqI();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */