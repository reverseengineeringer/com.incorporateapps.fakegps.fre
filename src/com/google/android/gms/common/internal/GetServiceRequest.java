package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.zzc;
import java.util.Collection;

public class GetServiceRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzi();
  final int version;
  final int zzall;
  int zzalm;
  String zzaln;
  IBinder zzalo;
  Scope[] zzalp;
  Bundle zzalq;
  Account zzalr;
  
  public GetServiceRequest(int paramInt)
  {
    version = 2;
    zzalm = zzc.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    zzall = paramInt;
  }
  
  GetServiceRequest(int paramInt1, int paramInt2, int paramInt3, String paramString, IBinder paramIBinder, Scope[] paramArrayOfScope, Bundle paramBundle, Account paramAccount)
  {
    version = paramInt1;
    zzall = paramInt2;
    zzalm = paramInt3;
    zzaln = paramString;
    if (paramInt1 < 2) {}
    for (zzalr = zzaO(paramIBinder);; zzalr = paramAccount)
    {
      zzalp = paramArrayOfScope;
      zzalq = paramBundle;
      return;
      zzalo = paramIBinder;
    }
  }
  
  private Account zzaO(IBinder paramIBinder)
  {
    Account localAccount = null;
    if (paramIBinder != null) {
      localAccount = zza.zza(zzp.zza.zzaP(paramIBinder));
    }
    return localAccount;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzi.zza(this, paramParcel, paramInt);
  }
  
  public GetServiceRequest zzb(zzp paramzzp)
  {
    if (paramzzp != null) {
      zzalo = paramzzp.asBinder();
    }
    return this;
  }
  
  public GetServiceRequest zzc(Account paramAccount)
  {
    zzalr = paramAccount;
    return this;
  }
  
  public GetServiceRequest zzcG(String paramString)
  {
    zzaln = paramString;
    return this;
  }
  
  public GetServiceRequest zzd(Collection paramCollection)
  {
    zzalp = ((Scope[])paramCollection.toArray(new Scope[paramCollection.size()]));
    return this;
  }
  
  public GetServiceRequest zzj(Bundle paramBundle)
  {
    zzalq = paramBundle;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.GetServiceRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */