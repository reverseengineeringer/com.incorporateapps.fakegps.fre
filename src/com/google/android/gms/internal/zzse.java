package com.google.android.gms.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;

public class zzse
  extends zzj
{
  private final Context mContext;
  private final int mTheme;
  private final String zzVa;
  private final int zzbpM;
  private final boolean zzbpN;
  
  public zzse(Context paramContext, Looper paramLooper, zzf paramzzf, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super(paramContext, paramLooper, 4, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
    mContext = paramContext;
    zzbpM = paramInt1;
    zzVa = paramzzf.getAccountName();
    mTheme = paramInt2;
    zzbpN = paramBoolean;
  }
  
  private Bundle zzIp()
  {
    return zza(zzbpM, mContext.getPackageName(), zzVa, mTheme, zzbpN);
  }
  
  public static Bundle zza(int paramInt1, String paramString1, String paramString2, int paramInt2, boolean paramBoolean)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", paramInt1);
    localBundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", paramBoolean);
    localBundle.putString("androidPackageName", paramString1);
    if (!TextUtils.isEmpty(paramString2)) {
      localBundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(paramString2, "com.google"));
    }
    localBundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", paramInt2);
    return localBundle;
  }
  
  public void zza(FullWalletRequest paramFullWalletRequest, int paramInt)
  {
    zzse.zzc localzzc = new zzse.zzc(mContext, paramInt);
    Bundle localBundle = zzIp();
    try
    {
      ((zzrz)zzqJ()).zza(paramFullWalletRequest, localBundle, localzzc);
      return;
    }
    catch (RemoteException paramFullWalletRequest)
    {
      Log.e("WalletClientImpl", "RemoteException getting full wallet", paramFullWalletRequest);
      localzzc.zza(8, null, Bundle.EMPTY);
    }
  }
  
  public void zza(IsReadyToPayRequest paramIsReadyToPayRequest, zza.zzb paramzzb)
  {
    paramzzb = new zzse.zzb(paramzzb);
    Bundle localBundle = zzIp();
    try
    {
      ((zzrz)zzqJ()).zza(paramIsReadyToPayRequest, localBundle, paramzzb);
      return;
    }
    catch (RemoteException paramIsReadyToPayRequest)
    {
      Log.e("WalletClientImpl", "RemoteException during isReadyToPay", paramIsReadyToPayRequest);
      paramzzb.zza(Status.zzagE, false, Bundle.EMPTY);
    }
  }
  
  public void zza(MaskedWalletRequest paramMaskedWalletRequest, int paramInt)
  {
    Bundle localBundle = zzIp();
    zzse.zzc localzzc = new zzse.zzc(mContext, paramInt);
    try
    {
      ((zzrz)zzqJ()).zza(paramMaskedWalletRequest, localBundle, localzzc);
      return;
    }
    catch (RemoteException paramMaskedWalletRequest)
    {
      Log.e("WalletClientImpl", "RemoteException getting masked wallet", paramMaskedWalletRequest);
      localzzc.zza(8, null, Bundle.EMPTY);
    }
  }
  
  public void zza(NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest)
  {
    Bundle localBundle = zzIp();
    try
    {
      ((zzrz)zzqJ()).zza(paramNotifyTransactionStatusRequest, localBundle);
      return;
    }
    catch (RemoteException paramNotifyTransactionStatusRequest) {}
  }
  
  protected zzrz zzep(IBinder paramIBinder)
  {
    return zzrz.zza.zzel(paramIBinder);
  }
  
  public void zzf(String paramString1, String paramString2, int paramInt)
  {
    Bundle localBundle = zzIp();
    zzse.zzc localzzc = new zzse.zzc(mContext, paramInt);
    try
    {
      ((zzrz)zzqJ()).zza(paramString1, paramString2, localBundle, localzzc);
      return;
    }
    catch (RemoteException paramString1)
    {
      Log.e("WalletClientImpl", "RemoteException changing masked wallet", paramString1);
      localzzc.zza(8, null, Bundle.EMPTY);
    }
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.wallet.service.BIND";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.wallet.internal.IOwService";
  }
  
  public void zzln(int paramInt)
  {
    Bundle localBundle = zzIp();
    zzse.zzc localzzc = new zzse.zzc(mContext, paramInt);
    try
    {
      ((zzrz)zzqJ()).zza(localBundle, localzzc);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("WalletClientImpl", "RemoteException during checkForPreAuthorization", localRemoteException);
      localzzc.zza(8, false, Bundle.EMPTY);
    }
  }
  
  public void zzlo(int paramInt)
  {
    Bundle localBundle = zzIp();
    zzse.zzc localzzc = new zzse.zzc(mContext, paramInt);
    try
    {
      ((zzrz)zzqJ()).zzb(localBundle, localzzc);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("WalletClientImpl", "RemoteException during isNewUser", localRemoteException);
      localzzc.zzb(8, false, Bundle.EMPTY);
    }
  }
  
  public boolean zzqK()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */