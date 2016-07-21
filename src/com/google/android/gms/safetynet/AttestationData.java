package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AttestationData
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zza();
  public final int mVersionCode;
  private String zzbgu;
  
  AttestationData(int paramInt, String paramString)
  {
    mVersionCode = paramInt;
    zzbgu = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getJwsResult()
  {
    return zzbgu;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.safetynet.AttestationData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */