package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.zzp;
import com.google.android.gms.common.internal.zzt;

public abstract interface zze
  extends IInterface
{
  public abstract void zza(int paramInt, Account paramAccount, zzd paramzzd);
  
  public abstract void zza(AuthAccountRequest paramAuthAccountRequest, zzd paramzzd);
  
  public abstract void zza(ResolveAccountRequest paramResolveAccountRequest, zzt paramzzt);
  
  public abstract void zza(zzp paramzzp, int paramInt, boolean paramBoolean);
  
  public abstract void zza(CheckServerAuthResult paramCheckServerAuthResult);
  
  public abstract void zza(RecordConsentRequest paramRecordConsentRequest, zzd paramzzd);
  
  public abstract void zza(SignInRequest paramSignInRequest, zzd paramzzd);
  
  public abstract void zzav(boolean paramBoolean);
  
  public abstract void zzb(zzd paramzzd);
  
  public abstract void zzka(int paramInt);
}

/* Location:
 * Qualified Name:     com.google.android.gms.signin.internal.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */