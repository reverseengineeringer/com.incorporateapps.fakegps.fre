package com.google.android.gms.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import java.lang.ref.WeakReference;

final class zzse$zzc
  extends zzse.zza
{
  private final int zzagz;
  private final WeakReference zzbqC;
  
  public zzse$zzc(Context paramContext, int paramInt)
  {
    super(null);
    zzbqC = new WeakReference((Activity)paramContext);
    zzagz = paramInt;
  }
  
  public final void zza(int paramInt, FullWallet paramFullWallet, Bundle paramBundle)
  {
    Activity localActivity = (Activity)zzbqC.get();
    if (localActivity == null)
    {
      Log.d("WalletClientImpl", "Ignoring onFullWalletLoaded, Activity has gone");
      return;
    }
    Object localObject = null;
    if (paramBundle != null) {
      localObject = (PendingIntent)paramBundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
    }
    paramBundle = new ConnectionResult(paramInt, (PendingIntent)localObject);
    if (paramBundle.hasResolution()) {
      try
      {
        paramBundle.startResolutionForResult(localActivity, zzagz);
        return;
      }
      catch (IntentSender.SendIntentException paramFullWallet)
      {
        Log.w("WalletClientImpl", "Exception starting pending intent", paramFullWallet);
        return;
      }
    }
    localObject = new Intent();
    int i;
    if (paramBundle.isSuccess())
    {
      i = -1;
      ((Intent)localObject).putExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET", paramFullWallet);
      paramFullWallet = localActivity.createPendingResult(zzagz, (Intent)localObject, 1073741824);
      if (paramFullWallet == null) {
        Log.w("WalletClientImpl", "Null pending result returned for onFullWalletLoaded");
      }
    }
    else
    {
      if (paramInt == 408) {}
      for (i = 0;; i = 1)
      {
        ((Intent)localObject).putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", paramInt);
        break;
      }
    }
    try
    {
      paramFullWallet.send(i);
      return;
    }
    catch (PendingIntent.CanceledException paramFullWallet)
    {
      Log.w("WalletClientImpl", "Exception setting pending result", paramFullWallet);
    }
  }
  
  public final void zza(int paramInt, MaskedWallet paramMaskedWallet, Bundle paramBundle)
  {
    Activity localActivity = (Activity)zzbqC.get();
    if (localActivity == null)
    {
      Log.d("WalletClientImpl", "Ignoring onMaskedWalletLoaded, Activity has gone");
      return;
    }
    Object localObject = null;
    if (paramBundle != null) {
      localObject = (PendingIntent)paramBundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
    }
    paramBundle = new ConnectionResult(paramInt, (PendingIntent)localObject);
    if (paramBundle.hasResolution()) {
      try
      {
        paramBundle.startResolutionForResult(localActivity, zzagz);
        return;
      }
      catch (IntentSender.SendIntentException paramMaskedWallet)
      {
        Log.w("WalletClientImpl", "Exception starting pending intent", paramMaskedWallet);
        return;
      }
    }
    localObject = new Intent();
    int i;
    if (paramBundle.isSuccess())
    {
      i = -1;
      ((Intent)localObject).putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", paramMaskedWallet);
      paramMaskedWallet = localActivity.createPendingResult(zzagz, (Intent)localObject, 1073741824);
      if (paramMaskedWallet == null) {
        Log.w("WalletClientImpl", "Null pending result returned for onMaskedWalletLoaded");
      }
    }
    else
    {
      if (paramInt == 408) {}
      for (i = 0;; i = 1)
      {
        ((Intent)localObject).putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", paramInt);
        break;
      }
    }
    try
    {
      paramMaskedWallet.send(i);
      return;
    }
    catch (PendingIntent.CanceledException paramMaskedWallet)
    {
      Log.w("WalletClientImpl", "Exception setting pending result", paramMaskedWallet);
    }
  }
  
  public final void zza(int paramInt, boolean paramBoolean, Bundle paramBundle)
  {
    paramBundle = (Activity)zzbqC.get();
    if (paramBundle == null)
    {
      Log.d("WalletClientImpl", "Ignoring onPreAuthorizationDetermined, Activity has gone");
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("com.google.android.gm.wallet.EXTRA_IS_USER_PREAUTHORIZED", paramBoolean);
    paramBundle = paramBundle.createPendingResult(zzagz, localIntent, 1073741824);
    if (paramBundle == null)
    {
      Log.w("WalletClientImpl", "Null pending result returned for onPreAuthorizationDetermined");
      return;
    }
    try
    {
      paramBundle.send(-1);
      return;
    }
    catch (PendingIntent.CanceledException paramBundle)
    {
      Log.w("WalletClientImpl", "Exception setting pending result", paramBundle);
    }
  }
  
  public final void zza(Status paramStatus, boolean paramBoolean, Bundle paramBundle)
  {
    paramStatus = (Activity)zzbqC.get();
    if (paramStatus == null)
    {
      Log.d("WalletClientImpl", "Ignoring onIsReadyToPayDetermined, Activity has gone");
      return;
    }
    paramBundle = new Intent();
    paramBundle.putExtra("com.google.android.gms.wallet.EXTRA_IS_READY_TO_PAY", paramBoolean);
    paramStatus = paramStatus.createPendingResult(zzagz, paramBundle, 1073741824);
    if (paramStatus == null)
    {
      Log.w("WalletClientImpl", "Null pending result returned for onIsReadyToPayDetermined");
      return;
    }
    try
    {
      paramStatus.send(-1);
      return;
    }
    catch (PendingIntent.CanceledException paramStatus)
    {
      Log.w("WalletClientImpl", "Exception setting pending result in onIsReadyToPayDetermined", paramStatus);
    }
  }
  
  public final void zzb(int paramInt, boolean paramBoolean, Bundle paramBundle)
  {
    paramBundle = (Activity)zzbqC.get();
    if (paramBundle == null)
    {
      Log.d("WalletClientImpl", "Ignoring onIsNewUserDetermined, Activity has gone");
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("com.google.android.gms.wallet.EXTRA_IS_NEW_USER", paramBoolean);
    paramBundle = paramBundle.createPendingResult(zzagz, localIntent, 1073741824);
    if (paramBundle == null)
    {
      Log.w("WalletClientImpl", "Null pending result returned for onIsNewUserDetermined");
      return;
    }
    try
    {
      paramBundle.send(-1);
      return;
    }
    catch (PendingIntent.CanceledException paramBundle)
    {
      Log.w("WalletClientImpl", "Exception setting pending result", paramBundle);
    }
  }
  
  public final void zzj(int paramInt, Bundle paramBundle)
  {
    zzx.zzb(paramBundle, "Bundle should not be null");
    Activity localActivity = (Activity)zzbqC.get();
    if (localActivity == null)
    {
      Log.d("WalletClientImpl", "Ignoring onWalletObjectsCreated, Activity has gone");
      return;
    }
    paramBundle = new ConnectionResult(paramInt, (PendingIntent)paramBundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT"));
    if (paramBundle.hasResolution()) {
      try
      {
        paramBundle.startResolutionForResult(localActivity, zzagz);
        return;
      }
      catch (IntentSender.SendIntentException paramBundle)
      {
        Log.w("WalletClientImpl", "Exception starting pending intent", paramBundle);
        return;
      }
    }
    Log.e("WalletClientImpl", "Create Wallet Objects confirmation UI will not be shown connection result: " + paramBundle);
    paramBundle = new Intent();
    paramBundle.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", 413);
    paramBundle = localActivity.createPendingResult(zzagz, paramBundle, 1073741824);
    if (paramBundle == null)
    {
      Log.w("WalletClientImpl", "Null pending result returned for onWalletObjectsCreated");
      return;
    }
    try
    {
      paramBundle.send(1);
      return;
    }
    catch (PendingIntent.CanceledException paramBundle)
    {
      Log.w("WalletClientImpl", "Exception setting pending result", paramBundle);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzse.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */