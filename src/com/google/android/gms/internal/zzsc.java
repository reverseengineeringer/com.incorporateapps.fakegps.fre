package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenResponse;
import com.google.android.gms.wallet.firstparty.GetInstrumentsResponse;

public abstract interface zzsc
  extends IInterface
{
  public abstract void zza(int paramInt, FullWallet paramFullWallet, Bundle paramBundle);
  
  public abstract void zza(int paramInt, MaskedWallet paramMaskedWallet, Bundle paramBundle);
  
  public abstract void zza(int paramInt, boolean paramBoolean, Bundle paramBundle);
  
  public abstract void zza(Status paramStatus, Bundle paramBundle);
  
  public abstract void zza(Status paramStatus, GetBuyFlowInitializationTokenResponse paramGetBuyFlowInitializationTokenResponse, Bundle paramBundle);
  
  public abstract void zza(Status paramStatus, GetInstrumentsResponse paramGetInstrumentsResponse, Bundle paramBundle);
  
  public abstract void zza(Status paramStatus, boolean paramBoolean, Bundle paramBundle);
  
  public abstract void zzb(int paramInt, boolean paramBoolean, Bundle paramBundle);
  
  public abstract void zzj(int paramInt, Bundle paramBundle);
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzsc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */