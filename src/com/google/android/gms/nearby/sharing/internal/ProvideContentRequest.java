package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public final class ProvideContentRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzf();
  final int versionCode;
  public IBinder zzbdk;
  public zzb zzbdl;
  public List zzbdm;
  public long zzbdn;
  public zzc zzbdo;
  
  ProvideContentRequest()
  {
    versionCode = 1;
  }
  
  ProvideContentRequest(int paramInt, IBinder paramIBinder1, IBinder paramIBinder2, List paramList, long paramLong, IBinder paramIBinder3)
  {
    versionCode = paramInt;
    zzbdk = paramIBinder1;
    zzbdl = zzb.zza.zzdG(paramIBinder2);
    zzbdm = paramList;
    zzbdn = paramLong;
    zzbdo = zzc.zza.zzdH(paramIBinder3);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
  
  final IBinder zzED()
  {
    return zzbdo.asBinder();
  }
  
  final IBinder zzEP()
  {
    if (zzbdl == null) {
      return null;
    }
    return zzbdl.asBinder();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.sharing.internal.ProvideContentRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */