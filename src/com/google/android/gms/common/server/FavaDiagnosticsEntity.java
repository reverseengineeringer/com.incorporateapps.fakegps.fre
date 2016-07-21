package com.google.android.gms.common.server;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class FavaDiagnosticsEntity
  implements SafeParcelable
{
  public static final zza CREATOR = new zza();
  final int mVersionCode;
  public final String zzamD;
  public final int zzamE;
  
  public FavaDiagnosticsEntity(int paramInt1, String paramString, int paramInt2)
  {
    mVersionCode = paramInt1;
    zzamD = paramString;
    zzamE = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.server.FavaDiagnosticsEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */